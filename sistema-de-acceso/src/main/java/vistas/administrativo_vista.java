package vistas;

import Funciones.Eliminar;
import Funciones.Guardar;
import Funciones.Modificar;
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

public class administrativo_vista extends javax.swing.JPanel {

    Guardar g = new Guardar();
    Modificar mod = new Modificar();
    Eliminar el = new Eliminar();
    Seleccionar select;
    Connection c;
    int contador = 0;

    private Component rootPane;

    public administrativo_vista() {
        initComponents();
        c = new Conection().conectar();
        select = new Seleccionar(c);
        limpiar_combo_admin();

    }

    public void limpiar_combo_admin() {
        combo_admin_mod.removeAllItems();
        combo_admin_mod.addItem("Seleccione un ID");
        c = new Conection().conectar();
        String[] barras = select.id_admin();

        for (String i : barras) {
            combo_admin_mod.addItem(i);
            contador++;
        }

        txt_nom_admin_mod.setText("");
        txt_ap_pat_admin_mod.setText("");
        txt_ap_mat_admin_mod.setText("");
    }

//FONDOS 
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
        MaterialTabbed_administrativo = new EVD1.MaterialTabbed();
        jPanel2 = new fondo2();
        txt_ap_pat = new EVD1.TextField();
        txt_nom_admin1 = new EVD1.TextField();
        txt_ap_mat = new EVD1.TextField();
        btn_guardar_admin = new EVD1.CustomButtons();
        jPanel3 = new fondo2();
        jLabel6 = new javax.swing.JLabel();
        combo_admin_mod = new EVD2.Combobox();
        txt_nom_admin_mod = new EVD1.TextField();
        txt_ap_pat_admin_mod = new EVD1.TextField();
        txt_ap_mat_admin_mod = new EVD1.TextField();
        btn_modificar_admin = new EVD1.CustomButtons();
        btn_eliminar_admin1 = new EVD1.CustomButtons();
        jPanel5 = new fondo2();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_administrativo = new javax.swing.JTable();
        btn_seleccionar_admin = new EVD1.CustomButtons();

        MaterialTabbed_administrativo.setBackground(new java.awt.Color(255, 255, 255));
        MaterialTabbed_administrativo.setForeground(new java.awt.Color(255, 255, 255));
        MaterialTabbed_administrativo.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setForeground(new java.awt.Color(153, 153, 255));

        txt_ap_pat.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        txt_ap_pat.setLabelText("APELLIDO PATERNO");

        txt_nom_admin1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        txt_nom_admin1.setLabelText("NOMBRE");

        txt_ap_mat.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        txt_ap_mat.setLabelText("APELLIDO MATERNO");

