/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Emili
 */
public class Gestion_horarios extends javax.swing.JPanel {

    /**
     * Creates new form Gestion_horarios
     */
    public Gestion_horarios() {
        initComponents();
    }
    //Agregar fondo
    fondo_panel fondo = new fondo_panel();
    class fondo_panel extends JPanel
    {
        private Image imagen;
        @Override
        public void paint(Graphics g)
        {
           imagen = new ImageIcon("src/main/java/Iconos/Gestion_horarios.png").getImage();
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
           imagen = new ImageIcon("src/main/java/Iconos/inicio_horario.png").getImage();
           g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
           setOpaque(false);
           super.paint(g);
        }        
    }
    
    //importar iconos a los botones
    ImageIcon iccarrera = new ImageIcon("src/main/java/Iconos/carrera.png");
    ImageIcon icmateria = new ImageIcon("src/main/java/Iconos/materia.png");
    ImageIcon icadministrativo = new ImageIcon("src/main/java/Iconos/administrativo.png");
    ImageIcon iclaboratorios = new ImageIcon("src/main/java/Iconos/laboratorios.png");
    ImageIcon ichorarios = new ImageIcon("src/main/java/Iconos/horarios.png");
    ImageIcon icdet_horarios = new ImageIcon("src/main/java/Iconos/detalle_horarios.png");
    ImageIcon icprofesores = new ImageIcon("src/main/java/Iconos/profesores.png");   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new fondo_panel();
        contenedor2 = new fondo2();
        customButtons1 = new EVD1.CustomButtons();
        customButtons2 = new EVD1.CustomButtons();
        customButtons3 = new EVD1.CustomButtons();
        customButtons4 = new EVD1.CustomButtons();
        customButtons5 = new EVD1.CustomButtons();
        customButtons6 = new EVD1.CustomButtons();
        customButtons7 = new EVD1.CustomButtons();

