package vistas;

import Funciones.Guardar;
import Funciones.Seleccionar;
import coneccion.Conection;
import java.awt.Component;
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

public class visitas_foraneo extends javax.swing.JPanel {

    public visitas_foraneo() {
        initComponents();

    }
    Connection c;

    fondo_panel fondo = new fondo_panel();

    class fondo_panel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon("src/main/java/Iconos/opciones.png").getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }

    }

    fondo2 fondosec = new fondo2();

    class fondo2 extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon("src/main/java/Iconos/tablas.png").getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new fondo_panel();
        MaterialTabbed1 = new EVD1.MaterialTabbed();
        jPanel2 = new fondo2();
        txtApmat = new EVD1.TextField();
        txtAppat = new EVD1.TextField();
        txtnombre = new EVD1.TextField();
        customButtons3 = new EVD1.CustomButtons();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable_bus3 = new javax.swing.JTable();
        jPanel3 = new fondo2();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_bus1 = new javax.swing.JTable();
        customButtons2 = new EVD1.CustomButtons();

        MaterialTabbed1.setBackground(new java.awt.Color(255, 255, 255));
        MaterialTabbed1.setForeground(new java.awt.Color(255, 255, 255));
        MaterialTabbed1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        MaterialTabbed1.setPreferredSize(new java.awt.Dimension(711, 500));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        txtApmat.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        txtApmat.setLabelText("APELLIDO MATERNO");

        txtAppat.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        txtAppat.setLabelText("APELLIDO PATERNO");
        txtAppat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAppatActionPerformed(evt);
            }
        });

        txtnombre.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        txtnombre.setLabelText("NOMBRE");
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        customButtons3.setBackground(new java.awt.Color(51, 51, 51));
        customButtons3.setForeground(new java.awt.Color(255, 255, 255));
        customButtons3.setText("BUSCAR");
        customButtons3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        customButtons3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customButtons3ActionPerformed(evt);
            }
        });

        jTable_bus3 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jTable_bus3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable_bus3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID DEL FORANEO", "ID DE LA VISITA", "LABORATORIO", "FECHA", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_bus3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable_bus3.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(jTable_bus3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAppat, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApmat, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addComponent(jScrollPane4)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(customButtons3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApmat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAppat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(customButtons3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        MaterialTabbed1.addTab("SELECCIÓN INDIVIDUAL", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jTable_bus1 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jTable_bus1.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jTable_bus1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID DEL FORANEO", "ID DE LA VISITA", "LABORATORIO", "FECHA", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_bus1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable_bus1.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTable_bus1);

        customButtons2.setBackground(new java.awt.Color(51, 51, 51));
        customButtons2.setForeground(new java.awt.Color(255, 255, 255));
        customButtons2.setText("VER TODOS");
        customButtons2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        customButtons2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customButtons2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(customButtons2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(customButtons2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        MaterialTabbed1.addTab("SELECCIÓN GENERAL", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(MaterialTabbed1, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MaterialTabbed1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        MaterialTabbed1.getAccessibleContext().setAccessibleName("Individual");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtAppatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAppatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAppatActionPerformed

    private void customButtons2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customButtons2ActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel modelado2 = new DefaultTableModel();
            jTable_bus1.setModel(modelado2);

            //Agregar tres variables
            PreparedStatement ps;
            ResultSet rs;
            //Connection con= getConection();
            c = new Conection().conectar();
            String sql = "select f.id_foraneo as Id_foraneo, vf.id_visitas_foraneo as Id_Visita, vf.id_lab as laboratorio, vf.fecha as fecha, vf.estado as estado from visitas_foraneo as vf inner join foraneo as f on f.id_foraneo = vf.id_foraneo;";
            ps = c.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMetaD = rs.getMetaData();
            int cant_columnas = rsMetaD.getColumnCount();

            modelado2.addColumn("id foraneo");
            modelado2.addColumn("id visita");
            modelado2.addColumn("laboratorio");
            modelado2.addColumn("fecha");
            modelado2.addColumn("estado");

            while (rs.next()) {
                Object[] filas = new Object[cant_columnas];

                for (int i = 0; i < cant_columnas; i++) {
                    filas[i] = rs.getObject(i + 1);

                }
                modelado2.addRow(filas);
            }

        } catch (Exception e) {
            System.out.println(e);

        }
    }//GEN-LAST:event_customButtons2ActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void customButtons3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customButtons3ActionPerformed
        // TODO add your handling code here:w
        if (!txtnombre.getText().equals("") && !txtAppat.getText().equals("") && !txtApmat.getText().equals("")) {
            try {
            DefaultTableModel modelado2 = new DefaultTableModel();
            jTable_bus3.setModel(modelado2);

            //Agregar tres variables
            PreparedStatement ps;
            ResultSet rs;
            //Connection con= getConection();
            c = new Conection().conectar();
            String sql = " select f.id_foraneo as Id_foraneo, vf.id_visitas_foraneo as Id_Visita, vf.id_lab as laboratorio, vf.fecha as fecha from visitas_foraneo as vf, vf.estado as estado inner join foraneo as f on f.id_foraneo = vf.id_foraneo where f.nombre_f ilike '%"+txtnombre.getText()+"' AND f.ap_pat ILIKE '%"+txtAppat.getText()+"' AND f.ap_mat ILIKE '%"+txtApmat.getText()+"';";
            ps = c.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMetaD = rs.getMetaData();
            int cant_columnas = rsMetaD.getColumnCount();

            modelado2.addColumn("id foraneo");
            modelado2.addColumn("id visita");
            modelado2.addColumn("laboratorio");
            modelado2.addColumn("fecha");
            modelado2.addColumn("estado");

            while (rs.next()) {
                Object[] filas = new Object[cant_columnas];

                for (int i = 0; i < cant_columnas; i++) {
                    filas[i] = rs.getObject(i + 1);

                }
                modelado2.addRow(filas);
            }

        } catch (Exception e) {
            System.out.println(e);

        }
        }
        else{
            JOptionPane.showMessageDialog(null, "Ingrese el nombre completo");
        }
    }//GEN-LAST:event_customButtons3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private EVD1.MaterialTabbed MaterialTabbed1;
    private EVD1.CustomButtons customButtons2;
    private EVD1.CustomButtons customButtons3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable_bus1;
    private javax.swing.JTable jTable_bus3;
    private EVD1.TextField txtApmat;
    private EVD1.TextField txtAppat;
    private EVD1.TextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
