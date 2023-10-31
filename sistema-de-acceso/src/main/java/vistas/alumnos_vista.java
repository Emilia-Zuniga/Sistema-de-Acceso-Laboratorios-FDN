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

public class alumnos_vista extends javax.swing.JPanel {

    public alumnos_vista() {
        initComponents();
        c = new Conection().conectar();
        select = new Seleccionar(c); 
 }

    Seleccionar select;
    Guardar guardar;
    Connection c;
    
    fondo_panel fondo = new fondo_panel();
    class fondo_panel extends JPanel
    {
        private Image imagen;
        @Override
        public void paint(Graphics g)
        {
           imagen = new ImageIcon("src/main/java/Iconos/opciones.png").getImage();
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
        MaterialTabbed1 = new EVD1.MaterialTabbed();
        jPanel2 = new fondo2();
        btn_buscar = new EVD1.CustomButtons();
        txt_matricula = new EVD1.TextField();
        txt_ap_pat = new EVD1.TextField();
        txt_ap_mat = new EVD1.TextField();
        txt_nombre = new EVD1.TextField();
        txt_semestre = new EVD1.TextField();
        txt_grupo = new EVD1.TextField();
        txt_correo = new EVD1.TextField();
        txt_carrera = new EVD1.TextField();
        txt_tipo = new EVD1.TextField();
        txt_telefono = new EVD1.TextField();
        jPanel3 = new fondo2();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_alumnos = new javax.swing.JTable();
        btn_mostrar = new EVD1.CustomButtons();

        MaterialTabbed1.setBackground(new java.awt.Color(255, 255, 255));
        MaterialTabbed1.setForeground(new java.awt.Color(255, 255, 255));
        MaterialTabbed1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        btn_buscar.setBackground(new java.awt.Color(51, 51, 51));
        btn_buscar.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscar.setText("BUSCAR");
        btn_buscar.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        btn_buscar.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_buscar.setShadowColor(new java.awt.Color(153, 153, 153));
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        txt_matricula.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        txt_matricula.setLabelText("MATRICULA");

        txt_ap_pat.setEditable(false);
        txt_ap_pat.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        txt_ap_pat.setLabelText("APELLIDO PATERNO");

        txt_ap_mat.setEditable(false);
        txt_ap_mat.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        txt_ap_mat.setLabelText("APELLIDO MATERNO");

        txt_nombre.setEditable(false);
        txt_nombre.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        txt_nombre.setLabelText("NOMBRE");

        txt_semestre.setEditable(false);
        txt_semestre.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        txt_semestre.setLabelText("SEMESTRE");

        txt_grupo.setEditable(false);
        txt_grupo.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        txt_grupo.setLabelText("GRUPO");

        txt_correo.setEditable(false);
        txt_correo.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        txt_correo.setLabelText("CORREO");

        txt_carrera.setEditable(false);
        txt_carrera.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        txt_carrera.setLabelText("CARRERA");

        txt_tipo.setEditable(false);
        txt_tipo.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        txt_tipo.setLabelText("TIPO DE ALUMNO");

        txt_telefono.setEditable(false);
        txt_telefono.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        txt_telefono.setLabelText("TELEFONO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txt_semestre, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt_ap_pat, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_ap_mat, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(144, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(txt_matricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_ap_pat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ap_mat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_semestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        MaterialTabbed1.addTab("SELECCIÓN INDIVIDUAL", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tabla_alumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "MATRICULA", "NOMBRE", "PATERNO", "MATERNO", "S", "G", "CORREO", "TELEFONO", "CARRERA", "TIPO "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_alumnos.setEnabled(false);
        jScrollPane1.setViewportView(tabla_alumnos);

        btn_mostrar.setBackground(new java.awt.Color(51, 51, 51));
        btn_mostrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_mostrar.setText("MOSTRAR ALUMNOS");
        btn_mostrar.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        btn_mostrar.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_mostrar.setShadowColor(new java.awt.Color(153, 153, 153));
        btn_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        MaterialTabbed1.addTab("SELECCIÓN GENERAL", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(MaterialTabbed1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
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

    private void btn_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrarActionPerformed
              try{
            DefaultTableModel modelado = new DefaultTableModel();
            tabla_alumnos.setModel(modelado);
            PreparedStatement ps = null;
            ResultSet rs = null;
            //Connection con= getConection();
            c = new Conection().conectar();
            String sql = "select al.matricula, al.nombre_a, al.ap_pat, al.ap_mat, al.semestre, al.grupo, al.telefono_a, al.correo_a, carr.nom_carrera, al.tipo_alumno from Alumnos al INNER JOIN carrera carr ON al.id_carrera = carr.id_carrera;";
            ps = c.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMetaD = rs.getMetaData();
            int cant_columnas = rsMetaD.getColumnCount();

            modelado.addColumn("MATRICULA");
            modelado.addColumn("NOMBRE");
            modelado.addColumn("PATERNO");
            modelado.addColumn("MATERNO");
            modelado.addColumn("S");
            modelado.addColumn("G");
            modelado.addColumn("TELÉFONO");
            modelado.addColumn("CORREO");
            modelado.addColumn("CARRERA");
            modelado.addColumn("TIPO");
            
            
            while(rs.next()){
            Object[] filas = new Object[cant_columnas];

            for (int i = 0; i < cant_columnas; i++){
            filas[i] = rs.getObject(i + 1);
                }
                modelado.addRow(filas);
            }
        }catch(Exception e){
            System.out.println("e");

        }
    }//GEN-LAST:event_btn_mostrarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
//try{
//            String matricula = txt_matricula.getText();
//            if(!matricula.equals("")){
//                
//            c = new Conection().conectar();
//                String datos [] = select.seleccionar_alumno(matricula);
//                
//                txt_nombre.setText(datos[1]);
//                txt_ap_pat.setText(datos[2]);
//                txt_ap_mat.setText(datos[3]);
//                txt_semestre.setText(datos[4]);
//                txt_grupo.setText(datos[5]);
//                txt_telefono.setText(datos[6]);
//                txt_correo.setText(datos[7]);
//                txt_carrera.setText(datos[8]);
//                txt_tipo.setText(datos[9]);
//                } 
//                else {
//                    JOptionPane.showMessageDialog(null, "Coloque una matricula");
//                
//            }
//        }catch(Exception x)
//        {
//        }

try{                       
        String matricula = txt_matricula.getText();
        if(matricula.equals("")){
        JOptionPane.showMessageDialog(null, "Coloque una matricula");

        } else {
            c = new Conection().conectar();
            String datos [] = select.seleccionar_alumno(matricula);
                txt_nombre.setText(datos[1]);
                txt_ap_pat.setText(datos[2]);
                txt_ap_mat.setText(datos[3]);
                txt_semestre.setText(datos[4]);
                txt_grupo.setText(datos[5]);
                txt_telefono.setText(datos[6]);
                txt_correo.setText(datos[7]);
                txt_carrera.setText(datos[8]);
                txt_tipo.setText(datos[9]);
            }
        }catch(Exception x){
            
        }
    }//GEN-LAST:event_btn_buscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private EVD1.MaterialTabbed MaterialTabbed1;
    private EVD1.CustomButtons btn_buscar;
    private EVD1.CustomButtons btn_mostrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_alumnos;
    private EVD1.TextField txt_ap_mat;
    private EVD1.TextField txt_ap_pat;
    private EVD1.TextField txt_carrera;
    private EVD1.TextField txt_correo;
    private EVD1.TextField txt_grupo;
    private EVD1.TextField txt_matricula;
    private EVD1.TextField txt_nombre;
    private EVD1.TextField txt_semestre;
    private EVD1.TextField txt_telefono;
    private EVD1.TextField txt_tipo;
    // End of variables declaration//GEN-END:variables
}
