/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
public class NivelacionJDBC
{

   
    public static void main ( String[] args )
    {
        //Config Database
        String user = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/nivelacion";

        Connection connection;

        Statement statement;

        ResultSet res;

        //Check if library exists
        try
        {
            Class.forName( "com.mysql.cj.jdbc.Driver" );
        }
        catch ( ClassNotFoundException ex )
        {
            Logger.getLogger(NivelacionJDBC.class.getName() ).log( Level.SEVERE , null , ex );
        }

        try
        {
            //Create and get connection
            connection = DriverManager.getConnection( url , user , password );
            statement = connection.createStatement();
            //Execute statement

            //Create
            statement.executeUpdate( "INSERT INTO users VALUES(null,'Andres','andres@mail.com','615')" );
            //Get
            res = statement.executeQuery( "SELECT * FROM users" );

            //Show response
            while ( res.next() )
            {
                String user_id = res.getString( "id" );
                String user_name = res.getString( "name" );
                String user_email = res.getString( "email" );

                System.out.println( "Id: " + user_id + 
                                   " Nombre: " + user_name + 
                                   " Email: " + user_email );
            }

        }
        catch ( SQLException ex )
        {
            Logger.getLogger(NivelacionJDBC.class.getName() ).log( Level.SEVERE , null , ex );
        }
    }

}
