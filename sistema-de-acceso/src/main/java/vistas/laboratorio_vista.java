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
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class laboratorio_vista extends javax.swing.JPanel {

    private Component rootPane;
    int contador = 0;
    Seleccionar busq;

    Guardar guardar;
    Connection c;

    Guardar g = new Guardar();
    Modificar met = new Modificar();
    Eliminar el = new Eliminar();

    /**
     * Creates new form laboratorio_vista
     */
    public laboratorio_vista() {
        initComponents();
        c = new Conection().conectar();
        busq = new Seleccionar(c);
        limpiar_articulos();
        limpiar_articulos2();
        limpiar_articulos3();
    }

    public void limpiar_articulos() {
        IdComboLab.removeAllItems();
        IdComboLab.addItem("Seleccione");
        c = new Conection().conectar();
        String[] barras = busq.Ver_ID();

        for (String i : barras) {
            IdComboLab.addItem(i);
            contador++;
        }
        TxtNomLab2.setText("");
        TxtUbicacion2.setText("");
        TxtNombreAdmin.setText("");
    }

    public void limpiar_articulos2() {
        ComboLab2.removeAllItems();
        ComboLab2.addItem("Seleccione");
        c = new Conection().conectar();
        String[] barras = busq.Ver_ID();

        for (String i : barras) {
            ComboLab2.addItem(i);
            contador++;
        }
        TxtNomLab3.setText("");
        TxtUbicacion3.setText("");
        TxtIdAdmin3.setText("");
    }

    public void limpiar_articulos3() {
        ComboLab1.removeAllItems();
        ComboLab1.addItem("Seleccione");
        c = new Conection().conectar();
        String[] barras = busq.Ver_ID();

        for (String i : barras) {
            ComboLab1.addItem(i);
            contador++;
        }
        TxtNomLab4.setText("");
        TxtUbicacion4.setText("");
    }

    //--------------------------------------------------------------------------
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
        btn_guardar_lab = new EVD1.CustomButtons();
        TxtUbicacion = new EVD1.TextField();
        TxtNomLab = new EVD1.TextField();
        TxtNombreAdmin = new EVD1.TextField();
        jPanel3 = new fondo2();
        IdComboLab = new EVD2.Combobox();
        TxtNomLab2 = new EVD1.TextField();
        TxtUbicacion2 = new EVD1.TextField();
        btn_mod_lab = new EVD1.CustomButtons();
        jPanel4 = new fondo2();
        TxtNomLab4 = new EVD1.TextField();
        TxtUbicacion4 = new EVD1.TextField();
        btn_eliminar_lab = new EVD1.CustomButtons();
        ComboLab1 = new EVD2.Combobox();
        jPanel5 = new fondo2();
        ComboLab2 = new EVD2.Combobox();
        TxtIdAdmin3 = new EVD1.TextField();
        TxtUbicacion3 = new EVD1.TextField();
        TxtNomLab3 = new EVD1.TextField();

        MaterialTabbed_administrativo.setBackground(new java.awt.Color(255, 255, 255));
        MaterialTabbed_administrativo.setForeground(new java.awt.Color(255, 255, 255));
        MaterialTabbed_administrativo.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N

        btn_guardar_lab.setBackground(new java.awt.Color(51, 51, 51));
        btn_guardar_lab.setForeground(new java.awt.Color(255, 255, 255));
        btn_guardar_lab.setText("GUARDAR");
        btn_guardar_lab.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        btn_guardar_lab.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_guardar_lab.setShadowColor(new java.awt.Color(153, 153, 153));
        btn_guardar_lab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar_labActionPerformed(evt);
            }
        });

        TxtUbicacion.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        TxtUbicacion.setLabelText("UBICACIÓN");
        TxtUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUbicacionActionPerformed(evt);
            }
        });

        TxtNomLab.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        TxtNomLab.setLabelText("NOMBRE DEL LABORATORIO");
        TxtNomLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNomLabActionPerformed(evt);
            }
        });

        TxtNombreAdmin.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        TxtNombreAdmin.setLabelText("NOMBRE DEL ADMINISTRADOR");
        TxtNombreAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_guardar_lab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtNomLab, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                            .addComponent(TxtUbicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtNombreAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(163, 163, 163))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(TxtNomLab, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtNombreAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_guardar_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        MaterialTabbed_administrativo.addTab("GUARDAR", jPanel2);

        IdComboLab.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        IdComboLab.setLabeText("");
        IdComboLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdComboLabActionPerformed(evt);
            }
        });

        TxtNomLab2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        TxtNomLab2.setLabelText("NOMBRE DEL LABORATORIO");
        TxtNomLab2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNomLab2ActionPerformed(evt);
            }
        });

        TxtUbicacion2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        TxtUbicacion2.setLabelText("UBICACIÓN");
        TxtUbicacion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUbicacion2ActionPerformed(evt);
            }
        });

        btn_mod_lab.setBackground(new java.awt.Color(51, 51, 51));
        btn_mod_lab.setForeground(new java.awt.Color(255, 255, 255));
        btn_mod_lab.setText("MODIFICAR");
        btn_mod_lab.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        btn_mod_lab.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_mod_lab.setShadowColor(new java.awt.Color(153, 153, 153));
        btn_mod_lab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mod_labActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 254, Short.MAX_VALUE)
                .addComponent(IdComboLab, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(254, 254, 254))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_mod_lab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(TxtUbicacion2, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                        .addComponent(TxtNomLab2, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)))
                .addGap(163, 163, 163))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(IdComboLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtNomLab2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtUbicacion2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_mod_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        MaterialTabbed_administrativo.addTab("MODIFICAR", jPanel3);

        TxtNomLab4.setEditable(false);
        TxtNomLab4.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        TxtNomLab4.setLabelText("NOMBRE DEL LABORATORIO");
        TxtNomLab4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNomLab4ActionPerformed(evt);
            }
        });

        TxtUbicacion4.setEditable(false);
        TxtUbicacion4.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        TxtUbicacion4.setLabelText("UBICACIÓN");
        TxtUbicacion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUbicacion4ActionPerformed(evt);
            }
        });

        btn_eliminar_lab.setBackground(new java.awt.Color(51, 51, 51));
        btn_eliminar_lab.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar_lab.setText("ELIMINAR");
        btn_eliminar_lab.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        btn_eliminar_lab.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_eliminar_lab.setShadowColor(new java.awt.Color(153, 153, 153));
        btn_eliminar_lab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminar_labActionPerformed(evt);
            }
        });

        ComboLab1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        ComboLab1.setLabeText("");
        ComboLab1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboLab1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_eliminar_lab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 163, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TxtNomLab4, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtUbicacion4, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(163, 163, 163))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(ComboLab1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(ComboLab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TxtNomLab4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtUbicacion4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btn_eliminar_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
        );

        MaterialTabbed_administrativo.addTab("ELIMINAR", jPanel4);

        ComboLab2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        ComboLab2.setLabeText("");
        ComboLab2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboLab2ActionPerformed(evt);
            }
        });

        TxtIdAdmin3.setEditable(false);
        TxtIdAdmin3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        TxtIdAdmin3.setLabelText("ID DEL ADMINISTRADOR");
        TxtIdAdmin3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIdAdmin3ActionPerformed(evt);
            }
        });

        TxtUbicacion3.setEditable(false);
        TxtUbicacion3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        TxtUbicacion3.setLabelText("UBICACIÓN");
        TxtUbicacion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUbicacion3ActionPerformed(evt);
            }
        });

        TxtNomLab3.setEditable(false);
        TxtNomLab3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        TxtNomLab3.setLabelText("NOMBRE DEL LABORATORIO");
        TxtNomLab3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNomLab3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(163, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(ComboLab2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(254, 254, 254))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TxtUbicacion3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtNomLab3, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtIdAdmin3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(163, 163, 163))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(ComboLab2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtNomLab3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtUbicacion3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtIdAdmin3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
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

    private void btn_guardar_labActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar_labActionPerformed
        if (!TxtNomLab.getText().equals("") || !TxtUbicacion.getText().equals("") || !TxtNombreAdmin.getText().equals("")) {

            String nombre_lab = TxtNomLab.getText();
            String ubicacion = TxtUbicacion.getText();
            String id_admin = TxtNombreAdmin.getText();
            //Conexion
            c = new Conection().conectar();
            //Statement t = c.getConexion();
            PreparedStatement ps = null;
            ResultSet rs = null;
            int pRes;

            try {
                c = new Conection().conectar();
                String sql = "Call Guardar_laboratorio('" + nombre_lab + "' ,'" + ubicacion + "' ,'" + id_admin + "', NULL);";
                ps = c.prepareStatement(sql);
                rs = ps.executeQuery();
                rs.next();
                pRes = rs.getInt("pRes");
                //Condicion para cuando ya se ha guardado el registro
                if (pRes == 1) {
                    JOptionPane.showMessageDialog(null, "Registro Exitoso", "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);
                    TxtNomLab.setText("");
                    TxtUbicacion.setText("");
                    TxtNombreAdmin.setText("");
                } else if (pRes == 2) {
                    JOptionPane.showMessageDialog(null, "Ya existe el laboratorio", "Ya existe el laboratorio", JOptionPane.INFORMATION_MESSAGE);
                    TxtNomLab.setText("");
                    TxtUbicacion.setText("");
                    TxtNombreAdmin.setText("");
                }
                if (pRes == 3) {
                    JOptionPane.showMessageDialog(null, "No se encontro el nombre del administrativo", "No se encontro el nombre del administrativo", JOptionPane.ERROR_MESSAGE);
                    TxtNomLab.setText("");
                    TxtUbicacion.setText("");
                    TxtNombreAdmin.setText("");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {

            JOptionPane.showMessageDialog(null, "Rellene todos los campos");

        }

    }//GEN-LAST:event_btn_guardar_labActionPerformed

    private void TxtUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUbicacionActionPerformed

    }//GEN-LAST:event_TxtUbicacionActionPerformed

    private void TxtNomLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNomLabActionPerformed

    }//GEN-LAST:event_TxtNomLabActionPerformed

    private void TxtNombreAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreAdminActionPerformed

    }//GEN-LAST:event_TxtNombreAdminActionPerformed

    private void IdComboLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdComboLabActionPerformed
        try {
            String id_lab = IdComboLab.getSelectedItem().toString();
            if (!id_lab.equals("Seleccione")) {
                c = new Conection().conectar();

                String datos[] = busq.verLab(id_lab);
                TxtNomLab2.setText(datos[0]);
                TxtUbicacion2.setText(datos[1]);

            }
        } catch (Exception x) {
            System.out.println(x);
        }
    }//GEN-LAST:event_IdComboLabActionPerformed

    private void TxtNomLab2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNomLab2ActionPerformed

    }//GEN-LAST:event_TxtNomLab2ActionPerformed

    private void TxtUbicacion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUbicacion2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUbicacion2ActionPerformed

    private void btn_mod_labActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mod_labActionPerformed
        // TODO add your handling code here:
        if (!TxtNomLab2.getText().equals("") || !TxtUbicacion2.getText().equals("")) {
            String id_lab = IdComboLab.getSelectedItem().toString();
            String nombre_lab = TxtNomLab2.getText();
            String ubicacion = TxtUbicacion2.getText();
            //Conexion
            c = new Conection().conectar();
            PreparedStatement ps = null;
            ResultSet rs = null;
            int pRes;
            int g = JOptionPane.showConfirmDialog(null, " ¡¿Seguro que desea modificar este registro?!", "Cita", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (g == JOptionPane.YES_OPTION) {

                try {
                    c = new Conection().conectar();
                    String sql = "Call modificar_laboratorio('" + nombre_lab + "' ,'" + ubicacion + "', " + id_lab + ", NULL);";
                    ps = c.prepareStatement(sql);
                    rs = ps.executeQuery();
                    rs.next();
                    pRes = rs.getInt("pRes");
                    //Condicion para cuando ya se ha guardado el registro
                    if (pRes == 1) {
                        JOptionPane.showMessageDialog(null, "Registro Modificado", "Registro Modificado", JOptionPane.INFORMATION_MESSAGE);
                        TxtNomLab2.setText("");
                        TxtUbicacion2.setText("");
                    } else if (pRes == 2) {
                        JOptionPane.showMessageDialog(null, "Ya existe el laboratorio", "Ya existe el laboratorio", JOptionPane.INFORMATION_MESSAGE);
                        TxtNomLab2.setText("");
                        TxtUbicacion2.setText("");
                    }
                    if (pRes == 3) {
                        JOptionPane.showMessageDialog(null, "No se encontro el id", "No se encontro el id", JOptionPane.ERROR_MESSAGE);
                        TxtNomLab2.setText("");
                        TxtUbicacion2.setText("");
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se Modifico nada!!!", "mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {

            JOptionPane.showMessageDialog(null, "Rellene todos los campos");

        }
    }//GEN-LAST:event_btn_mod_labActionPerformed

    private void TxtNomLab4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNomLab4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNomLab4ActionPerformed

    private void TxtUbicacion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUbicacion4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUbicacion4ActionPerformed

    private void btn_eliminar_labActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar_labActionPerformed
        String id_lab = ComboLab1.getSelectedItem().toString();
         int g = JOptionPane.showConfirmDialog(null, " ¡¿Seguro que desea eliminar este registro?!", "Cita", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (g == JOptionPane.YES_OPTION) {

            el.eliminarLab(id_lab);
            TxtNomLab4.setText("");
            TxtUbicacion4.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "No se Elimino nada!!!", "mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_eliminar_labActionPerformed

    private void ComboLab1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboLab1ActionPerformed
        try {
            String id_lab = ComboLab1.getSelectedItem().toString();
            if (!id_lab.equals("Seleccione")) {
                c = new Conection().conectar();

                String datos[] = busq.verLab(id_lab);
                TxtNomLab4.setText(datos[0]);
                TxtUbicacion4.setText(datos[1]);

            }
        } catch (Exception x) {
            System.out.println(x);
        }
    }//GEN-LAST:event_ComboLab1ActionPerformed

    private void ComboLab2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboLab2ActionPerformed
        try {
            String id_lab2 = ComboLab2.getSelectedItem().toString();
            if (!id_lab2.equals("Seleccione")) {
                c = new Conection().conectar();

                String datos[] = busq.verLab2(id_lab2);
                TxtNomLab3.setText(datos[0]);
                TxtUbicacion3.setText(datos[1]);
                TxtIdAdmin3.setText(datos[2]);

            }
        } catch (Exception x) {
        }        // TODO add your handling code here:
    }//GEN-LAST:event_ComboLab2ActionPerformed

    private void TxtIdAdmin3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIdAdmin3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIdAdmin3ActionPerformed

    private void TxtUbicacion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUbicacion3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUbicacion3ActionPerformed

    private void TxtNomLab3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNomLab3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNomLab3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private EVD2.Combobox ComboLab1;
    private EVD2.Combobox ComboLab2;
    private EVD2.Combobox IdComboLab;
    private EVD1.MaterialTabbed MaterialTabbed_administrativo;
    private EVD1.TextField TxtIdAdmin3;
    private EVD1.TextField TxtNomLab;
    private EVD1.TextField TxtNomLab2;
    private EVD1.TextField TxtNomLab3;
    private EVD1.TextField TxtNomLab4;
    private EVD1.TextField TxtNombreAdmin;
    private EVD1.TextField TxtUbicacion;
    private EVD1.TextField TxtUbicacion2;
    private EVD1.TextField TxtUbicacion3;
    private EVD1.TextField TxtUbicacion4;
    private EVD1.CustomButtons btn_eliminar_lab;
    private EVD1.CustomButtons btn_guardar_lab;
    private EVD1.CustomButtons btn_mod_lab;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
