/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Funciones.Eliminar;
import Funciones.Guardar;
import Funciones.Seleccionar;
import coneccion.Conection;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Samu
 */
public class detalle_horario_vista extends javax.swing.JPanel {

    /**
     * Creates new form detalle_horario_vista
     */
    int contador = 0;
    Seleccionar busq;

    Guardar guardar;
    Connection c;

    Eliminar el = new Eliminar();

    public detalle_horario_vista() {
        initComponents();
        c = new Conection().conectar();
        busq = new Seleccionar(c);
        ver_periodos();
        ver_periodos2();
        ver_profesores();
        ver_materias();
        ver_cns();
        ver_cnsModificar();
        ver_profesoresModificar();
        ver_materiasModificar();
        add_dias();
        add_horas();
        add_semestres();
        add_grupos();
        ver_nombres();
    }

    public void add_dias() {
        TxtDia.removeAllItems();
        TxtDia.addItem("Dia");
        TxtDia.addItem("Lunes");
        TxtDia.addItem("Martes");
        TxtDia.addItem("Miercoles");
        TxtDia.addItem("Jueves");
        TxtDia.addItem("Viernes");

    }

    public void add_semestres() {
        TxtSemestre.removeAllItems();
        TxtSemestre.addItem("Semestres");
        TxtSemestre.addItem("1");
        TxtSemestre.addItem("2");
        TxtSemestre.addItem("3");
        TxtSemestre.addItem("4");
        TxtSemestre.addItem("5");
        TxtSemestre.addItem("6");
        TxtSemestre.addItem("7");
        TxtSemestre.addItem("8");
        TxtSemestre.addItem("9");

    }

    public void add_grupos() {
        TxtGrupo.removeAllItems();
        TxtGrupo.addItem("Grupo");
        TxtGrupo.addItem("A");
        TxtGrupo.addItem("B");
        TxtGrupo.addItem("C");
        TxtGrupo.addItem("D");
        TxtGrupo.addItem("E");
        TxtGrupo.addItem("F");
        TxtGrupo.addItem("G");
        TxtGrupo.addItem("H");

    }

    public void add_horas() {
        TxtHoraEntrada.removeAllItems();
        TxtHoraEntrada.addItem("Hora");
        TxtHoraEntrada.addItem("7:00 a 8:00");
        TxtHoraEntrada.addItem("8:00 a 9:00");
        TxtHoraEntrada.addItem("9:00 a 10:00");
        TxtHoraEntrada.addItem("10:00 a 11:00");
        TxtHoraEntrada.addItem("11:00 a 12:00");
        TxtHoraEntrada.addItem("12:00 a 13:00");
        TxtHoraEntrada.addItem("13:00 a 14:00");
        TxtHoraEntrada.addItem("14:00 a 15:00");
        TxtHoraEntrada.addItem("15:00 a 16:00");
        TxtHoraEntrada.addItem("16:00 a 17:00");
        TxtHoraEntrada.addItem("17:00 a 18:00");
        TxtHoraEntrada.addItem("18:00 a 19:00");
        TxtHoraEntrada.addItem("19:00 a 20:00");
        TxtHoraEntrada.addItem("20:00 a 21:00");
        TxtHoraEntrada.addItem("21:00 a 22:00");

    }

    public void ver_periodos() {
        idhorario.removeAllItems();
        idhorario.addItem("id de horario");
        c = new Conection().conectar();
        String[] barras = busq.Ver_ID_Horario();

        for (String i : barras) {
            idhorario.addItem(i);
            contador++;
        }

    }

    public void ver_periodos2() {
        PeriodoCombo5.removeAllItems();
        PeriodoCombo5.addItem("Seleccione un periodo");
        c = new Conection().conectar();
        String[] barras = busq.VerPeriodo();

        for (String i : barras) {
            PeriodoCombo5.addItem(i);
            contador++;
        }
    }

    public void ver_nombres() {
        IdNomCombo.removeAllItems();
        IdNomCombo.addItem("Seleccione Laboratorio");
        c = new Conection().conectar();
        String[] barras = busq.Ver_LaboratorioName();

        for (String i : barras) {
            IdNomCombo.addItem(i);
            contador++;
        }

    }

    public void ver_profesores() {
        ProfesorCombo.removeAllItems();
        ProfesorCombo.addItem("Seleccione un profesor");
        c = new Conection().conectar();
        String[] barras = busq.VerProfesores();

        for (String i : barras) {
            ProfesorCombo.addItem(i);
            contador++;
        }

    }

    public void ver_materias() {
        MateriaCombo.removeAllItems();
        MateriaCombo.addItem("Seleccione una materia");
        c = new Conection().conectar();
        String[] barras = busq.VerMaterias();

        for (String i : barras) {
            MateriaCombo.addItem(i);
            contador++;
        }

    }

    public void ver_cns() {
        consecutivoCombo3.removeAllItems();
        consecutivoCombo3.addItem("Seleccione");
        c = new Conection().conectar();
        String[] barras = busq.VerCns();

        for (String i : barras) {
            consecutivoCombo3.addItem(i);
            contador++;
        }

    }

