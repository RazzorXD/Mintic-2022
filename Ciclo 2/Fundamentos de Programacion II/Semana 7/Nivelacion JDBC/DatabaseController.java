package mysqltest;


/*
 *Database Controller
 */

/**
 *
 * @author David Torres
 */
public class DatabaseController
{
    private Database _db;
    
    public DatabaseController()
    {
      this._db = new Database();
   
    }
    
    
    public void init()
    {
         _db.init();
    }
    
    
   public void createUser(User user)
    {
        String query = "INSERT INTO users VALUES(null,'"+user.getName()+"','"+user.getEmail()+"','"+user.getPassword()+"')";
       
        _db.insertItem(query);

        System.out.println( "User created successfully" );
    }
   
   public void insertQuery(String query)
   {
       _db.insertQuery( query );
   }
    
}
