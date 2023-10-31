package vistas;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import coneccion.Conection;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import javax.swing.JOptionPane;

public class Escanear_Foraneo_lb extends javax.swing.JFrame implements Runnable, ThreadFactory {

    private WebcamPanel panel = null;
    private Webcam webcam = null;
    Connection c;
    private static final long serialVersionUID = 6441489157408381878L;
    private Executor executor = Executors.newSingleThreadExecutor(this);

    public Escanear_Foraneo_lb() {
        initComponents();
        initWebcam();
        c = new Conection().conectar_foraneo();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        result_field = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_confirmar = new EVD1.CustomButtons();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(29, 53, 100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        result_field.setEditable(false);
        result_field.setBorder(null);
        jPanel1.add(result_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 470, 20));

        jSeparator1.setForeground(new java.awt.Color(126, 167, 206));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 470, 10));

        jLabel1.setForeground(new java.awt.Color(105, 105, 105));
        jLabel1.setText("Resultado");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 470, 300));

        btn_confirmar.setBackground(new java.awt.Color(51, 51, 51));
        btn_confirmar.setForeground(new java.awt.Color(255, 255, 255));
        btn_confirmar.setText("CONFIRMAR");
        btn_confirmar.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        btn_confirmar.setShadowColor(new java.awt.Color(0, 0, 0));
        btn_confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 180, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmarActionPerformed
        // TODO add your handling code here:
        if (result_field.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos");
        } else {
            String codigo = result_field.getText();
//            codigo = codigo.substring(0, codigo.length()-1);
            //Conexion
            //Statement t = c.getConexion();
            PreparedStatement ps = null;
            ResultSet rs = null;
            int pRes;

            try {
                c = new Conection().conectar_foraneo();
                //String sql = "Call Guardar_visita_ingreso_lab1 ('"+matricula+ "', NULL);";
                String sql1 = "Call Guardar_historial_ingreso_lab3_foraneo ('" + codigo + "', NULL);";
                //ps = c.prepareStatement(sql);
                ps = c.prepareStatement(sql1);
                rs = ps.executeQuery();
                rs.next();
                pRes = rs.getInt("pRes");
                //Condicion para cuando ya se ha guardado el registro
                 if (pRes == 1) {
                    JOptionPane.showMessageDialog(null, "El alumno cuenta con una visita iniciada la cual se acaba de finalizar", "", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, "Si quiere iniciar una nueva visita vuelva a escanear su QR", "", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                }
                if (pRes == 2) {
                     JOptionPane.showMessageDialog(null, "Visita guardada exitosamente", "Visita guardada exitosamente", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                }
                if (pRes == 3) {
                    JOptionPane.showMessageDialog(null, "Alumno no encontrado. Se debe acudir con el administrativo.", "Alumno no encontrado", JOptionPane.ERROR_MESSAGE);
                }
                if (pRes == 4) {
                    JOptionPane.showMessageDialog(null, "Hay una clase en curso, NO SE PUEDE INGRESAR", "ERROR", JOptionPane.ERROR_MESSAGE);
                    this.dispose();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btn_confirmarActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private EVD1.CustomButtons btn_confirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField result_field;
    // End of variables declaration//GEN-END:variables

    private void initWebcam() {
        Dimension size = WebcamResolution.QVGA.getSize();
        webcam = Webcam.getWebcams().get(0); //0 is default webcam
        webcam.setViewSize(size);

        panel = new WebcamPanel(webcam);
        panel.setPreferredSize(size);
        panel.setFPSDisplayed(true);

        jPanel2.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 300));

        executor.execute(this);
    }

    @Override
    public void run() {
        do {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Result result = null;
            BufferedImage image = null;

            if (webcam.isOpen()) {
                if ((image = webcam.getImage()) == null) {
                    continue;
                }
            }

            LuminanceSource source = new BufferedImageLuminanceSource(image);
            BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));

            try {
                result = new MultiFormatReader().decode(bitmap);
            } catch (NotFoundException e) {
                //No result...
            }

            if (result != null) {
                result_field.setText(result.getText());
            }

            if (!this.isVisible()) {
                webcam.close();
            }
        } while (true);
    }

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r, "My Thread");
        t.setDaemon(true);
        return t;
    }
}
