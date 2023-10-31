package vistas;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Gestion_usuarios extends javax.swing.JPanel {

    public Gestion_usuarios() {
        initComponents();
    }

    fondo_panel fondo = new fondo_panel();

    class fondo_panel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon("src/main/java/Iconos/Gestion_horarios.png").getImage();
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
            imagen = new ImageIcon("src/main/java/Iconos/inicio_usuario.png").getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }

    //importar iconos
    ImageIcon icalumno = new ImageIcon("src/main/java/Iconos/alumno.png");
    ImageIcon icvisitas_alumno = new ImageIcon("src/main/java/Iconos/visitas_alumno.png");
    ImageIcon ichistorial_alumno = new ImageIcon("src/main/java/Iconos/historial_alumno.png");
    ImageIcon icforaneo = new ImageIcon("src/main/java/Iconos/viajero.png");
    ImageIcon icvisitas_foraneo = new ImageIcon("src/main/java/Iconos/visitas_foraneo.png");
    ImageIcon ichistorial_foraneo = new ImageIcon("src/main/java/Iconos/historial_foraneo.png");
    ImageIcon btn_reportes = new ImageIcon("src/main/java/Iconos/reportes.png");

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new fondo_panel();
        jPanel2 = new fondo_panel();
        contenedor3 = new fondo2();
        customButtons1 = new EVD1.CustomButtons();
        customButtons2 = new EVD1.CustomButtons();
        customButtons3 = new EVD1.CustomButtons();
        customButtons6 = new EVD1.CustomButtons();
        customButtons5 = new EVD1.CustomButtons();
        customButtons4 = new EVD1.CustomButtons();
        botn_reportes = new EVD1.CustomButtons();

        javax.swing.GroupLayout contenedor3Layout = new javax.swing.GroupLayout(contenedor3);
        contenedor3.setLayout(contenedor3Layout);
        contenedor3Layout.setHorizontalGroup(
            contenedor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 749, Short.MAX_VALUE)
        );
        contenedor3Layout.setVerticalGroup(
            contenedor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        customButtons1.setBackground(new java.awt.Color(36, 36, 36));
        customButtons1.setIcon(icalumno);
        customButtons1.setToolTipText("Alumnos");
        customButtons1.setRippleColor(new java.awt.Color(255, 255, 255));
        customButtons1.setShadowColor(new java.awt.Color(36, 36, 36));
        customButtons1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customButtons1ActionPerformed(evt);
            }
        });

        customButtons2.setBackground(new java.awt.Color(36, 36, 36));
        customButtons2.setIcon(icvisitas_alumno);
        customButtons2.setToolTipText("Visitas de Alumnos");
        customButtons2.setRippleColor(new java.awt.Color(255, 255, 255));
        customButtons2.setShadowColor(new java.awt.Color(36, 36, 36));
        customButtons2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customButtons2ActionPerformed(evt);
            }
        });

        customButtons3.setBackground(new java.awt.Color(36, 36, 36));
        customButtons3.setIcon(ichistorial_alumno);
        customButtons3.setToolTipText("Historial Alumno");
        customButtons3.setRippleColor(new java.awt.Color(255, 255, 255));
        customButtons3.setShadowColor(new java.awt.Color(36, 36, 36));
        customButtons3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customButtons3ActionPerformed(evt);
            }
        });

        customButtons6.setBackground(new java.awt.Color(36, 36, 36));
        customButtons6.setIcon(ichistorial_foraneo);
        customButtons6.setToolTipText("Historial Foraneo");
        customButtons6.setRippleColor(new java.awt.Color(255, 255, 255));
        customButtons6.setShadowColor(new java.awt.Color(36, 36, 36));
        customButtons6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customButtons6ActionPerformed(evt);
            }
        });

        customButtons5.setBackground(new java.awt.Color(36, 36, 36));
        customButtons5.setIcon(icvisitas_foraneo);
        customButtons5.setToolTipText("Visitas Forano");
        customButtons5.setRippleColor(new java.awt.Color(255, 255, 255));
        customButtons5.setShadowColor(new java.awt.Color(36, 36, 36));
        customButtons5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customButtons5ActionPerformed(evt);
            }
        });

        customButtons4.setBackground(new java.awt.Color(36, 36, 36));
        customButtons4.setIcon(icforaneo);
        customButtons4.setToolTipText("Alumno Foraneo");
        customButtons4.setRippleColor(new java.awt.Color(255, 255, 255));
        customButtons4.setShadowColor(new java.awt.Color(36, 36, 36));
        customButtons4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customButtons4ActionPerformed(evt);
            }
        });

        botn_reportes.setBackground(new java.awt.Color(36, 36, 36));
        botn_reportes.setIcon(btn_reportes);
        botn_reportes.setToolTipText("Reportes");
        botn_reportes.setRippleColor(new java.awt.Color(255, 255, 255));
        botn_reportes.setShadowColor(new java.awt.Color(36, 36, 36));
        botn_reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botn_reportesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(customButtons1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(customButtons2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(customButtons3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(customButtons6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(customButtons5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(customButtons4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botn_reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedor3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(customButtons1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customButtons2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customButtons3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customButtons4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customButtons5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customButtons6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botn_reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void customButtons1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customButtons1ActionPerformed
        alumnos_vista cv = new alumnos_vista();
        cv.setSize(749, 500);
        cv.setLocation(0, 0);

        contenedor3.removeAll();;
        contenedor3.add(cv, BorderLayout.CENTER);
        contenedor3.revalidate();
        contenedor3.repaint();
    }//GEN-LAST:event_customButtons1ActionPerformed

    private void customButtons2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customButtons2ActionPerformed
        // TODO add your handling code here:
        visitas_alumnos visalum = new visitas_alumnos();
        visalum.setSize(749, 500);
        visalum.setLocation(0, 0);

        contenedor3.removeAll();;
        contenedor3.add(visalum, BorderLayout.CENTER);
        contenedor3.revalidate();
        contenedor3.repaint();
    }//GEN-LAST:event_customButtons2ActionPerformed

    private void customButtons3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customButtons3ActionPerformed

        historial_visitas hvt = new historial_visitas();
        hvt.setSize(749, 500);
        hvt.setLocation(0, 0);

        contenedor3.removeAll();;
        contenedor3.add(hvt, BorderLayout.CENTER);
        contenedor3.revalidate();
        contenedor3.repaint();            // TODO add your handling code here:
    }//GEN-LAST:event_customButtons3ActionPerformed

    private void customButtons4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customButtons4ActionPerformed
        // TODO add your handling code here:
        foraneo_admin_vista fa = new foraneo_admin_vista();
        fa.setSize(749, 500);
        fa.setLocation(0, 0);

        contenedor3.removeAll();;
        contenedor3.add(fa, BorderLayout.CENTER);
        contenedor3.revalidate();
        contenedor3.repaint();
    }//GEN-LAST:event_customButtons4ActionPerformed

    private void customButtons5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customButtons5ActionPerformed
        // TODO add your handling code here:
        visitas_foraneo vf = new visitas_foraneo();
        vf.setSize(749, 500);
        vf.setLocation(0, 0);

        contenedor3.removeAll();;
        contenedor3.add(vf, BorderLayout.CENTER);
        contenedor3.revalidate();
        contenedor3.repaint();
    }//GEN-LAST:event_customButtons5ActionPerformed

    private void customButtons6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customButtons6ActionPerformed
        // TODO add your handling code here:
        historial_foraneo hf = new historial_foraneo();
        hf.setSize(749, 500);
        hf.setLocation(0, 0);

        contenedor3.removeAll();;
        contenedor3.add(hf, BorderLayout.CENTER);
        contenedor3.revalidate();
        contenedor3.repaint();
    }//GEN-LAST:event_customButtons6ActionPerformed

    private void botn_reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botn_reportesActionPerformed
        // TODO add your handling code here: boton para reportes 
        Reportes rep = new Reportes();
        rep.setSize(749, 500);
        rep.setLocation(0, 0);

        contenedor3.removeAll();;
        contenedor3.add(rep, BorderLayout.CENTER);
        contenedor3.revalidate();
        contenedor3.repaint();
    }//GEN-LAST:event_botn_reportesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private EVD1.CustomButtons botn_reportes;
    private javax.swing.JPanel contenedor3;
    private EVD1.CustomButtons customButtons1;
    private EVD1.CustomButtons customButtons2;
    private EVD1.CustomButtons customButtons3;
    private EVD1.CustomButtons customButtons4;
    private EVD1.CustomButtons customButtons5;
    private EVD1.CustomButtons customButtons6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
