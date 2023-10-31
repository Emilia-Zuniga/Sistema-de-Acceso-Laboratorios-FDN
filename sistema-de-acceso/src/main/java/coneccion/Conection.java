/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coneccion;

import Metodos.Setters_getters;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conection {
    
    Connection con = null;
    Setters_getters gst = new Setters_getters();
    public Boolean ban = false;
    private final String usuario = "alumno";
    private final String contraseña = "alumno";  
    private final String u_foraneo="foraneo";
    private final String ps_foraneo="foraneo";

    //variables para guardar los datos de acceso a la bd
    private final String url = "jdbc:postgresql://localhost:5432/sistema_acceso";

    //metodo para conectar la bd, es una clase de tipo Connection 
    public Connection conectar() {
        try {
            //manejo del Driver
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url,Setters_getters.getUsuario(), Setters_getters.getContra());
            ban = true;
            System.out.println("conectada");
        } catch (ClassNotFoundException | SQLException e) {
            //excepcion sql
            JOptionPane.showMessageDialog(null, "Error en su conexion ", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
            ban = false;

        }
        return con;
    }
    
    public Connection conectar_alumno() {
        try {
            //manejo del Driver
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, usuario, contraseña);

            ban = true;
        } catch (ClassNotFoundException | SQLException e) {
            //excepcion sql
            JOptionPane.showMessageDialog(null, "Error en su conexion ", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
            ban = false;

        }
        return con;
    }
    
    public Connection conectar_foraneo() {
        try {
            //manejo del Driver
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url,u_foraneo,ps_foraneo);
            
            ban = true;
        } catch (ClassNotFoundException | SQLException e) {
            //excepcion sql
            JOptionPane.showMessageDialog(null, "Error en su conexion ", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
            ban = false;

        }
        return con;
    }


    public Statement getConexion() {
        Statement stmt = null;
        return stmt;
    }

    public Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

