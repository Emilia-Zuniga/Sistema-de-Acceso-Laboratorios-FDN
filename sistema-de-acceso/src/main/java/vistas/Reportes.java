/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Funciones.Seleccionar;
import coneccion.Conection;
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

public class Reportes extends javax.swing.JPanel {

    /**
     * Creates new form Reportes
     */
    
    Connection c;
    Seleccionar select;
    int contador = 0;
    public Reportes() {
        initComponents();
        c = new Conection().conectar(); 
        select = new Seleccionar(c);
        limpiar_repo_actual();
        limpiar_repo_actual1();
        limpiar_repo_actual2();
        limpiar_repo_actual3();
        limpiar_repo_actual4();
        limpiar_repo_actual_periodo();
        add_semanas_iniciales();
        add_semanas_finales();
        add_semanas_inicialesmensual();
        add_semanas_finalesmensual();
    }
      
    public void limpiar_repo_actual() {
        combo_seleccionar_lab.removeAllItems();
        combo_seleccionar_lab.addItem("Seleccione un laboratorio");
        c = new Conection().conectar();
        String[] barras = select.Ver_LaboratorioName();

        for (String i : barras) {
            combo_seleccionar_lab.addItem(i);
            contador++;
        }  
    }
    
    public void limpiar_repo_actual1() {
        combo_seleccionar_lab1.removeAllItems();
        combo_seleccionar_lab1.addItem("Seleccione un laboratorio");
        c = new Conection().conectar();
        String[] barras = select.Ver_LaboratorioName();

        for (String i : barras) {
            combo_seleccionar_lab1.addItem(i);
            contador++;
        }  
    }
    
    public void limpiar_repo_actual2() {
        combo_seleccionar_lab2.removeAllItems();
        combo_seleccionar_lab2.addItem("Seleccione un laboratorio");
        c = new Conection().conectar();
        String[] barras = select.Ver_LaboratorioName();

        for (String i : barras) {
            combo_seleccionar_lab2.addItem(i);
            contador++;
        }  
    }
    
    public void limpiar_repo_actual3() {
        combo_seleccionar_lab3.removeAllItems();
        combo_seleccionar_lab3.addItem("Seleccione un laboratorio");
        c = new Conection().conectar();
        String[] barras = select.Ver_LaboratorioName();

        for (String i : barras) {
            combo_seleccionar_lab3.addItem(i);
            contador++;
        }  
    }
    
    public void limpiar_repo_actual4() {
        combo_seleccionar_periodo.removeAllItems();
        combo_seleccionar_periodo.addItem("Seleccione un periodo");
        c = new Conection().conectar();
        String[] barras = select.VerPeriodo();

        for (String i : barras) {
            combo_seleccionar_periodo.addItem(i);
            contador++;
        }  
    }
    
