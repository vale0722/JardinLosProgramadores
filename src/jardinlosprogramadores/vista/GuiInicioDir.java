/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jardinlosprogramadores.vista;

import jardinlosprogramadores.Control.jardinLosProgramadores;
import jardinlosprogramadores.Modelo.Logro;
import jardinlosprogramadores.Modelo.LogroNinno;
import jardinlosprogramadores.Modelo.Ninno;
import jardinlosprogramadores.Modelo.Pariente;
import jardinlosprogramadores.Modelo.Profesor;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vale_
 */
public class GuiInicioDir extends javax.swing.JFrame {

    /**
     * Creates new form GuiInicioDir
     */
    public GuiInicioDir() {
        
        initComponents();
        nombre.setText(jardinLosProgramadores.getDirector().getNombre() + " " + jardinLosProgramadores.getDirector().getApellidos());
        Id.setText(jardinLosProgramadores.getDirector().getId());
        tDocument.setText(jardinLosProgramadores.getDirector().gettDocumento());

        //llenar tabla ninnos
        for (int i = 0; i < jardinLosProgramadores.getNinnos().size(); i++) {
            Ninno ninno = jardinLosProgramadores.getNinnos().get(i);
            String[] vNinno = {ninno.gettDocumento(), ninno.getId(), ninno.getNombre() + " " + ninno.getApellidos(), "" + ninno.getGrupo().getNumeroGrupo()};
            DefaultTableModel tabla = (DefaultTableModel) tablaNinnos.getModel();
            tabla.addRow(vNinno);
        }
        totalNinnos.setText("" + jardinLosProgramadores.getNinnos().size());

        //Llenar tabla profesores
        for (int i = 0; i < jardinLosProgramadores.getProfesores().size(); i++) {
            Profesor prof = jardinLosProgramadores.getProfesores().get(i);
            String[] vProf = {prof.gettDocumento(), prof.getId(), prof.getNombre() + " " + prof.getApellidos(), "" + prof.getnGrupo(), prof.getTitulo(), prof.getCorreo()};
            DefaultTableModel tabla = (DefaultTableModel) tablaProfs.getModel();
            tabla.addRow(vProf);
        }
        totalProfs.setText("" + jardinLosProgramadores.getProfesores().size());

        //Llenar tabla Grupo1
        for (int i = 0; i < jardinLosProgramadores.getGrupos().get(0).getNinnos().size(); i++) {
            Ninno ninno = jardinLosProgramadores.getGrupos().get(0).getNinnos().get(i);
            String[] vNinno = {ninno.gettDocumento(), ninno.getId(), ninno.getNombre() + " " + ninno.getApellidos(), "" + ninno.getPromedio()};
            DefaultTableModel tabla = (DefaultTableModel) tablaNinnosG1.getModel();
            tabla.addRow(vNinno);
        }
        totalNinnosG1.setText("" + jardinLosProgramadores.getGrupos().get(0).getNinnos().size());
        promedioG1.setText("" + jardinLosProgramadores.getGrupos().get(0).getPromedio());
        profG1.setText(jardinLosProgramadores.getGrupos().get(0).getProfesor().getNombre() + " " + jardinLosProgramadores.getGrupos().get(0).getProfesor().getApellidos());

        //Llenar tabla Grupo2
        for (int i = 0; i < jardinLosProgramadores.getGrupos().get(1).getNinnos().size(); i++) {
            Ninno ninno = jardinLosProgramadores.getGrupos().get(1).getNinnos().get(i);
            String[] vNinno = {ninno.gettDocumento(), ninno.getId(), ninno.getNombre() + " " + ninno.getApellidos(), "" + ninno.getPromedio()};
            DefaultTableModel tabla = (DefaultTableModel) tablaNinnosG2.getModel();
            tabla.addRow(vNinno);
        }
        totalNinnosG2.setText("" + jardinLosProgramadores.getGrupos().get(1).getNinnos().size());
        promedioG2.setText("" + jardinLosProgramadores.getGrupos().get(1).getPromedio());
        profG2.setText(jardinLosProgramadores.getGrupos().get(1).getProfesor().getNombre() + " " + jardinLosProgramadores.getGrupos().get(1).getProfesor().getApellidos());

        //Llenar tabla Grupo3
        for (int i = 0; i < jardinLosProgramadores.getGrupos().get(2).getNinnos().size(); i++) {
            Ninno ninno = jardinLosProgramadores.getGrupos().get(2).getNinnos().get(i);
            String[] vNinno = {ninno.gettDocumento(), ninno.getId(), ninno.getNombre() + " " + ninno.getApellidos(), "" + ninno.getPromedio()};
            DefaultTableModel tabla = (DefaultTableModel) tablaNinnosG3.getModel();
            tabla.addRow(vNinno);
        }
        totalNinnosG3.setText("" + jardinLosProgramadores.getGrupos().get(2).getNinnos().size());
        promedioG3.setText("" + jardinLosProgramadores.getGrupos().get(2).getPromedio());
        profG3.setText(jardinLosProgramadores.getGrupos().get(2).getProfesor().getNombre() + " " + jardinLosProgramadores.getGrupos().get(2).getProfesor().getApellidos());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();
        jPanel7 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();
        tDocument = new javax.swing.JLabel();
        Id = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel10 = new javax.swing.JPanel();
        paginador = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        scrollPane1 = new java.awt.ScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaNinnos = new javax.swing.JTable();
        verNinno = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        totalNinnos = new javax.swing.JTextField();
        agregarNinno = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        totalProfs = new javax.swing.JTextField();
        scrollPane5 = new java.awt.ScrollPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaProfs = new javax.swing.JTable();
        g2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        panel2 = new java.awt.Panel();
        scrollPane2 = new java.awt.ScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaNinnosG1 = new javax.swing.JTable();
        panel3 = new java.awt.Panel();
        jLabel3 = new javax.swing.JLabel();
        profG1 = new javax.swing.JTextField();
        promedioG1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        verNinnoG1 = new javax.swing.JButton();
        verLogrosG1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        totalNinnosG1 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        scrollPane4 = new java.awt.ScrollPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaNinnosG2 = new javax.swing.JTable();
        panel5 = new java.awt.Panel();
        jLabel9 = new javax.swing.JLabel();
        profG2 = new javax.swing.JTextField();
        promedioG2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        verNinnoG2 = new javax.swing.JButton();
        verLogrosG2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        totalNinnosG2 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        scrollPane6 = new java.awt.ScrollPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaNinnosG3 = new javax.swing.JTable();
        panel6 = new java.awt.Panel();
        jLabel15 = new javax.swing.JLabel();
        profG3 = new javax.swing.JTextField();
        promedioG3 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        verNinnoG3 = new javax.swing.JButton();
        verLogrosG3 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        totalNinnosG3 = new javax.swing.JTextField();

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 767, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 771, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("JARDIN INFANTIL");
        setMaximumSize(new java.awt.Dimension(567, 491));
        setMinimumSize(new java.awt.Dimension(567, 491));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombre.setText("Nombre del Director");
        nombre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tDocument.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        tDocument.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tDocument.setText("TDocument");

        Id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Id.setText("IdDocument");

        user.setBackground(new java.awt.Color(102, 102, 102));
        user.setForeground(new java.awt.Color(102, 102, 102));
        user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout (2).png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(tDocument, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Id, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombre)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tDocument, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        paginador.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tablaNinnos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        tablaNinnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TD", "ND", "Nombre Completo", "Grupo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaNinnos.setSelectionBackground(new java.awt.Color(255, 102, 51));
        jScrollPane1.setViewportView(tablaNinnos);
        if (tablaNinnos.getColumnModel().getColumnCount() > 0) {
            tablaNinnos.getColumnModel().getColumn(2).setPreferredWidth(200);
        }

        scrollPane1.add(jScrollPane1);

        verNinno.setBackground(new java.awt.Color(255, 102, 0));
        verNinno.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        verNinno.setForeground(new java.awt.Color(255, 255, 255));
        verNinno.setText("Ver Niño Seleccionado");
        verNinno.setActionCommand("");
        verNinno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verNinnoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Total de niños matriculados:");

        totalNinnos.setEnabled(false);

        agregarNinno.setBackground(new java.awt.Color(255, 102, 0));
        agregarNinno.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        agregarNinno.setForeground(new java.awt.Color(255, 255, 255));
        agregarNinno.setText("Matricular un estudiante");
        agregarNinno.setActionCommand("");
        agregarNinno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarNinnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(totalNinnos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(verNinno)
                .addGap(34, 34, 34)
                .addComponent(agregarNinno)
                .addContainerGap())
            .addComponent(scrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarNinno)
                    .addComponent(verNinno)
                    .addComponent(totalNinnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(149, Short.MAX_VALUE))
        );

