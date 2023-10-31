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
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class materias_vista extends javax.swing.JPanel {

    Guardar gua = new Guardar();
    Modificar mod = new Modificar();
    Eliminar el = new Eliminar();
    Seleccionar select;
    Connection c;
    int contador = 0;

    private Component rootPane;

    public materias_vista() {

        initComponents();
        c = new Conection().conectar();
        select = new Seleccionar(c);
        limpiar_combo_materia();
        limpiar_combo_materia2();
    }

    public void limpiar_combo_materia() {
        combo_materia_mod.removeAllItems();
        combo_materia_mod.addItem("Seleccionar materia");
        c = new Conection().conectar();
        String[] barras = select.nombre_materia();

        for (String i : barras) {
            combo_materia_mod.addItem(i);
            contador++;
        }

        txt_nom_materia_mod.setText("");
        txt_semestre_materia_mod.setText("");
        txt_carrera_materia_mod.setText("");
    }

    public void limpiar_combo_materia2() {
        combo_materia_el.removeAllItems();
        combo_materia_el.addItem("Seleccionar materia");
        c = new Conection().conectar();
        String[] barras = select.nombre_materia();

        for (String i : barras) {
            combo_materia_el.addItem(i);
            contador++;
        }

        txt_nom_materia_el.setText("");
        txt_semestre_materia_el.setText("");
        txt_carrera_materia_el.setText("");
    }

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
    Guardar g = new Guardar();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new fondo_panel();
        MaterialTabbed_administrativo = new EVD1.MaterialTabbed();
        jPanel2 = new fondo2();
        btn_guardar_materia = new EVD1.CustomButtons();
        txt_nom_carrera = new EVD1.TextField();
        txt_semestre = new EVD1.TextField();
        txt_nom_materia = new EVD1.TextField();
        jPanel3 = new fondo2();
        jLabel6 = new javax.swing.JLabel();
        txt_carrera_materia_mod = new EVD1.TextField();
        txt_nom_materia_mod = new EVD1.TextField();
        txt_semestre_materia_mod = new EVD1.TextField();
        combo_materia_mod = new EVD2.Combobox();
        btn_materia_mod = new EVD1.CustomButtons();
        jPanel6 = new fondo2();
        jLabel8 = new javax.swing.JLabel();
        txt_carrera_materia_el = new EVD1.TextField();
        txt_nom_materia_el = new EVD1.TextField();
        txt_semestre_materia_el = new EVD1.TextField();
        combo_materia_el = new EVD2.Combobox();
        btn_materia_el = new EVD1.CustomButtons();
        jPanel5 = new fondo2();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_materias = new javax.swing.JTable();
        btn_mostrar = new EVD1.CustomButtons();

        MaterialTabbed_administrativo.setBackground(new java.awt.Color(255, 255, 255));
        MaterialTabbed_administrativo.setForeground(new java.awt.Color(255, 255, 255));
        MaterialTabbed_administrativo.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setForeground(new java.awt.Color(153, 153, 255));

        btn_guardar_materia.setBackground(new java.awt.Color(51, 51, 51));
        btn_guardar_materia.setForeground(new java.awt.Color(255, 255, 255));
        btn_guardar_materia.setText("GUARDAR");
        btn_guardar_materia.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        btn_guardar_materia.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_guardar_materia.setShadowColor(new java.awt.Color(153, 153, 153));
        btn_guardar_materia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar_materiaActionPerformed(evt);
            }
        });

        txt_nom_carrera.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        txt_nom_carrera.setLabelText("CARRERA");

        txt_semestre.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        txt_semestre.setLabelText("SEMESTRE");

        txt_nom_materia.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        txt_nom_materia.setLabelText("NOMBRE ");
        txt_nom_materia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nom_materiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(161, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_guardar_materia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txt_nom_materia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_nom_carrera, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_semestre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(145, 145, 145))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(txt_nom_materia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_semestre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(txt_nom_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btn_guardar_materia, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        MaterialTabbed_administrativo.addTab("GUARDAR", jPanel2);

        txt_carrera_materia_mod.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        txt_carrera_materia_mod.setLabelText("CARRERA");
        txt_carrera_materia_mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_carrera_materia_modActionPerformed(evt);
            }
        });

        txt_nom_materia_mod.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        txt_nom_materia_mod.setLabelText("NOMBRE");
        txt_nom_materia_mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nom_materia_modActionPerformed(evt);
            }
        });

        txt_semestre_materia_mod.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        txt_semestre_materia_mod.setLabelText("SEMESTRE");
        txt_semestre_materia_mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_semestre_materia_modActionPerformed(evt);
            }
        });

        combo_materia_mod.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        combo_materia_mod.setLabeText("");
        combo_materia_mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_materia_modActionPerformed(evt);
            }
        });

        btn_materia_mod.setBackground(new java.awt.Color(51, 51, 51));
        btn_materia_mod.setForeground(new java.awt.Color(255, 255, 255));
        btn_materia_mod.setText("MODIFICAR");
        btn_materia_mod.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        btn_materia_mod.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_materia_mod.setShadowColor(new java.awt.Color(204, 204, 204));
        btn_materia_mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_materia_modActionPerformed(evt);
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
                        .addGap(150, 150, 150)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_materia_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(combo_materia_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_nom_materia_mod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_carrera_materia_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(174, 174, 174))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(txt_semestre_materia_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(474, 474, 474))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(combo_materia_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_nom_materia_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_semestre_materia_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_carrera_materia_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_materia_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        MaterialTabbed_administrativo.addTab("MODIFICAR", jPanel3);

        txt_carrera_materia_el.setEditable(false);
        txt_carrera_materia_el.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        txt_carrera_materia_el.setLabelText("CARRERA");
        txt_carrera_materia_el.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_carrera_materia_elActionPerformed(evt);
            }
        });

        txt_nom_materia_el.setEditable(false);
        txt_nom_materia_el.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        txt_nom_materia_el.setLabelText("NOMBRE");
        txt_nom_materia_el.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nom_materia_elActionPerformed(evt);
            }
        });

        txt_semestre_materia_el.setEditable(false);
        txt_semestre_materia_el.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        txt_semestre_materia_el.setLabelText("SEMESTRE");
        txt_semestre_materia_el.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_semestre_materia_elActionPerformed(evt);
            }
        });

        combo_materia_el.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        combo_materia_el.setLabeText("");
        combo_materia_el.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_materia_elActionPerformed(evt);
            }
        });

        btn_materia_el.setBackground(new java.awt.Color(51, 51, 51));
        btn_materia_el.setForeground(new java.awt.Color(255, 255, 255));
        btn_materia_el.setText("ELIMINAR");
        btn_materia_el.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        btn_materia_el.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_materia_el.setSelected(true);
        btn_materia_el.setShadowColor(new java.awt.Color(204, 204, 204));
        btn_materia_el.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_materia_elActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combo_materia_el, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_carrera_materia_el, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_nom_materia_el, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_materia_el, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                    .addComponent(txt_semestre_materia_el, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(300, 300, 300))))))
                .addGap(174, 174, 174))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(combo_materia_el, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_nom_materia_el, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_semestre_materia_el, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_carrera_materia_el, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_materia_el, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        MaterialTabbed_administrativo.addTab("ELIMINAR", jPanel6);

        tabla_materias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NOMBRE", "ID ", "SEMESTRE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_materias);

        btn_mostrar.setBackground(new java.awt.Color(51, 51, 51));
        btn_mostrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_mostrar.setText("MOSTRAR MATERIAS");
        btn_mostrar.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        btn_mostrar.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_mostrar.setShadowColor(new java.awt.Color(153, 153, 153));
        btn_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MaterialTabbed_administrativo.addTab("SELECCIONAR", jPanel5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(MaterialTabbed_administrativo, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MaterialTabbed_administrativo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void combo_materia_elActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_materia_elActionPerformed
        try {
            String combop = combo_materia_el.getSelectedItem().toString();
            if (!combop.equals("")) {
                c = new Conection().conectar();
                String datos[] = select.seleccionar_materias(combop);
                txt_nom_materia_el.setText(datos[0]);
                txt_semestre_materia_el.setText(datos[1]);
                txt_carrera_materia_el.setText(datos[2]);

            }
        } catch (Exception x) {
        }
    }//GEN-LAST:event_combo_materia_elActionPerformed

    private void txt_semestre_materia_elActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_semestre_materia_elActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_semestre_materia_elActionPerformed

    private void txt_nom_materia_elActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nom_materia_elActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nom_materia_elActionPerformed

    private void txt_carrera_materia_elActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_carrera_materia_elActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_carrera_materia_elActionPerformed

    private void combo_materia_modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_materia_modActionPerformed
        try {
            String combop = combo_materia_mod.getSelectedItem().toString();
            if (!combop.equals("")) {
                c = new Conection().conectar();
                String datos[] = select.seleccionar_materias(combop);
                txt_nom_materia_mod.setText(datos[0]);
                txt_semestre_materia_mod.setText(datos[1]);
                txt_carrera_materia_mod.setText(datos[2]);

            }
        } catch (Exception x) {
        }
    }//GEN-LAST:event_combo_materia_modActionPerformed

    private void txt_semestre_materia_modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_semestre_materia_modActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_semestre_materia_modActionPerformed

    private void txt_nom_materia_modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nom_materia_modActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nom_materia_modActionPerformed

    private void txt_carrera_materia_modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_carrera_materia_modActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_carrera_materia_modActionPerformed

    private void txt_nom_materiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nom_materiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nom_materiaActionPerformed

    private void btn_guardar_materiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar_materiaActionPerformed
        if (txt_nom_materia.getText().equals("") || txt_semestre.getText().equals("") || txt_nom_carrera.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campos vacios");
        } else {

            String nombre = txt_nom_materia.getText();
            int semestre = Integer.parseInt(txt_semestre.getText());
            String carrera = txt_nom_carrera.getText();
            //Conexion
            c = new Conection().conectar();
            //Statement t = c.getConexion();
            PreparedStatement ps = null;
            ResultSet rs = null;
            int pRes;

            try {
                c = new Conection().conectar();
                //String sql = "CALL modificar_materia ('"+nombre+ "',"+semestre+ ",'"+carrera+ "' NULL);";
                String sql = "CALL guardar_materia ('" + nombre + "'," + semestre + ",'" + carrera + "', NULL);";
                //ps = c.prepareStatement(sql);
                ps = c.prepareStatement(sql);
                rs = ps.executeQuery();
                rs.next();
                pRes = rs.getInt("pRes");
                //Condicion para cuando ya se ha guardado el registro
                if (pRes == 1) {
                    JOptionPane.showMessageDialog(null, "Materia guardada", "Carrera guardada exitosamente", JOptionPane.INFORMATION_MESSAGE);
                    txt_nom_materia.setText("");
                    txt_semestre.setText("");
                    txt_nom_carrera.setText("");
                    //this.dispose();
                } else if (pRes == 2) {
                    // JOptionPane.showMessageDialog(null, "Compra realizada");
                    JOptionPane.showMessageDialog(null, "Carrera no valida ", "Carrera no encontrada", JOptionPane.ERROR_MESSAGE);
                    //limpiar_articulos();    
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }//GEN-LAST:event_btn_guardar_materiaActionPerformed

    private void btn_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrarActionPerformed
        try {
            DefaultTableModel modelado = new DefaultTableModel();
            tabla_materias.setModel(modelado);
            PreparedStatement ps = null;
            ResultSet rs = null;
            //Connection con= getConection();
            c = new Conection().conectar();
            String sql = "select ma.nom_materia, ma.semestre, carr.nom_carrera from materias ma INNER JOIN carrera carr ON carr.id_carrera = ma.id_carrera;";
            ps = c.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMetaD = rs.getMetaData();
            int cant_columnas = rsMetaD.getColumnCount();

            modelado.addColumn("NOMBRE");
            modelado.addColumn("ID");
            modelado.addColumn("CARRERA CORRESPONDIENTE");

            while (rs.next()) {
                Object[] filas = new Object[cant_columnas];

                for (int i = 0; i < cant_columnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelado.addRow(filas);
            }
        } catch (Exception e) {
            System.out.println("e");

        }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_mostrarActionPerformed

    private void btn_materia_modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_materia_modActionPerformed
        if (txt_nom_materia_mod.getText().equals("") || txt_semestre_materia_mod.getText().equals("") || txt_carrera_materia_mod.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campos vacios");
        } else {
            int g = JOptionPane.showConfirmDialog(null, " ¡¿Seguro que desea modificar este registro?!", "Cita", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (g == JOptionPane.YES_OPTION) {

                String combo = combo_materia_mod.getSelectedItem().toString();
                String nombre = txt_nom_materia_mod.getText();
                int semestre = Integer.parseInt(txt_semestre_materia_mod.getText());
                String carrera = txt_carrera_materia_mod.getText();
                //Conexion
                c = new Conection().conectar();
                //Statement t = c.getConexion();
                PreparedStatement ps = null;
                ResultSet rs = null;
                int pRes;

                try {
                    c = new Conection().conectar();
                    //String sql = "CALL modificar_materia ('"+combo+ "','"+nombre+ "',"+semestre+ ",'"+carrera+ "' NULL);";
                    String sql = "CALL modificar_materia ('" + combo + "','" + nombre + "'," + semestre + ",'" + carrera + "', NULL);";
                    //ps = c.prepareStatement(sql);
                    ps = c.prepareStatement(sql);
                    rs = ps.executeQuery();
                    rs.next();
                    pRes = rs.getInt("pRes");
                    //Condicion para cuando ya se ha guardado el registro
                    if (pRes == 1) {
                        JOptionPane.showMessageDialog(null, "Materia actualizada", "Visita guardada exitosamente", JOptionPane.INFORMATION_MESSAGE);
                        //limpiar_articulos();
                        //this.dispose();
                    } else if (pRes == 2) {
                        // JOptionPane.showMessageDialog(null, "Compra realizada");
                        JOptionPane.showMessageDialog(null, "Materia actualizada", "", JOptionPane.INFORMATION_MESSAGE);
                        //limpiar_articulos();

                    }
                    if (pRes == 3) {
                        // JOptionPane.showMessageDialog(null, "Compra realizada");
                        JOptionPane.showMessageDialog(null, "Materia no encontrada", "404 NOT FOUND", JOptionPane.ERROR_MESSAGE);
                        //limpiar_articulos();

                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se Modifico nada!!!", "mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }//GEN-LAST:event_btn_materia_modActionPerformed

    private void btn_materia_elActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_materia_elActionPerformed
        int g = JOptionPane.showConfirmDialog(null, " ¡¿Seguro que desea eliminar este registro?!", "Cita", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (g == JOptionPane.YES_OPTION) {

            c = new Conection().conectar();
            String combop = combo_materia_el.getSelectedItem().toString();
            if (!combop.equals("")) {
                el.eliminar_materia(combop);
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione una materia");
            }
        }else{
            JOptionPane.showMessageDialog(null, "No se Elimino nada!!!", "mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_materia_elActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private EVD1.MaterialTabbed MaterialTabbed_administrativo;
    private EVD1.CustomButtons btn_guardar_materia;
    private EVD1.CustomButtons btn_materia_el;
    private EVD1.CustomButtons btn_materia_mod;
    private EVD1.CustomButtons btn_mostrar;
    private EVD2.Combobox combo_materia_el;
    private EVD2.Combobox combo_materia_mod;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_materias;
    private EVD1.TextField txt_carrera_materia_el;
    private EVD1.TextField txt_carrera_materia_mod;
    private EVD1.TextField txt_nom_carrera;
    private EVD1.TextField txt_nom_materia;
    private EVD1.TextField txt_nom_materia_el;
    private EVD1.TextField txt_nom_materia_mod;
    private EVD1.TextField txt_semestre;
    private EVD1.TextField txt_semestre_materia_el;
    private EVD1.TextField txt_semestre_materia_mod;
    // End of variables declaration//GEN-END:variables
}