    public void ver_cnsModificar() {
        consecutivoCombo.removeAllItems();
        consecutivoCombo.addItem("Seleccione");
        c = new Conection().conectar();
        String[] barras = busq.VerCns();

        for (String i : barras) {
            consecutivoCombo.addItem(i);
            contador++;
        }

    }

    public void ver_profesoresModificar() {
        ProfesorCombo2.removeAllItems();
        ProfesorCombo2.addItem("Seleccione");
        c = new Conection().conectar();
        String[] barras = busq.VerProfesores();

        for (String i : barras) {
            ProfesorCombo2.addItem(i);
            contador++;
        }

    }

    public void ver_materiasModificar() {
        MateriaCombo2.removeAllItems();
        MateriaCombo2.addItem("Seleccione");
        c = new Conection().conectar();
        String[] barras = busq.VerMaterias();

        for (String i : barras) {
            MateriaCombo2.addItem(i);
            contador++;
        }

    }

    public void limpiar_horario_detalle() {
        idhorario.removeAllItems();
        idhorario.addItem("Seleccione");
        ProfesorCombo.removeAllItems();
        ProfesorCombo.addItem("Seleccione");
        MateriaCombo.removeAllItems();
        MateriaCombo.addItem("Seleccione");
        TxtDia.setSelectedItem("Dia");
        TxtHoraEntrada.setSelectedItem("Hora");
        TxtSemestre.setSelectedItem("Semestre");
        TxtGrupo.setSelectedItem("Grupo");
    }

