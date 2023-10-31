/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import coneccion.Conection;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Emili
 */
public class Eliminar {

    private final Conection c = new Conection();

    Statement st; //Para uso de sentencia Sql
    Connection conexion;

    public void eliminar_profesor(String numero_plaza) {
        try {
            Connection conexiion = c.conectar();
            st = conexiion.createStatement();
            String sql = "Delete from profesores where num_plaza = '" + numero_plaza + "';";
            st.execute(sql);
            st.close();
            JOptionPane.showMessageDialog(null, "ELIMINACIÓN EXITOSA");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ELIMINACIÓN EXITOSA", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /// PEDRO OCTAVIO CULEBRO PRADO
    public void eliminar_materia(String nom_materia) {
        try {
            Connection conexiion = c.conectar();
            st = conexiion.createStatement();
            String sql = "Delete from materias where nom_materia = '" + nom_materia + "' ";
            st.execute(sql);
            st.close();
            JOptionPane.showMessageDialog(null, "ELIMINACIÓN EXITOSA");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ELIMINACIÓN EXITOSA", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void eliminar_admin(String id_admin) {
        try {
            Connection conexiion = c.conectar();
            st = conexiion.createStatement();
            String sql = "Delete from administrativo where id_admin = " + id_admin + " ";
            st.execute(sql);
            st.close();
            JOptionPane.showMessageDialog(null, "ELIMINACIÓN EXITOSA");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ELIMINACIÓN EXITOSA", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void eliminarHorario(Integer ID) {
       
        try {
            //conexion a la bd
            Connection conexion = c.conectar();
            java.sql.Statement st = conexion.createStatement();
            //sentencia sql
            String sql ="delete from horarios where id_horario = " + ID + ";";;
            st.executeUpdate(sql);
            //cerramos la coneccion
            st.close();
            conexion.close();
            //mensajes de eliminacion
            JOptionPane.showMessageDialog(null, "ELIMINACIÓN EXITOSA");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ELIMINACIÓN EXITOSA", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void eliminarDetalleHorario(String cns) {
        try {
            Connection conexiion = c.conectar();
            st = c.createStatement();
            String sql = " delete from detalle_horario where cns_deth = '" + cns + "'; ";
            st.execute(sql);
            st.close();
            JOptionPane.showMessageDialog(null, "ELIMINACIÓN EXITOSA");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ELIMINACIÓN EXITOSA", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void eliminarLab(String id_lab) {
        try {
            Connection conexiion = c.conectar();
            st = c.createStatement();
            String sql = "Delete from laboratorio where id_lab = " + id_lab + " ";
            st.execute(sql);
            st.close();
            JOptionPane.showMessageDialog(null, "ELIMINACIÓN EXITOSA");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ELIMINACIÓN EXITOSA", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void eliminar_foraneo(Integer id_fo) {
        //manejo de excepcion sql
        try {
            //conexion a la bd
            Connection conexion = c.conectar();
            java.sql.Statement st = conexion.createStatement();
            //sentencia sql
            String sql = "delete from foraneo where id_foraneo=" + id_fo + "; ";
            st.executeUpdate(sql);
            //cerramos la coneccion
            st.close();
            conexion.close();
            //mensajes de eliminacion
            JOptionPane.showMessageDialog(null, "ELIMINACIÓN EXITOSA");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ELIMINACIÓN EXITOSA", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
