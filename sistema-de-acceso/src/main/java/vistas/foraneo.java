package vistas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.io.ByteArrayOutputStream;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;
import Funciones.*;
import coneccion.Conection;
import java.sql.ResultSetMetaData;
import java.sql.PreparedStatement;
import java.sql.*;
import static java.sql.JDBCType.NULL;

/**
 *
 * @author Jose Eduardo Orozco Cardenas <eduardo.orozco66@unach.mx>
 */
public class foraneo extends javax.swing.JFrame {

    /**
     * Creates new form foraneo
     */
    public foraneo() {
        initComponents();
        add_facultades();
        lblImagen.setBackground(Color.white);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    Connection c;

    fondo_panel fondo = new fondo_panel();

    class fondo_panel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon("src/main/java/Iconos/formulario_foraneo.png").getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new fondo_panel();
        lblImagen = new javax.swing.JLabel();
        customButtons1 = new EVD1.CustomButtons();
        ComboBoxFacultades = new EVD2.Combobox();
        TXTnombre = new EVD1.TextField();
        txtAppat = new EVD1.TextField();
        txtApmat = new EVD1.TextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        customButtons1.setBackground(new java.awt.Color(51, 51, 51));
        customButtons1.setForeground(new java.awt.Color(255, 255, 255));
        customButtons1.setText("GENERAR QR");
        customButtons1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        customButtons1.setRippleColor(new java.awt.Color(255, 255, 255));
        customButtons1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customButtons1ActionPerformed(evt);
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

        TXTnombre.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        TXTnombre.setLabelText("NOMBRE");
        TXTnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTnombreActionPerformed(evt);
            }
        });

        txtAppat.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        txtAppat.setLabelText("APELLIDO PATERNO");
        txtAppat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAppatActionPerformed(evt);
            }
        });

        txtApmat.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        txtApmat.setLabelText("APELLIDO MATERNO");
        txtApmat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApmatActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Porfavor toma foto a tu QR y da click en la  \"X\" de cerrar para regresar al menu anterior para poder escanearlo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(customButtons1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TXTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtAppat, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtApmat, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(76, 96, Short.MAX_VALUE))
                            .addComponent(ComboBoxFacultades, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(TXTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAppat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApmat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addComponent(ComboBoxFacultades, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(customButtons1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customButtons1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customButtons1ActionPerformed
        // TODO add your handling code here:
        if (TXTnombre.getText().equals("") || txtAppat.getText().equals("") || ComboBoxFacultades.getSelectedItem().equals("Seleccione") || txtApmat.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos");
        } else {
            int pRes;
            String nombre_foraneo = TXTnombre.getText();
            String ap_pat = txtAppat.getText();
            String ap_mat = txtApmat.getText();
            String facultad = (String) ComboBoxFacultades.getSelectedItem();
            c = new Conection().conectar_foraneo();
            PreparedStatement ps;
            ResultSet rs;
            try {

                String sql_pro = "call guardar_foraneo('" + nombre_foraneo + "','" + ap_pat + "','" + ap_mat + "','" + facultad + "'," + NULL + ");";
                ps = c.prepareStatement(sql_pro);
                rs = ps.executeQuery();
                rs.next();
                pRes = rs.getInt("pRes");
                if (pRes == 1) {
                    JOptionPane.showMessageDialog(null, "Alumno(a) guardado(a) exitosamente", "exito", JOptionPane.INFORMATION_MESSAGE);
                    String sql = "SELECT id_foraneo FROM foraneo ORDER BY id_foraneo DESC LIMIT 1;";
                    ps = c.prepareStatement(sql);
                    rs = ps.executeQuery();
                    int id_foraneo = 0;
                    if (rs.next()) {
                        id_foraneo = rs.getInt("id_foraneo");
                    }
                    String texto_qr = (nombre_foraneo.substring(0, 1) + ap_pat.substring(0, 1) + ap_mat.substring(0, 1) + facultad.substring(0, 1) + "FDN" + id_foraneo);
                    java.sql.Statement st = c.createStatement();
                    String sql_2 = "UPDATE FORANEO SET CODIGO='" + texto_qr + "'WHERE id_foraneo=" + id_foraneo + ";";
                    st.executeUpdate(sql_2);
                    ByteArrayOutputStream out = QRCode.from(texto_qr).to(ImageType.PNG).withSize(205, 205).stream();
                    ImageIcon imageIcon = new ImageIcon(out.toByteArray());
                    this.lblImagen.setIcon(imageIcon);
                } else if (pRes == 2) {

                    JOptionPane.showMessageDialog(null, "El alumno(a) ya cuenta con un registro. Acuda con el administrador", "ya se tiene registro.", JOptionPane.ERROR_MESSAGE);
                }

            } catch (SQLException e) {
                System.out.println(e);
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_customButtons1ActionPerformed

    private void ComboBoxFacultadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxFacultadesActionPerformed

    }//GEN-LAST:event_ComboBoxFacultadesActionPerformed

    private void TXTnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTnombreActionPerformed

    private void txtAppatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAppatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAppatActionPerformed

    private void txtApmatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApmatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApmatActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private EVD2.Combobox ComboBoxFacultades;
    private EVD1.TextField TXTnombre;
    private EVD1.CustomButtons customButtons1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImagen;
    private EVD1.TextField txtApmat;
    private EVD1.TextField txtAppat;
    // End of variables declaration//GEN-END:variables
}