        javax.swing.GroupLayout contenedor2Layout = new javax.swing.GroupLayout(contenedor2);
        contenedor2.setLayout(contenedor2Layout);
        contenedor2Layout.setHorizontalGroup(
            contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 749, Short.MAX_VALUE)
        );
        contenedor2Layout.setVerticalGroup(
            contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        customButtons1.setBackground(new java.awt.Color(36, 36, 36));
        customButtons1.setIcon(iccarrera);
        customButtons1.setToolTipText("Carreras");
        customButtons1.setRippleColor(new java.awt.Color(255, 255, 255));
        customButtons1.setShadowColor(new java.awt.Color(36, 36, 36));
        customButtons1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customButtons1ActionPerformed(evt);
            }
        });

        customButtons2.setBackground(new java.awt.Color(36, 36, 36));
        customButtons2.setIcon(icmateria);
        customButtons2.setToolTipText("Materias");
        customButtons2.setRippleColor(new java.awt.Color(255, 255, 255));
        customButtons2.setShadowColor(new java.awt.Color(36, 36, 36));
        customButtons2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customButtons2ActionPerformed(evt);
            }
        });

        customButtons3.setBackground(new java.awt.Color(36, 36, 36));
        customButtons3.setIcon(icadministrativo);
        customButtons3.setToolTipText("Administrativo");
        customButtons3.setRippleColor(new java.awt.Color(255, 255, 255));
        customButtons3.setShadowColor(new java.awt.Color(36, 36, 36));
        customButtons3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customButtons3ActionPerformed(evt);
            }
        });

        customButtons4.setBackground(new java.awt.Color(36, 36, 36));
        customButtons4.setIcon(iclaboratorios);
        customButtons4.setToolTipText("Laboratorios");
        customButtons4.setRippleColor(new java.awt.Color(255, 255, 255));
        customButtons4.setShadowColor(new java.awt.Color(36, 36, 36));
        customButtons4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customButtons4ActionPerformed(evt);
            }
        });

        customButtons5.setBackground(new java.awt.Color(36, 36, 36));
        customButtons5.setIcon(ichorarios);
        customButtons5.setToolTipText("Horarios");
        customButtons5.setRippleColor(new java.awt.Color(255, 255, 255));
        customButtons5.setShadowColor(new java.awt.Color(36, 36, 36));
        customButtons5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customButtons5ActionPerformed(evt);
            }
        });

        customButtons6.setBackground(new java.awt.Color(36, 36, 36));
        customButtons6.setIcon(icdet_horarios);
        customButtons6.setToolTipText("Cronograma");
        customButtons6.setRippleColor(new java.awt.Color(255, 255, 255));
        customButtons6.setShadowColor(new java.awt.Color(36, 36, 36));
        customButtons6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customButtons6ActionPerformed(evt);
            }
        });

        customButtons7.setBackground(new java.awt.Color(36, 36, 36));
        customButtons7.setIcon(icprofesores);
        customButtons7.setToolTipText("Profesores");
        customButtons7.setRippleColor(new java.awt.Color(255, 255, 255));
        customButtons7.setShadowColor(new java.awt.Color(36, 36, 36));
        customButtons7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customButtons7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customButtons7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customButtons6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customButtons5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customButtons4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customButtons3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customButtons2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customButtons1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(customButtons1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(customButtons2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(customButtons3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(customButtons4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(customButtons5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(customButtons6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(customButtons7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
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
        carrera_vista cv = new carrera_vista();
        cv.setSize (749,500);
        cv.setLocation (0,0);

        contenedor2.removeAll();;
        contenedor2.add (cv, BorderLayout.CENTER);
        contenedor2.revalidate();
        contenedor2.repaint();
    }//GEN-LAST:event_customButtons1ActionPerformed

    private void customButtons2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customButtons2ActionPerformed
        //botonazo para materias
        materias_vista mv = new materias_vista();
        mv.setSize (749,500);
        mv.setLocation (0,0);

        contenedor2.removeAll();;
        contenedor2.add (mv, BorderLayout.CENTER);
        contenedor2.revalidate();
        contenedor2.repaint();
    }//GEN-LAST:event_customButtons2ActionPerformed

    private void customButtons3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customButtons3ActionPerformed
        administrativo_vista av = new administrativo_vista();
        av.setSize (749,500);
        av.setLocation (0,0);

        contenedor2.removeAll();;
        contenedor2.add (av, BorderLayout.CENTER);
        contenedor2.revalidate();
        contenedor2.repaint();        // TODO add your handling code here:
    }//GEN-LAST:event_customButtons3ActionPerformed

    private void customButtons4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customButtons4ActionPerformed
        // TODO add your handling code here:
        laboratorio_vista lab = new laboratorio_vista();
        lab.setSize (749,500);
        lab.setLocation (0,0);

        contenedor2.removeAll();
        contenedor2.add (lab, BorderLayout.CENTER);
        contenedor2.revalidate();
        contenedor2.repaint();
    }//GEN-LAST:event_customButtons4ActionPerformed

    private void customButtons5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customButtons5ActionPerformed
        // TODO add your handling code here:
        horario_vista hv = new horario_vista();
        hv.setSize (749,500);
        hv.setLocation (0,0);

        contenedor2.removeAll();;
        contenedor2.add (hv, BorderLayout.CENTER);
        contenedor2.revalidate();
        contenedor2.repaint();
    }//GEN-LAST:event_customButtons5ActionPerformed

    private void customButtons6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customButtons6ActionPerformed
        // TODO add your handling code here:
        detalle_horario_vista dhv = new detalle_horario_vista();
        dhv.setSize (749,500);
        dhv.setLocation (0,0);

        contenedor2.removeAll();;
        contenedor2.add (dhv, BorderLayout.CENTER);
        contenedor2.revalidate();
        contenedor2.repaint();
    }//GEN-LAST:event_customButtons6ActionPerformed

    private void customButtons7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customButtons7ActionPerformed
        profesores p = new profesores();
        p.setSize (749,500);
        p.setLocation (0,0);

        contenedor2.removeAll();;
        contenedor2.add (p, BorderLayout.CENTER);
        contenedor2.revalidate();
        contenedor2.repaint();
    }//GEN-LAST:event_customButtons7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedor2;
    private EVD1.CustomButtons customButtons1;
    private EVD1.CustomButtons customButtons2;
    private EVD1.CustomButtons customButtons3;
    private EVD1.CustomButtons customButtons4;
    private EVD1.CustomButtons customButtons5;
    private EVD1.CustomButtons customButtons6;
    private EVD1.CustomButtons customButtons7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
