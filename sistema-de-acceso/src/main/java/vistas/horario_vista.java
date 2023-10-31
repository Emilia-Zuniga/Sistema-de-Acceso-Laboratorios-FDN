package vistas;

import Funciones.Eliminar;
import Funciones.Guardar;
import Funciones.Modificar;
import Funciones.Seleccionar;
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
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class horario_vista extends javax.swing.JPanel {

    /**
     * Creates new form horario_vista
     */
    private Component rootPane;

    int contador = 0;
    Seleccionar busq;

    Guardar guardar;
    Connection c;

    Guardar g = new Guardar();
    Modificar met = new Modificar();
    Eliminar el = new Eliminar();

    public horario_vista() {
        initComponents();
        c = new Conection().conectar();
        busq = new Seleccionar(c);
        limpiar_articulos2();
        ver_nombres();
        ver_nombres2();
        ver_periodos();
        ver_periodos2();
        jTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                JTable table = new JTable();
                Point point = evt.getPoint();
                int row = table.rowAtPoint(point);
                int fila_point = jTable.rowAtPoint(evt.getPoint());
                int columna_point = 0;
                if (evt.getClickCount() == 1) {
                    TxtIdHorario3.setText(jTable.getValueAt(jTable.getSelectedRow(), 0).toString());
                    TxtIdLaboratorio3.setText(jTable.getValueAt(jTable.getSelectedRow(), 1).toString());

                }
            }
        });
    }

    public void limpiar_articulos2() {
        IdHorarioCombo.removeAllItems();
        IdHorarioCombo.addItem("Seleccione");
        c = new Conection().conectar();
        String[] barras = busq.Ver_ID_Horario();

        for (String i : barras) {
            IdHorarioCombo.addItem(i);
            contador++;
        }
        TxtPeriodo2.setText("");
    }

    public void ver_nombres() {
        IdLabCombo2.removeAllItems();
        IdLabCombo2.addItem("Seleccione");
        c = new Conection().conectar();
        String[] barras = busq.Ver_LaboratorioName();

        for (String i : barras) {
            IdLabCombo2.addItem(i);
            contador++;
        }

    }

    public void ver_nombres2() {
        IdLabCombo.removeAllItems();
        IdLabCombo.addItem("Seleccione");
        c = new Conection().conectar();
        String[] barras = busq.Ver_LaboratorioName();

        for (String i : barras) {
            IdLabCombo.addItem(i);
            contador++;
        }
        TxtPeriodo1.setText("");
    }

    public void ver_periodos() {
        IdHorarioCombo3.removeAllItems();
        IdHorarioCombo3.addItem("Seleccione");
        c = new Conection().conectar();
        String[] barras = busq.VerPeriodo();

        for (String i : barras) {
            IdHorarioCombo3.addItem(i);
            contador++;
        }
        TxtIdHorario3.setText("");
        TxtIdLaboratorio3.setText("");
    }

    public void ver_periodos2() {
        PeriodoCombo4.removeAllItems();
        PeriodoCombo4.addItem("Seleccione");
        c = new Conection().conectar();
        String[] barras = busq.VerPeriodo();

        for (String i : barras) {
            PeriodoCombo4.addItem(i);
            contador++;
        }
        TxtIdHorario4.setText("");
        TxtLaboratorio4.setText("");
    }

    //--------------------------------------------------------------------------
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

        fondo2 fondosec = new fondo2();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new fondo_panel();
        MaterialTabbed_administrativo = new EVD1.MaterialTabbed();
        jPanel3 = new fondo2();
        IdLabCombo = new EVD2.Combobox();
        TxtPeriodo1 = new EVD1.TextField();
        btn_guardar_hor = new EVD1.CustomButtons();
        jPanel4 = new fondo2();
        IdHorarioCombo = new EVD2.Combobox();
        TxtPeriodo2 = new EVD1.TextField();
        IdLabCombo2 = new EVD2.Combobox();
        BtnModificarHorario = new EVD1.CustomButtons();
        jPanel5 = new fondo2();
        IdHorarioCombo3 = new EVD2.Combobox();
        TxtIdHorario3 = new EVD1.TextField();
        TxtIdLaboratorio3 = new EVD1.TextField();
        BtnEliminarHorario = new EVD1.CustomButtons();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jPanel2 = new fondo2();
        TxtLaboratorio4 = new EVD1.TextField();
        TxtIdHorario4 = new EVD1.TextField();
        PeriodoCombo4 = new EVD2.Combobox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        MaterialTabbed_administrativo.setBackground(new java.awt.Color(255, 255, 255));
        MaterialTabbed_administrativo.setForeground(new java.awt.Color(255, 255, 255));
        MaterialTabbed_administrativo.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N

        IdLabCombo.setForeground(new java.awt.Color(0, 0, 0));
        IdLabCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione un ID" }));
        IdLabCombo.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        IdLabCombo.setLabeText("");
        IdLabCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdLabComboActionPerformed(evt);
            }
        });

        TxtPeriodo1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        TxtPeriodo1.setLabelText("PERIODO");
        TxtPeriodo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPeriodo1ActionPerformed(evt);
            }
        });

        btn_guardar_hor.setBackground(new java.awt.Color(51, 51, 51));
        btn_guardar_hor.setForeground(new java.awt.Color(255, 255, 255));
        btn_guardar_hor.setText("GUARDAR");
        btn_guardar_hor.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        btn_guardar_hor.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_guardar_hor.setShadowColor(new java.awt.Color(153, 153, 153));
        btn_guardar_hor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar_horActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(IdLabCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_guardar_hor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtPeriodo1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(TxtPeriodo1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IdLabCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_guardar_hor, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(204, Short.MAX_VALUE))
        );

        MaterialTabbed_administrativo.addTab("GUARDAR", jPanel3);

        IdHorarioCombo.setForeground(new java.awt.Color(0, 0, 0));
        IdHorarioCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione un ID" }));
        IdHorarioCombo.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        IdHorarioCombo.setLabeText("");
        IdHorarioCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdHorarioComboActionPerformed(evt);
            }
        });

        TxtPeriodo2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        TxtPeriodo2.setLabelText("PERIODO");
        TxtPeriodo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPeriodo2ActionPerformed(evt);
            }
        });

        IdLabCombo2.setForeground(new java.awt.Color(0, 0, 0));
        IdLabCombo2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione un laboratorio" }));
        IdLabCombo2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        IdLabCombo2.setLabeText("");
        IdLabCombo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdLabCombo2ActionPerformed(evt);
            }
        });

        BtnModificarHorario.setBackground(new java.awt.Color(51, 51, 51));
        BtnModificarHorario.setForeground(new java.awt.Color(255, 255, 255));
        BtnModificarHorario.setText("MODIFICAR");
        BtnModificarHorario.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        BtnModificarHorario.setRippleColor(new java.awt.Color(204, 204, 204));
        BtnModificarHorario.setShadowColor(new java.awt.Color(153, 153, 153));
        BtnModificarHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarHorarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(23, 153, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(IdHorarioCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtPeriodo2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnModificarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IdLabCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(153, 153, 153))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(IdHorarioCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(TxtPeriodo2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(IdLabCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnModificarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        MaterialTabbed_administrativo.addTab("MODIFICAR", jPanel4);

        IdHorarioCombo3.setForeground(new java.awt.Color(0, 0, 0));
        IdHorarioCombo3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione un periodo" }));
        IdHorarioCombo3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        IdHorarioCombo3.setLabeText("");
        IdHorarioCombo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdHorarioCombo3ActionPerformed(evt);
            }
        });

        TxtIdHorario3.setEditable(false);
        TxtIdHorario3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        TxtIdHorario3.setLabelText("ID DEL HORARIO");
        TxtIdHorario3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIdHorario3ActionPerformed(evt);
            }
        });

        TxtIdLaboratorio3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        TxtIdLaboratorio3.setLabelText("LABORATORIO");
        TxtIdLaboratorio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIdLaboratorio3ActionPerformed(evt);
            }
        });

        BtnEliminarHorario.setBackground(new java.awt.Color(51, 51, 51));
        BtnEliminarHorario.setForeground(new java.awt.Color(255, 255, 255));
        BtnEliminarHorario.setText("ELIMINAR");
        BtnEliminarHorario.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        BtnEliminarHorario.setRippleColor(new java.awt.Color(204, 204, 204));
        BtnEliminarHorario.setShadowColor(new java.awt.Color(153, 153, 153));
        BtnEliminarHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarHorarioActionPerformed(evt);
            }
        });

        jTable = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID HORARIO", "PERIODO", "LAB"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 153, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnEliminarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtIdHorario3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IdHorarioCombo3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtIdLaboratorio3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(153, 153, 153))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(IdHorarioCombo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtIdHorario3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtIdLaboratorio3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnEliminarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        MaterialTabbed_administrativo.addTab("ELIMINAR", jPanel5);

        TxtLaboratorio4.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        TxtLaboratorio4.setLabelText("LABORATORIO");
        TxtLaboratorio4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtLaboratorio4ActionPerformed(evt);
            }
        });

        TxtIdHorario4.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        TxtIdHorario4.setLabelText("ID DEL HORARIO");
        TxtIdHorario4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIdHorario4ActionPerformed(evt);
            }
        });

        PeriodoCombo4.setForeground(new java.awt.Color(0, 0, 0));
        PeriodoCombo4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione un periodo" }));
        PeriodoCombo4.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        PeriodoCombo4.setLabeText("");
        PeriodoCombo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PeriodoCombo4ActionPerformed(evt);
            }
        });

        jTable3 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jTable3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID HORARIO", "PERIODO", "LAB"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable3.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TxtIdHorario4, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PeriodoCombo4, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtLaboratorio4, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(PeriodoCombo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(TxtIdHorario4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtLaboratorio4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );

        MaterialTabbed_administrativo.addTab("SELECCIONAR", jPanel2);

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

    private void IdLabComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdLabComboActionPerformed

    }//GEN-LAST:event_IdLabComboActionPerformed

    private void TxtPeriodo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPeriodo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPeriodo1ActionPerformed

    private void btn_guardar_horActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar_horActionPerformed
        // Boton Guardar HORARIO

        if (TxtPeriodo1.getText().equals("") || IdLabCombo.getSelectedItem().toString().equals("Seleccione")) {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos");
        } else {
            String periodo = TxtPeriodo1.getText();
            String laboratorio = IdLabCombo.getSelectedItem().toString();
            /*
            g.guardar_horario(periodo, laboratorio);
            JOptionPane.showMessageDialog(rootPane, "Registro guardado"); 
            
            TxtPeriodo1.setText("");
             */

            //Conexion
            c = new Conection().conectar();

            PreparedStatement ps = null;
            ResultSet rs = null;
            int pRes;

            try {
                c = new Conection().conectar();
                String sql = "Call guardar_horario ('" + periodo + "' ,'" + laboratorio + "' , NULL);";
                ps = c.prepareStatement(sql);
                rs = ps.executeQuery();
                rs.next();
                pRes = rs.getInt("pRes");
                //Condicion para cuando ya se ha guardado el registro
                if (pRes == 1) {
                    JOptionPane.showMessageDialog(null, "Registro Exitoso", "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);
                    TxtPeriodo1.setText("");
                    IdLabCombo.removeAllItems();
                    IdLabCombo.addItem("Seleccione");
                } else if (pRes == 2) {
                    JOptionPane.showMessageDialog(null, "Ya existe un horario para ese Laboratorio en ese periodo", "Repetido", JOptionPane.INFORMATION_MESSAGE);
                    TxtPeriodo1.setText("");
                    IdLabCombo.removeAllItems();
                    IdLabCombo.addItem("Seleccione");
                }
                if (pRes == 3) {
                    JOptionPane.showMessageDialog(null, "No se encontro el nombre del laboratorio", "No se encontro el nombre del laboratorio", JOptionPane.ERROR_MESSAGE);
                    TxtPeriodo1.setText("");
                    IdLabCombo.removeAllItems();
                    IdLabCombo.addItem("Seleccione");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }//GEN-LAST:event_btn_guardar_horActionPerformed

    private void IdHorarioComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdHorarioComboActionPerformed
        try {
            String id_horario = IdHorarioCombo.getSelectedItem().toString();
            if (!id_horario.equals("Seleccione")) {
                c = new Conection().conectar();

                String datos[] = busq.verHorarios(id_horario);

                TxtPeriodo2.setText(datos[0]);

            }
        } catch (Exception x) {
        }
    }//GEN-LAST:event_IdHorarioComboActionPerformed

    private void TxtPeriodo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPeriodo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPeriodo2ActionPerformed

    private void IdLabCombo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdLabCombo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdLabCombo2ActionPerformed

    private void BtnModificarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarHorarioActionPerformed
        if (TxtPeriodo2.getText().equals("") || IdHorarioCombo.getSelectedItem().toString().equals("Seleccione") || IdLabCombo2.getSelectedItem().toString().equals("Seleccione")) {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos");
        } else {

            String id_horario = IdHorarioCombo.getSelectedItem().toString();
            String nombre_lab = IdLabCombo2.getSelectedItem().toString();
            String periodo = TxtPeriodo2.getText();
            /*
            met.modificarHorario(periodo, nombre_lab, id_horario);
            limpiar_articulos2();
             */

            c = new Conection().conectar();
            PreparedStatement ps = null;
            ResultSet rs = null;
            int pRes;
            int g = JOptionPane.showConfirmDialog(null, " ¡¿Seguro que desea modificar este registro?!", "Cita", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (g == JOptionPane.YES_OPTION) {

                try {
                    c = new Conection().conectar();
                    String sql = "Call modificar_horario('" + id_horario + "' ,'" + periodo + "', '" + nombre_lab + "', NULL);";
                    ps = c.prepareStatement(sql);
                    rs = ps.executeQuery();
                    rs.next();
                    pRes = rs.getInt("pRes");
                    //Condicion para cuando ya se ha guardado el registro
                    if (pRes == 1) {
                        JOptionPane.showMessageDialog(null, "Horario Modificado", "Horario Modificado", JOptionPane.INFORMATION_MESSAGE);
                        TxtPeriodo2.setText("");
                        IdLabCombo2.removeAllItems();
                        IdLabCombo2.addItem("Seleccione");
                        IdHorarioCombo.removeAllItems();
                        IdHorarioCombo.addItem("Seleccione");

                    } else if (pRes == 2) {
                        JOptionPane.showMessageDialog(null, "Periodo no existente", " periodo", JOptionPane.ERROR_MESSAGE);
                        TxtPeriodo2.setText("");
                        IdLabCombo2.removeAllItems();
                        IdLabCombo2.addItem("Seleccione");
                        IdHorarioCombo.removeAllItems();
                        IdHorarioCombo.addItem("Seleccione");

                    }
                    if (pRes == 3) {
                        JOptionPane.showMessageDialog(null, "No se encontro el laboratorio", "No se encontro el laboratorio", JOptionPane.ERROR_MESSAGE);
                        TxtPeriodo2.setText("");
                        IdLabCombo2.removeAllItems();
                        IdLabCombo2.addItem("Seleccione");
                        IdHorarioCombo.removeAllItems();
                        IdHorarioCombo.addItem("Seleccione");
                    }
                    if (pRes == 4) {
                        JOptionPane.showMessageDialog(null, "Ya existe un horario para ese periodo", "Ya existe un horario para ese periodo", JOptionPane.ERROR_MESSAGE);
                        TxtPeriodo1.setText("");
                        IdLabCombo.removeAllItems();
                        IdLabCombo.addItem("Seleccione");
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se Modifico nada!!!", "mensaje", JOptionPane.INFORMATION_MESSAGE);
            }

        }        // TODO add your handling code here:
    }//GEN-LAST:event_BtnModificarHorarioActionPerformed

    private void IdHorarioCombo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdHorarioCombo3ActionPerformed
// Id Horarios Combo Eliminar
        try {
            String periodo = IdHorarioCombo3.getSelectedItem().toString();
            if (!periodo.equals("Seleccione")) {
                c = new Conection().conectar();

                DefaultTableModel modelado5 = new DefaultTableModel();
                jTable.setModel(modelado5);

                //Agregar tres variables
                PreparedStatement ps;
                ResultSet rs;
                //Connection con= getConection();
                c = new Conection().conectar();
                String sql = "select id_horario, periodo, nombre_lab  from horarios h INNER JOIN laboratorio l ON h.id_lab = l.id_lab where h.periodo = '" + periodo + "' ;";
                ps = c.prepareStatement(sql);
                rs = ps.executeQuery();

                ResultSetMetaData rsMetaD = rs.getMetaData();
                int cant_columnas = rsMetaD.getColumnCount();

                modelado5.addColumn("ID HORARIO");
                modelado5.addColumn("PERIODO");
                modelado5.addColumn("ID LAB");

                while (rs.next()) {
                    Object[] filas = new Object[cant_columnas];

                    for (int i = 0; i < cant_columnas; i++) {
                        filas[i] = rs.getObject(i + 1);

                    }
                    modelado5.addRow(filas);
                }
            }
        } catch (Exception x) {
        }        // TODO add your handling code here:
    }//GEN-LAST:event_IdHorarioCombo3ActionPerformed

    private void TxtIdHorario3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIdHorario3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIdHorario3ActionPerformed

    private void TxtIdLaboratorio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIdLaboratorio3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIdLaboratorio3ActionPerformed

    private void BtnEliminarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarHorarioActionPerformed
// Eliminar un horario
        if (!TxtIdHorario3.getText().equals("") || !TxtIdLaboratorio3.getText().equals("")) {

            int g = JOptionPane.showConfirmDialog(null, " ¡¿Seguro que desea eliminar este registro?!", "Cita", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (g == JOptionPane.YES_OPTION) {
                String IDperiodo = TxtIdHorario3.getText();
                int ID = Integer.parseInt(IDperiodo);
                el.eliminarHorario(ID);
                TxtIdHorario3.setText("");
                TxtIdLaboratorio3.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "No se Elimino nada!!!", "mensaje", JOptionPane.INFORMATION_MESSAGE);
            }// TODO add your handling code here:
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese datos seleccionando en la tabla");
        }

    }//GEN-LAST:event_BtnEliminarHorarioActionPerformed

    private void PeriodoCombo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PeriodoCombo4ActionPerformed
        // Ver horarios en Seleccionar
        try {
            String periodo = PeriodoCombo4.getSelectedItem().toString();
            if (!periodo.equals("Seleccione")) {
                c = new Conection().conectar();

                DefaultTableModel modelado5 = new DefaultTableModel();
                jTable3.setModel(modelado5);

                //Agregar tres variables
                PreparedStatement ps;
                ResultSet rs;
                //Connection con= getConection();
                c = new Conection().conectar();
                String sql = "select id_horario, periodo, nombre_lab  from horarios h INNER JOIN laboratorio l ON h.id_lab = l.id_lab where h.periodo = '" + periodo + "' ;";
                ps = c.prepareStatement(sql);
                rs = ps.executeQuery();

                ResultSetMetaData rsMetaD = rs.getMetaData();
                int cant_columnas = rsMetaD.getColumnCount();

                modelado5.addColumn("ID HORARIO");
                modelado5.addColumn("PERIODO");
                modelado5.addColumn("ID LAB");

                while (rs.next()) {
                    Object[] filas = new Object[cant_columnas];

                    for (int i = 0; i < cant_columnas; i++) {
                        filas[i] = rs.getObject(i + 1);

                    }
                    modelado5.addRow(filas);
                }
            }
        } catch (Exception x) {
        }
    }//GEN-LAST:event_PeriodoCombo4ActionPerformed

    private void TxtIdHorario4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIdHorario4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIdHorario4ActionPerformed

    private void TxtLaboratorio4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtLaboratorio4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtLaboratorio4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private EVD1.CustomButtons BtnEliminarHorario;
    private EVD1.CustomButtons BtnModificarHorario;
    private EVD2.Combobox IdHorarioCombo;
    private EVD2.Combobox IdHorarioCombo3;
    private EVD2.Combobox IdLabCombo;
    private EVD2.Combobox IdLabCombo2;
    private EVD1.MaterialTabbed MaterialTabbed_administrativo;
    private EVD2.Combobox PeriodoCombo4;
    private EVD1.TextField TxtIdHorario3;
    private EVD1.TextField TxtIdHorario4;
    private EVD1.TextField TxtIdLaboratorio3;
    private EVD1.TextField TxtLaboratorio4;
    private EVD1.TextField TxtPeriodo1;
    private EVD1.TextField TxtPeriodo2;
    private EVD1.CustomButtons btn_guardar_hor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
