/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Jose Eduardo Orozco Cardenas <eduardo.orozco66@unach.mx>
 */
public class Lab_Linux_A extends javax.swing.JFrame {

    /**
     * Creates new form Lab_Linux_B
     */
    public Lab_Linux_A() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    fondo_panel fondo = new fondo_panel();

    class fondo_panel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon("src/main/java/Iconos/Pantalla_inicio_(1).png").getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }

    }

    login_admin lgadmin = new login_admin();
    foraneo foraneo = new foraneo();
    ImageIcon iconobtn3 = new ImageIcon("src/main/java/Iconos/llave.png");

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new fondo_panel();
        login_admin = new EVD1.CustomButtons();
        btn_escanerforaneo = new EVD1.CustomButtons();
        btn_foraneo1 = new EVD1.CustomButtons();
        btn_alumno = new EVD1.CustomButtons();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login_admin.setIcon( iconobtn3);
        login_admin.setBackground(new java.awt.Color(29, 53, 100));
        login_admin.setIcon(iconobtn3);
        login_admin.setRippleColor(new java.awt.Color(255, 255, 255));
        login_admin.setShadowColor(new java.awt.Color(255, 255, 255));
        login_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_adminActionPerformed(evt);
            }
        });
        jPanel2.add(login_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 440, 50, 50));

        login_admin.setIcon( iconobtn3);
        btn_escanerforaneo.setBackground(new java.awt.Color(29, 53, 100));
        btn_escanerforaneo.setForeground(new java.awt.Color(255, 255, 255));
        btn_escanerforaneo.setText("ESCANEA AQUÍ");
        btn_escanerforaneo.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        btn_escanerforaneo.setRippleColor(new java.awt.Color(255, 255, 255));
        btn_escanerforaneo.setShadowColor(new java.awt.Color(255, 255, 255));
        btn_escanerforaneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_escanerforaneoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_escanerforaneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 340, 60));

        login_admin.setIcon( iconobtn3);
        btn_foraneo1.setBackground(new java.awt.Color(29, 53, 100));
        btn_foraneo1.setForeground(new java.awt.Color(255, 255, 255));
        btn_foraneo1.setText("RELLENA TU FORMULARIO AQUÍ");
        btn_foraneo1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        btn_foraneo1.setRippleColor(new java.awt.Color(255, 255, 255));
        btn_foraneo1.setShadowColor(new java.awt.Color(255, 255, 255));
        btn_foraneo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_foraneo1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_foraneo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 340, 60));

        login_admin.setIcon( iconobtn3);
        btn_alumno.setForeground(new java.awt.Color(0, 0, 0));
        btn_alumno.setText("ESCANEA TU CODIGO");
        btn_alumno.setActionCommand("ESCANEA TU CÓDIGO");
        btn_alumno.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        btn_alumno.setRippleColor(new java.awt.Color(0, 0, 0));
        btn_alumno.setShadowColor(new java.awt.Color(0, 0, 0));
        btn_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alumnoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 330, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void login_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_adminActionPerformed
            // TODO add your handling code here:
        Seleccionar_laboratorio sl = new Seleccionar_laboratorio();
        lgadmin.setVisible(true);
        this.dispose();
        lgadmin.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                sl.setVisible(true);
            }
        });    // TODO add your handling code here:
    }//GEN-LAST:event_login_adminActionPerformed

    private void btn_escanerforaneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_escanerforaneoActionPerformed
        // TODO add your handling code here: ACCION FORANEO
        Escanear_Foraneo_la escan_f = new Escanear_Foraneo_la();
        if (evt.getSource() == btn_escanerforaneo) {
            btn_alumno.setEnabled(false);
            btn_foraneo1.setEnabled(false);
            btn_escanerforaneo.setEnabled(false);
            login_admin.setEnabled(false);

            escan_f.setVisible(true);

            escan_f.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent we) {
                    btn_alumno.setEnabled(true);
                    btn_foraneo1.setEnabled(true);
                    btn_escanerforaneo.setEnabled(true);
                    login_admin.setEnabled(true);
                }

                public void windowClosed(WindowEvent we) {
                    btn_alumno.setEnabled(true);
                    btn_foraneo1.setEnabled(true);
                    btn_escanerforaneo.setEnabled(true);
                    login_admin.setEnabled(true);
                }
            });
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_escanerforaneoActionPerformed

    private void btn_foraneo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_foraneo1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        foraneo.setVisible(true);
        foraneo.addWindowListener(new WindowAdapter(){
            @Override
                public void windowClosing(WindowEvent we) {
                    btn_alumno.setEnabled(true);
                    btn_foraneo1.setEnabled(true);
                    btn_escanerforaneo.setEnabled(true);
                    login_admin.setEnabled(true);
                    setVisible(true);
                }

                public void windowClosed(WindowEvent we) {
                    btn_alumno.setEnabled(true);
                    btn_foraneo1.setEnabled(true);
                    btn_escanerforaneo.setEnabled(true);
                    login_admin.setEnabled(true);
                    setVisible(true);
                }
        });        // TODO add your handling code here:
    }//GEN-LAST:event_btn_foraneo1ActionPerformed

    private void btn_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alumnoActionPerformed
        // TODO add your handling code here: ACCION ALUMNO
        Escaner_alumno_la escaum = new Escaner_alumno_la();
        if (evt.getSource() == btn_alumno) {
            btn_alumno.setEnabled(false);
            btn_foraneo1.setEnabled(false);
            btn_escanerforaneo.setEnabled(false);
            login_admin.setEnabled(false);

            escaum.setVisible(true);

            escaum.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent we) {
                    btn_alumno.setEnabled(true);
                    btn_foraneo1.setEnabled(true);
                    btn_escanerforaneo.setEnabled(true);
                    login_admin.setEnabled(true);
                }

                public void windowClosed(WindowEvent we) {
                    btn_alumno.setEnabled(true);
                    btn_foraneo1.setEnabled(true);
                    btn_escanerforaneo.setEnabled(true);
                    login_admin.setEnabled(true);
                }
            });
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_alumnoActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private EVD1.CustomButtons btn_alumno;
    private EVD1.CustomButtons btn_escanerforaneo;
    private EVD1.CustomButtons btn_foraneo1;
    private javax.swing.JPanel jPanel2;
    private EVD1.CustomButtons login_admin;
    // End of variables declaration//GEN-END:variables
}