        btn_guardar_admin.setBackground(new java.awt.Color(51, 51, 51));
        btn_guardar_admin.setForeground(new java.awt.Color(255, 255, 255));
        btn_guardar_admin.setText("GUARDAR");
        btn_guardar_admin.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        btn_guardar_admin.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_guardar_admin.setShadowColor(new java.awt.Color(204, 204, 204));
        btn_guardar_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar_adminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_guardar_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nom_admin1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ap_mat, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ap_pat, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(204, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(txt_nom_admin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_ap_pat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_ap_mat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_guardar_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        MaterialTabbed_administrativo.addTab("GUARDAR", jPanel2);

        combo_admin_mod.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        combo_admin_mod.setLabeText("");
        combo_admin_mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_admin_modActionPerformed(evt);
            }
        });

        txt_nom_admin_mod.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        txt_nom_admin_mod.setLabelText("NOMBRE");

        txt_ap_pat_admin_mod.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        txt_ap_pat_admin_mod.setLabelText("APELLIDO PATERNO");

        txt_ap_mat_admin_mod.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        txt_ap_mat_admin_mod.setLabelText("APELLIDO MATERNO");

        btn_modificar_admin.setBackground(new java.awt.Color(51, 51, 51));
        btn_modificar_admin.setForeground(new java.awt.Color(255, 255, 255));
        btn_modificar_admin.setText("MODIFICAR");
        btn_modificar_admin.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        btn_modificar_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificar_adminActionPerformed(evt);
            }
        });

        btn_eliminar_admin1.setBackground(new java.awt.Color(51, 51, 51));
        btn_eliminar_admin1.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar_admin1.setText("ELIMINAR");
        btn_eliminar_admin1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        btn_eliminar_admin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminar_admin1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btn_modificar_admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_eliminar_admin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_ap_pat_admin_mod, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                .addComponent(txt_nom_admin_mod, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                .addComponent(txt_ap_mat_admin_mod, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(combo_admin_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(159, 159, 159))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(combo_admin_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(4, 4, 4)
                .addComponent(txt_nom_admin_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_ap_pat_admin_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_ap_mat_admin_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_eliminar_admin1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_modificar_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        MaterialTabbed_administrativo.addTab("MODIFICAR / ELIMINAR", jPanel3);

        tabla_administrativo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "APELLIDO PATERNO", "APELLIDO MATERNO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_administrativo);
        if (tabla_administrativo.getColumnModel().getColumnCount() > 0) {
            tabla_administrativo.getColumnModel().getColumn(0).setResizable(false);
            tabla_administrativo.getColumnModel().getColumn(1).setResizable(false);
        }

        btn_seleccionar_admin.setBackground(new java.awt.Color(51, 51, 51));
        btn_seleccionar_admin.setForeground(new java.awt.Color(255, 255, 255));
        btn_seleccionar_admin.setText("MOSTRAR ADMINISTRATIVOS");
        btn_seleccionar_admin.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        btn_seleccionar_admin.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_seleccionar_admin.setShadowColor(new java.awt.Color(153, 153, 153));
        btn_seleccionar_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seleccionar_adminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_seleccionar_admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_seleccionar_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        MaterialTabbed_administrativo.addTab("SELECCIONAR", jPanel5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(MaterialTabbed_administrativo, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MaterialTabbed_administrativo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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

    private void btn_seleccionar_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seleccionar_adminActionPerformed
        try {
            DefaultTableModel modelado = new DefaultTableModel();
            tabla_administrativo.setModel(modelado);
            PreparedStatement ps = null;
            ResultSet rs = null;
            //Connection con= getConection();
            c = new Conection().conectar();
            String sql = "SELECT id_admin, nombre_admin, ap_pat, ap_mat FROM administrativo;";
            ps = c.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMetaD = rs.getMetaData();
            int cant_columnas = rsMetaD.getColumnCount();

            modelado.addColumn("ID DEL ADMINISTRATIVO");
            modelado.addColumn("NOMBRE");
            modelado.addColumn("APELLIDO PATERNO");
            modelado.addColumn("APELLIDO MATERNO");

            while (rs.next()) {
                Object[] filas = new Object[cant_columnas];

                for (int i = 0; i < cant_columnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelado.addRow(filas);
            }
        } catch (Exception e) {
            System.out.println("e");

        }
    }//GEN-LAST:event_btn_seleccionar_adminActionPerformed

    private void btn_guardar_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar_adminActionPerformed
        String nombre = txt_ap_pat.getText();
        String ap_pat = txt_ap_pat.getText();
        String ap_mat = txt_ap_mat.getText();

        if (!nombre.equals("")) {
            g.guardar_administrativo(nombre, ap_pat, ap_mat);
            JOptionPane.showMessageDialog(rootPane, "Registro guardado");
            txt_nom_admin1.setText("");
            txt_ap_pat.setText("");
            txt_ap_mat.setText("");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Ingrese una plaza");
        }
    }//GEN-LAST:event_btn_guardar_adminActionPerformed

    private void combo_admin_modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_admin_modActionPerformed
        try {
            String combop = combo_admin_mod.getSelectedItem().toString();
            if (!combop.equals("Seleccione un ID")) {
                c = new Conection().conectar();
                String datos[] = select.seleccionar_administrativo(combop);
                txt_nom_admin_mod.setText(datos[1]);
                txt_ap_pat_admin_mod.setText(datos[2]);
                txt_ap_mat_admin_mod.setText(datos[3]);

            }
        } catch (Exception x) {
        }
    }//GEN-LAST:event_combo_admin_modActionPerformed

    private void btn_eliminar_admin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar_admin1ActionPerformed
        int g = JOptionPane.showConfirmDialog(null, " ¡¿Seguro que desea eliminar este registro?!", "Cita", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (g == JOptionPane.YES_OPTION) {
            c = new Conection().conectar();
            String combop = combo_admin_mod.getSelectedItem().toString();
            if (!combop.equals("")) {
                el.eliminar_admin(combop);
                txt_nom_admin_mod.setText("");
                txt_ap_pat_admin_mod.setText("");
                txt_ap_mat_admin_mod.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un administrativo");
            }
        }else{
            JOptionPane.showMessageDialog(null, "No se Eliminar nada!!!", "mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_eliminar_admin1ActionPerformed

    private void btn_modificar_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificar_adminActionPerformed
        if (txt_nom_admin_mod.getText().equals("") || txt_ap_pat_admin_mod.getText().equals("") || txt_ap_mat_admin_mod.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos");
        } else {
            int g = JOptionPane.showConfirmDialog(null, " ¡¿Seguro que desea modificar este registro?!", "Cita", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (g == JOptionPane.YES_OPTION) {

                String id_admin = combo_admin_mod.getSelectedItem().toString();

                String Nombre = txt_nom_admin_mod.getText();
                String ap_pat = txt_ap_pat_admin_mod.getText();
                String ap_mat = txt_ap_mat_admin_mod.getText();

                mod.modificar_admin(Nombre, ap_pat, ap_mat, id_admin);
            } else {
                JOptionPane.showMessageDialog(null, "No se Modifico nada!!!", "mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        }


    }//GEN-LAST:event_btn_modificar_adminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private EVD1.MaterialTabbed MaterialTabbed_administrativo;
    private EVD1.CustomButtons btn_eliminar_admin1;
    private EVD1.CustomButtons btn_guardar_admin;
    private EVD1.CustomButtons btn_modificar_admin;
    private EVD1.CustomButtons btn_seleccionar_admin;
    private EVD2.Combobox combo_admin_mod;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_administrativo;
    private EVD1.TextField txt_ap_mat;
    private EVD1.TextField txt_ap_mat_admin_mod;
    private EVD1.TextField txt_ap_pat;
    private EVD1.TextField txt_ap_pat_admin_mod;
    private EVD1.TextField txt_nom_admin1;
    private EVD1.TextField txt_nom_admin_mod;
    // End of variables declaration//GEN-END:variables
}
