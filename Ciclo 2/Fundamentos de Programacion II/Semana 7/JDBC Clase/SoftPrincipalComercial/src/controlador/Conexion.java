/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author RamiroJose
 */
public class Conexion {
    
    private static String basedatos="SOFTPRICIPAL";
    private static String usuario="root";
    private static String password="Lafacil2021**";
    private static String url="jdbc:mysql://192.168.1.187/"+basedatos;
    
    public Connection getConexion(){
        Connection cn=null;
        try{
        
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn= DriverManager.getConnection(url,usuario,password);
           //(url, usuario, password);
        }catch(Exception e){
            System.out.println("Error conexion"+e.getMessage());
        } return cn;
        }
   }
   
