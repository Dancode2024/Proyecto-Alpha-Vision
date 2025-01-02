package com.Cine.View.Admin;

import com.Cine.View.user.*;
import com.Cine.View.Login_us;
import com.Cine.Model.RoundBorder;
import com.Cine.mysql.conexion.Cine_db;
import com.formdev.flatlaf.FlatDarkLaf;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.RingPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import com.Cine.Controller.Administrador;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Admin extends javax.swing.JFrame {

    Cine_db db;
    private CardLayout card;

    public Admin() {
        boolean setup = FlatDarkLaf.setup();
        //Conexión a la base de datos
        db = new Cine_db(); // Instancia correctamente
        db.getConnection(); // Llama al método para establecer la conexión
        initComponents();
        this.setTitle("Admin");
        setSize(900, 530);
        setLocationRelativeTo(null);

        Image log = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/Cine/View/image/logo.jpg"));
        Logo.setIcon(new ImageIcon(log.getScaledInstance(Logo.getWidth(), Logo.getHeight(), Image.SCALE_SMOOTH)));

        Image p = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/Cine/View/image/peli.png"));
        Pelicula.setIcon(new ImageIcon(p.getScaledInstance(Pelicula.getWidth(), Pelicula.getHeight(), Image.SCALE_SMOOTH)));
        Image c = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/Cine/View/image/user.png"));
        usuarios.setIcon(new ImageIcon(c.getScaledInstance(usuarios.getWidth(), usuarios.getHeight(), Image.SCALE_SMOOTH)));
        Image b = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/Cine/View/image/bd.png"));
        bdatos.setIcon(new ImageIcon(b.getScaledInstance(bdatos.getWidth(), bdatos.getHeight(), Image.SCALE_SMOOTH)));
        Image pro = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/Cine/View/image/productos.png"));
        Prod.setIcon(new ImageIcon(pro.getScaledInstance(Prod.getWidth(), Prod.getHeight(), Image.SCALE_SMOOTH)));
        Image close = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/Cine/View/image/close.png"));
        Close.setIcon(new ImageIcon(close.getScaledInstance(Close.getWidth(), Close.getHeight(), Image.SCALE_SMOOTH)));
        Image g = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/Cine/View/image/grafico.png"));
        Grafics.setIcon(new ImageIcon(g.getScaledInstance(Grafics.getWidth(), Grafics.getHeight(), Image.SCALE_SMOOTH)));
        Image m = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/Cine/View/image/mapa.png"));
        mundi.setIcon(new ImageIcon(m.getScaledInstance(mundi.getWidth(), mundi.getHeight(), Image.SCALE_SMOOTH)));

        //MOSTAR DATOS EN PANTALLA
        CargarDatos();
        CargarHorario();
        CargarCategoria();
        CargarProductos();
        CargarReservas();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Pelicula = new javax.swing.JLabel();
        bdatos = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usuarios = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Prod = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Grafics = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        view_user = new javax.swing.JPanel();
        GRAFICOS = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        Productos = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        num_user = new javax.swing.JLabel();
        Reservas = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        tot_peli = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        tot_horario = new javax.swing.JLabel();
        mundi = new javax.swing.JLabel();
        Usuario = new javax.swing.JButton();
        Graficos_Panel = new javax.swing.JPanel();
        Usuarios = new javax.swing.JButton();
        user = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn_agregar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        user_table = new javax.swing.JTable();
        reservas = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Agregar = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_reservas = new javax.swing.JTable();
        productos = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Add_productos = new javax.swing.JButton();
        Update_productos = new javax.swing.JButton();
        Delete_productos = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tb_productos = new javax.swing.JTable();
        pelicula = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Add_categoria = new javax.swing.JButton();
        Up_categoria = new javax.swing.JButton();
        Del_categoria = new javax.swing.JButton();
        Add_horario = new javax.swing.JButton();
        Up_horario = new javax.swing.JButton();
        Del_horario = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_horario = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tb_categoria = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(3, 3, 5));

        Pelicula.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        Pelicula.setForeground(new java.awt.Color(255, 255, 255));
        Pelicula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Pelicula.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Pelicula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PeliculaMouseClicked(evt);
            }
        });

        bdatos.setBackground(new java.awt.Color(255, 153, 0));
        bdatos.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        bdatos.setForeground(new java.awt.Color(255, 153, 0));
        bdatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bdatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bdatosMouseClicked(evt);
            }
        });

        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pelicula");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Usuarios");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Loguot");

        usuarios.setBackground(new java.awt.Color(255, 153, 0));
        usuarios.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        usuarios.setForeground(new java.awt.Color(255, 153, 0));
        usuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuariosMouseClicked(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Reservas");

        Prod.setBackground(new java.awt.Color(255, 153, 0));
        Prod.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        Prod.setForeground(new java.awt.Color(255, 153, 0));
        Prod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Prod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProdMouseClicked(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Producto");

        Grafics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GraficsMouseClicked(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Graficos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bdatos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Prod, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addComponent(Pelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Grafics, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Pelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(bdatos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Prod, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Grafics, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(12, 12, 12))
        );

        view_user.setLayout(new java.awt.CardLayout());

        GRAFICOS.setBackground(new java.awt.Color(255, 255, 255));
        GRAFICOS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 204, 204));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("DASHBOARD");
        GRAFICOS.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 6, -1, -1));

        Productos.setBackground(new java.awt.Color(0, 204, 204));
        Productos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Productos.setForeground(new java.awt.Color(255, 255, 255));
        Productos.setText("Productos");
        Productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductosActionPerformed(evt);
            }
        });
        GRAFICOS.add(Productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 100, 40));

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));
        jPanel4.setBorder(new RoundBorder(10)
        );

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Total de Usuarios");

        num_user.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        num_user.setForeground(new java.awt.Color(255, 255, 255));
        num_user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
            .addComponent(num_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(num_user, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        GRAFICOS.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 180, 80));

        Reservas.setBackground(new java.awt.Color(255, 204, 0));
        Reservas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Reservas.setForeground(new java.awt.Color(255, 255, 255));
        Reservas.setText("Reservas");
        Reservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservasActionPerformed(evt);
            }
        });
        GRAFICOS.add(Reservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 100, 40));

        jPanel5.setBackground(new java.awt.Color(255, 204, 0));
        jPanel5.setBorder(new RoundBorder(10));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Total de Peliculas");

        tot_peli.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tot_peli.setForeground(new java.awt.Color(255, 255, 255));
        tot_peli.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(tot_peli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tot_peli, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        GRAFICOS.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 200, 80));

        jPanel6.setBackground(new java.awt.Color(153, 0, 204));
        jPanel6.setBorder(new RoundBorder(10)
        );

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Horarios Disponibles");

        tot_horario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tot_horario.setForeground(new java.awt.Color(255, 255, 255));
        tot_horario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
            .addComponent(tot_horario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tot_horario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        GRAFICOS.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 180, 80));
        GRAFICOS.add(mundi, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 50, 40));

        Usuario.setBackground(new java.awt.Color(255, 0, 0));
        Usuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Usuario.setForeground(new java.awt.Color(255, 255, 255));
        Usuario.setText("Roles");
        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });
        GRAFICOS.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 100, 40));

        javax.swing.GroupLayout Graficos_PanelLayout = new javax.swing.GroupLayout(Graficos_Panel);
        Graficos_Panel.setLayout(Graficos_PanelLayout);
        Graficos_PanelLayout.setHorizontalGroup(
            Graficos_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        Graficos_PanelLayout.setVerticalGroup(
            Graficos_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        GRAFICOS.add(Graficos_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 460, 260));

        Usuarios.setBackground(new java.awt.Color(204, 0, 255));
        Usuarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Usuarios.setForeground(new java.awt.Color(255, 255, 255));
        Usuarios.setText("Usuarios");
        Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariosActionPerformed(evt);
            }
        });
        GRAFICOS.add(Usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 100, 40));

        view_user.add(GRAFICOS, "GRAFICOS");

        user.setBackground(new java.awt.Color(255, 255, 255));
        user.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Rockwell Condensed", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("USUARIOS");
        user.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 280, -1));

        btn_agregar.setBackground(new java.awt.Color(0, 204, 204));
        btn_agregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_agregar.setForeground(new java.awt.Color(255, 255, 255));
        btn_agregar.setText("AGREGAR");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        user.add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 100, -1));

        btn_editar.setBackground(new java.awt.Color(255, 153, 0));
        btn_editar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_editar.setForeground(new java.awt.Color(255, 255, 255));
        btn_editar.setText("EDITAR");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });
        user.add(btn_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 100, -1));

        btn_eliminar.setBackground(new java.awt.Color(255, 0, 0));
        btn_eliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        user.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 100, 30));

        user_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "USUARIO", "CONTRASEÑA"
            }
        ));
        jScrollPane5.setViewportView(user_table);

        user.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, 290));

        view_user.add(user, "User");

        reservas.setBackground(new java.awt.Color(255, 255, 255));
        reservas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Rockwell Condensed", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Reservas");
        reservas.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        Agregar.setBackground(new java.awt.Color(255, 153, 0));
        Agregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Agregar.setForeground(new java.awt.Color(255, 255, 255));
        Agregar.setText("AGREGAR");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        reservas.add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, -1, -1));

        Editar.setBackground(new java.awt.Color(0, 204, 204));
        Editar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Editar.setForeground(new java.awt.Color(255, 255, 255));
        Editar.setText("EDITAR");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });
        reservas.add(Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 90, -1));

        Eliminar.setBackground(new java.awt.Color(255, 0, 0));
        Eliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar.setText("ELIMINAR");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        reservas.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, -1, -1));

        tb_reservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "TITULOS", "HORARIOS", "CATEGORIA", "FECHA", "PRECIO", "USUARIO"
            }
        ));
        jScrollPane1.setViewportView(tb_reservas);

        reservas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 570, 320));

        view_user.add(reservas, "Reservas");

        productos.setBackground(new java.awt.Color(255, 255, 255));
        productos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Rockwell Condensed", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Productos");
        productos.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        Add_productos.setBackground(new java.awt.Color(255, 153, 0));
        Add_productos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Add_productos.setForeground(new java.awt.Color(255, 255, 255));
        Add_productos.setText("AGREGAR");
        Add_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_productosActionPerformed(evt);
            }
        });
        productos.add(Add_productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, -1, -1));

        Update_productos.setBackground(new java.awt.Color(0, 204, 204));
        Update_productos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Update_productos.setForeground(new java.awt.Color(255, 255, 255));
        Update_productos.setText("EDITAR");
        Update_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_productosActionPerformed(evt);
            }
        });
        productos.add(Update_productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, 100, -1));

        Delete_productos.setBackground(new java.awt.Color(255, 0, 0));
        Delete_productos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Delete_productos.setForeground(new java.awt.Color(255, 255, 255));
        Delete_productos.setText("ELIMINAR");
        Delete_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_productosActionPerformed(evt);
            }
        });
        productos.add(Delete_productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, -1, -1));

        tb_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "USUARIO", "PRODUCTO", "CATEGORIA", "PRECIO", "CANTIDAD"
            }
        ));
        jScrollPane6.setViewportView(tb_productos);

        productos.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 590, 350));

        view_user.add(productos, "Productos");

        pelicula.setBackground(new java.awt.Color(255, 255, 255));
        pelicula.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Rockwell Condensed", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Peliculas");
        pelicula.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        Add_categoria.setBackground(new java.awt.Color(255, 204, 0));
        Add_categoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Add_categoria.setForeground(new java.awt.Color(255, 255, 255));
        Add_categoria.setText("AGREGAR");
        Add_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_categoriaActionPerformed(evt);
            }
        });
        pelicula.add(Add_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 100, 30));

        Up_categoria.setBackground(new java.awt.Color(0, 204, 204));
        Up_categoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Up_categoria.setForeground(new java.awt.Color(255, 255, 255));
        Up_categoria.setText("EDITAR");
        Up_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Up_categoriaActionPerformed(evt);
            }
        });
        pelicula.add(Up_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 90, 30));

        Del_categoria.setBackground(new java.awt.Color(255, 0, 0));
        Del_categoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Del_categoria.setForeground(new java.awt.Color(255, 255, 255));
        Del_categoria.setText("ELIMINAR");
        Del_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Del_categoriaActionPerformed(evt);
            }
        });
        pelicula.add(Del_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 100, 30));

        Add_horario.setBackground(new java.awt.Color(255, 204, 0));
        Add_horario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Add_horario.setForeground(new java.awt.Color(255, 255, 255));
        Add_horario.setText("AGREGAR");
        Add_horario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_horarioActionPerformed(evt);
            }
        });
        pelicula.add(Add_horario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 100, 30));

        Up_horario.setBackground(new java.awt.Color(0, 204, 204));
        Up_horario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Up_horario.setForeground(new java.awt.Color(255, 255, 255));
        Up_horario.setText("EDITAR");
        Up_horario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Up_horarioActionPerformed(evt);
            }
        });
        pelicula.add(Up_horario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 100, 30));

        Del_horario.setBackground(new java.awt.Color(255, 0, 0));
        Del_horario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Del_horario.setForeground(new java.awt.Color(255, 255, 255));
        Del_horario.setText("ELIMINAR");
        Del_horario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Del_horarioActionPerformed(evt);
            }
        });
        pelicula.add(Del_horario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 100, 30));

        tb_horario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "HORARIO"
            }
        ));
        jScrollPane3.setViewportView(tb_horario);

        pelicula.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 220, 260));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 204, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("HORARIO");
        pelicula.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("CATEGORIA");
        pelicula.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, -1, -1));

        tb_categoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "TITULO", "CATEGORIA"
            }
        ));
        jScrollPane4.setViewportView(tb_categoria);

        pelicula.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 350, 270));

        view_user.add(pelicula, "Peliculas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(view_user, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(view_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PeliculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PeliculaMouseClicked
        card = (CardLayout) this.view_user.getLayout();
        card.show(view_user, "Peliculas");

    }//GEN-LAST:event_PeliculaMouseClicked

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        // Mostrar un cuadro de diálogo de confirmación
        int opcion = JOptionPane.showConfirmDialog(
                this,
                "¿Está seguro que desea cerrar sesión?",
                "Confirmar Cierre de Sesión",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        // Comprobar la respuesta del usuario
        if (opcion == JOptionPane.YES_OPTION) {
            // Si selecciona "Sí", abrir la ventana de Login y cerrar la actual
            Login_us peli = new Login_us();
            peli.setVisible(true);
            this.setVisible(false);
        }
        // Si selecciona "No", no se hace nada
    }//GEN-LAST:event_CloseMouseClicked

    private void bdatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bdatosMouseClicked
        card = (CardLayout) this.view_user.getLayout();
        card.show(view_user, "Reservas");
    }//GEN-LAST:event_bdatosMouseClicked

    private void usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuariosMouseClicked
        card = (CardLayout) this.view_user.getLayout();
        card.show(view_user, "User");
    }//GEN-LAST:event_usuariosMouseClicked

    private void ProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProdMouseClicked
        // TODO add your handling code here:
        card = (CardLayout) this.view_user.getLayout();
        card.show(view_user, "Productos");
    }//GEN-LAST:event_ProdMouseClicked

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        Administrador admin = new Administrador();

        // Solicita los datos del nuevo usuario
        String nombre = JOptionPane.showInputDialog(this, "Ingrese el nombre:");
        String usuario = JOptionPane.showInputDialog(this, "Ingrese el usuario:");
        String contraseña = JOptionPane.showInputDialog(this, "Ingrese la contraseña:");

        // Valida que los datos no sean nulos ni vacíos
        if (nombre != null && !nombre.trim().isEmpty()
                && usuario != null && !usuario.trim().isEmpty()
                && contraseña != null && !contraseña.trim().isEmpty()) {

            // Llama al método de la clase Administrador para agregar el usuario
            if (admin.agregarUsuario(nombre.trim(), usuario.trim(), contraseña.trim())) {
                JOptionPane.showMessageDialog(this, "Usuario agregado con éxito.");
                CargarDatos(); // Actualiza la tabla
            } else {
                JOptionPane.showMessageDialog(this, "Error al agregar el usuario.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Operación cancelada o campos vacíos.");
        }

    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        Administrador admin = new Administrador();

        int filaSeleccionada = user_table.getSelectedRow();
        if (filaSeleccionada >= 0) {
            // Obtén el ID del usuario seleccionado
            int id = (int) user_table.getValueAt(filaSeleccionada, 0);

            // Muestra cuadros de diálogo para editar los valores actuales
            String nuevoNombre = JOptionPane.showInputDialog(this, "Nuevo nombre:", user_table.getValueAt(filaSeleccionada, 1));
            String nuevoUsuario = JOptionPane.showInputDialog(this, "Nuevo usuario:", user_table.getValueAt(filaSeleccionada, 2));
            String nuevaContraseña = JOptionPane.showInputDialog(this, "Nueva contraseña:", user_table.getValueAt(filaSeleccionada, 3));

            // Valida que no se cancelen los cuadros de diálogo
            if (nuevoNombre != null && !nuevoNombre.trim().isEmpty()
                    && nuevoUsuario != null && !nuevoUsuario.trim().isEmpty()
                    && nuevaContraseña != null && !nuevaContraseña.trim().isEmpty()) {

                // Llama al método de la clase Administrador para actualizar el usuario
                if (admin.actualizarUsuario(id, nuevoNombre.trim(), nuevoUsuario.trim(), nuevaContraseña.trim())) {
                    JOptionPane.showMessageDialog(this, "Usuario actualizado con éxito.");
                    CargarDatos(); // Actualiza los datos de la tabla
                } else {
                    JOptionPane.showMessageDialog(this, "Error al actualizar el usuario.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Operación cancelada o campos vacíos.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un usuario para editar.");
        }
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        Administrador admin = new Administrador();
        int filaSeleccionada = user_table.getSelectedRow();
        if (filaSeleccionada >= 0) {
            Object idObj = user_table.getValueAt(filaSeleccionada, 0);

            // Validar que el ID sea un entero
            if (idObj instanceof Integer) {
                int id = (int) idObj;

                // Confirmar la eliminación
                int confirmacion = JOptionPane.showConfirmDialog(this,
                        "¿Está seguro de que desea eliminar este usuario?",
                        "Confirmar eliminación",
                        JOptionPane.YES_NO_OPTION);

                if (confirmacion == JOptionPane.YES_OPTION) {
                    // Llamar al método en la clase Administrador
                    if (admin.eliminarUsuario(id)) {
                        JOptionPane.showMessageDialog(this, "Usuario eliminado con éxito.");
                        CargarDatos(); // Actualizar la tabla
                    } else {
                        JOptionPane.showMessageDialog(this, "No se pudo eliminar el usuario.");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "El ID seleccionado no es válido.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un usuario para eliminar.");
        }

    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // ELIMINAR RESERVAS
        Administrador admin = new Administrador();
        int filaSeleccionada = tb_reservas.getSelectedRow(); // Obtiene la fila seleccionada

        if (filaSeleccionada >= 0) {
            // Obtén el ID de la columna correspondiente
            Object idObj = tb_reservas.getValueAt(filaSeleccionada, 0);

            try {
                int id = Integer.parseInt(idObj.toString()); // Convierte el ID a entero

                // Confirmar eliminación
                int confirmacion = JOptionPane.showConfirmDialog(this,
                        "¿Está seguro de que desea eliminar esta reserva?",
                        "Confirmar eliminación",
                        JOptionPane.YES_NO_OPTION);

                if (confirmacion == JOptionPane.YES_OPTION) {
                    // Llama al método para eliminar en la clase Administrador
                    if (admin.eliminarReservaPorId(id)) {
                        JOptionPane.showMessageDialog(this, "Reserva eliminada con éxito.");
                        CargarReservas(); // Actualiza la tabla
                    } else {
                        JOptionPane.showMessageDialog(this, "No se pudo eliminar la reserva.");
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "El ID seleccionado no es válido.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una reserva para eliminar.");
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        // AGREGAR RESERVAS:
        String titulo = JOptionPane.showInputDialog(this, "Ingrese el Titulo:");
        String horario = JOptionPane.showInputDialog(this, "Ingrese el Horario:");
        String categoria = JOptionPane.showInputDialog(this, "Ingrese la Categoria:");
        String fecha = JOptionPane.showInputDialog(this, "Ingrese la Fecha:");
        String precio = JOptionPane.showInputDialog(this, "Ingrese el Precio:");
        String user = JOptionPane.showInputDialog(this, "Ingrese Usuario:");

        if (titulo != null && !titulo.trim().isEmpty()
                && horario != null && !horario.trim().isEmpty()
                && categoria != null && !categoria.trim().isEmpty()
                && fecha != null && !fecha.trim().isEmpty()
                && precio != null && !precio.trim().isEmpty()
                && user != null && !user.trim().isEmpty()) {

            // Crear un objeto Administrador para manejar la base de datos
            Administrador admin = new Administrador();
            boolean exito = admin.agregarReserva(titulo.trim(), horario.trim(), categoria.trim(),
                    fecha.trim(), precio.trim(), user.trim());

            if (exito) {
                JOptionPane.showMessageDialog(this, "Reserva agregada con éxito.");
                CargarReservas(); // Actualizar la tabla
            } else {
                JOptionPane.showMessageDialog(this, "Error al agregar la reserva.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Operación cancelada o campos vacíos.");
        }
    }//GEN-LAST:event_AgregarActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        // EDITAR RESERVAS
        int filaSeleccionada = tb_reservas.getSelectedRow();
        if (filaSeleccionada >= 0) {
            try {
                // Convierte el ID a entero desde la tabla
                int id = Integer.parseInt(tb_reservas.getValueAt(filaSeleccionada, 0).toString());

                String nuevoTitulo = JOptionPane.showInputDialog(this, "Nuevo titulo:", tb_reservas.getValueAt(filaSeleccionada, 1));
                String nuevoHorario = JOptionPane.showInputDialog(this, "Nuevo horario:", tb_reservas.getValueAt(filaSeleccionada, 2));
                String nuevaCategoria = JOptionPane.showInputDialog(this, "Nueva categoria:", tb_reservas.getValueAt(filaSeleccionada, 3));
                String nuevaFecha = JOptionPane.showInputDialog(this, "Nueva fecha:", tb_reservas.getValueAt(filaSeleccionada, 4));
                String nuevoPrecio = JOptionPane.showInputDialog(this, "Nuevo precio:", tb_reservas.getValueAt(filaSeleccionada, 5));
                String nuevoUsuario = JOptionPane.showInputDialog(this, "Nuevo usuario:", tb_reservas.getValueAt(filaSeleccionada, 6));

                if (nuevoTitulo != null && !nuevoTitulo.trim().isEmpty()
                        && nuevoHorario != null && !nuevoHorario.trim().isEmpty()
                        && nuevaCategoria != null && !nuevaCategoria.trim().isEmpty()
                        && nuevaFecha != null && !nuevaFecha.trim().isEmpty()
                        && nuevoPrecio != null && !nuevoPrecio.trim().isEmpty()
                        && nuevoUsuario != null && !nuevoUsuario.trim().isEmpty()) {

                    // Crear un objeto Administrador para realizar la actualización
                    Administrador admin = new Administrador();
                    boolean exito = admin.editarReserva(id, nuevoTitulo.trim(), nuevoHorario.trim(),
                            nuevaCategoria.trim(), nuevaFecha.trim(), nuevoPrecio.trim(), nuevoUsuario.trim());

                    if (exito) {
                        JOptionPane.showMessageDialog(this, "Reserva actualizada con éxito.");
                        CargarReservas(); // Actualiza la tabla
                    } else {
                        JOptionPane.showMessageDialog(this, "Error al actualizar la reserva.");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Operación cancelada o campos vacíos.");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Error al convertir el ID: " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una reserva para editar.");
        }

    }//GEN-LAST:event_EditarActionPerformed

    private void Add_horarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_horarioActionPerformed
        // AGREGAR HORARIO
        Administrador admin = new Administrador();

        String horario = JOptionPane.showInputDialog(this, "Ingrese el Horario:");
        if (horario != null && !horario.trim().isEmpty()) {
            // Llamar al método en la clase Administrador
            if (admin.agregarHorario(horario)) {
                JOptionPane.showMessageDialog(this, "Horario agregado con éxito.");
                CargarHorario(); // Actualizar la tabla
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo agregar el horario.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Operación cancelada o campos vacíos.");
        }
    }//GEN-LAST:event_Add_horarioActionPerformed

    private void Up_horarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Up_horarioActionPerformed
        Administrador admin = new Administrador();

        int filaSeleccionada = tb_horario.getSelectedRow();
        if (filaSeleccionada >= 0) {
            try {
                // Convierte el ID a entero desde la tabla
                int id = Integer.parseInt(tb_horario.getValueAt(filaSeleccionada, 0).toString());

                // Solicitar el nuevo horario al usuario
                String nuevoHorario = JOptionPane.showInputDialog(this, "Nuevo horario:", tb_horario.getValueAt(filaSeleccionada, 1));

                if (nuevoHorario != null && !nuevoHorario.trim().isEmpty()) {
                    // Llamar al método en la clase Administrador
                    if (admin.actualizarHorario(id, nuevoHorario)) {
                        JOptionPane.showMessageDialog(this, "Horario actualizado con éxito.");
                        CargarHorario(); // Actualizar la tabla
                    } else {
                        JOptionPane.showMessageDialog(this, "No se pudo actualizar el horario.");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Operación cancelada o campos vacíos.");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Error al convertir el ID: " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un horario para editar.");
        }
    }//GEN-LAST:event_Up_horarioActionPerformed

    private void Del_horarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Del_horarioActionPerformed
        // ELIMINAR HORARIO
        Administrador admin = new Administrador();
        int filaSeleccionada = tb_horario.getSelectedRow(); // Verificar si hay una fila seleccionada
        if (filaSeleccionada >= 0) {
            Object idObj = tb_horario.getValueAt(filaSeleccionada, 0);
            if (!(idObj instanceof Integer)) {
                JOptionPane.showMessageDialog(this, "El ID seleccionado no es válido.");
                return;
            }
            int id = (int) idObj; // Obtener el ID de la fila seleccionada

            int confirmacion = JOptionPane.showConfirmDialog(this,
                    "¿Está seguro de que desea eliminar este horario?",
                    "Confirmar eliminación",
                    JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                if (admin.eliminarHorarioPorId(id)) {
                    JOptionPane.showMessageDialog(this, "Horario eliminado con éxito.");
                    CargarHorario(); // Actualiza la tabla tras la eliminación
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo eliminar el horario.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un horario para eliminar.");
        }
    }//GEN-LAST:event_Del_horarioActionPerformed

    private void Add_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_categoriaActionPerformed
        // AGREGAR CATEGORIA
        Administrador admin = new Administrador();
        String titulo = JOptionPane.showInputDialog(this, "Ingrese el Titulo: ");
        String categoria = JOptionPane.showInputDialog(this, "Ingrese la Categoria: ");

        if (titulo != null && categoria != null) {
            if (admin.agregarCategoria(titulo, categoria)) {
                JOptionPane.showMessageDialog(this, "Categoría agregada con éxito.");
                CargarCategoria(); // Actualizar la tabla
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo agregar la categoría.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Operación cancelada.");
        }
    }//GEN-LAST:event_Add_categoriaActionPerformed

    private void Up_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Up_categoriaActionPerformed
        // EDITAR CATEGORIA
        Administrador admin = new Administrador();
        int filaSeleccionada = tb_categoria.getSelectedRow();
        if (filaSeleccionada >= 0) {
            try {
                // Obtener el ID desde la tabla
                int id = Integer.parseInt(tb_categoria.getValueAt(filaSeleccionada, 0).toString());

                // Pedir los nuevos valores al usuario
                String nuevoTitulo = JOptionPane.showInputDialog(this, "Nuevo Título:", tb_categoria.getValueAt(filaSeleccionada, 1));
                String nuevaCategoria = JOptionPane.showInputDialog(this, "Nueva Categoría:", tb_categoria.getValueAt(filaSeleccionada, 2));

                // Validar los valores ingresados
                if (nuevoTitulo != null && !nuevoTitulo.trim().isEmpty()
                        && nuevaCategoria != null && !nuevaCategoria.trim().isEmpty()) {

                    // Llamar al método en la clase Administrador
                    if (admin.actualizarCategoria(id, nuevoTitulo, nuevaCategoria)) {
                        JOptionPane.showMessageDialog(this, "Datos actualizados con éxito.");
                        CargarCategoria(); // Actualizar la tabla
                    } else {
                        JOptionPane.showMessageDialog(this, "No se pudo actualizar los datos.");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Operación cancelada o campos vacíos.");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Error al convertir el ID: " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una fila para editar.");
        }
    }//GEN-LAST:event_Up_categoriaActionPerformed

    private void Del_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Del_categoriaActionPerformed
        // ELIMINAR CATEGORIA
        Administrador admin = new Administrador();
        int filaSeleccionada = tb_categoria.getSelectedRow(); // Verificar si hay una fila seleccionada
        if (filaSeleccionada >= 0) {
            Object idObj = tb_categoria.getValueAt(filaSeleccionada, 0);
            if (!(idObj instanceof Integer)) {
                JOptionPane.showMessageDialog(this, "El ID seleccionado no es válido.");
                return;
            }
            int id = (int) idObj; // Obtener ID de la fila seleccionada

            int confirmacion = JOptionPane.showConfirmDialog(this,
                    "¿Está seguro de que desea eliminar esta categoría y sus registros relacionados?",
                    "Confirmar eliminación",
                    JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                if (admin.eliminarCategoriaPorId(id)) {
                    JOptionPane.showMessageDialog(this, "Categoría eliminada con éxito.");
                    CargarCategoria(); // Actualizar la tabla
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo eliminar la categoría.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una fila para eliminar.");
        }
    }//GEN-LAST:event_Del_categoriaActionPerformed

    private void Add_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_productosActionPerformed
        // AGREGAR PRODUCTOS
        String usuario = JOptionPane.showInputDialog(this, "Ingrese el Usuario: ");
        String producto = JOptionPane.showInputDialog(this, "Ingrese el Producto: ");
        String categoria = JOptionPane.showInputDialog(this, "Ingrese la Categoría: ");
        String precio = JOptionPane.showInputDialog(this, "Ingrese el Precio: ");
        String cantidad = JOptionPane.showInputDialog(this, "Ingrese la Cantidad: ");

        // Validar que los campos no sean nulos
        if (usuario != null && producto != null && categoria != null && precio != null && cantidad != null) {
            // Llama al método de la clase Administrador
            Administrador admin = new Administrador();
            boolean exito = admin.agregarProducto(usuario.trim(), producto.trim(), categoria.trim(), precio.trim(), cantidad.trim());

            if (exito) {
                JOptionPane.showMessageDialog(this, "Producto agregado con éxito.");
                CargarProductos(); // Actualizar la tabla
            } else {
                JOptionPane.showMessageDialog(this, "Error al agregar el producto.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Operación cancelada.");
        }

    }//GEN-LAST:event_Add_productosActionPerformed

    private void Update_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_productosActionPerformed
        // EDITAR PRODUCTOS
        int filaSeleccionada = tb_productos.getSelectedRow();
        if (filaSeleccionada >= 0) {
            try {
                // Obtiene el ID seleccionado en la tabla
                int id = Integer.parseInt(tb_productos.getValueAt(filaSeleccionada, 0).toString());

                // Solicita los nuevos datos al usuario
                String nuevoUsuario = JOptionPane.showInputDialog(this, "Nuevo Usuario:", tb_productos.getValueAt(filaSeleccionada, 1));
                String nuevoProducto = JOptionPane.showInputDialog(this, "Nuevo Producto:", tb_productos.getValueAt(filaSeleccionada, 2));
                String nuevoCategoria = JOptionPane.showInputDialog(this, "Nueva Categoría:", tb_productos.getValueAt(filaSeleccionada, 3));
                String nuevoPrecio = JOptionPane.showInputDialog(this, "Nuevo Precio:", tb_productos.getValueAt(filaSeleccionada, 4));
                String nuevaCantidad = JOptionPane.showInputDialog(this, "Nueva Cantidad:", tb_productos.getValueAt(filaSeleccionada, 5));

                // Validación de campos no vacíos
                if (nuevoUsuario != null && !nuevoUsuario.trim().isEmpty()
                        && nuevoProducto != null && !nuevoProducto.trim().isEmpty()
                        && nuevoCategoria != null && !nuevoCategoria.trim().isEmpty()
                        && nuevoPrecio != null && !nuevoPrecio.trim().isEmpty()
                        && nuevaCantidad != null && !nuevaCantidad.trim().isEmpty()) {

                    // Llama al método de la clase Administrador para actualizar los datos
                    Administrador admin = new Administrador();
                    boolean exito = admin.actualizarProducto(id, nuevoUsuario.trim(), nuevoProducto.trim(),
                            nuevoCategoria.trim(), nuevoPrecio.trim(), nuevaCantidad.trim());

                    if (exito) {
                        JOptionPane.showMessageDialog(this, "Datos actualizados con éxito.");
                        CargarProductos(); // Actualiza la tabla en la interfaz
                    } else {
                        JOptionPane.showMessageDialog(this, "Error al actualizar los datos.");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Operación cancelada o campos vacíos.");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Error al convertir el ID: " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un producto para editar.");
        }
    }//GEN-LAST:event_Update_productosActionPerformed

    private void Delete_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_productosActionPerformed
        //ELIMINAR PRODUCTO
        // Crear un objeto Administrador para realizar la actualización
        Administrador admin = new Administrador();
        int filaSeleccionada = tb_productos.getSelectedRow(); // Verificar si hay una fila seleccionada
        if (filaSeleccionada >= 0) {
            Object idObj = tb_productos.getValueAt(filaSeleccionada, 0);
            if (!(idObj instanceof Integer)) {
                JOptionPane.showMessageDialog(this, "El ID seleccionado no es válido.");
                return;
            }
            int id = (int) idObj;

            int confirmacion = JOptionPane.showConfirmDialog(this,
                    "¿Está seguro de que desea eliminar este producto?",
                    "Confirmar eliminación",
                    JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                if (admin.eliminarProductoPorId(id)) {
                    JOptionPane.showMessageDialog(this, "Producto eliminado con éxito.");
                    CargarProductos(); // Actualiza la tabla después de la eliminación
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo eliminar el producto.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un producto para eliminar.");
        }
    }//GEN-LAST:event_Delete_productosActionPerformed

    private void GraficsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GraficsMouseClicked
        // MOSTRAR GRAFICOS
        card = (CardLayout) this.view_user.getLayout();
        card.show(view_user, "GRAFICOS");
        MostrarUser();
        MostrarHorarios();
        MostrarPeliculas();
    }//GEN-LAST:event_GraficsMouseClicked

    private void ProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductosActionPerformed
        try (Connection con = (Connection) db.getConnection()) {
            String sql = "SELECT categoria, SUM(cantidad) AS total FROM productos GROUP BY categoria";
            try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql); ResultSet rs = pst.executeQuery()) {
                DefaultCategoryDataset dataset = new DefaultCategoryDataset();

                while (rs.next()) {
                    String categoria = rs.getString("categoria");
                    int totalCantidad = rs.getInt("total");
                    dataset.addValue(totalCantidad, "Cantidad", categoria);
                }

                JFreeChart chart = ChartFactory.createBarChart(
                        "Cantidad de Productos por Categoría", "Categorías", "Cantidad Total", dataset
                );

                CategoryPlot plot = chart.getCategoryPlot();
                plot.setBackgroundPaint(new Color(240, 240, 240));
                plot.setDomainGridlinePaint(Color.BLACK);
                plot.setRangeGridlinePaint(Color.BLACK);

                BarRenderer renderer = (BarRenderer) plot.getRenderer();
                renderer.setSeriesPaint(0, new Color(50, 150, 255));
                renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator("{2}",
                        NumberFormat.getInstance())); // Generador de etiquetas
                renderer.setBaseItemLabelsVisible(true);             // Hacer visibles las etiquetas
                renderer.setItemLabelAnchorOffset(10);               // Ajustar posición de etiquetas

                ChartPanel chartPanel = new ChartPanel(chart);
                updateGraficosPanel(chartPanel); // Método para actualizar el panel
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al generar el gráfico: " + e.getMessage());
        }
    }//GEN-LAST:event_ProductosActionPerformed

    private void ReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservasActionPerformed
        try (Connection con = (Connection) db.getConnection()) {
            String sql = "SELECT titulo, COUNT(*) AS total FROM reservas GROUP BY titulo";
            try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql); ResultSet rs = pst.executeQuery()) {
                DefaultCategoryDataset dataset = new DefaultCategoryDataset();

                // Llenar el dataset con los títulos y la cantidad de reservas
                while (rs.next()) {
                    String titulo = rs.getString("titulo");  // Obtener el título
                    int totalReservas = rs.getInt("total");  // Obtener el total de reservas
                    dataset.addValue(totalReservas, "Reservas", titulo);  // Agregar al dataset
                }

                // Crear el gráfico de barras
                JFreeChart chart = ChartFactory.createBarChart(
                        "Reservas por Título", // Título del gráfico
                        "Títulos", // Etiqueta del eje X
                        "Total de Reservas", // Etiqueta del eje Y
                        dataset // Dataset
                );

                // Personalizar el gráfico
                CategoryPlot plot = chart.getCategoryPlot();
                plot.setBackgroundPaint(new Color(240, 240, 240)); // Fondo del gráfico
                plot.setDomainGridlinePaint(Color.BLACK);         // Líneas del grid en el eje X
                plot.setRangeGridlinePaint(Color.BLACK);          // Líneas del grid en el eje Y

                // Personalizar las barras
                BarRenderer renderer = (BarRenderer) plot.getRenderer();
                renderer.setSeriesPaint(0, new Color(50, 150, 255)); // Color de las barras
                renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator("{2}",
                        NumberFormat.getInstance())); // Generador de etiquetas
                renderer.setBaseItemLabelsVisible(true);             // Hacer visibles las etiquetas
                renderer.setItemLabelAnchorOffset(10);               // Ajustar posición de etiquetas

                // Crear el panel para mostrar el gráfico
                ChartPanel chartPanel = new ChartPanel(chart);
                updateGraficosPanel(chartPanel); // Método para actualizar el panel donde se mostrará el gráfico
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al generar el gráfico: " + e.getMessage());
        }
    }//GEN-LAST:event_ReservasActionPerformed

    private void UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioActionPerformed
        try (Connection con = (Connection) db.getConnection()) {
            String sql = "SELECT rol_id, COUNT(*) AS total FROM usuarios GROUP BY rol_id";
            try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql); ResultSet rs = pst.executeQuery()) {
                DefaultPieDataset dataset = new DefaultPieDataset();
                while (rs.next()) {
                    int rolId = rs.getInt("rol_id");
                    int totalUsuarios = rs.getInt("total");
                    String rolNombre = switch (rolId) {
                        case 1 ->
                            "Administrador";
                        case 2 ->
                            "Usuario";
                        default ->
                            "Otros";
                    };
                    dataset.setValue(rolNombre, totalUsuarios);
                }

                JFreeChart chart = ChartFactory.createRingChart(
                        "Usuarios por Rol", dataset, true, true, false
                );

                RingPlot plot = (RingPlot) chart.getPlot();
                plot.setSectionDepth(0.25);
                plot.setLabelGenerator(new StandardPieSectionLabelGenerator("{0}:{1}"));

                ChartPanel chartPanel = new ChartPanel(chart);
                updateGraficosPanel(chartPanel); // Método para actualizar el panel
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al generar el gráfico: " + e.getMessage());
        }
    }//GEN-LAST:event_UsuarioActionPerformed

    private void UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariosActionPerformed
        try (Connection con = (Connection) db.getConnection()) {
            // Corregir la consulta para obtener reservas por título
            String sql = "SELECT usuario, COUNT(*) AS total FROM reservas GROUP BY usuario";
            try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql); ResultSet rs = pst.executeQuery()) {
                DefaultPieDataset dataset = new DefaultPieDataset();

                // Llenar el dataset con los títulos y la cantidad de reservas
                while (rs.next()) {
                    String usuario = rs.getString("usuario");  // Obtener el usuario
                    int totalReservas = rs.getInt("total");  // Obtener el total de reservas
                    dataset.setValue(usuario, totalReservas);  // Agregar al dataset
                }

                // Crear el gráfico de pastel
                JFreeChart chart = ChartFactory.createPieChart(
                        "Reservas por Usuario", dataset, true, true, false
                );

                // Personalizar el gráfico
                PiePlot plot = (PiePlot) chart.getPlot();
                plot.setBackgroundPaint(new Color(240, 240, 255));  // Fondo del gráfico
                plot.setLabelGenerator(new StandardPieSectionLabelGenerator("{0}:{1}"));  // Etiquetas del gráfico

                // Crear el panel para mostrar el gráfico
                ChartPanel chartPanel = new ChartPanel(chart);
                updateGraficosPanel(chartPanel); // Método para actualizar el panel donde se mostrará el gráfico
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al generar el gráfico: " + e.getMessage());
        }

    }//GEN-LAST:event_UsuariosActionPerformed
    public void CargarDatos() {
        DefaultTableModel modelo = (DefaultTableModel) user_table.getModel();
        modelo.setRowCount(0); // Limpiar la tabla antes de cargar datos
        System.out.println("Filas en la tabla: " + user_table.getRowCount());

        String sql = "SELECT id, nombre, usuario, contraseña FROM usuarios";
        try (Connection con = (Connection) db.getConnection(); PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql); ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                Object[] fila = {
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("usuario"),
                    rs.getString("contraseña")
                };
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            System.out.println("Error al cargar datos: " + e.getMessage());
        }
    }

    public void CargarHorario() {
        DefaultTableModel modelo = (DefaultTableModel) tb_horario.getModel();
        modelo.setRowCount(0); // Limpiar la tabla antes de cargar datos

        String sql = "SELECT  id, hora FROM horarios";
        try (Connection con = (Connection) db.getConnection(); PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql); ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                Object[] fila = {
                    rs.getInt("id"),
                    rs.getString("hora"),};
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            System.out.println("Error al cargar datos: " + e.getMessage());
        }
    }

    public void CargarCategoria() {
        DefaultTableModel modelo = (DefaultTableModel) tb_categoria.getModel();
        modelo.setRowCount(0); // Limpiar la tabla antes de cargar datos

        String sql = "SELECT id, titulo, genero FROM peliculas";
        try (Connection con = (Connection) db.getConnection(); PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql); ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                Object[] fila = {
                    rs.getInt("id"),
                    rs.getString("titulo"),
                    rs.getString("genero"),};
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            System.out.println("Error al cargar datos: " + e.getMessage());
        }
    }

    public void CargarProductos() {
        DefaultTableModel modelo = (DefaultTableModel) tb_productos.getModel();
        modelo.setRowCount(0); // Limpiar la tabla antes de cargar datos

        String sql = "SELECT id,usuario, nombre, categoria, precio, cantidad  FROM productos";
        try (Connection con = (Connection) db.getConnection(); PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql); ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                Object[] fila = {
                    rs.getInt("id"),
                    rs.getString("usuario"),
                    rs.getString("nombre"),
                    rs.getString("categoria"),
                    rs.getString("precio"),
                    rs.getString("cantidad"),};
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            System.out.println("Error al cargar datos: " + e.getMessage());
        }
    }

    public void CargarReservas() {
        // Obtiene el modelo de la tabla
        DefaultTableModel modelo = (DefaultTableModel) tb_reservas.getModel();
        modelo.setRowCount(0); // Limpia las filas existentes antes de cargar datos

        // Consulta SQL corregida
        String sql = "SELECT id, titulo, horario, categoria, fecha, precio, usuario "
                + "FROM reservas"; // Elimina la coma extra y selecciona solo las columnas necesarias

        try (Connection con = (Connection) db.getConnection(); PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql); ResultSet rs = pst.executeQuery()) {

            // Recorre los resultados
            while (rs.next()) {
                // Crea un arreglo con los datos de cada fila
                Object[] fila = {
                    rs.getInt("id"), // Título de la película
                    rs.getString("titulo"), // Título de la película
                    rs.getString("horario"), // Horario de la función
                    rs.getString("categoria"), // Categoría de la película
                    rs.getString("fecha"), // Fecha de la reserva
                    rs.getDouble("precio"), // Precio de la reserva
                    rs.getString("usuario") // Usuario que realizó la reserva
                };
                modelo.addRow(fila); // Agrega la fila al modelo de la tabla
            }
        } catch (SQLException e) {
            // Manejo de errores
            System.out.println("Error al cargar datos: " + e.getMessage());
        }
    }

    public void MostrarUser() {
        String sql = "SELECT COUNT(*) AS total FROM usuarios";
        try {
            Connection conn = (Connection) db.getConnection();
            PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                int total = rs.getInt("total");
                num_user.setText(" " + total);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al obtener el total de usuarios: " + e.getMessage());
        }
    }

    public void MostrarPeliculas() {
        String sql = "SELECT COUNT(*) AS total FROM peliculas";
        try {
            Connection conn = (Connection) db.getConnection();
            PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                int total = rs.getInt("total");
                tot_peli.setText(" " + total);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al obtener el total de usuarios: " + e.getMessage());
        }
    }

    public void MostrarHorarios() {
        String sql = "SELECT COUNT(*) AS total FROM peliculas";
        try {
            Connection conn = (Connection) db.getConnection();
            PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                int total = rs.getInt("total");
                tot_horario.setText(" " + total);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al obtener el total de usuarios: " + e.getMessage());
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_categoria;
    private javax.swing.JButton Add_horario;
    private javax.swing.JButton Add_productos;
    private javax.swing.JButton Agregar;
    private javax.swing.JLabel Close;
    private javax.swing.JButton Del_categoria;
    private javax.swing.JButton Del_horario;
    private javax.swing.JButton Delete_productos;
    private javax.swing.JButton Editar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JPanel GRAFICOS;
    private javax.swing.JPanel Graficos_Panel;
    private javax.swing.JLabel Grafics;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Pelicula;
    private javax.swing.JLabel Prod;
    private javax.swing.JButton Productos;
    private javax.swing.JButton Reservas;
    private javax.swing.JButton Up_categoria;
    private javax.swing.JButton Up_horario;
    private javax.swing.JButton Update_productos;
    private javax.swing.JButton Usuario;
    private javax.swing.JButton Usuarios;
    private javax.swing.JLabel bdatos;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel mundi;
    private javax.swing.JLabel num_user;
    private javax.swing.JPanel pelicula;
    private javax.swing.JPanel productos;
    private javax.swing.JPanel reservas;
    private javax.swing.JTable tb_categoria;
    private javax.swing.JTable tb_horario;
    private javax.swing.JTable tb_productos;
    private javax.swing.JTable tb_reservas;
    private javax.swing.JLabel tot_horario;
    private javax.swing.JLabel tot_peli;
    private javax.swing.JPanel user;
    private javax.swing.JTable user_table;
    private javax.swing.JLabel usuarios;
    private javax.swing.JPanel view_user;
    // End of variables declaration//GEN-END:variables

    private void updateGraficosPanel(ChartPanel chartPanel) {
        Graficos_Panel.removeAll(); // Limpiar el panel
        Graficos_Panel.setLayout(new BorderLayout()); // Configurar diseño
        Graficos_Panel.add(chartPanel, BorderLayout.CENTER); // Agregar el gráfico
        Graficos_Panel.revalidate(); // Actualizar componentes
        Graficos_Panel.repaint(); // Redibujar el panel
    }

    /*private boolean eliminarCategoriaPorId(int id) {
        //String sqlHorarios = "DELETE FROM horarios WHERE id = ?";
        String sqlPeliculas = "DELETE FROM peliculas WHERE id = ?";
        try (Connection con = (Connection) db.getConnection()) {
            con.setAutoCommit(false); // Iniciar transacción
            try ( PreparedStatement pstPeliculas = (PreparedStatement) con.prepareStatement(sqlPeliculas)) {

                // Eliminar registro en peliculas
                pstPeliculas.setInt(1, id);
                pstPeliculas.executeUpdate();

                con.commit(); // Confirmar transacción
                return true;
            } catch (SQLException e) {
                con.rollback(); // Revertir cambios en caso de error
                JOptionPane.showMessageDialog(null, "Error al eliminar los registros relacionados: " + e.getMessage());
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos: " + e.getMessage());
            return false;
        }
    }
     */
 /*private boolean eliminarHorarioPorId(int id) {
        String sql = "DELETE FROM horarios WHERE id = ?";
        try (Connection con = (Connection) db.getConnection(); PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql)) {

            pst.setInt(1, id); // Asignar el ID al parámetro
            int filasAfectadas = pst.executeUpdate();

            return filasAfectadas > 0; // Retorna true si se eliminó con éxito
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al eliminar el horario: " + e.getMessage());
            return false;
        }
    }*/
}
