/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cinev;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author fband
 */
public class Conexion {
    
      Connection conectar = null;
    
    String usuario = "postgres";
    String contrasenia = "12345";
    String bd = "Sistema_Cine";
    String ip = "localhost";
    String puerto = "5432";
    
    String cadena = "jdbc:postgresql://"+ip+":"+puerto+"/"+bd;
    
    public Connection establecerConexion(){
        
        try {
            Class.forName("org.postgresql.Driver");
            conectar = DriverManager.getConnection(cadena, usuario, contrasenia);
            JOptionPane.showMessageDialog(null, "Se conecto correctamente a la Base de Datos");
            
        } catch (Exception e) {
            JOptionPane.showInternalMessageDialog(null,"Error al conectar a la base de datos, error: "+e.toString());
        }
        
        return conectar;
    }
    public static void main(String []args){
         Conexion objetoConexion = new Conexion();
        objetoConexion.establecerConexion();

    }

}