    public void limpiar_horario_detalle2() {
        consecutivoCombo.removeAllItems();
        consecutivoCombo.addItem("Seleccione");
        ProfesorCombo2.removeAllItems();
        ProfesorCombo2.addItem("Seleccione");
        MateriaCombo2.removeAllItems();
        MateriaCombo2.addItem("Seleccione");

        TxtDiaMod.setText("");
        TxtHoraInicioMod.setText("");
        TxtHoraFinMod.setText("");
        TxtSemestreMod.setText("");
        TxtGrupoMod.setText("");
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
        MaterialTabbed_administrativo = new EVD1.MaterialTabbed();
        jPanel2 = new fondo2();
        idhorario = new EVD2.Combobox();
        ProfesorCombo = new EVD2.Combobox();
        MateriaCombo = new EVD2.Combobox();
        BtnGuardarDetalleHorario = new EVD1.CustomButtons();
        TxtDia = new EVD2.Combobox();
        TxtHoraEntrada = new EVD2.Combobox();
        TxtSemestre = new EVD2.Combobox();
        TxtGrupo = new EVD2.Combobox();
        jPanel3 = new fondo2();
        TxtDiaMod = new EVD1.TextField();
        TxtHoraInicioMod = new EVD1.TextField();
        TxtHoraFinMod = new EVD1.TextField();
        TxtSemestreMod = new EVD1.TextField();
        TxtGrupoMod = new EVD1.TextField();
        BtnModificarDetalleHorario = new EVD1.CustomButtons();
        MateriaCombo2 = new EVD2.Combobox();
        ProfesorCombo2 = new EVD2.Combobox();
        consecutivoCombo = new EVD2.Combobox();
        jPanel4 = new fondo2();
        jLabel13 = new javax.swing.JLabel();
        consecutivoCombo3 = new EVD2.Combobox();
        TxtDia3 = new EVD1.TextField();
        TxtHoraInicio3 = new EVD1.TextField();
        TxtHoraFin3 = new EVD1.TextField();
        TxtSemestre3 = new EVD1.TextField();
        TxtGrupo3 = new EVD1.TextField();
        TxtProfesor3 = new EVD1.TextField();
        TxtMateria3 = new EVD1.TextField();
        TxtPeriodo3 = new EVD1.TextField();
        BtnEliminarDetalleHorario = new EVD1.CustomButtons();
        jPanel5 = new fondo2();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDetalleHorario = new javax.swing.JTable();
        BtnSeleccionarDetalleHorario = new EVD1.CustomButtons();
        PeriodoCombo5 = new EVD2.Combobox();
        IdNomCombo = new EVD2.Combobox();
        customButtons1 = new EVD1.CustomButtons();

        MaterialTabbed_administrativo.setBackground(new java.awt.Color(255, 255, 255));
        MaterialTabbed_administrativo.setForeground(new java.awt.Color(255, 255, 255));
        MaterialTabbed_administrativo.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N

        idhorario.setForeground(new java.awt.Color(0, 0, 0));
        idhorario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "id de horario" }));
        idhorario.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        idhorario.setLabeText("");
        idhorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idhorarioActionPerformed(evt);
            }
        });

        ProfesorCombo.setForeground(new java.awt.Color(0, 0, 0));
        ProfesorCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione un profesor" }));
        ProfesorCombo.setFocusable(false);
        ProfesorCombo.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        ProfesorCombo.setLabeText("");
        ProfesorCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfesorComboActionPerformed(evt);
            }
        });

        MateriaCombo.setForeground(new java.awt.Color(0, 0, 0));
        MateriaCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione una materia" }));
        MateriaCombo.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        MateriaCombo.setLabeText("");
        MateriaCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MateriaComboActionPerformed(evt);
            }
        });

        BtnGuardarDetalleHorario.setBackground(new java.awt.Color(51, 51, 51));
        BtnGuardarDetalleHorario.setForeground(new java.awt.Color(255, 255, 255));
        BtnGuardarDetalleHorario.setText("GUARDAR");
        BtnGuardarDetalleHorario.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        BtnGuardarDetalleHorario.setRippleColor(new java.awt.Color(204, 204, 204));
        BtnGuardarDetalleHorario.setShadowColor(new java.awt.Color(204, 204, 204));
        BtnGuardarDetalleHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarDetalleHorarioActionPerformed(evt);
            }
        });

        TxtDia.setForeground(new java.awt.Color(0, 0, 0));
        TxtDia.setMaximumRowCount(3);
        TxtDia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dia" }));
        TxtDia.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        TxtDia.setLabeText("");

        TxtHoraEntrada.setForeground(new java.awt.Color(0, 0, 0));
        TxtHoraEntrada.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hora" }));
        TxtHoraEntrada.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        TxtHoraEntrada.setLabeText("");

        TxtSemestre.setForeground(new java.awt.Color(0, 0, 0));
        TxtSemestre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Semestre" }));
        TxtSemestre.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        TxtSemestre.setLabeText("");

        TxtGrupo.setForeground(new java.awt.Color(0, 0, 0));
        TxtGrupo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Grupo" }));
        TxtGrupo.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        TxtGrupo.setLabeText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(idhorario, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtHoraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(214, 214, 214))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ProfesorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MateriaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(TxtSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnGuardarDetalleHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(281, 281, 281))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idhorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProfesorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MateriaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(TxtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtHoraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnGuardarDetalleHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        MaterialTabbed_administrativo.addTab("GUARDAR", jPanel2);

        TxtDiaMod.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        TxtDiaMod.setLabelText("DÍA");
        TxtDiaMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDiaModActionPerformed(evt);
            }
        });

        TxtHoraInicioMod.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        TxtHoraInicioMod.setLabelText("HORA DE ENTRADA");
        TxtHoraInicioMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtHoraInicioModActionPerformed(evt);
            }
        });

        TxtHoraFinMod.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        TxtHoraFinMod.setLabelText("HORA DE SALIDA");
        TxtHoraFinMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtHoraFinModActionPerformed(evt);
            }
        });

        TxtSemestreMod.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        TxtSemestreMod.setLabelText("SEMESTRE");
        TxtSemestreMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSemestreModActionPerformed(evt);
            }
        });

        TxtGrupoMod.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        TxtGrupoMod.setLabelText("GRUPO");
        TxtGrupoMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtGrupoModActionPerformed(evt);
            }
        });

        BtnModificarDetalleHorario.setBackground(new java.awt.Color(51, 51, 51));
        BtnModificarDetalleHorario.setForeground(new java.awt.Color(255, 255, 255));
        BtnModificarDetalleHorario.setText("MODIFICAR");
        BtnModificarDetalleHorario.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        BtnModificarDetalleHorario.setRippleColor(new java.awt.Color(204, 204, 204));
        BtnModificarDetalleHorario.setShadowColor(new java.awt.Color(204, 204, 204));
        BtnModificarDetalleHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarDetalleHorarioActionPerformed(evt);
            }
        });

        MateriaCombo2.setForeground(new java.awt.Color(0, 0, 0));
        MateriaCombo2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione una materia" }));
        MateriaCombo2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        MateriaCombo2.setLabeText("");
        MateriaCombo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MateriaCombo2ActionPerformed(evt);
            }
        });

        ProfesorCombo2.setForeground(new java.awt.Color(0, 0, 0));
        ProfesorCombo2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione un profesor" }));
        ProfesorCombo2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        ProfesorCombo2.setLabeText("");
        ProfesorCombo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfesorCombo2ActionPerformed(evt);
            }
        });

        consecutivoCombo.setForeground(new java.awt.Color(0, 0, 0));
        consecutivoCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione un consecutivo" }));
        consecutivoCombo.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        consecutivoCombo.setLabeText("");
        consecutivoCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consecutivoComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(consecutivoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(ProfesorCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(MateriaCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(TxtSemestreMod, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TxtGrupoMod, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(BtnModificarDetalleHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(TxtDiaMod, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtHoraInicioMod, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TxtHoraFinMod, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MateriaCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProfesorCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consecutivoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(TxtDiaMod, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtHoraFinMod, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtHoraInicioMod, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtGrupoMod, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtSemestreMod, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnModificarDetalleHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        MaterialTabbed_administrativo.addTab("MODIFICAR", jPanel3);

        consecutivoCombo3.setForeground(new java.awt.Color(0, 0, 0));
        consecutivoCombo3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione un consecutivo" }));
        consecutivoCombo3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        consecutivoCombo3.setLabeText("");
        consecutivoCombo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consecutivoCombo3ActionPerformed(evt);
            }
        });

        TxtDia3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        TxtDia3.setLabelText("DÍA");
        TxtDia3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDia3ActionPerformed(evt);
            }
        });

        TxtHoraInicio3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        TxtHoraInicio3.setLabelText("HORA DE ENTRADA");
        TxtHoraInicio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtHoraInicio3ActionPerformed(evt);
            }
        });

        TxtHoraFin3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        TxtHoraFin3.setLabelText("HORA DE SALIDA");
        TxtHoraFin3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtHoraFin3ActionPerformed(evt);
            }
        });

        TxtSemestre3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        TxtSemestre3.setLabelText("SEMESTRE");
        TxtSemestre3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSemestre3ActionPerformed(evt);
            }
        });

        TxtGrupo3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        TxtGrupo3.setLabelText("GRUPO");
        TxtGrupo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtGrupo3ActionPerformed(evt);
            }
        });

        TxtProfesor3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        TxtProfesor3.setLabelText("PROFESOR (NUM DE PLAZA)");
        TxtProfesor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtProfesor3ActionPerformed(evt);
            }
        });

        TxtMateria3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        TxtMateria3.setLabelText("MATERIA");
        TxtMateria3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtMateria3ActionPerformed(evt);
            }
        });

        TxtPeriodo3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        TxtPeriodo3.setLabelText("PERIODO");
        TxtPeriodo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPeriodo3ActionPerformed(evt);
            }
        });

        BtnEliminarDetalleHorario.setBackground(new java.awt.Color(51, 51, 51));
        BtnEliminarDetalleHorario.setForeground(new java.awt.Color(255, 255, 255));
        BtnEliminarDetalleHorario.setText("ELIMINAR");
        BtnEliminarDetalleHorario.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        BtnEliminarDetalleHorario.setRippleColor(new java.awt.Color(204, 204, 204));
        BtnEliminarDetalleHorario.setShadowColor(new java.awt.Color(204, 204, 204));
        BtnEliminarDetalleHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarDetalleHorarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TxtMateria3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(TxtProfesor3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(TxtSemestre3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtGrupo3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addGap(58, 58, 58)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnEliminarDetalleHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(TxtHoraInicio3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TxtHoraFin3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(TxtPeriodo3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TxtDia3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(79, 79, 79))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel13))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(consecutivoCombo3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(consecutivoCombo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(TxtProfesor3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtMateria3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtSemestre3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtGrupo3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtPeriodo3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtDia3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtHoraInicio3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtHoraFin3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnEliminarDetalleHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        MaterialTabbed_administrativo.addTab("ELIMINAR", jPanel4);

        TablaDetalleHorario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "HORARIO", "PROFESOR", "MATERIA", "LABORATORIO", "DÍA", "HORA INICIO", "HORA FIN", "SEMESTRE", "GRUPO"
            }
        ));
        jScrollPane1.setViewportView(TablaDetalleHorario);

        BtnSeleccionarDetalleHorario.setBackground(new java.awt.Color(51, 51, 51));
        BtnSeleccionarDetalleHorario.setForeground(new java.awt.Color(255, 255, 255));
        BtnSeleccionarDetalleHorario.setText("SELECCIONAR");
        BtnSeleccionarDetalleHorario.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        BtnSeleccionarDetalleHorario.setRippleColor(new java.awt.Color(204, 204, 204));
        BtnSeleccionarDetalleHorario.setShadowColor(new java.awt.Color(204, 204, 204));
        BtnSeleccionarDetalleHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSeleccionarDetalleHorarioActionPerformed(evt);
            }
        });

        PeriodoCombo5.setForeground(new java.awt.Color(0, 0, 0));
        PeriodoCombo5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione un periodo" }));
        PeriodoCombo5.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        PeriodoCombo5.setLabeText("");
        PeriodoCombo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PeriodoCombo5ActionPerformed(evt);
            }
        });

        IdNomCombo.setForeground(new java.awt.Color(0, 0, 0));
        IdNomCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Laboratorio" }));
        IdNomCombo.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        IdNomCombo.setLabeText("");
        IdNomCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdNomComboActionPerformed(evt);
            }
        });

        customButtons1.setBackground(new java.awt.Color(51, 51, 51));
        customButtons1.setForeground(new java.awt.Color(255, 255, 255));
        customButtons1.setText("IMPRIMIR");
        customButtons1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        customButtons1.setRippleColor(new java.awt.Color(204, 204, 204));
        customButtons1.setShadowColor(new java.awt.Color(204, 204, 204));
        customButtons1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customButtons1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(customButtons1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnSeleccionarDetalleHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(PeriodoCombo5, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(IdNomCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PeriodoCombo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IdNomCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSeleccionarDetalleHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customButtons1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
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

    private void idhorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idhorarioActionPerformed

    }//GEN-LAST:event_idhorarioActionPerformed

    private void ProfesorComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfesorComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProfesorComboActionPerformed

    private void MateriaComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MateriaComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MateriaComboActionPerformed

    private void BtnGuardarDetalleHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarDetalleHorarioActionPerformed
        // Boton guardar detalle_horario

        if (TxtDia.getSelectedItem().equals("Dia") || TxtHoraEntrada.getSelectedItem().equals("Hora")
                || TxtSemestre.getSelectedItem().equals("Semestre") || TxtGrupo.getSelectedItem().equals("Grupo") || idhorario.getSelectedItem().toString().equals("Seleccione")
                || ProfesorCombo.getSelectedItem().toString().equals("Seleccione") || MateriaCombo.getSelectedItem().toString().equals("Seleccione")) {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos");
        } else {

            Integer id = Integer.parseInt(idhorario.getSelectedItem().toString());
            String num_plaza = ProfesorCombo.getSelectedItem().toString();
            String materia = MateriaCombo.getSelectedItem().toString();
            String dia = TxtDia.getSelectedItem().toString();
            String HoraEntrada = TxtHoraEntrada.getSelectedItem().toString();
            String HoraEntrada1 = null;
            String HoraSalida = null;
            if (HoraEntrada.equals("7:00 a 8:00")) {
                HoraEntrada1 = "7:00";
                HoraSalida = "8:00";
            }
            if (HoraEntrada.equals("8:00 a 9:00")) {
                HoraEntrada1 = "8:00";
                HoraSalida = "9:00";
            }
            if (HoraEntrada.equals("9:00 a 10:00")) {
                HoraEntrada1 = "9:00";
                HoraSalida = "10:00";
            }
            if (HoraEntrada.equals("10:00 a 11:00")) {
                HoraEntrada1 = "10:00";
                HoraSalida = "11:00";
            }
            if (HoraEntrada.equals("11:00 a 12:00")) {
                HoraEntrada1 = "11:00";
                HoraSalida = "12:00";
            }
            if (HoraEntrada.equals("12:00 a 13:00")) {
                HoraEntrada1 = "12:00";
                HoraSalida = "13:00";
            }
            if (HoraEntrada.equals("13:00 a 14:00")) {
                HoraEntrada1 = "13:00";
                HoraSalida = "14:00";
            }
            if (HoraEntrada.equals("14:00 a 15:00")) {
                HoraEntrada1 = "14:00";
                HoraSalida = "15:00";
            }
            if (HoraEntrada.equals("15:00 a 16:00")) {
                HoraEntrada1 = "15:00";
                HoraSalida = "16:00";
            }
            if (HoraEntrada.equals("16:00 a 17:00")) {
                HoraEntrada1 = "16:00";
                HoraSalida = "17:00";
            }
            if (HoraEntrada.equals("17:00 a 18:00")) {
                HoraEntrada1 = "17:00";
                HoraSalida = "18:00";
            }
            if (HoraEntrada.equals("18:00 a 19:00")) {
                HoraEntrada1 = "18:00";
                HoraSalida = "19:00";
            }
            if (HoraEntrada.equals("19:00 a 20:00")) {
                HoraEntrada1 = "19:00";
                HoraSalida = "20:00";
            }
            if (HoraEntrada.equals("20:00 a 21:00")) {
                HoraEntrada1 = "20:00";
                HoraSalida = "21:00";
            }
            if (HoraEntrada.equals("21:00 a 22:00")) {
                HoraEntrada1 = "21:00";
                HoraSalida = "22:00";
            }

            Integer semestre = Integer.parseInt(TxtSemestre.getSelectedItem().toString());
            String grupo = TxtGrupo.getSelectedItem().toString();

            //PL para guardar detalle_horario
            c = new Conection().conectar();

            PreparedStatement ps = null;
            ResultSet rs = null;
            int pRes;

            try {

                c = new Conection().conectar();
                String sql1 = "SELECT cns_deth FROM detalle_horario ORDER BY cns_deth DESC LIMIT 1;";
                ps = c.prepareStatement(sql1);
                rs = ps.executeQuery();
                int cns = 0;
                if (rs.next()) {
                    cns = rs.getInt("cns_deth");
                }
                cns = cns + 1;
                String sql = "Call guardar_detalle_horario3 ('" + id + "' ,'" + num_plaza + "' , '" + materia + "' , " + cns + " , '" + dia + "' , '" + HoraEntrada1 + "' , '" + HoraSalida + "', " + semestre + ", '" + grupo + "', NULL);";
                ps = c.prepareStatement(sql);
                rs = ps.executeQuery();
                rs.next();
                pRes = rs.getInt("pRes");
                //Condicion para cuando ya se ha guardado el registro

                if (pRes == 1) {
                    JOptionPane.showMessageDialog(null, "Registro Exitoso", "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);
                    limpiar_horario_detalle();

                } else if (pRes == 2) {
                    JOptionPane.showMessageDialog(null, "Maestro no registrado", "Maestro no registrado", JOptionPane.ERROR_MESSAGE);
                }
                if (pRes == 3) {
                    JOptionPane.showMessageDialog(null, "Cns repetido", "Cns Rpetido", JOptionPane.ERROR_MESSAGE);
                    limpiar_horario_detalle();

                } else if (pRes == 4) {
                    JOptionPane.showMessageDialog(null, "Registro repetido", "Registro repetido", JOptionPane.ERROR_MESSAGE);
                }
                if (pRes == 5) {
                    JOptionPane.showMessageDialog(null, "La materia no existe", "No existe la materia", JOptionPane.ERROR_MESSAGE);
                } else if (pRes == 6) {
                    JOptionPane.showMessageDialog(null, "Periodo no encontrado", "Periodo no encontrado", JOptionPane.ERROR_MESSAGE);
                }
                if (pRes == 7) {
                    JOptionPane.showMessageDialog(null, "Ya se tiene un registro para esta hora", "ya esta agendado", JOptionPane.ERROR_MESSAGE);
                }
                c.close();

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        }
    }//GEN-LAST:event_BtnGuardarDetalleHorarioActionPerformed

    private void TxtDiaModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDiaModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDiaModActionPerformed

    private void TxtHoraInicioModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtHoraInicioModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtHoraInicioModActionPerformed

    private void TxtHoraFinModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtHoraFinModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtHoraFinModActionPerformed

    private void TxtSemestreModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSemestreModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSemestreModActionPerformed

    private void TxtGrupoModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtGrupoModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtGrupoModActionPerformed

    private void BtnModificarDetalleHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarDetalleHorarioActionPerformed
        //Boton MODIFICAR DETALLE_HORARIO

        //modificar
        if (TxtDiaMod.getText().equals("") || TxtHoraInicioMod.getText().equals("") || TxtHoraFinMod.getText().equals("") || TxtSemestreMod.getText().equals("")
                || TxtGrupoMod.getText().equals("") || ProfesorCombo2.getSelectedItem().toString().equals("Seleccione")
                || MateriaCombo2.getSelectedItem().toString().equals("Seleccione") || consecutivoCombo.getSelectedItem().toString().equals("Seleccione")) {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos");
        } else {

            String cns = consecutivoCombo.getSelectedItem().toString();
            String num_plaza = ProfesorCombo2.getSelectedItem().toString();
            String materia = MateriaCombo2.getSelectedItem().toString();
            String dia = TxtDiaMod.getText();
            String HoraEntrada = TxtHoraInicioMod.getText();
            String HoraSalida = TxtHoraFinMod.getText();
            String semestre = TxtSemestreMod.getText();
            String grupo = TxtGrupoMod.getText();

            //PL para guardar detalle_horario
            c = new Conection().conectar();

            PreparedStatement ps = null;
            ResultSet rs = null;
            int pRes;

            if (StringUtils.isNumeric(semestre)) {

                try {

                    c = new Conection().conectar();
                    String sql = "call modificar_detalle_horario2('" + cns + "' ,'" + num_plaza + "' , '" + materia + "' , '" + dia + "' , '" + HoraEntrada + "' , '" + HoraSalida + "', " + semestre + ", '" + grupo + "', NULL);";
                    ps = c.prepareStatement(sql);
                    rs = ps.executeQuery();
                    rs.next();
                    pRes = rs.getInt("pRes");
                    //Condicion para cuando ya se ha guardado el registro

                    if (pRes == 1) {
                        JOptionPane.showMessageDialog(null, "Registro modificado exitosamente", "Registro modificado exitosamente", JOptionPane.INFORMATION_MESSAGE);
                        limpiar_horario_detalle2();

                    } else if (pRes == 2) {
                        JOptionPane.showMessageDialog(null, "La materia no existe", "La materia no existe", JOptionPane.ERROR_MESSAGE);

                    }
                    if (pRes == 3) {
                        JOptionPane.showMessageDialog(null, "La plaza(profesor) no existe", "La plaza(profesor) no existe", JOptionPane.ERROR_MESSAGE);
                        limpiar_horario_detalle2();

                    } else if (pRes == 4) {
                        JOptionPane.showMessageDialog(null, "No existe el CNS", "No existe el CNS", JOptionPane.ERROR_MESSAGE);
                    }

                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }

            } else {
                JOptionPane.showMessageDialog(null, "El SEMESTRE debe ser numerico", "El SEMESTRE  debe ser numerico", JOptionPane.ERROR_MESSAGE);
            }

        }        // TODO add your handling code here:
    }//GEN-LAST:event_BtnModificarDetalleHorarioActionPerformed

    private void MateriaCombo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MateriaCombo2ActionPerformed

    }//GEN-LAST:event_MateriaCombo2ActionPerformed

    private void ProfesorCombo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfesorCombo2ActionPerformed
        // ComboBox de MODIFICAR para mostrar datos seleccionado el cns
        try {
            String cns = consecutivoCombo.getSelectedItem().toString();
            if (!cns.equals("Seleccione")) {
                c = new Conection().conectar();

                String datos[] = busq.VerDetalleModificar(cns);

                TxtDiaMod.setText(datos[0]);
                TxtHoraInicioMod.setText(datos[1]);
                TxtHoraFinMod.setText(datos[2]);
                TxtSemestreMod.setText(datos[3]);
                TxtGrupoMod.setText(datos[4]);

            }
        } catch (Exception x) {
        }
    }//GEN-LAST:event_ProfesorCombo2ActionPerformed

    private void consecutivoComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consecutivoComboActionPerformed

        // ComboBox de MODIFICAR para mostrar datos seleccionado el cns
        try {
            String cns = consecutivoCombo.getSelectedItem().toString();
            if (!cns.equals("Seleccione")) {
                c = new Conection().conectar();

                String datos[] = busq.VerDetalleModificar(cns);

                TxtDiaMod.setText(datos[0]);
                TxtHoraInicioMod.setText(datos[1]);
                TxtHoraFinMod.setText(datos[2]);
                TxtSemestreMod.setText(datos[3]);
                TxtGrupoMod.setText(datos[4]);

            }
        } catch (Exception x) {
        }        // TODO add your handling code here:
    }//GEN-LAST:event_consecutivoComboActionPerformed

    private void consecutivoCombo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consecutivoCombo3ActionPerformed
        // ComboBox de eliminar para mostrar datos seleccionado el cns
        try {
            String cns = consecutivoCombo3.getSelectedItem().toString();
            if (!cns.equals("Seleccione")) {
                c = new Conection().conectar();

                String datos[] = busq.VerDetalleEliminar(cns);

                TxtPeriodo3.setText(datos[0]);
                TxtProfesor3.setText(datos[1]);
                TxtMateria3.setText(datos[2]);
                TxtDia3.setText(datos[3]);
                TxtHoraInicio3.setText(datos[4]);
                TxtHoraFin3.setText(datos[5]);
                TxtSemestre3.setText(datos[6]);
                TxtGrupo3.setText(datos[7]);

            }
        } catch (Exception x) {
        }        // TODO add your handling code here:
    }//GEN-LAST:event_consecutivoCombo3ActionPerformed

    private void TxtDia3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDia3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDia3ActionPerformed

    private void TxtHoraInicio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtHoraInicio3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtHoraInicio3ActionPerformed

    private void TxtHoraFin3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtHoraFin3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtHoraFin3ActionPerformed

    private void TxtSemestre3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSemestre3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSemestre3ActionPerformed

    private void TxtGrupo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtGrupo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtGrupo3ActionPerformed

    private void TxtProfesor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtProfesor3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtProfesor3ActionPerformed

    private void TxtMateria3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtMateria3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtMateria3ActionPerformed

    private void TxtPeriodo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPeriodo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPeriodo3ActionPerformed

    private void BtnEliminarDetalleHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarDetalleHorarioActionPerformed
        // Eliminar Detalle del horario
        String cns = consecutivoCombo3.getSelectedItem().toString();

        el.eliminarDetalleHorario(cns);
        TxtPeriodo3.setText("");
        TxtProfesor3.setText("");
        TxtMateria3.setText("");
        TxtDia3.setText("");
        TxtHoraInicio3.setText("");
        TxtHoraFin3.setText("");
        TxtSemestre3.setText("");
        TxtGrupo3.setText("");

        consecutivoCombo3.removeAllItems();
        consecutivoCombo3.addItem("Seleccione");
    }//GEN-LAST:event_BtnEliminarDetalleHorarioActionPerformed

    private void BtnSeleccionarDetalleHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSeleccionarDetalleHorarioActionPerformed
        if (!PeriodoCombo5.getSelectedItem().toString().equals("Seleccione un periodo") || !IdNomCombo.getSelectedItem().toString().equals("Seleccione Laboratorio")) {
            //MOSTRAR TABLA DE DETALLE_HORARIO
            try {
                DefaultTableModel modelado = new DefaultTableModel();
                TablaDetalleHorario.setModel(modelado);

                //Agregar tres variables
                PreparedStatement ps = null;
                ResultSet rs = null;
                //Connection con= getConection();
                c = new Conection().conectar();
                String sql = "select h.periodo, (SELECT (nombre_p || ' ' || ap_pat || ' ' || ap_mat) AS Nombre_Completo FROM profesores), m.nom_materia, l.nombre_lab, dh.dia, dh.hora_inicio, dh.hora_fin, dh.semestre, dh.grupo FROM horarios h INNER JOIN detalle_horario dh ON dh.id_horario = h.id_horario  INNER JOIN materias m ON m.id_materia = dh.id_materia INNER JOIN laboratorio l on h.id_lab=l.id_lab WHERE h.periodo = '" + PeriodoCombo5.getSelectedItem().toString() + "' and l.nombre_lab = '" + IdNomCombo.getSelectedItem().toString() + "' order by h.periodo;";
                ps = c.prepareStatement(sql);
                rs = ps.executeQuery();

                ResultSetMetaData rsMetaD = rs.getMetaData();
                int cant_columnas = rsMetaD.getColumnCount();

                modelado.addColumn("PERIODO");
                modelado.addColumn("PROFESOR");
                modelado.addColumn("MATERIA");
                modelado.addColumn("LABORATORIO");
                modelado.addColumn("DÍA");
                modelado.addColumn("HORA ENTRADA");
                modelado.addColumn("HORA SALIDA");
                modelado.addColumn("SEMESTRE");
                modelado.addColumn("GRUPO");

                while (rs.next()) {
                    Object[] filas = new Object[cant_columnas];

                    for (int i = 0; i < cant_columnas; i++) {
                        filas[i] = rs.getObject(i + 1);

                    }
                    modelado.addRow(filas);
                }
            } catch (Exception e) {
                System.out.println("e");

            }
        }else{
             JOptionPane.showMessageDialog(null, "Seleccione datos en los botones desplegables");
        }

    }//GEN-LAST:event_BtnSeleccionarDetalleHorarioActionPerformed

    private void PeriodoCombo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PeriodoCombo5ActionPerformed
        // Id Horarios Combo Eliminar
        // TODO add your handling code here:
    }//GEN-LAST:event_PeriodoCombo5ActionPerformed

    private void IdNomComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdNomComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdNomComboActionPerformed

    private void customButtons1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customButtons1ActionPerformed
        // TODO add your handling code here:
        
        if (!PeriodoCombo5.getSelectedItem().toString().equals("Seleccione un periodo") || !IdNomCombo.getSelectedItem().toString().equals("Seleccione Laboratorio")) {
        Document documento = new Document();
            try {

            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/" + PeriodoCombo5.getSelectedItem().toString()+"_"+IdNomCombo.getSelectedItem().toString()+".pdf"));
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("HORARIO DE "+PeriodoCombo5.getSelectedItem().toString()+" "+IdNomCombo.getSelectedItem().toString()+". \n \n");
            parrafo.setFont(FontFactory.getFont("Tahoma", 14, Font.BOLD, BaseColor.DARK_GRAY));
        
            documento.open();
            documento.add(parrafo);
            
            PdfPTable tablahorario = new PdfPTable(5);
                tablahorario.addCell("PROFESOR");
                tablahorario.addCell("MATERIA");
                tablahorario.addCell("DÍA");
                tablahorario.addCell("HORA ENTRADA");
                tablahorario.addCell("HORA SALIDA");
                tablahorario.addCell("SEMESTRE");
                tablahorario.addCell("GRUPO");    
                
            
            try {

                //Agregar tres variables
                PreparedStatement ps = null;
                ResultSet rs = null;
                //Connection con= getConection();
                c = new Conection().conectar();
                String sql = "select h.periodo, (SELECT (nombre_p || ' ' || ap_pat || ' ' || ap_mat) AS Nombre_Completo FROM profesores), m.nom_materia, l.nombre_lab, dh.dia, dh.hora_inicio, dh.hora_fin, dh.semestre, dh.grupo FROM horarios h INNER JOIN detalle_horario dh ON dh.id_horario = h.id_horario  INNER JOIN materias m ON m.id_materia = dh.id_materia INNER JOIN laboratorio l on h.id_lab=l.id_lab WHERE h.periodo = '" + PeriodoCombo5.getSelectedItem().toString() + "' and l.nombre_lab = '" + IdNomCombo.getSelectedItem().toString() + "' order by h.periodo;";
                ps = c.prepareStatement(sql);
                rs = ps.executeQuery();

                ResultSetMetaData rsMetaD = rs.getMetaData();
                int cant_columnas = rsMetaD.getColumnCount();


                while (rs.next()) {
                    Object[] filas = new Object[cant_columnas];

                    for (int i = 0; i < cant_columnas; i++) {
                        filas[i] = rs.getObject(i + 1);
                        tablahorario.addCell(rs.getString(2));
                        tablahorario.addCell(rs.getString(3));
                        tablahorario.addCell(rs.getString(5));
                        tablahorario.addCell(rs.getString(6));
                        tablahorario.addCell(rs.getString(7));
                        tablahorario.addCell(rs.getString(8));
                        tablahorario.addCell(rs.getString(9));
                        
                        
                    } 
                }
                documento.add(tablahorario);
                JOptionPane.showMessageDialog(null, "Reporte creado correctamente.");
                documento.close();
                
            } catch (Exception e) {
                System.out.println(e);

            }
        }catch (DocumentException | IOException e) {
            System.err.println("Error en PDF o ruta de imagen" + e);
            JOptionPane.showMessageDialog(null, "Error al generar PDF, contacte al administrador");
        }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione datos en los botones desplegables");
        }
    }//GEN-LAST:event_customButtons1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private EVD1.CustomButtons BtnEliminarDetalleHorario;
    private EVD1.CustomButtons BtnGuardarDetalleHorario;
    private EVD1.CustomButtons BtnModificarDetalleHorario;
    private EVD1.CustomButtons BtnSeleccionarDetalleHorario;
    private EVD2.Combobox IdNomCombo;
    private EVD2.Combobox MateriaCombo;
    private EVD2.Combobox MateriaCombo2;
    private EVD1.MaterialTabbed MaterialTabbed_administrativo;
    private EVD2.Combobox PeriodoCombo5;
    private EVD2.Combobox ProfesorCombo;
    private EVD2.Combobox ProfesorCombo2;
    private javax.swing.JTable TablaDetalleHorario;
    private EVD2.Combobox TxtDia;
    private EVD1.TextField TxtDia3;
    private EVD1.TextField TxtDiaMod;
    private EVD2.Combobox TxtGrupo;
    private EVD1.TextField TxtGrupo3;
    private EVD1.TextField TxtGrupoMod;
    private EVD2.Combobox TxtHoraEntrada;
    private EVD1.TextField TxtHoraFin3;
    private EVD1.TextField TxtHoraFinMod;
    private EVD1.TextField TxtHoraInicio3;
    private EVD1.TextField TxtHoraInicioMod;
    private EVD1.TextField TxtMateria3;
    private EVD1.TextField TxtPeriodo3;
    private EVD1.TextField TxtProfesor3;
    private EVD2.Combobox TxtSemestre;
    private EVD1.TextField TxtSemestre3;
    private EVD1.TextField TxtSemestreMod;
    private EVD2.Combobox consecutivoCombo;
    private EVD2.Combobox consecutivoCombo3;
    private EVD1.CustomButtons customButtons1;
    private EVD2.Combobox idhorario;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
