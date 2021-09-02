/*
 * Database configuration
 */
package mysqltest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author David Torres
 */
public class Database
{
    //Config Database

    private String _USER = "root";
    private String _PASSWORD = "";
    private String _URL = "jdbc:mysql://localhost:3306/nivelacion";

    private Connection _connection;

    private Statement _statement;

   //Initialize database
    public void init ()
    {
        try
        {
            //Check drivers
            Class.forName( "com.mysql.cj.jdbc.Driver" );
            //Create and get connection
            _connection = DriverManager.getConnection( _URL , _USER , _PASSWORD );
            _statement = _connection.createStatement();

        }
        catch ( ClassNotFoundException ex )
        {

            Logger.getLogger( NivelacionJDBC_Refactor.class.getName() ).log( Level.SEVERE , null , ex );

        }

        catch ( SQLException ex )
        {
            Logger.getLogger( NivelacionJDBC_Refactor.class.getName() ).log( Level.SEVERE , null , ex );
        }

    }

    public Statement getStatement ()
    {
        return _statement;
    }
    
    //Execute updates in database
    public void insertItem ( String query )
    {
        try
        {
            _statement.executeUpdate(query);
        }

        catch ( SQLException ex )
        {
            Logger.getLogger( NivelacionJDBC.class.getName() ).log( Level.SEVERE , null , ex );
        }
    }
    //Insert explicit query
    public void insertQuery ( String query )
    {
        try
        {
            ResultSet res = _statement.executeQuery( query );

            showResponse( res );

        }
        catch ( SQLException ex )
        {
            Logger.getLogger( NivelacionJDBC.class.getName() ).log( Level.SEVERE , null , ex );
        }

    }
    //Show ResultSet content
    public void showResponse ( ResultSet res )
    {
        try
        {
            //Show response
            while ( res.next() )
            {
                String user_id = res.getString( "id" );
                String user_name = res.getString( "name" );
                String user_email = res.getString( "email" );

                System.out.println( "Id: " + user_id
                        + " Nombre: " + user_name
                        + " Email: " + user_email );
            }
        }
        catch ( SQLException ex )
        {
            Logger.getLogger( NivelacionJDBC.class.getName() ).log( Level.SEVERE , null , ex );
        }
    }

}
