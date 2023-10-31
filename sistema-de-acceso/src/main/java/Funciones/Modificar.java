/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import coneccion.Conection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Modificar {
    
    Connection conexion;
    Conection c = new Conection();
    Statement st;
    ResultSet rs;
    
    public Modificar(){
        conexion=c.conectar();
    }

    
//    public void modificar_profesor(String nombre_p, String ap_pat, String ap_mat, String num_plaza){
//        try
//        {
//            st=conexion.createStatement();
//            String sql ="update profesores set nombre_p = '"+nombre_p+"', ap_pat = '"+ap_pat+"', ap_mat = '"+ap_mat+"' where num_plaza = '"+num_plaza+"';";
//            st.execute(sql);
//            st.close();
//            JOptionPane.showMessageDialog(null, "El registro se actualizo", "Exito", JOptionPane.INFORMATION_MESSAGE);
//            
//        }catch(Exception e){
//            JOptionPane.showMessageDialog(null, "Error al actualizar " + e, "Error", JOptionPane.ERROR_MESSAGE);
//            JOptionPane.showMessageDialog(null, e);
//        }
//    }
    
//    public void modificar_profesor(String nombre_p, String ap_pat, String ap_mat, String num_plaza){
//        try
//        {
//            st=conexion.createStatement();
//            String sql ="update profesores set nombre_p ='"+nombre_p+"', ap_pat = '"+ap_pat+"', ap_mat = '"+ap_mat+"' where num_plaza = '"+num_plaza+"';";
//            st.execute(sql);
//            st.close();
//            JOptionPane.showMessageDialog(null, "El registro se actualizo", "Exito", JOptionPane.INFORMATION_MESSAGE);
//            
//        }catch(Exception e){
//            JOptionPane.showMessageDialog(null, "Error al actualizar " + e, "Error", JOptionPane.ERROR_MESSAGE);
//            JOptionPane.showMessageDialog(null, e);
//        }
//    }  
    
        public void modificar_profesor (String nombre_p, String ap_pat, String ap_mat, String num_plaza) {
        
        try {
            st = conexion.createStatement();
            String sql = "update profesores set nombre_p='" + nombre_p +"', ap_pat='" + ap_pat + "',ap_mat='" + ap_mat + "' where num_plaza ='" + num_plaza + "'; ";
            st.executeUpdate(sql);
            st.close();
            
            JOptionPane.showMessageDialog(null, "El registro se actualizo", "Exito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
/// PEDRO OCTAVIO CULEBRO PRADO
        
        
public void modificar_admin(String nom_admin, String ap_pat, String ap_mat, String combo)
      {
        try
        {
            st=conexion.createStatement();
            String sql ="update administrativo set nombre_admin = '"+nom_admin+"', ap_pat = '"+ap_pat+"' , ap_mat = '"+ap_mat+"'  where id_admin = '"+combo+"';";//Sentencia sql
            st.execute(sql);
            st.close();
            JOptionPane.showMessageDialog(null, "Modificacion exitosa");
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }

      }


public void actualizar_foraneo(String nombre, String appat, String apmat, String facultad, Integer id) {
        //taratamiento de excepcion sql
        try {
            //conexion a la BD
            Connection conexion = c.conectar();
            java.sql.Statement st = conexion.createStatement();
            //senetencia sql para la actualizacion' 
            String sql = "update foraneo set nombre_f='" + nombre + "',ap_pat='" + appat + "',ap_mat='" + apmat + "',facultad='" + facultad + "' where id_foraneo=" + id+ "; ";
            st.executeUpdate(sql);
            //cerramos la coneccion
            st.close();
            conexion.close();
            //mensajes de actualizacion
            JOptionPane.showMessageDialog(null, "El registro se actualizo", "Exito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
