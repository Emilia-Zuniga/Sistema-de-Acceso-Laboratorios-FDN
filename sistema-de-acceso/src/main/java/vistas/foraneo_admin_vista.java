package vistas;

import Funciones.*;
import coneccion.Conection;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class foraneo_admin_vista extends javax.swing.JPanel {

    public foraneo_admin_vista() {
        initComponents();
        add_facultades();
        jTable_bus.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                JTable table = new JTable();
                Point point = evt.getPoint();
                int row = table.rowAtPoint(point);
                int fila_point = jTable_bus.rowAtPoint(evt.getPoint());
                int columna_point = 0;
                if (evt.getClickCount() == 1) {
                    txt_id.setText(jTable_bus.getValueAt(jTable_bus.getSelectedRow(), 0).toString());
                    txt_nombre.setText(jTable_bus.getValueAt(jTable_bus.getSelectedRow(), 1).toString());
                    txt_app.setText(jTable_bus.getValueAt(jTable_bus.getSelectedRow(), 2).toString());
                    txt_apm.setText(jTable_bus.getValueAt(jTable_bus.getSelectedRow(), 3).toString());
                    ComboBoxFacultades.setSelectedItem(jTable_bus.getValueAt(jTable_bus.getSelectedRow(), 4).toString());
                }
            }
        });
    }

    public void add_facultades() {
        ComboBoxFacultades.removeAllItems();
        ComboBoxFacultades.addItem("Seleccione");
        ComboBoxFacultades.addItem("Administracion");
        ComboBoxFacultades.addItem("Medicina Humana");
        ComboBoxFacultades.addItem("Quimica");
        ComboBoxFacultades.addItem("Pedagogia");
        ComboBoxFacultades.addItem("Derecho");
        ComboBoxFacultades.addItem("Lenguas");
        ComboBoxFacultades.addItem("Costeros");
        ComboBoxFacultades.addItem("Agronomia");
        ComboBoxFacultades.addItem("Humanidades");
        ComboBoxFacultades.addItem("Biociencias");

    }

    Connection c;

    fondo_panel fondo = new fondo_panel();

    class fondo_panel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon("src/main/java/Iconos/tablas1.png").getImage();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_bus = new javax.swing.JTable();
        txtAppat = new EVD1.TextField();
        txtApmat = new EVD1.TextField();
        btn_buscar1 = new EVD1.CustomButtons();
        customButtons1 = new EVD1.CustomButtons();
        btn_editar = new EVD1.CustomButtons();
        btn_eliminar = new EVD1.CustomButtons();
        btn_salvar = new EVD1.CustomButtons();
        txt_id = new EVD1.TextField();
        txt_nombre = new EVD1.TextField();
        txt_app = new EVD1.TextField();
        txt_apm = new EVD1.TextField();
        ComboBoxFacultades = new EVD2.Combobox();

        jTable_bus = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jTable_bus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable_bus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID ", "NOMBRE", "APELLIDO PATERNO", "APELLIDO MATERNO", "FACULTAD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_bus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable_bus.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable_bus);

        txtAppat.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        txtAppat.setLabelText("APELLIDO PATERNO");
        txtAppat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAppatActionPerformed(evt);
            }
        });

        txtApmat.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        txtApmat.setLabelText("APELLIDO MATERNO");

        btn_buscar1.setBackground(new java.awt.Color(51, 51, 51));
        btn_buscar1.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscar1.setText("BUSCAR");
        btn_buscar1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        btn_buscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar1ActionPerformed(evt);
            }
        });

        customButtons1.setBackground(new java.awt.Color(51, 51, 51));
        customButtons1.setForeground(new java.awt.Color(255, 255, 255));
        customButtons1.setText("VER TODOS");
        customButtons1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        customButtons1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customButtons1ActionPerformed(evt);
            }
        });

        btn_editar.setBackground(new java.awt.Color(51, 51, 51));
        btn_editar.setForeground(new java.awt.Color(255, 255, 255));
        btn_editar.setText("EDITAR");
        btn_editar.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_eliminar.setBackground(new java.awt.Color(51, 51, 51));
        btn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_salvar.setBackground(new java.awt.Color(51, 51, 51));
        btn_salvar.setForeground(new java.awt.Color(255, 255, 255));
        btn_salvar.setText("GUARDAR");
        btn_salvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        txt_id.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        txt_id.setLabelText("ID");
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        txt_nombre.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        txt_nombre.setLabelText("NOMBRE");
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });

        txt_app.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        txt_app.setLabelText("APELLIDO PATERNO");
        txt_app.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_appActionPerformed(evt);
            }
        });

        txt_apm.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        txt_apm.setLabelText("APELLIDO MATERNO");
        txt_apm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apmActionPerformed(evt);
            }
        });

        ComboBoxFacultades.setForeground(new java.awt.Color(0, 0, 0));
        ComboBoxFacultades.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBoxFacultades.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        ComboBoxFacultades.setLabeText("");
        ComboBoxFacultades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxFacultadesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_app, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txt_apm, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ComboBoxFacultades, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(customButtons1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(txtAppat, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtApmat, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_buscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_buscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApmat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAppat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customButtons1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_app, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_apm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboBoxFacultades, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtAppatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAppatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAppatActionPerformed

    private void btn_buscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar1ActionPerformed
        // TODO add your handling code here:
        if (!txtAppat.getText().equals("") && !txtApmat.getText().equals("")) {
            try {
                DefaultTableModel modelado = new DefaultTableModel();
                jTable_bus.setModel(modelado);

                //Agregar tres variables
                PreparedStatement ps;
                ResultSet rs;
                //Connection con= getConection();
                c = new Conection().conectar();
                String sql = "SELECT * FROM foraneo WHERE ap_pat ILIKE '%" + txtAppat.getText() + "' AND ap_mat ILIKE'%" + txtApmat.getText() + "' order by id_foraneo ASC;";
                ps = c.prepareStatement(sql);
                rs = ps.executeQuery();

                ResultSetMetaData rsMetaD = rs.getMetaData();
                int cant_columnas = rsMetaD.getColumnCount();

                modelado.addColumn("ID");
                modelado.addColumn("NOMBRE");
                modelado.addColumn("APELLIDO PATERNO");
                modelado.addColumn("APELLIDO MATERNO");
                modelado.addColumn("FACULTAD");

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
            JOptionPane.showMessageDialog(null, "Ingrese ambos apellidos");
        }
    }//GEN-LAST:event_btn_buscar1ActionPerformed

    private void customButtons1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customButtons1ActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel modelado = new DefaultTableModel();
            jTable_bus.setModel(modelado);

            //Agregar tres variables
            PreparedStatement ps;
            ResultSet rs;
            //Connection con= getConection();
            c = new Conection().conectar();
            String sql = "SELECT * FROM foraneo order by id_foraneo ASC;";
            ps = c.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMetaD = rs.getMetaData();
            int cant_columnas = rsMetaD.getColumnCount();

            modelado.addColumn("id");
            modelado.addColumn("nombre");
            modelado.addColumn("apellido paterno");
            modelado.addColumn("apellido materno");
            modelado.addColumn("facultad");

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
    }//GEN-LAST:event_customButtons1ActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        // TODO add your handling code here:
        Modificar up = new Modificar();
        String nombre = txt_nombre.getText();
        String ap_pat = txt_app.getText();
        String ap_mat = txt_apm.getText();
        String facultad = (String) ComboBoxFacultades.getSelectedItem();
        int id = Integer.parseInt(txt_id.getText());
        int g = JOptionPane.showConfirmDialog(null, " ¡¿Seguro que desea modificar este registro?!", "Cita", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (g == JOptionPane.YES_OPTION) {

            up.actualizar_foraneo(nombre,ap_pat,ap_mat,facultad,id);
            txt_id.setText("");
            txt_nombre.setText("");
            txt_app.setText("");
            txt_apm.setText("");
            ComboBoxFacultades.setSelectedIndex(0);

        } else {
            JOptionPane.showMessageDialog(null, "No se Modifico nada!!!", "mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        // TODO add your handling code here:
        txt_id.setEditable(true);
        txt_nombre.setEditable(true);
        txt_app.setEditable(true);
        txt_apm.setEditable(true);
        ComboBoxFacultades.setEnabled(true);
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        Eliminar de = new Eliminar();
        int id = Integer.parseInt(txt_id.getText());
        int g = JOptionPane.showConfirmDialog(null, " ¡¿Seguro que desea eliminar este registro?!", "Cita", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (g == JOptionPane.YES_OPTION) {

            de.eliminar_foraneo(id);
            txt_id.setText("");
            txt_nombre.setText("");
            txt_app.setText("");
            txt_apm.setText("");
            ComboBoxFacultades.setSelectedIndex(0);

        } else {
            JOptionPane.showMessageDialog(null, "No se Elimino nada!!!", "mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_appActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_appActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_appActionPerformed

    private void txt_apmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apmActionPerformed

    private void ComboBoxFacultadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxFacultadesActionPerformed

    }//GEN-LAST:event_ComboBoxFacultadesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private EVD2.Combobox ComboBoxFacultades;
    private EVD1.CustomButtons btn_buscar1;
    private EVD1.CustomButtons btn_editar;
    private EVD1.CustomButtons btn_eliminar;
    private EVD1.CustomButtons btn_salvar;
    private EVD1.CustomButtons customButtons1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_bus;
    private EVD1.TextField txtApmat;
    private EVD1.TextField txtAppat;
    private EVD1.TextField txt_apm;
    private EVD1.TextField txt_app;
    private EVD1.TextField txt_id;
    private EVD1.TextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