        paginador.addTab("Niños", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setText("Profesores registrados:");

        totalProfs.setEnabled(false);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel12)
                .addGap(26, 26, 26)
                .addComponent(totalProfs, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 27, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(totalProfs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        tablaProfs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TD", "ND", "Nombre Completo", "Grupo", "Titulo", "Correo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tablaProfs);
        if (tablaProfs.getColumnModel().getColumnCount() > 0) {
            tablaProfs.getColumnModel().getColumn(0).setPreferredWidth(5);
            tablaProfs.getColumnModel().getColumn(2).setPreferredWidth(200);
            tablaProfs.getColumnModel().getColumn(3).setPreferredWidth(10);
        }

        scrollPane5.add(jScrollPane5);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(scrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(scrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        paginador.addTab("Profesores", jPanel3);

        g2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        tablaNinnosG1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TD", "ND", "Nombre Completo", "Promedio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaNinnosG1);
        if (tablaNinnosG1.getColumnModel().getColumnCount() > 0) {
            tablaNinnosG1.getColumnModel().getColumn(2).setPreferredWidth(200);
        }

        scrollPane2.add(jScrollPane2);

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Profesor a cargo:");

        profG1.setEnabled(false);
        profG1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profG1ActionPerformed(evt);
            }
        });

        promedioG1.setEnabled(false);
        promedioG1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                promedioG1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Promedio del grupo:");

        verNinnoG1.setBackground(new java.awt.Color(255, 102, 0));
        verNinnoG1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        verNinnoG1.setForeground(new java.awt.Color(255, 255, 255));
        verNinnoG1.setText("Ver Niño Seleccionado");
        verNinnoG1.setActionCommand("");
        verNinnoG1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verNinnoG1ActionPerformed(evt);
            }
        });

        verLogrosG1.setBackground(new java.awt.Color(255, 102, 0));
        verLogrosG1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        verLogrosG1.setForeground(new java.awt.Color(255, 255, 255));
        verLogrosG1.setText("Logros Evaluados");
        verLogrosG1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verLogrosG1ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel13.setText("Cantidad de Niños:");

        totalNinnosG1.setEnabled(false);

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addComponent(totalNinnosG1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(verLogrosG1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(profG1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(promedioG1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                    .addContainerGap(537, Short.MAX_VALUE)
                    .addComponent(verNinnoG1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(promedioG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(verLogrosG1))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(totalNinnosG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel3Layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(verNinnoG1)
                    .addContainerGap(157, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        g2.addTab("Grupo 1", jPanel5);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        tablaNinnosG2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TD", "ND", "Nombre Completo", "Promedio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tablaNinnosG2);
        if (tablaNinnosG2.getColumnModel().getColumnCount() > 0) {
            tablaNinnosG2.getColumnModel().getColumn(2).setPreferredWidth(200);
        }

        scrollPane4.add(jScrollPane4);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("Profesor a cargo:");

        profG2.setEnabled(false);
        profG2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profG2ActionPerformed(evt);
            }
        });

        promedioG2.setEnabled(false);
        promedioG2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                promedioG2ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel11.setText("Promedio del grupo:");

        verNinnoG2.setBackground(new java.awt.Color(255, 102, 0));
        verNinnoG2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        verNinnoG2.setForeground(new java.awt.Color(255, 255, 255));
        verNinnoG2.setText("Ver Niño Seleccionado");
        verNinnoG2.setActionCommand("");
        verNinnoG2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verNinnoG2ActionPerformed(evt);
            }
        });

        verLogrosG2.setBackground(new java.awt.Color(255, 102, 0));
        verLogrosG2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        verLogrosG2.setForeground(new java.awt.Color(255, 255, 255));
        verLogrosG2.setText("Logros Evaluados");
        verLogrosG2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verLogrosG2ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel14.setText("Cantidad de Niños:");

        totalNinnosG2.setEnabled(false);

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel5Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalNinnosG2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(verLogrosG2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel5Layout.createSequentialGroup()
                        .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel5Layout.createSequentialGroup()
                                .addComponent(profG2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 442, Short.MAX_VALUE))
                            .addGroup(panel5Layout.createSequentialGroup()
                                .addComponent(promedioG2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 245, Short.MAX_VALUE)
                                .addComponent(verNinnoG2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(verNinnoG2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(promedioG2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profG2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel5Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(verLogrosG2))
                    .addGroup(panel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(totalNinnosG2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(scrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );

        g2.addTab("Grupo 2", jPanel8);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        tablaNinnosG3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TD", "ND", "Nombre Completo", "Promedio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tablaNinnosG3);
        if (tablaNinnosG3.getColumnModel().getColumnCount() > 0) {
            tablaNinnosG3.getColumnModel().getColumn(2).setPreferredWidth(200);
        }

        scrollPane6.add(jScrollPane6);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel15.setText("Profesor a cargo:");

        profG3.setEnabled(false);
        profG3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profG3ActionPerformed(evt);
            }
        });

        promedioG3.setEnabled(false);
        promedioG3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                promedioG3ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel17.setText("Promedio del grupo:");

        verNinnoG3.setBackground(new java.awt.Color(255, 102, 0));
        verNinnoG3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        verNinnoG3.setForeground(new java.awt.Color(255, 255, 255));
        verNinnoG3.setText("Ver Niño Seleccionado");
        verNinnoG3.setActionCommand("");
        verNinnoG3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verNinnoG3ActionPerformed(evt);
            }
        });

        verLogrosG3.setBackground(new java.awt.Color(255, 102, 0));
        verLogrosG3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        verLogrosG3.setForeground(new java.awt.Color(255, 255, 255));
        verLogrosG3.setText("Logros Evaluados");
        verLogrosG3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verLogrosG3ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel18.setText("Cantidad de Niños:");

        totalNinnosG3.setEnabled(false);

        javax.swing.GroupLayout panel6Layout = new javax.swing.GroupLayout(panel6);
        panel6.setLayout(panel6Layout);
        panel6Layout.setHorizontalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel6Layout.createSequentialGroup()
                        .addComponent(totalNinnosG3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(verLogrosG3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel6Layout.createSequentialGroup()
                        .addComponent(profG3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 442, Short.MAX_VALUE))
                    .addGroup(panel6Layout.createSequentialGroup()
                        .addComponent(promedioG3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 245, Short.MAX_VALUE)
                        .addComponent(verNinnoG3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panel6Layout.setVerticalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(verNinnoG3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel6Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(promedioG3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profG3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel6Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(verLogrosG3))
                    .addGroup(panel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalNinnosG3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(scrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 766, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        g2.addTab("Grupo 3", jPanel6);

        paginador.addTab("Grupos", g2);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(paginador, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paginador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        paginador.getAccessibleContext().setAccessibleName("");
        paginador.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private JFrame getFrame() {
        return this;
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        frameInicio.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void verNinnoG1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verNinnoG1ActionPerformed
        DefaultTableModel model = (DefaultTableModel) tablaNinnosG1.getModel();
        int a = tablaNinnosG1.getSelectedRow();
        Ninno ninno = null;
        if (a < 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila de la tabla");
        } else {
            for (int i = 0; i < jardinLosProgramadores.getGrupos().get(0).getNinnos().size(); i++) {
                if (jardinLosProgramadores.getGrupos().get(0).getNinnos().get(i).getId().equals(String.valueOf(tablaNinnosG1.getValueAt(a, 1)))) {
                    ninno = jardinLosProgramadores.getGrupos().get(0).getNinnos().get(i);
                }
            }
            if (ninno != null) {
                verNinno(ninno);
            }
        }
    }//GEN-LAST:event_verNinnoG1ActionPerformed

    private void promedioG1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_promedioG1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_promedioG1ActionPerformed

    private void profG1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profG1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_profG1ActionPerformed

    private void agregarNinnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarNinnoActionPerformed
        GuiCrearNinno nuevoNinno = new GuiCrearNinno() {
            @Override
            public void dispose() {
                super.dispose();
            }
        };
        nuevoNinno.setFrameInicio(frameInicio);
        nuevoNinno.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_agregarNinnoActionPerformed

    private void verNinnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verNinnoActionPerformed
        DefaultTableModel model = (DefaultTableModel) tablaNinnos.getModel();
        int a = tablaNinnos.getSelectedRow();
        Ninno ninno = null;
        if (a < 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila de la tabla");
        } else {
            for (int i = 0; i < jardinLosProgramadores.getNinnos().size(); i++) {
                if (jardinLosProgramadores.getNinnos().get(i).getId().equals(String.valueOf(tablaNinnos.getValueAt(a, 1)))) {
                    ninno = jardinLosProgramadores.getNinnos().get(i);
                }
            }
            if (ninno != null) {
                verNinno(ninno);
            }
        }
    }//GEN-LAST:event_verNinnoActionPerformed

    private void profG2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profG2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_profG2ActionPerformed

    private void promedioG2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_promedioG2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_promedioG2ActionPerformed

    private void verNinnoG2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verNinnoG2ActionPerformed
        DefaultTableModel model = (DefaultTableModel) tablaNinnosG2.getModel();
        int a = tablaNinnosG2.getSelectedRow();
        Ninno ninno = null;
        if (a < 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila de la tabla");
        } else {
            for (int i = 0; i < jardinLosProgramadores.getGrupos().get(1).getNinnos().size(); i++) {
                if (jardinLosProgramadores.getGrupos().get(1).getNinnos().get(i).getId().equals(String.valueOf(tablaNinnosG2.getValueAt(a, 1)))) {
                    ninno = jardinLosProgramadores.getGrupos().get(1).getNinnos().get(i);
                }
            }
            if (ninno != null) {
                verNinno(ninno);
            }
        }
    }//GEN-LAST:event_verNinnoG2ActionPerformed

    private void verLogrosG2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verLogrosG2ActionPerformed
        GuiLogrosGrupo lG = new GuiLogrosGrupo();
        lG.setnGrupo("Grupo " + jardinLosProgramadores.getGrupos().get(1).getNumeroGrupo());
        //llenar tabla Logros grupo 1
        for (int i = 0; i < jardinLosProgramadores.getGrupos().get(1).getLogros().size(); i++) {
            Logro logro = jardinLosProgramadores.getGrupos().get(1).getLogros().get(i);
            String[] vLogro = {logro.getTitulo(), logro.getDescripcion()};
            DefaultTableModel tabla = (DefaultTableModel) lG.getTablaLogros().getModel();
            tabla.addRow(vLogro);
        }
        lG.setVisible(true);
    }//GEN-LAST:event_verLogrosG2ActionPerformed

    private void profG3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profG3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_profG3ActionPerformed

    private void promedioG3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_promedioG3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_promedioG3ActionPerformed

    private void verNinnoG3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verNinnoG3ActionPerformed
        DefaultTableModel model = (DefaultTableModel) tablaNinnosG3.getModel();
        int a = tablaNinnosG3.getSelectedRow();
        Ninno ninno = null;
        if (a < 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila de la tabla");
        } else {
            for (int i = 0; i < jardinLosProgramadores.getGrupos().get(2).getNinnos().size(); i++) {
                if (jardinLosProgramadores.getGrupos().get(2).getNinnos().get(i).getId().equals(String.valueOf(tablaNinnosG3.getValueAt(a, 1)))) {
                    ninno = jardinLosProgramadores.getGrupos().get(2).getNinnos().get(i);
                }
            }
            if (ninno != null) {
                verNinno(ninno);
            }
        }
    }//GEN-LAST:event_verNinnoG3ActionPerformed

    private void verLogrosG3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verLogrosG3ActionPerformed
        GuiLogrosGrupo lG = new GuiLogrosGrupo();
        lG.setnGrupo("Grupo " + jardinLosProgramadores.getGrupos().get(2).getNumeroGrupo());
        //llenar tabla Logros grupo 1
        for (int i = 0; i < jardinLosProgramadores.getGrupos().get(2).getLogros().size(); i++) {
            Logro logro = jardinLosProgramadores.getGrupos().get(2).getLogros().get(i);
            String[] vLogro = {logro.getTitulo(), logro.getDescripcion()};
            DefaultTableModel tabla = (DefaultTableModel) lG.getTablaLogros().getModel();
            tabla.addRow(vLogro);
        }
        lG.setVisible(true);
    }//GEN-LAST:event_verLogrosG3ActionPerformed

    private void verLogrosG1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verLogrosG1ActionPerformed
        GuiLogrosGrupo lG = new GuiLogrosGrupo();
        lG.setnGrupo("Grupo " + jardinLosProgramadores.getGrupos().get(0).getNumeroGrupo());
        //llenar tabla Logros grupo 1
        for (int i = 0; i < jardinLosProgramadores.getGrupos().get(0).getLogros().size(); i++) {
            Logro logro = jardinLosProgramadores.getGrupos().get(0).getLogros().get(i);
            String[] vLogro = {logro.getTitulo(), logro.getDescripcion()};
            DefaultTableModel tabla = (DefaultTableModel) lG.getTablaLogros().getModel();
            tabla.addRow(vLogro);
        }
        lG.setVisible(true);
    }//GEN-LAST:event_verLogrosG1ActionPerformed
    
    private void verNinno(Ninno ninno) {
        GuiNinno infoNinno = new GuiNinno();
        infoNinno.setNombre(ninno.getNombre() + " " + ninno.getApellidos());
        infoNinno.setDocumento(ninno.gettDocumento() + ". " + ninno.getId());
        infoNinno.setEdad(ninno.getEdad());
        infoNinno.setCondicion(ninno.getCondEspeciales());
        infoNinno.setNombreA(ninno.getPariente().getNombre() + " " + ninno.getPariente().getApellidos());
        infoNinno.setDocumentoA(ninno.getPariente().gettDocumento() + ". " + ninno.getPariente().getId());
        infoNinno.setContactoA(ninno.getPariente().getTelefono() + " - " + ninno.getPariente().getCelular());
        infoNinno.setCorreoA(ninno.getPariente().getCorreo());
        infoNinno.setParentezco(ninno.getPariente().getParentezco());
        infoNinno.setPromedio("" + ninno.getPromedio());
        infoNinno.getAgregarLogroNinno().setVisible(false);
        infoNinno.getAgregarLogroNinno().setEnabled(false);
        infoNinno.getGenerarReporte().setVisible(false);
        infoNinno.getGenerarReporte().setEnabled(false);
        //llenar tabla Logros ninno
        for (int i = 0; i < ninno.getLogrosNinno().size(); i++) {
            LogroNinno logroninno = ninno.getLogrosNinno().get(i);
            String[] vLNinno = {logroninno.getLogro().getTitulo(), logroninno.getLogro().getDescripcion(), logroninno.getAlcance(), String.valueOf(logroninno.getNota())};
            DefaultTableModel tabla = (DefaultTableModel) infoNinno.getTablaLogros().getModel();
            tabla.addRow(vLNinno);
        }
        infoNinno.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiInicioDir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiInicioDir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiInicioDir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiInicioDir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiInicioDir().setVisible(true);
            }
        });
    }
    
    public JFrame getFrameInicio() {
        return frameInicio;
    }
    
    public void setFrameInicio(JFrame frame) {
        this.frameInicio = frame;
    }
    
    private JFrame frameInicio;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Id;
    private javax.swing.JButton agregarNinno;
    private javax.swing.JTabbedPane g2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nombre;
    private javax.swing.JTabbedPane paginador;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    private java.awt.Panel panel5;
    private java.awt.Panel panel6;
    private javax.swing.JTextField profG1;
    private javax.swing.JTextField profG2;
    private javax.swing.JTextField profG3;
    private javax.swing.JTextField promedioG1;
    private javax.swing.JTextField promedioG2;
    private javax.swing.JTextField promedioG3;
    private java.awt.ScrollPane scrollPane1;
    private java.awt.ScrollPane scrollPane2;
    private java.awt.ScrollPane scrollPane4;
    private java.awt.ScrollPane scrollPane5;
    private java.awt.ScrollPane scrollPane6;
    private javax.swing.JLabel tDocument;
    private javax.swing.JTable tablaNinnos;
    private javax.swing.JTable tablaNinnosG1;
    private javax.swing.JTable tablaNinnosG2;
    private javax.swing.JTable tablaNinnosG3;
    private javax.swing.JTable tablaProfs;
    private javax.swing.JTextField totalNinnos;
    private javax.swing.JTextField totalNinnosG1;
    private javax.swing.JTextField totalNinnosG2;
    private javax.swing.JTextField totalNinnosG3;
    private javax.swing.JTextField totalProfs;
    private javax.swing.JLabel user;
    private javax.swing.JButton verLogrosG1;
    private javax.swing.JButton verLogrosG2;
    private javax.swing.JButton verLogrosG3;
    private javax.swing.JButton verNinno;
    private javax.swing.JButton verNinnoG1;
    private javax.swing.JButton verNinnoG2;
    private javax.swing.JButton verNinnoG3;
    // End of variables declaration//GEN-END:variables
}
