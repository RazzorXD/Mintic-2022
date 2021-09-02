/*
 */
package mysqltest;

/**
 *
 * @author David Torres
 */
public class NivelacionJDBC_Refactor
{
       
    public static void main ( String[] args )
    {
         DatabaseController db = new DatabaseController();
         
         db.init();
         
         User user1 = new User("Juan","juan@mail.com","615");
         
         //db.createUser( user1 );
         
         db.insertQuery( "SELECT * FROM users" );
          
        
    }
}
 