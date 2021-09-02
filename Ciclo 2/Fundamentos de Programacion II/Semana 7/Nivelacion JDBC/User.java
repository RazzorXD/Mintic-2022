/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysqltest;

/**
 *
 * @author datcx
 */
public class User
{
    
    private String _name;
    private String _email;
    private String _password;

    public User ( String name , String email , String password )
    {
        this._name = name;
        this._email = email;
        this._password = password;
    }
    
    public String getName ()
    {
        return _name;
    }

    public void setName ( String _name )
    {
        this._name = _name;
    }

    public String getEmail ()
    {
        return _email;
    }

    public void setEmail ( String _email )
    {
        this._email = _email;
    }

    public String getPassword ()
    {
        return _password;
    }

    public void setPassword ( String _password )
    {
        this._password = _password;
    }

}