    public void limpiar_repo_actual_periodo() {
        combo_seleccionar_lab4.removeAllItems();
        combo_seleccionar_lab4.addItem("Seleccione un laboratorio");
        c = new Conection().conectar();
        String[] barras = select.Ver_LaboratorioName();

        for (String i : barras) {
            combo_seleccionar_lab4.addItem(i);
            contador++;
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
    
    public void add_semanas_iniciales() {
        combo_seleccionar_fecha_inicial.removeAllItems();
        combo_seleccionar_fecha_inicial.addItem("Seleccione");
        combo_seleccionar_fecha_inicial.addItem("08-08-2022");
        combo_seleccionar_fecha_inicial.addItem("15-08-2022");
        combo_seleccionar_fecha_inicial.addItem("22-08-2022");
        combo_seleccionar_fecha_inicial.addItem("29-08-2022");
        combo_seleccionar_fecha_inicial.addItem("05-09-2022");
        combo_seleccionar_fecha_inicial.addItem("12-09-2022");
        combo_seleccionar_fecha_inicial.addItem("19-09-2022");
        combo_seleccionar_fecha_inicial.addItem("26-09-2022");
        combo_seleccionar_fecha_inicial.addItem("03-10-2022");
        combo_seleccionar_fecha_inicial.addItem("10-10-2022");
        combo_seleccionar_fecha_inicial.addItem("17-10-2022");
        combo_seleccionar_fecha_inicial.addItem("24-10-2022");
        combo_seleccionar_fecha_inicial.addItem("31-10-2022");
        combo_seleccionar_fecha_inicial.addItem("07-11-2022");
        combo_seleccionar_fecha_inicial.addItem("14-11-2022");
        combo_seleccionar_fecha_inicial.addItem("21-11-2022");
        combo_seleccionar_fecha_inicial.addItem("28-11-2022");
    }
    
    public void add_semanas_finales() {
        combo_seleccionar_fecha_final.removeAllItems();
        combo_seleccionar_fecha_final.addItem("Seleccione");
        combo_seleccionar_fecha_final.addItem("12-08-2022");
        combo_seleccionar_fecha_final.addItem("19-08-2022");
        combo_seleccionar_fecha_final.addItem("26-08-2022");
        combo_seleccionar_fecha_final.addItem("02-09-2022");
        combo_seleccionar_fecha_final.addItem("09-09-2022");
        combo_seleccionar_fecha_final.addItem("16-09-2022");
        combo_seleccionar_fecha_final.addItem("23-09-2022");
        combo_seleccionar_fecha_final.addItem("30-09-2022");
        combo_seleccionar_fecha_final.addItem("07-10-2022");
        combo_seleccionar_fecha_final.addItem("14-10-2022");
        combo_seleccionar_fecha_final.addItem("21-10-2022");
        combo_seleccionar_fecha_final.addItem("28-10-2022");
        combo_seleccionar_fecha_final.addItem("04-11-2022");
        combo_seleccionar_fecha_final.addItem("11-11-2022");
        combo_seleccionar_fecha_final.addItem("18-11-2022");
        combo_seleccionar_fecha_final.addItem("25-11-2022");
        combo_seleccionar_fecha_final.addItem("02-12-2022");
    }
    
    public void add_semanas_inicialesmensual() {
        combo_seleccionar_fecha_inicialm.removeAllItems();
        combo_seleccionar_fecha_inicialm.addItem("Seleccione");
        combo_seleccionar_fecha_inicialm.addItem("08-08-2022");
        combo_seleccionar_fecha_inicialm.addItem("09-09-2022");
        combo_seleccionar_fecha_inicialm.addItem("09-10-2022");
        combo_seleccionar_fecha_inicialm.addItem("09-11-2022");
    }
    
    public void add_semanas_finalesmensual() {
        combo_seleccionar_fecha_finalm.removeAllItems();
        combo_seleccionar_fecha_finalm.addItem("Seleccione");
        combo_seleccionar_fecha_finalm.addItem("08-09-2022");
        combo_seleccionar_fecha_finalm.addItem("08-10-2022");
        combo_seleccionar_fecha_finalm.addItem("08-11-2022");
        combo_seleccionar_fecha_finalm.addItem("02-12-2022");
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
        materialTabbed1 = new EVD1.MaterialTabbed();
        jPanel2 = new fondo2();
        btn_seleccionar_alum = new EVD1.CustomButtons();
        jScrollPane1 = new javax.swing.JScrollPane();
        reporte_actual = new javax.swing.JTable();
        combo_seleccionar_lab = new EVD2.Combobox();
        btn_seleccionar_for = new EVD1.CustomButtons();
        jPanel3 = new fondo2();
        combo_seleccionar_lab1 = new EVD2.Combobox();
        jScrollPane2 = new javax.swing.JScrollPane();
        reporte_diario = new javax.swing.JTable();
        btn_seleccionar_for1 = new EVD1.CustomButtons();
        btn_seleccionar_alum1 = new EVD1.CustomButtons();
        jPanel4 = new fondo2();
        combo_seleccionar_lab2 = new EVD2.Combobox();
        jScrollPane3 = new javax.swing.JScrollPane();
        reporte_semanal = new javax.swing.JTable();
        btn_seleccionar_for2 = new EVD1.CustomButtons();
        btn_seleccionar_alum2 = new EVD1.CustomButtons();
        combo_seleccionar_fecha_final = new EVD2.Combobox();
        combo_seleccionar_fecha_inicial = new EVD2.Combobox();
        jPanel5 = new fondo2();
        combo_seleccionar_lab3 = new EVD2.Combobox();
        jScrollPane4 = new javax.swing.JScrollPane();
        reporte_mensual = new javax.swing.JTable();
        btn_seleccionar_for3 = new EVD1.CustomButtons();
        btn_seleccionar_alum3 = new EVD1.CustomButtons();
        combo_seleccionar_fecha_inicialm = new EVD2.Combobox();
        combo_seleccionar_fecha_finalm = new EVD2.Combobox();
        jPanel6 = new fondo2();
        combo_seleccionar_lab4 = new EVD2.Combobox();
        jScrollPane5 = new javax.swing.JScrollPane();
        reporte_semestral = new javax.swing.JTable();
        btn_seleccionar_for4 = new EVD1.CustomButtons();
        btn_seleccionar_alum4 = new EVD1.CustomButtons();
        combo_seleccionar_periodo = new EVD2.Combobox();

        materialTabbed1.setBackground(new java.awt.Color(255, 255, 255));
        materialTabbed1.setForeground(new java.awt.Color(255, 255, 255));
        materialTabbed1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N

        jPanel2.setPreferredSize(new java.awt.Dimension(709, 500));

        btn_seleccionar_alum.setBackground(new java.awt.Color(51, 51, 51));
        btn_seleccionar_alum.setForeground(new java.awt.Color(255, 255, 255));
        btn_seleccionar_alum.setText("SELECCIONAR ALUMNO");
        btn_seleccionar_alum.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        btn_seleccionar_alum.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_seleccionar_alum.setShadowColor(new java.awt.Color(153, 153, 153));
        btn_seleccionar_alum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seleccionar_alumActionPerformed(evt);
            }
        });

