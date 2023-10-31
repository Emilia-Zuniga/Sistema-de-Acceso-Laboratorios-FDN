/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import coneccion.Conection;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Emili
 */
public class Guardar {
    
    Conection c = new Conection();
    Statement st; //Para uso de sentencia Sql
    Connection conexion;
    //Connection con = null;
    
    //Constructor de la clase 
    public Guardar(){
        conexion = c.conectar(); 
    }
    
    public boolean guardar_profesores(String nombre_p, String ap_pat, String ap_mat, String num_plaza){ 
        String sql="insert into profesores (nombre_p, ap_pat, ap_mat, num_plaza) values('"+nombre_p+"','"+ap_pat+"','"+ap_mat+"','"+num_plaza+"');";
        boolean respuesta = true;
        try{
            st=conexion.createStatement();
            respuesta=st.execute(sql);
            //System.out.println(respuesta);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage() );
            System.out.println(e.getMessage());
        }finally{
            try{
                st.close();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex.getMessage() );
                System.out.println(ex.getMessage());
            }
        }
        return !respuesta;
    }
    
     
        /// PEDRO OCTAVIO CULEBRO PRADO
    
        public boolean guardar_carrera(String id_carrera, String nom_carrera){ 
        String sql="insert into carrera (id_carrera, nom_carrera, semestre) values('"+id_carrera+"','"+nom_carrera+"');";
        boolean respuesta = true;
        try{
            st=conexion.createStatement();
            respuesta=st.execute(sql);
            //System.out.println(respuesta);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage() );
            System.out.println(e.getMessage());
        }finally{
            try{
                st.close();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex.getMessage() );
                System.out.println(ex.getMessage());
            }
        }
        return !respuesta;
    }
        
     public boolean guardar_materia(String nombre, String semestre, String carrera){ 
        String sql="insert into materias(nom_materia, semestre, id_carrera) values('"+nombre+"','"+semestre+"', '"+carrera+"');";
        boolean respuesta = true;
        try{
            st=conexion.createStatement();
            respuesta=st.execute(sql);
        //System.out.println(respuesta);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
            System.out.println(e.getMessage());
        }finally{
            try{
                st.close();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex.getMessage() );
                System.out.println(ex.getMessage());
            }
        }
        return !respuesta;
    }
     
         public boolean guardar_administrativo(String nombre, String ap_pat, String ap_mat){ 
        String sql="insert into administrativo(id_admin, nombre_admin, ap_pat, ap_mat) values(default,'"+nombre+"','"+ap_pat+"', '"+ap_mat+"');";
        boolean respuesta = true;
        try{
            st=conexion.createStatement();
            respuesta=st.execute(sql);
            //System.out.println(respuesta);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage() );
            System.out.println(e.getMessage());
        }finally{
            try{
                st.close();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex.getMessage() );
                System.out.println(ex.getMessage());
            }
        }
        return !respuesta;
    }


}
