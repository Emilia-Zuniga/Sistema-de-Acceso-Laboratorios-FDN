/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import coneccion.Conection;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class historial_visitas extends javax.swing.JPanel {

    
    Connection c;
    public historial_visitas() {
        initComponents();
        c = new Conection().conectar();
    }
    
    fondo_panel fondo = new fondo_panel();
    class fondo_panel extends JPanel
    {
        private Image imagen;
        @Override
        public void paint(Graphics g)
        {
           imagen = new ImageIcon("src/main/java/Iconos/opciones.png").getImage();
           g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
           setOpaque(false);
           super.paint(g);
        }        
    }
    
    fondo2 fondosec = new fondo2();
    
    class fondo2 extends JPanel
    {
        private Image imagen;
        @Override
        public void paint(Graphics g)
        {
           imagen = new ImageIcon("src/main/java/Iconos/tablas.png").getImage();
           g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
           setOpaque(false);
           super.paint(g);
        }        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel12 = new fondo_panel();
        materialTabbed1 = new EVD1.MaterialTabbed();
        jPanel6 = new fondo2();
        jScrollPane1 = new javax.swing.JScrollPane();
        visitas_alumnos = new javax.swing.JTable();
        matricula = new EVD1.TextField();
        btn_seleccionar = new EVD1.CustomButtons();

        materialTabbed1.setBackground(new java.awt.Color(255, 255, 255));
        materialTabbed1.setForeground(new java.awt.Color(255, 255, 255));
        materialTabbed1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N

        visitas_alumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "VISITAS", "NÚMERO DE HORARIO", "HORA INICIAL", "HORA FINAL"
            }
        ));
        jScrollPane1.setViewportView(visitas_alumnos);

        matricula.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        matricula.setLabelText("MATRICULA");
        matricula.setName(""); // NOI18N

        btn_seleccionar.setBackground(new java.awt.Color(51, 51, 51));
        btn_seleccionar.setForeground(new java.awt.Color(255, 255, 255));
        btn_seleccionar.setText("SELECCIONAR");
        btn_seleccionar.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        btn_seleccionar.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_seleccionar.setSelected(true);
        btn_seleccionar.setShadowColor(new java.awt.Color(204, 204, 204));
        btn_seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_seleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_seleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        materialTabbed1.addTab("SELECCIONAR", jPanel6);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(materialTabbed1, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(materialTabbed1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_seleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seleccionarActionPerformed
        if (!matricula.getText().equals("")) {
            try {
                DefaultTableModel modelado = new DefaultTableModel();
                visitas_alumnos.setModel(modelado);
                //Agregar tres variables
                PreparedStatement ps;
                ResultSet rs;
                //Connection con= getConection();
                c = new Conection().conectar();
                String sql = "select v.id_visitas as Visita, dh.cns_deth as Numero_horario, hv.hora_inicial as Hora_inicial, hv.hora_final as Hora_final from alumnos as a inner join visitas as v on a.id_alumno = v.id_alumno \n" +
"                                                                inner join historial_visita as hv on v.id_visitas = hv.id_visitas\n" +
"                                                                inner join detalle_horario as dh on hv.cns_deth = dh.cns_deth where a.matricula like '%" + matricula.getText() + "%';";
                ps = c.prepareStatement(sql);
                rs = ps.executeQuery();

                ResultSetMetaData rsMetaD = rs.getMetaData();
                int cant_columnas = rsMetaD.getColumnCount();

                modelado.addColumn("VISITA");
                modelado.addColumn("NÚMERO HORARIO");
                modelado.addColumn("HORA INICIAL");
                modelado.addColumn("HORA FINAL");

                while (rs.next()) {
                    Object[] filas = new Object[cant_columnas];

                    for (int i = 0; i < cant_columnas; i++) {
                        filas[i] = rs.getObject(i + 1);

                    }
                    modelado.addRow(filas);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Inserte una matricula");
        }
    }//GEN-LAST:event_btn_seleccionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private EVD1.CustomButtons btn_seleccionar;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private EVD1.MaterialTabbed materialTabbed1;
    private EVD1.TextField matricula;
    private javax.swing.JTable visitas_alumnos;
    // End of variables declaration//GEN-END:variables
}