        reporte_actual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "MATRICULA", "SEMESTRE", "GRUPO", "CARRERA", "HORA", "FECHA", "TIPO VISITA"
            }
        ));
        jScrollPane1.setViewportView(reporte_actual);

        combo_seleccionar_lab.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        combo_seleccionar_lab.setLabeText("");
        combo_seleccionar_lab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_seleccionar_labActionPerformed(evt);
            }
        });

        btn_seleccionar_for.setBackground(new java.awt.Color(51, 51, 51));
        btn_seleccionar_for.setForeground(new java.awt.Color(255, 255, 255));
        btn_seleccionar_for.setText("SELECCIONAR FORANEO");
        btn_seleccionar_for.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        btn_seleccionar_for.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_seleccionar_for.setShadowColor(new java.awt.Color(153, 153, 153));
        btn_seleccionar_for.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seleccionar_forActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(261, Short.MAX_VALUE)
                .addComponent(combo_seleccionar_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(228, 228, 228))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_seleccionar_for, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_seleccionar_alum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(combo_seleccionar_lab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_seleccionar_alum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_seleccionar_for, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114))
        );

        materialTabbed1.addTab("ACTUAL", jPanel2);

        combo_seleccionar_lab1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        combo_seleccionar_lab1.setLabeText("");
        combo_seleccionar_lab1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_seleccionar_lab1ActionPerformed(evt);
            }
        });

        reporte_diario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "MATRICULA", "SEMESTRE", "GRUPO", "CARRERA", "HORA", "FECHA", "TIPO VISITA"
            }
        ));
        jScrollPane2.setViewportView(reporte_diario);

        btn_seleccionar_for1.setBackground(new java.awt.Color(51, 51, 51));
        btn_seleccionar_for1.setForeground(new java.awt.Color(255, 255, 255));
        btn_seleccionar_for1.setText("SELECCIONAR FORANEO");
        btn_seleccionar_for1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        btn_seleccionar_for1.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_seleccionar_for1.setShadowColor(new java.awt.Color(153, 153, 153));
        btn_seleccionar_for1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seleccionar_for1ActionPerformed(evt);
            }
        });

        btn_seleccionar_alum1.setBackground(new java.awt.Color(51, 51, 51));
        btn_seleccionar_alum1.setForeground(new java.awt.Color(255, 255, 255));
        btn_seleccionar_alum1.setText("SELECCIONAR ALUMNO");
        btn_seleccionar_alum1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        btn_seleccionar_alum1.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_seleccionar_alum1.setShadowColor(new java.awt.Color(153, 153, 153));
        btn_seleccionar_alum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seleccionar_alum1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(261, Short.MAX_VALUE)
                .addComponent(combo_seleccionar_lab1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(228, 228, 228))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_seleccionar_for1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_seleccionar_alum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(combo_seleccionar_lab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_seleccionar_alum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_seleccionar_for1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114))
        );

        materialTabbed1.addTab("DIARIO", jPanel3);

        combo_seleccionar_lab2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        combo_seleccionar_lab2.setLabeText("");
        combo_seleccionar_lab2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_seleccionar_lab2ActionPerformed(evt);
            }
        });

        reporte_semanal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "MATRICULA", "SEMESTRE", "GRUPO", "CARRERA", "HORA", "FECHA", "TIPO VISITA"
            }
        ));
        jScrollPane3.setViewportView(reporte_semanal);

        btn_seleccionar_for2.setBackground(new java.awt.Color(51, 51, 51));
        btn_seleccionar_for2.setForeground(new java.awt.Color(255, 255, 255));
        btn_seleccionar_for2.setText("SELECCIONAR FORANEO");
        btn_seleccionar_for2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        btn_seleccionar_for2.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_seleccionar_for2.setShadowColor(new java.awt.Color(153, 153, 153));
        btn_seleccionar_for2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seleccionar_for2ActionPerformed(evt);
            }
        });

        btn_seleccionar_alum2.setBackground(new java.awt.Color(51, 51, 51));
        btn_seleccionar_alum2.setForeground(new java.awt.Color(255, 255, 255));
        btn_seleccionar_alum2.setText("SELECCIONAR ALUMNO");
        btn_seleccionar_alum2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        btn_seleccionar_alum2.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_seleccionar_alum2.setShadowColor(new java.awt.Color(153, 153, 153));
        btn_seleccionar_alum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seleccionar_alum2ActionPerformed(evt);
            }
        });

        combo_seleccionar_fecha_final.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        combo_seleccionar_fecha_final.setLabeText("");
        combo_seleccionar_fecha_final.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_seleccionar_fecha_finalActionPerformed(evt);
            }
        });

        combo_seleccionar_fecha_inicial.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        combo_seleccionar_fecha_inicial.setLabeText("");
        combo_seleccionar_fecha_inicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_seleccionar_fecha_inicialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_seleccionar_for2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_seleccionar_alum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(combo_seleccionar_lab2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(combo_seleccionar_fecha_inicial, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(combo_seleccionar_fecha_final, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combo_seleccionar_fecha_final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(combo_seleccionar_lab2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(combo_seleccionar_fecha_inicial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_seleccionar_alum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_seleccionar_for2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114))
        );

        materialTabbed1.addTab("SEMANAL", jPanel4);

        combo_seleccionar_lab3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        combo_seleccionar_lab3.setLabeText("");
        combo_seleccionar_lab3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_seleccionar_lab3ActionPerformed(evt);
            }
        });

        reporte_mensual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "MATRICULA", "SEMESTRE", "GRUPO", "CARRERA", "HORA", "FECHA", "TIPO VISITA"
            }
        ));
        jScrollPane4.setViewportView(reporte_mensual);

        btn_seleccionar_for3.setBackground(new java.awt.Color(51, 51, 51));
        btn_seleccionar_for3.setForeground(new java.awt.Color(255, 255, 255));
        btn_seleccionar_for3.setText("SELECCIONAR FORANEO");
        btn_seleccionar_for3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        btn_seleccionar_for3.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_seleccionar_for3.setShadowColor(new java.awt.Color(153, 153, 153));
        btn_seleccionar_for3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seleccionar_for3ActionPerformed(evt);
            }
        });

        btn_seleccionar_alum3.setBackground(new java.awt.Color(51, 51, 51));
        btn_seleccionar_alum3.setForeground(new java.awt.Color(255, 255, 255));
        btn_seleccionar_alum3.setText("SELECCIONAR ALUMNO");
        btn_seleccionar_alum3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        btn_seleccionar_alum3.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_seleccionar_alum3.setShadowColor(new java.awt.Color(153, 153, 153));
        btn_seleccionar_alum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seleccionar_alum3ActionPerformed(evt);
            }
        });

        combo_seleccionar_fecha_inicialm.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        combo_seleccionar_fecha_inicialm.setLabeText("");
        combo_seleccionar_fecha_inicialm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_seleccionar_fecha_inicialmActionPerformed(evt);
            }
        });

        combo_seleccionar_fecha_finalm.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        combo_seleccionar_fecha_finalm.setLabeText("");
        combo_seleccionar_fecha_finalm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_seleccionar_fecha_finalmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_seleccionar_for3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_seleccionar_alum3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(combo_seleccionar_lab3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(combo_seleccionar_fecha_inicialm, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(combo_seleccionar_fecha_finalm, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_seleccionar_lab3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_seleccionar_fecha_inicialm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_seleccionar_fecha_finalm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_seleccionar_alum3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_seleccionar_for3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114))
        );

        materialTabbed1.addTab("MENSUAL", jPanel5);

        combo_seleccionar_lab4.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        combo_seleccionar_lab4.setLabeText("");
        combo_seleccionar_lab4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_seleccionar_lab4ActionPerformed(evt);
            }
        });

        reporte_semestral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "MATRICULA", "SEMESTRE", "GRUPO", "CARRERA", "HORA", "FECHA", "TIPO VISITA"
            }
        ));
        jScrollPane5.setViewportView(reporte_semestral);

        btn_seleccionar_for4.setBackground(new java.awt.Color(51, 51, 51));
        btn_seleccionar_for4.setForeground(new java.awt.Color(255, 255, 255));
        btn_seleccionar_for4.setText("SELECCIONAR FORANEO");
        btn_seleccionar_for4.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        btn_seleccionar_for4.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_seleccionar_for4.setShadowColor(new java.awt.Color(153, 153, 153));
        btn_seleccionar_for4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seleccionar_for4ActionPerformed(evt);
            }
        });

        btn_seleccionar_alum4.setBackground(new java.awt.Color(51, 51, 51));
        btn_seleccionar_alum4.setForeground(new java.awt.Color(255, 255, 255));
        btn_seleccionar_alum4.setText("SELECCIONAR ALUMNO");
        btn_seleccionar_alum4.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        btn_seleccionar_alum4.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_seleccionar_alum4.setShadowColor(new java.awt.Color(153, 153, 153));
        btn_seleccionar_alum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seleccionar_alum4ActionPerformed(evt);
            }
        });

        combo_seleccionar_periodo.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        combo_seleccionar_periodo.setLabeText("");
        combo_seleccionar_periodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_seleccionar_periodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_seleccionar_for4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_seleccionar_alum4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(combo_seleccionar_lab4, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(combo_seleccionar_periodo, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_seleccionar_lab4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_seleccionar_periodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_seleccionar_alum4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_seleccionar_for4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114))
        );

        materialTabbed1.addTab("SEMESTRAL", jPanel6);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(materialTabbed1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(materialTabbed1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
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

    private void btn_seleccionar_alumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seleccionar_alumActionPerformed
        // TODO add your handling code here: 
        //Reporte actual
        try{
            DefaultTableModel modelado = new DefaultTableModel();
            reporte_actual.setModel(modelado);
            
            //Extraer el nombre del laboratorio desde el combo 
            String laboratorio = combo_seleccionar_lab.getSelectedItem().toString();
            //Agregar tres variables
            PreparedStatement ps = null;  
            ResultSet rs = null;
            //Connection con= getConection();
            c = new Conection().conectar();
            String sql = "select alu.matricula, alu.semestre, alu.grupo, car.nom_carrera, vis.hora, vis.fecha, vis.tipo_visita from carrera car "
                    + "inner join alumnos alu on car.id_carrera = alu.id_carrera inner join visitas vis on alu.id_alumno = vis.id_alumno "
                    + "inner join laboratorio lab on vis.id_lab = lab.id_lab where vis.estado = 'iniciada' and lab.nombre_lab = '"+laboratorio+"';";
            ps = c.prepareStatement(sql); 
            rs = ps.executeQuery();
            ResultSetMetaData rsMetaD = rs.getMetaData();
            int cant_columnas = rsMetaD.getColumnCount();
            
            modelado.addColumn("MATRICULA");
            modelado.addColumn("SEMESTRE");
            modelado.addColumn("GRUPO");
            modelado.addColumn("CARRERA");            
            modelado.addColumn("HORA");
            modelado.addColumn("FECHA");
            modelado.addColumn("TIPO VISITA");
            
            while(rs.next()){
                Object[] filas = new Object[cant_columnas];

                for (int i = 0; i < cant_columnas; i++){
                    filas[i] = rs.getObject(i + 1);

                }
                modelado.addRow(filas);
            }
        }catch(Exception e){
            System.out.println(e);

        }
    }//GEN-LAST:event_btn_seleccionar_alumActionPerformed

    private void combo_seleccionar_labActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_seleccionar_labActionPerformed
            
    }//GEN-LAST:event_combo_seleccionar_labActionPerformed

    private void btn_seleccionar_forActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seleccionar_forActionPerformed
        // TODO add your handling code here:
        try{
            DefaultTableModel modelado = new DefaultTableModel();
            reporte_actual.setModel(modelado);
            
            //Extraer el nombre del laboratorio desde el combo 
            String laboratorio = combo_seleccionar_lab.getSelectedItem().toString();
            //Agregar tres variables
            PreparedStatement ps = null;  
            ResultSet rs = null;
            //Connection con= getConection();
            c = new Conection().conectar();
            String sql = "select fo.nombre_f, fo.ap_pat, fo.ap_mat, fo.facultad, vis.hora, vis.fecha "
                    + "from foraneo fo inner join visitas_foraneo vis on fo.id_foraneo = vis.id_foraneo inner join laboratorio lab "
                    + "on vis.id_lab = lab.id_lab where lab.nombre_lab = '"+laboratorio+"' and vis.estado = 'iniciada';";
            ps = c.prepareStatement(sql); 
            rs = ps.executeQuery();
            System.out.println(sql);
            ResultSetMetaData rsMetaD = rs.getMetaData();
            int cant_columnas = rsMetaD.getColumnCount();
            
            modelado.addColumn("NOMBRE");
            modelado.addColumn("AP. PATERNO");
            modelado.addColumn("AP. MATERNO");
            modelado.addColumn("FACULTAD");            
            modelado.addColumn("HORA");
            modelado.addColumn("FECHA");
            
            while(rs.next()){
                Object[] filas = new Object[cant_columnas];

                for (int i = 0; i < cant_columnas; i++){
                    filas[i] = rs.getObject(i + 1);

                }
                modelado.addRow(filas);
            }
        }catch(Exception e){
            System.out.println(e);

        }
    }//GEN-LAST:event_btn_seleccionar_forActionPerformed

    private void combo_seleccionar_lab1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_seleccionar_lab1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_seleccionar_lab1ActionPerformed

    private void btn_seleccionar_for1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seleccionar_for1ActionPerformed
        // TODO add your handling code here: DIARIO FORANEO
        try{
            DefaultTableModel modelado = new DefaultTableModel();
            reporte_diario.setModel(modelado);
            
            //Extraer el nombre del laboratorio desde el combo 
            String laboratorio = combo_seleccionar_lab1.getSelectedItem().toString();
            //Agregar tres variables
            PreparedStatement ps = null;  
            ResultSet rs = null;
            //Connection con= getConection();
            c = new Conection().conectar();
            String sql = "select fo.nombre_f, fo.ap_pat, fo.ap_mat, fo.facultad, lab.nombre_lab, vis.hora, vis.fecha, vis.estado "
                    + "from foraneo fo inner join visitas_foraneo vis on fo.id_foraneo = vis.id_foraneo inner join laboratorio lab on vis.id_lab = lab.id_lab "
                    + "where lab.nombre_lab = 'linux B' and vis.estado = 'finalizada' and vis.fecha = current_date;";
            ps = c.prepareStatement(sql); 
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMetaD = rs.getMetaData();
            int cant_columnas = rsMetaD.getColumnCount();
            
            modelado.addColumn("NOMBRE");
            modelado.addColumn("AP. PATERNO");
            modelado.addColumn("AP. MATERNO");
            modelado.addColumn("FACULTAD");            
            modelado.addColumn("HORA");
            modelado.addColumn("FECHA");
            
            while(rs.next()){
                Object[] filas = new Object[cant_columnas];

                for (int i = 0; i < cant_columnas; i++){
                    filas[i] = rs.getObject(i + 1);

                }
                modelado.addRow(filas);
            }
        }catch(Exception e){
            System.out.println(e);

        }
    }//GEN-LAST:event_btn_seleccionar_for1ActionPerformed

    private void btn_seleccionar_alum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seleccionar_alum1ActionPerformed
        // TODO add your handling code here: DIARIO ALUMNO
        try{
            DefaultTableModel modelado = new DefaultTableModel();
            reporte_diario.setModel(modelado);
            
            //Extraer el nombre del laboratorio desde el combo 
            String laboratorio = combo_seleccionar_lab1.getSelectedItem().toString();
            //Agregar tres variables
            PreparedStatement ps = null;  
            ResultSet rs = null;
            //Connection con= getConection();
            c = new Conection().conectar();
            String sql = "select alu.matricula, alu.semestre, alu.grupo, car.nom_carrera, lab.nombre_lab, vis.hora, vis.fecha, vis. tipo_visita "
                    + "from carrera car inner join alumnos alu on car.id_carrera = alu.id_carrera "
                    + "inner join visitas vis on alu.id_alumno = vis.id_alumno inner join laboratorio lab on vis.id_lab = lab.id_lab "
                    + "where lab.nombre_lab = '"+laboratorio+"' and vis.estado = 'finalizada' and vis.fecha = current_date;";
            ps = c.prepareStatement(sql); 
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMetaD = rs.getMetaData();
            int cant_columnas = rsMetaD.getColumnCount();
            
            modelado.addColumn("MATRICULA");
            modelado.addColumn("SEMESTRE");
            modelado.addColumn("GRUPO");
            modelado.addColumn("CARRERA");            
            modelado.addColumn("HORA");
            modelado.addColumn("FECHA");
            modelado.addColumn("TIPO VISITA");
            
            while(rs.next()){
                Object[] filas = new Object[cant_columnas];

                for (int i = 0; i < cant_columnas; i++){
                    filas[i] = rs.getObject(i + 1);

                }
                modelado.addRow(filas);
            }
        }catch(Exception e){
            System.out.println(e);

        }
    }//GEN-LAST:event_btn_seleccionar_alum1ActionPerformed

    private void combo_seleccionar_lab2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_seleccionar_lab2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_seleccionar_lab2ActionPerformed

    private void btn_seleccionar_for2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seleccionar_for2ActionPerformed
        // TODO add your handling code here: reporte semanal foraneo
        try{
            DefaultTableModel modelado = new DefaultTableModel();
            reporte_semanal.setModel(modelado);
            
            //Extraer el nombre del laboratorio desde el combo 
            String laboratorio = combo_seleccionar_lab2.getSelectedItem().toString();
            String inicial = combo_seleccionar_fecha_inicial.getSelectedItem().toString();
            String ffinal = combo_seleccionar_fecha_final.getSelectedItem().toString();
            //Agregar tres variables
            PreparedStatement ps = null;  
            ResultSet rs = null;
            //Connection con= getConection();
            c = new Conection().conectar();
            String sql = "select fo.nombre_f, fo.ap_pat, fo.ap_mat, fo.facultad, lab.nombre_lab, vis.hora, vis.fecha, vis.estado from foraneo fo "
                    + "inner join visitas_foraneo vis on fo.id_foraneo = vis.id_foraneo inner join laboratorio lab on vis.id_lab = lab.id_lab "
                    + "inner join horarios hor on lab.id_lab = hor.id_lab where lab.nombre_lab = '"+laboratorio+"' and vis.estado = 'finalizada' and  vis.fecha "
                    + "between '"+inicial+"' and '"+ffinal+"';";
            ps = c.prepareStatement(sql); 
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMetaD = rs.getMetaData();
            int cant_columnas = rsMetaD.getColumnCount();
            
            modelado.addColumn("NOMBRE");
            modelado.addColumn("AP. PATERNO");
            modelado.addColumn("AP. MATERNO");
            modelado.addColumn("FACULTAD");            
            modelado.addColumn("HORA");
            modelado.addColumn("FECHA");
            
            while(rs.next()){
                Object[] filas = new Object[cant_columnas];

                for (int i = 0; i < cant_columnas; i++){
                    filas[i] = rs.getObject(i + 1);

                }
                modelado.addRow(filas);
            }
        }catch(Exception e){
            System.out.println(e);

        }     
    }//GEN-LAST:event_btn_seleccionar_for2ActionPerformed

    private void btn_seleccionar_alum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seleccionar_alum2ActionPerformed
        // TODO add your handling code here: reporte semanal alumno
        try{
            DefaultTableModel modelado = new DefaultTableModel();
            reporte_semanal.setModel(modelado);
            
            //Extraer el nombre del laboratorio desde el combo 
            String laboratorio = combo_seleccionar_lab2.getSelectedItem().toString();
            String inicial = combo_seleccionar_fecha_inicial.getSelectedItem().toString();
            String ffinal = combo_seleccionar_fecha_final.getSelectedItem().toString();
            //Agregar tres variables
            PreparedStatement ps = null;  
            ResultSet rs = null;
            //Connection con= getConection();
            c = new Conection().conectar();
            String sql = "select alu.matricula, alu.semestre, alu.grupo, car.nom_carrera, lab.nombre_lab, vis.hora, vis.fecha, vis. tipo_visita "
                    + "from carrera car inner join alumnos alu on car.id_carrera = alu.id_carrera inner join visitas vis on alu.id_alumno = vis.id_alumno "
                    + "inner join laboratorio lab on vis.id_lab = lab.id_lab where lab.nombre_lab = '"+laboratorio+"' and vis.estado = 'finalizada' and  vis.fecha "
                    + "between '"+inicial+"' and '"+ffinal+"';";
            ps = c.prepareStatement(sql); 
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMetaD = rs.getMetaData();
            int cant_columnas = rsMetaD.getColumnCount();
            
            modelado.addColumn("MATRICULA");
            modelado.addColumn("SEMESTRE");
            modelado.addColumn("GRUPO");
            modelado.addColumn("CARRERA");            
            modelado.addColumn("HORA");
            modelado.addColumn("FECHA");
            modelado.addColumn("TIPO VISITA");
            
            while(rs.next()){
                Object[] filas = new Object[cant_columnas];

                for (int i = 0; i < cant_columnas; i++){
                    filas[i] = rs.getObject(i + 1);

                }
                modelado.addRow(filas);
            }
        }catch(Exception e){
            System.out.println(e);

        }       
        
    }//GEN-LAST:event_btn_seleccionar_alum2ActionPerformed

    private void combo_seleccionar_lab3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_seleccionar_lab3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_seleccionar_lab3ActionPerformed

    private void btn_seleccionar_for3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seleccionar_for3ActionPerformed
        // TODO add your handling code here:
        try{
            DefaultTableModel modelado = new DefaultTableModel();
            reporte_mensual.setModel(modelado);
            
            //Extraer el nombre del laboratorio desde el combo 
            String laboratorio = combo_seleccionar_lab3.getSelectedItem().toString();
            String inicial = combo_seleccionar_fecha_inicial.getSelectedItem().toString();
            String ffinal = combo_seleccionar_fecha_final.getSelectedItem().toString();
            //Agregar tres variables
            PreparedStatement ps = null;    
            ResultSet rs = null; 
            //Connection con= getConection();
            c = new Conection().conectar();
            String sql = "select fo.nombre_f, fo.ap_pat, fo.ap_mat, fo.facultad, lab.nombre_lab, vis.hora, vis.fecha, vis.estado from foraneo fo "
                    + "inner join visitas_foraneo vis on fo.id_foraneo = vis.id_foraneo inner join laboratorio lab on vis.id_lab = lab.id_lab "
                    + "inner join horarios hor on lab.id_lab = hor.id_lab where lab.nombre_lab = '"+laboratorio+"' and vis.estado = 'finalizada' and  vis.fecha "
                    + "between '"+inicial+"' and '"+ffinal+"'";
            ps = c.prepareStatement(sql); 
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMetaD = rs.getMetaData();
            int cant_columnas = rsMetaD.getColumnCount();
            
            modelado.addColumn("NOMBRE");
            modelado.addColumn("AP. PATERNO");
            modelado.addColumn("AP. MATERNO");
            modelado.addColumn("FACULTAD");            
            modelado.addColumn("HORA");
            modelado.addColumn("FECHA");
            
            while(rs.next()){
                Object[] filas = new Object[cant_columnas];

                for (int i = 0; i < cant_columnas; i++){
                    filas[i] = rs.getObject(i + 1);

                }
                modelado.addRow(filas);
            }
        }catch(Exception e){
            System.out.println(e);

        }  

    }//GEN-LAST:event_btn_seleccionar_for3ActionPerformed

    private void btn_seleccionar_alum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seleccionar_alum3ActionPerformed
        // TODO add your handling code here: REPORTE MENSUAL  
        try{
            DefaultTableModel modelado = new DefaultTableModel();
            reporte_mensual.setModel(modelado);
            
            //Extraer el nombre del laboratorio desde el combo 
            String laboratorio = combo_seleccionar_lab3.getSelectedItem().toString();
            String inicial = combo_seleccionar_fecha_inicial.getSelectedItem().toString();
            String ffinal = combo_seleccionar_fecha_final.getSelectedItem().toString();
            //Agregar tres variables
            PreparedStatement ps = null;    
            ResultSet rs = null; 
            //Connection con= getConection();
            c = new Conection().conectar();
            String sql = "select alu.matricula, alu.semestre, alu.grupo, car.nom_carrera, lab.nombre_lab, vis.hora, vis.fecha, vis. tipo_visita "
                    + "from carrera car inner join alumnos alu on car.id_carrera = alu.id_carrera inner join visitas vis on alu.id_alumno = vis.id_alumno "
                    + "inner join laboratorio lab on vis.id_lab = lab.id_lab where lab.nombre_lab = '"+laboratorio+"' and vis.estado = 'finalizada' and  vis.fecha "
                    + "between '"+inicial+"' and '"+ffinal+"';";
            ps = c.prepareStatement(sql); 
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMetaD = rs.getMetaData();
            int cant_columnas = rsMetaD.getColumnCount();
            
            modelado.addColumn("MATRICULA");
            modelado.addColumn("SEMESTRE");
            modelado.addColumn("GRUPO");
            modelado.addColumn("CARRERA");            
            modelado.addColumn("HORA");
            modelado.addColumn("FECHA");
            modelado.addColumn("TIPO VISITA");
            
            while(rs.next()){
                Object[] filas = new Object[cant_columnas];

                for (int i = 0; i < cant_columnas; i++){
                    filas[i] = rs.getObject(i + 1);

                }
                modelado.addRow(filas);
            }
        }catch(Exception e){
            System.out.println(e);

        }  
        
    }//GEN-LAST:event_btn_seleccionar_alum3ActionPerformed

    private void combo_seleccionar_lab4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_seleccionar_lab4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_seleccionar_lab4ActionPerformed

    private void btn_seleccionar_for4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seleccionar_for4ActionPerformed
        // TODO add your handling code here: reporte semestral foraneo
        try{
            DefaultTableModel modelado = new DefaultTableModel();
            reporte_semestral.setModel(modelado);
            
            //Extraer el nombre del laboratorio desde el combo 
            String laboratorio = combo_seleccionar_lab4.getSelectedItem().toString();
            String periodo = combo_seleccionar_periodo.getSelectedItem().toString();
            //Agregar tres variables
            PreparedStatement ps = null;    
            ResultSet rs = null; 
            //Connection con= getConection();
            c = new Conection().conectar();
            String sql = "select fo.nombre_f, fo.ap_pat, fo.ap_mat, fo.facultad, lab.nombre_lab, vis.hora, vis.fecha, vis.estado from foraneo fo "
                    + "inner join visitas_foraneo vis on fo.id_foraneo = vis.id_foraneo inner join laboratorio lab on vis.id_lab = lab.id_lab "
                    + "inner join horarios hor on lab.id_lab = hor.id_lab where lab.nombre_lab = '"+laboratorio+"' and vis.estado = 'finalizada' and hor.periodo = '"+periodo+"';";
            ps = c.prepareStatement(sql); 
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMetaD = rs.getMetaData();
            int cant_columnas = rsMetaD.getColumnCount();
            
            modelado.addColumn("NOMBRE");
            modelado.addColumn("AP. PATERNO");
            modelado.addColumn("AP. MATERNO");
            modelado.addColumn("FACULTAD");            
            modelado.addColumn("HORA");
            modelado.addColumn("FECHA");
            
            while(rs.next()){
                Object[] filas = new Object[cant_columnas];

                for (int i = 0; i < cant_columnas; i++){
                    filas[i] = rs.getObject(i + 1);

                }
                modelado.addRow(filas);
            }
        }catch(Exception e){
            System.out.println(e);

        }  
        
    }//GEN-LAST:event_btn_seleccionar_for4ActionPerformed

    private void btn_seleccionar_alum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seleccionar_alum4ActionPerformed
        // TODO add your handling code here: REPORTE SEMESTRAL ALUMNO
        try{
            DefaultTableModel modelado = new DefaultTableModel();
            reporte_semestral.setModel(modelado);
            
            //Extraer el nombre del laboratorio desde el combo 
            String laboratorio = combo_seleccionar_lab4.getSelectedItem().toString();
            String periodo = combo_seleccionar_periodo.getSelectedItem().toString();
            //Agregar tres variables
            PreparedStatement ps = null;  
            ResultSet rs = null;
            //Connection con= getConection();
            c = new Conection().conectar();
            String sql = "select alu.matricula, alu.semestre, alu.grupo, car.nom_carrera, lab.nombre_lab, vis.hora, vis.fecha, vis. tipo_visita from carrera car "
                    + "inner join alumnos alu on car.id_carrera = alu.id_carrera inner join visitas vis on alu.id_alumno = vis.id_alumno "
                    + "inner join laboratorio lab on vis.id_lab = lab.id_lab inner join horarios hor on lab.id_lab = hor.id_lab "
                    + "where lab.nombre_lab = '"+laboratorio+"' and vis.estado = 'finalizada' and hor.periodo = '"+periodo+"';";
            ps = c.prepareStatement(sql); 
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMetaD = rs.getMetaData();
            int cant_columnas = rsMetaD.getColumnCount();
            
            modelado.addColumn("MATRICULA");
            modelado.addColumn("SEMESTRE");
            modelado.addColumn("GRUPO");
            modelado.addColumn("CARRERA");            
            modelado.addColumn("HORA");
            modelado.addColumn("FECHA");
            modelado.addColumn("TIPO VISITA");
            
            while(rs.next()){
                Object[] filas = new Object[cant_columnas];

                for (int i = 0; i < cant_columnas; i++){
                    filas[i] = rs.getObject(i + 1);

                }
                modelado.addRow(filas);
            }
        }catch(Exception e){
            System.out.println(e);

        }       
    }//GEN-LAST:event_btn_seleccionar_alum4ActionPerformed

    private void combo_seleccionar_periodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_seleccionar_periodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_seleccionar_periodoActionPerformed

    private void combo_seleccionar_fecha_finalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_seleccionar_fecha_finalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_seleccionar_fecha_finalActionPerformed

    private void combo_seleccionar_fecha_inicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_seleccionar_fecha_inicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_seleccionar_fecha_inicialActionPerformed

    private void combo_seleccionar_fecha_inicialmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_seleccionar_fecha_inicialmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_seleccionar_fecha_inicialmActionPerformed

    private void combo_seleccionar_fecha_finalmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_seleccionar_fecha_finalmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_seleccionar_fecha_finalmActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private EVD1.CustomButtons btn_seleccionar_alum;
    private EVD1.CustomButtons btn_seleccionar_alum1;
    private EVD1.CustomButtons btn_seleccionar_alum2;
    private EVD1.CustomButtons btn_seleccionar_alum3;
    private EVD1.CustomButtons btn_seleccionar_alum4;
    private EVD1.CustomButtons btn_seleccionar_for;
    private EVD1.CustomButtons btn_seleccionar_for1;
    private EVD1.CustomButtons btn_seleccionar_for2;
    private EVD1.CustomButtons btn_seleccionar_for3;
    private EVD1.CustomButtons btn_seleccionar_for4;
    private EVD2.Combobox combo_seleccionar_fecha_final;
    private EVD2.Combobox combo_seleccionar_fecha_finalm;
    private EVD2.Combobox combo_seleccionar_fecha_inicial;
    private EVD2.Combobox combo_seleccionar_fecha_inicialm;
    private EVD2.Combobox combo_seleccionar_lab;
    private EVD2.Combobox combo_seleccionar_lab1;
    private EVD2.Combobox combo_seleccionar_lab2;
    private EVD2.Combobox combo_seleccionar_lab3;
    private EVD2.Combobox combo_seleccionar_lab4;
    private EVD2.Combobox combo_seleccionar_periodo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private EVD1.MaterialTabbed materialTabbed1;
    private javax.swing.JTable reporte_actual;
    private javax.swing.JTable reporte_diario;
    private javax.swing.JTable reporte_mensual;
    private javax.swing.JTable reporte_semanal;
    private javax.swing.JTable reporte_semestral;
    // End of variables declaration//GEN-END:variables
}
