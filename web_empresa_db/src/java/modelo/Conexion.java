/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author jhosm
 */
public class Conexion {
    public Connection conexionDB;
    public final String bd ="db_empresa3";
    public final String urlConexion = String.format("jdbc:mysql://localhost:3306/%s",bd);
    public final String usuario = "root";
    public final String contraseña = "Marroquin*5008";
    public final String jdbc = "com.mysql.cj.jdbc.Driver";
    
    public void abrir_conexion(){
        try{
            Class.forName(jdbc);
            conexionDB = DriverManager.getConnection(urlConexion,usuario,contraseña);
            
        }catch(HeadlessException | ClassNotFoundException | SQLException ex){
            System.out.print("Error..." + ex.getLocalizedMessage());
        }
    }
    public void cerrar_conexion(){
        try{ 
            conexionDB.close();
    }catch(SQLException ex){
    System.out.print("Error..." + ex.getLocalizedMessage());
    
}
}
}
