package com.Cine.View.user;

import com.Cine.Model.RoundBorder;
import com.Cine.View.Login_us;
import com.Cine.mysql.conexion.Cine_db;
import com.formdev.flatlaf.FlatDarkLaf;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.awt.Dimension;
import java.awt.Image;
import java.sql.ResultSet;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Combos extends javax.swing.JFrame {

    Cine_db db;

    public Combos() {
        boolean setup = FlatDarkLaf.setup();
        //Conexión a la base de datos
        db = new Cine_db(); // Instancia correctamente
        db.getConnection(); // Llama al método para establecer la conexión
        //Lanzamiento del Login
        // mostar.setEnabled(true);
        // mostar.setVisible(true);

        initComponents();
        this.setTitle("Combos");
        setSize(995, 565);
        setLocationRelativeTo(null);
        Image combo = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/Cine/View/image/bebida.png"));
        combo1.setIcon(new ImageIcon(combo.getScaledInstance(combo1.getWidth(), combo1.getHeight(), Image.SCALE_SMOOTH)));
        Image cancha = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/Cine/View/image/pop.png"));
        corn.setIcon(new ImageIcon(cancha.getScaledInstance(corn.getWidth(), corn.getHeight(), Image.SCALE_SMOOTH)));
        Image burguer = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/Cine/View/image/burger.png"));
        Burger.setIcon(new ImageIcon(burguer.getScaledInstance(Burger.getWidth(), Burger.getHeight(), Image.SCALE_SMOOTH)));

        ButtonGroup bebidas = new ButtonGroup();
        bebidas.add(rb_1);
        bebidas.add(rb_2);
        bebidas.add(rb_3);

        ButtonGroup canchita = new ButtonGroup();
        canchita.add(rc_1);
        canchita.add(rc_2);
        canchita.add(rc_3);

        ButtonGroup burger = new ButtonGroup();
        burger.add(rh_1);
        burger.add(rh_2);
        burger.add(rh_3);
        burger.add(rh_4);
        burger.add(rh_5);
        burger.add(rh_6);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @SuppressWarnings("checked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btn_pelicula = new javax.swing.JButton();
        btn_combo = new javax.swing.JButton();
        btn_inicio = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        combo1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        rb_1 = new javax.swing.JRadioButton();
        rb_2 = new javax.swing.JRadioButton();
        rb_3 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        btn_bebida = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        corn = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rc_1 = new javax.swing.JRadioButton();
        rc_2 = new javax.swing.JRadioButton();
        rc_3 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        btn_cancha = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Burger = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rh_1 = new javax.swing.JRadioButton();
        rh_2 = new javax.swing.JRadioButton();
        rh_3 = new javax.swing.JRadioButton();
        rh_4 = new javax.swing.JRadioButton();
        rh_5 = new javax.swing.JRadioButton();
        rh_6 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        Calcular = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btn_burger = new javax.swing.JButton();
        mostrar = new javax.swing.JTextField();
        btn_orden = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(3, 3, 5));
        jPanel1.setForeground(new java.awt.Color(41, 128, 185));

        btn_pelicula.setBackground(new java.awt.Color(3, 3, 5));
        btn_pelicula.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_pelicula.setForeground(new java.awt.Color(255, 255, 255));
        btn_pelicula.setText("Peliculas");
        btn_pelicula.setBorder(null);
        btn_pelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_peliculaActionPerformed(evt);
            }
        });

        btn_combo.setBackground(new java.awt.Color(3, 3, 5));
        btn_combo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_combo.setForeground(new java.awt.Color(153, 255, 255));
        btn_combo.setText("Combos");
        btn_combo.setBorder(null);
        btn_combo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_comboActionPerformed(evt);
            }
        });

        btn_inicio.setBackground(new java.awt.Color(3, 3, 5));
        btn_inicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_inicio.setForeground(new java.awt.Color(255, 255, 255));
        btn_inicio.setText("Inicio");
        btn_inicio.setBorder(null);
        btn_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inicioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CineRise ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("----------------------------------------------------------------------------------------------------------------------------------------");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BEBIDAS");

        rb_1.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        rb_1.setForeground(new java.awt.Color(0, 204, 204));
        rb_1.setText("1 Gaseosa - $ 5.00");

        rb_2.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        rb_2.setForeground(new java.awt.Color(0, 204, 204));
        rb_2.setText(" 2 Gaseosas - $10.00");

        rb_3.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        rb_3.setForeground(new java.awt.Color(0, 204, 204));
        rb_3.setText(" 3 x 2 Promoción - $ 13.50");

        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("----------------------------------------");

        btn_bebida.setBackground(new java.awt.Color(0, 204, 204));
        btn_bebida.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_bebida.setForeground(new java.awt.Color(255, 255, 255));
        btn_bebida.setText("Guardar");
        btn_bebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bebidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rb_2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb_1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb_3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_bebida))
                .addGap(55, 55, 55))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb_1)
                .addGap(18, 18, 18)
                .addComponent(rb_2)
                .addGap(18, 18, 18)
                .addComponent(rb_3)
                .addGap(18, 18, 18)
                .addComponent(btn_bebida, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new RoundBorder(10));
        jPanel3.setPreferredSize(new java.awt.Dimension(288, 380));

        jLabel5.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("CANCHITA");

        rc_1.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        rc_1.setForeground(new java.awt.Color(255, 204, 0));
        rc_1.setText(" 1 Canchita - $. 6.50");
        rc_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rc_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc_1ActionPerformed(evt);
            }
        });

        rc_2.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        rc_2.setForeground(new java.awt.Color(255, 204, 0));
        rc_2.setText(" 2 Canchita - $. 12.50");

        rc_3.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        rc_3.setForeground(new java.awt.Color(255, 204, 0));
        rc_3.setText(" 3 x 2 Canchita - $. 15.00");

        jLabel7.setForeground(new java.awt.Color(255, 204, 0));
        jLabel7.setText("----------------------------------------");

        btn_cancha.setBackground(new java.awt.Color(255, 204, 0));
        btn_cancha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cancha.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancha.setText("Guardar");
        btn_cancha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_canchaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(corn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel7))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_cancha)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rc_2)
                                .addComponent(rc_1)
                                .addComponent(rc_3)))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(corn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rc_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rc_2)
                .addGap(18, 18, 18)
                .addComponent(rc_3)
                .addGap(18, 18, 18)
                .addComponent(btn_cancha, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new RoundBorder(10));
        jPanel4.setPreferredSize(new java.awt.Dimension(288, 380));

        jLabel6.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("HAMBURGUESA");

        jLabel8.setForeground(new java.awt.Color(255, 102, 0));
        jLabel8.setText("----------------------------------------");

        rh_1.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        rh_1.setForeground(new java.awt.Color(255, 102, 0));
        rh_1.setText("Royal - $10.00");

        rh_2.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        rh_2.setForeground(new java.awt.Color(255, 102, 0));
        rh_2.setText("Clásica - $8.00");
        rh_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rh_2ActionPerformed(evt);
            }
        });

        rh_3.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        rh_3.setForeground(new java.awt.Color(255, 102, 0));
        rh_3.setText("Pavo - $10.00");

        rh_4.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        rh_4.setForeground(new java.awt.Color(255, 102, 0));
        rh_4.setText("Vegana - $9.00");
        rh_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rh_4ActionPerformed(evt);
            }
        });

        rh_5.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        rh_5.setForeground(new java.awt.Color(255, 102, 0));
        rh_5.setText("BBQ  - $10.00");

        rh_6.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        rh_6.setForeground(new java.awt.Color(255, 102, 0));
        rh_6.setText("Pescado - $9.00");
        rh_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rh_6ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 204, 0));
        jLabel9.setText("Unidad: ");

        Calcular.setBackground(new java.awt.Color(0, 204, 102));
        Calcular.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Calcular.setForeground(new java.awt.Color(255, 255, 255));
        Calcular.setText("Calcular");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(0, 102, 204));
        jLabel10.setText("---------------------------");

        cantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantidad.setToolTipText("[1 - 2]");
        cantidad.setBorder(new RoundBorder(5));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 204, 0));
        jLabel11.setText("S/.");

        btn_burger.setBackground(new java.awt.Color(255, 102, 0));
        btn_burger.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_burger.setForeground(new java.awt.Color(255, 255, 255));
        btn_burger.setText("Guardar");
        btn_burger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_burgerActionPerformed(evt);
            }
        });

        mostrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mostrar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mostrar.setBorder(new RoundBorder(6));
        mostrar.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(53, 53, 53))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(Burger, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(83, 83, 83))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(rh_5)
                                .addGap(18, 18, 18)
                                .addComponent(rh_6))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel8))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(rh_1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rh_2))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(rh_3)
                                        .addGap(18, 18, 18)
                                        .addComponent(rh_4)))))
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(btn_burger, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Burger, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rh_1)
                    .addComponent(rh_2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rh_3)
                    .addComponent(rh_4))
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rh_5)
                    .addComponent(rh_6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_burger, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
        );

        btn_orden.setBackground(new java.awt.Color(255, 0, 0));
        btn_orden.setFont(new java.awt.Font("Rockwell Condensed", 1, 16)); // NOI18N
        btn_orden.setForeground(new java.awt.Color(255, 204, 0));
        btn_orden.setText("Generar Orden - Ticket");
        btn_orden.setBorder(new RoundBorder(10));
        btn_orden.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_orden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ordenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_pelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_orden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_combo)
                    .addComponent(btn_pelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_orden, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btn_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicioActionPerformed
        // TODO add your handling code here:
        Index inicio = new Index();
        inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_inicioActionPerformed
    private void btn_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_comboActionPerformed
        // TODO add your handling code here:
        Combos combo = new Combos();
        combo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_comboActionPerformed
    private void btn_peliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_peliculaActionPerformed
        Peliculas peli = new Peliculas();
        peli.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_peliculaActionPerformed
    private void rc_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rc_1ActionPerformed
    private void rh_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rh_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rh_2ActionPerformed
    private void rh_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rh_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rh_4ActionPerformed
    private void rh_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rh_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rh_6ActionPerformed

    private void btn_ordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ordenActionPerformed
        // Mostrar mensaje de confirmación
        int respuesta = JOptionPane.showConfirmDialog(
                this,
                "¿Estás seguro de que deseas generar la boleta?",
                "Confirmación",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        // Si el usuario selecciona "Sí", generar la boleta
        if (respuesta == JOptionPane.YES_OPTION) {
            btn_orden.setEnabled(false); // Desactivar el botón de orden mientras se genera la boleta
            GenerarOrden(); // Llamar al método para generar la boleta
        }
    }//GEN-LAST:event_btn_ordenActionPerformed

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        // Verificar que se haya ingresado una cantidad válida
        String num = cantidad.getText().trim(); // Eliminar espacios innecesarios

        // Validar que la cantidad no esté vacía y sea un número válido
        if (num.isEmpty() || !num.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Por favor, ingresa una cantidad válida.");
            return;
        }
        int n = Integer.parseInt(num);

        // Determinar qué tipo de hamburguesa fue seleccionada
        String burger = ""; // Tipo de hamburguesa
        if (rh_1.isSelected()) {
            burger = "Hamburguesa Royal";
        } else if (rh_2.isSelected()) {
            burger = "Hamburguesa Clásica";
        } else if (rh_3.isSelected()) {
            burger = "Hamburguesa Pavo";
        } else if (rh_4.isSelected()) {
            burger = "Hamburguesa Vegana";
        } else if (rh_5.isSelected()) {
            burger = "Hamburguesa BBQ";
        } else if (rh_6.isSelected()) {
            burger = "Hamburguesa Pescado";
        }

        // Validar si se seleccionó una hamburguesa
        if (burger.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un tipo de Hamburguesa.");
            return;
        }

        // Preguntar al usuario si está seguro de calcular el precio
        int confirmacion = JOptionPane.showConfirmDialog(
                this,
                "¿Estás seguro de que deseas calcular el precio?\n"
                + "Hamburguesa: " + burger + "\nCantidad: " + n,
                "Confirmación",
                JOptionPane.YES_NO_OPTION
        );

        // Si el usuario selecciona "Sí", proceder con el cálculo
        if (confirmacion == JOptionPane.YES_OPTION) {
            // Calcular precio total
            double precio = PrecioBurger(burger, n);

            // Mostrar el precio calculado
            mostrar.setText(String.format("%.2f", precio));
            JOptionPane.showMessageDialog(this, "Precio calculado: S/ " + precio);

            // Habilitar el botón Guardar si todo está correcto
            btn_burger.setEnabled(true);
        } else {
            // Si el usuario selecciona "No", cancelar la acción
            JOptionPane.showMessageDialog(this, "Acción cancelada.");
        }
        btn_burger.setEnabled(true);
    }//GEN-LAST:event_CalcularActionPerformed

    private void btn_burgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_burgerActionPerformed
        // Desactivar el botón de orden inicialmente
        btn_burger.setEnabled(false);
        btn_orden.setEnabled(false);

        // Validar que se haya seleccionado al menos una hamburguesa y que la cantidad no esté vacía
        if (!rh_1.isSelected() && !rh_2.isSelected() && !rh_3.isSelected()
                && !rh_4.isSelected() && !rh_5.isSelected() && !rh_6.isSelected()
                || cantidad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una hamburguesa y la cantidad.");
            return;
        }

        // Obtener el nombre de la hamburguesa seleccionada
        String burger = obtenerBurger("");
        if (burger == null) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una presentación !!.");
            return;
        }

        // Convertir la cantidad a entero
        int cantidadSeleccionada;
        try {
            cantidadSeleccionada = Integer.parseInt(cantidad.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "La cantidad debe ser un número válido.");
            return;
        }

        // Obtener el precio de la hamburguesa seleccionada
        double precioBurger = PrecioBurger(burger, cantidadSeleccionada);

        // Asegurarnos de que el precio no sea 0 (es decir, que se haya seleccionado una hamburguesa válida)
        if (precioBurger == 0.0) {
            JOptionPane.showMessageDialog(this, "Error: Hamburguesa seleccionada no válida.");
            return;
        }

        // El precio total (en este caso, es el precio calculado de la hamburguesa por la cantidad)
        double precioFinal = precioBurger;

        // Preguntar al usuario si está seguro de guardar los datos
        int confirmacion = JOptionPane.showConfirmDialog(
                this,
                "¿Estás seguro de que deseas guardar la hamburguesa?\n"
                + "Hamburguesa: " + burger + "\nCantidad: " + cantidadSeleccionada + "\nPrecio Total: S/ " + precioFinal,
                "Confirmación",
                JOptionPane.YES_NO_OPTION
        );

        // Si el usuario selecciona "Sí", proceder con la inserción
        if (confirmacion == JOptionPane.YES_OPTION) {
            // SQL para insertar los datos en la base de datos
            String sql = "INSERT INTO productos (usuario, nombre, categoria, precio, cantidad, stock, id_usuario) VALUES (?, ?, ?, ?, ?, ?, ?)";

            try (Connection conn = (Connection) db.getConnection(); PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql)) {

                // Establecer los valores a insertar en la base de datos
                pst.setString(1, Login_us.nombreUsuarioLogeado); // Usuario logueado
                pst.setString(2, burger); // Nombre de la hamburguesa
                pst.setString(3, "Hamburguesa"); // Categoría
                pst.setDouble(4, precioFinal); // Precio de la hamburguesa
                pst.setInt(5, cantidadSeleccionada); // Cantidad de hamburguesas seleccionadas
                pst.setInt(6, 0); // Establecemos el stock en 0 como valor predeterminado
                pst.setInt(7, Login_us.idUsuarioLogeado); // ID del usuario logueado

                // Ejecutar la consulta
                int resultado = pst.executeUpdate();

                if (resultado > 0) {
                    JOptionPane.showMessageDialog(this, "Hamburguesa guardada exitosamente.\n"
                            + "Hamburguesa: " + burger + "\n"
                            + "Cantidad: " + cantidadSeleccionada + "\n"
                            + "Precio Total: S/ " + precioFinal);

                    // Desactivar botones "Guardar" y "Calcular"
                    btn_burger.setEnabled(false);
                    Calcular.setEnabled(false);

                    // Activar el botón "Orden"
                    btn_orden.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(this, "Error al guardar la hamburguesa.");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error al guardar los datos: " + e.getMessage());
            }
        } else {
            // Si el usuario selecciona "No", cancelar la acción
            JOptionPane.showMessageDialog(this, "Acción cancelada.");
        }
    }//GEN-LAST:event_btn_burgerActionPerformed

    private void btn_bebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bebidaActionPerformed
        // Verificar que al menos una bebida esté seleccionada
        if (!rb_1.isSelected() && !rb_2.isSelected() && !rb_3.isSelected()) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una opción.");
            return;
        }

        // Obtener el nombre de la bebida seleccionada
        String bebida = obtenerBebida();
        if (bebida == null) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una bebida.");
            return;
        }

        int drink = Bebida();
        if (drink == 0) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una bebida.");
            return;
        }

        // Obtener el precio de la bebida seleccionada
        double precioBebida = PrecioBebida(bebida);

        // Asegurarnos de que el precio no sea 0 (es decir, que se haya seleccionado una bebida válida)
        if (precioBebida == 0.0) {
            JOptionPane.showMessageDialog(this, "Error: Bebida seleccionada no válida.");
            return;
        }

        // El precio total (en este caso, es solo el precio de la bebida)
        double precioFinal = precioBebida;

        // Preguntar al usuario si está seguro de realizar la acción
        int confirmacion = JOptionPane.showConfirmDialog(
                this,
                "¿Estás seguro de que deseas guardar esta bebida?\n"
                + "Bebida: " + bebida + "\nPrecio: S/ " + precioFinal,
                "Confirmación",
                JOptionPane.YES_NO_OPTION
        );

        // Si el usuario selecciona "Sí", procedemos con la inserción
        if (confirmacion == JOptionPane.YES_OPTION) {
            // SQL para insertar los datos en la base de datos
            String sql = "INSERT INTO productos (usuario, nombre, categoria, precio, cantidad, stock, id_usuario) VALUES (?, ?, ?, ?, ?, ?, ?)";

            try (Connection conn = (Connection) db.getConnection(); PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql)) {

                // Establecer los valores a insertar en la base de datos
                pst.setString(1, Login_us.nombreUsuarioLogeado); // Usuario logueado
                pst.setString(2, bebida); // Nombre de la bebida
                pst.setString(3, "Bebida"); // Categoría
                pst.setDouble(4, precioFinal); // Precio de la bebida
                pst.setInt(5, drink); // Cantidad seleccionada
                pst.setInt(6, 0); // Establecemos el stock en 0 como valor predeterminado
                pst.setInt(7, Login_us.idUsuarioLogeado); // ID del usuario logueado

                // Ejecutar la consulta
                int resultado = pst.executeUpdate();

                if (resultado > 0) {
                    JOptionPane.showMessageDialog(this, "Bebida guardada exitosamente.\n"
                            + "Bebida: " + bebida + "\n"
                            + "Precio: S/ " + precioFinal);

                    // Desactivar el botón de bebida
                    btn_bebida.setEnabled(false);

                    // Activar el botón que generará la orden
                    btn_orden.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(this, "Error al guardar la bebida.");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error al guardar los datos: " + e.getMessage());
            }
        } else {
            // Si el usuario selecciona "No", mostramos un mensaje o hacemos alguna otra acción
            JOptionPane.showMessageDialog(this, "Acción cancelada.");
        }
    }//GEN-LAST:event_btn_bebidaActionPerformed

    private void btn_canchaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_canchaActionPerformed
        // Verificar que al menos una canchita esté seleccionada
        if (!rc_1.isSelected() && !rc_2.isSelected() && !rc_3.isSelected()) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una opción.");
            return;
        }

        // Obtener el nombre de la Canchita seleccionada
        String cancha = obtenerCanchita();
        if (cancha == null) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una presentación de la canchita.");
            return;
        }

        // Obtener la cantidad seleccionada
        int corn = Canchita();
        if (corn == 0) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una cantidad válida.");
            return;
        }

        // Obtener el precio de la Canchita seleccionada
        double pcancha = PrecioCancha(cancha);

        // Asegurarnos de que el precio no sea 0 (es decir, que se haya seleccionado una Canchita válida)
        if (pcancha == 0.0) {
            JOptionPane.showMessageDialog(this, "Error: Presentación seleccionada no válida.");
            return;
        }

        // El precio total (en este caso, es solo el precio de la Canchita)
        double precioFinal = pcancha;

        // Preguntar al usuario si está seguro de realizar la acción
        int confirmacion = JOptionPane.showConfirmDialog(
                this,
                "¿Estás seguro de que deseas guardar esta canchita?\n"
                + "Canchita: " + cancha + "\nPrecio: S/ " + precioFinal,
                "Confirmación",
                JOptionPane.YES_NO_OPTION
        );

        // Si el usuario selecciona "Sí", procedemos con la inserción
        if (confirmacion == JOptionPane.YES_OPTION) {
            // SQL para insertar los datos en la base de datos
            String sql = "INSERT INTO productos (usuario, nombre, categoria, precio, cantidad, stock, id_usuario) VALUES (?, ?, ?, ?, ?, ?, ?)";

            try (Connection conn = (Connection) db.getConnection(); PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql)) {

                // Establecer los valores a insertar en la base de datos
                pst.setString(1, Login_us.nombreUsuarioLogeado); // Usuario logueado
                pst.setString(2, cancha); // Nombre de la canchita
                pst.setString(3, "Canchita"); // Categoría
                pst.setDouble(4, precioFinal); // Precio de la canchita
                pst.setInt(5, corn); // Cantidad de la canchita
                pst.setInt(6, 0); // Establecemos el stock en 0 como valor predeterminado
                pst.setInt(7, Login_us.idUsuarioLogeado); // ID del usuario logueado

                // Ejecutar la consulta
                int resultado = pst.executeUpdate();

                if (resultado > 0) {
                    JOptionPane.showMessageDialog(this, "Canchita guardada exitosamente.\n"
                            + "Canchita: " + cancha + "\n"
                            + "Precio: S/ " + precioFinal);

                    // Desactivar el botón de la canchita
                    btn_cancha.setEnabled(false);

                    // Activar el botón de la orden
                    btn_orden.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(this, "Error al guardar la canchita.");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error al guardar los datos: " + e.getMessage());
            }
        } else {
            // Si el usuario selecciona "No", mostramos un mensaje o hacemos alguna otra acción
            JOptionPane.showMessageDialog(this, "Acción cancelada.");
        }
    }//GEN-LAST:event_btn_canchaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Burger;
    private javax.swing.JButton Calcular;
    private javax.swing.JButton btn_bebida;
    private javax.swing.JButton btn_burger;
    private javax.swing.JButton btn_cancha;
    private javax.swing.JButton btn_combo;
    private javax.swing.JButton btn_inicio;
    private javax.swing.JButton btn_orden;
    private javax.swing.JButton btn_pelicula;
    private javax.swing.JTextField cantidad;
    private javax.swing.JLabel combo1;
    private javax.swing.JLabel corn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField mostrar;
    private javax.swing.JRadioButton rb_1;
    private javax.swing.JRadioButton rb_2;
    private javax.swing.JRadioButton rb_3;
    private javax.swing.JRadioButton rc_1;
    private javax.swing.JRadioButton rc_2;
    private javax.swing.JRadioButton rc_3;
    private javax.swing.JRadioButton rh_1;
    private javax.swing.JRadioButton rh_2;
    private javax.swing.JRadioButton rh_3;
    private javax.swing.JRadioButton rh_4;
    private javax.swing.JRadioButton rh_5;
    private javax.swing.JRadioButton rh_6;
    // End of variables declaration//GEN-END:variables

// Función para obtener la Bebida seleccionada
    private String obtenerBebida() {
        if (rb_1.isSelected()) {
            return "1 Gaseosa 650 ml";
        }
        if (rb_2.isSelected()) {
            return "2 Gaseosas 650 ml";
        }
        if (rb_3.isSelected()) {
            return "3 Gaseosas 650 ml";
        }
        return null; // Ninguna bebida seleccionada
    }

    // Función para obtener la Bebida seleccionada
    private int Bebida() {
        if (rb_1.isSelected()) {
            return 1;
        }
        if (rb_2.isSelected()) {
            return 2;
        }
        if (rb_3.isSelected()) {
            return 3;
        }
        return 0;

    }

    // Función para obtener la Canchita seleccionada
    private String obtenerCanchita() {
        if (rc_1.isSelected()) {
            return "1 Cajita de Canchita";
        }
        if (rc_2.isSelected()) {
            return "2 Cajita de Canchita";
        }
        if (rc_3.isSelected()) {
            return "3 Cajita de Canchita";
        }
        return null; // Ninguna canchita seleccionada
    }

    // Función para obtener la Canchita seleccionada
    private int Canchita() {
        if (rc_1.isSelected()) {
            return 1;
        }
        if (rc_2.isSelected()) {
            return 2;
        }
        if (rc_3.isSelected()) {
            return 3;
        }
        return 0; // Ninguna canchita seleccionada
    }

    // Función para obtener la Bebida seleccionada
    private String obtenerBurger(String burger) {

        if (rh_1.isSelected()) {
            return "Hamburguesa Royal";
        }
        if (rh_2.isSelected()) {
            return "Hamburguesa Clásica";
        }
        if (rh_3.isSelected()) {
            return "Hamburguesa Pavo";
        }
        if (rh_4.isSelected()) {
            return "Hamburguesa Vegana";
        }
        if (rh_5.isSelected()) {
            return "Hamburguesa BBQ";
        }
        if (rh_6.isSelected()) {
            return "Hamburguesa Pescado";
        }
        return null; // Ninguna sala seleccionada
    }

    // Función para obtener el precio de la bebida seleccionada
    private double PrecioBebida(String bebida) {
        double precioBase = 0.0;
        switch (bebida) {
            case "1 Gaseosa 650 ml":
                precioBase = 5.00;
                break;
            case "2 Gaseosas 650 ml":
                precioBase = 10.00;
                break;
            case "3 Gaseosas 650 ml":
                precioBase = 13.50;
                break;
            default:
                precioBase = 0.0;  // Si no se seleccionó ninguna bebida válida
                break;
        }
        return precioBase;
    }

    // Método para obtener el precio de la canchita
    private double PrecioCancha(String cancha) {
        double precioc = 0.0;
        switch (cancha) {
            case "1 Cajita de Canchita":
                precioc = 6.50;
                break;
            case "2 Cajita de Canchita":
                precioc = 12.50;
                break;
            case "3 Cajita de Canchita":
                precioc = 15.00;
                break;
            default:
                precioc = 0.0;  // Si no se seleccionó ninguna opción
                break;
        }
        return precioc;
    }

    private double PrecioBurger(String burger, int cantidad) {
        double precioUnitario;

        // Determinar el precio según el tipo de hamburguesa
        precioUnitario = switch (burger) {
            case "Hamburguesa Royal" ->
                10.00;
            case "Hamburguesa Clásica" ->
                8.00;
            case "Hamburguesa Pavo" ->
                10.00;
            case "Hamburguesa Vegana" ->
                9.00;
            case "Hamburguesa BBQ" ->
                10.00;
            case "Hamburguesa Pescado" ->
                9.00;
            default ->
                0.0;
        }; // Si no coincide con ninguna hamburguesa

        // Calcular y devolver el precio total
        return precioUnitario * cantidad;
    }

    private void GenerarOrden() {
        // Verificar selección de productos
        String bebida = "";
        double precioBebida = 0.0;
        if (rb_1.isSelected()) {
            bebida = "1 Gaseosa - $ 5.00";
            precioBebida = 5.00;
        } else if (rb_2.isSelected()) {
            bebida = "2 Gaseosas - $10.00";
            precioBebida = 10.00;
        } else if (rb_3.isSelected()) {
            bebida = "3 x 2 Promoción - $ 13.50";
            precioBebida = 13.50;
        }

        String cancha = "";
        double precioCancha = 0.0;
        if (rc_1.isSelected()) {
            cancha = "1 Canchita - $ 6.50";
            precioCancha = 6.50;
        } else if (rc_2.isSelected()) {
            cancha = "2 Canchita - $ 12.50";
            precioCancha = 12.50;
        } else if (rc_3.isSelected()) {
            cancha = "3 x 2 Canchita - $ 15.00";
            precioCancha = 15.00;
        }

        String burger = "";
        double precioBurger = 0.0;
        if (rh_1.isSelected()) {
            burger = "Hamburguesa Royal";
            precioBurger = 10.00;
        } else if (rh_2.isSelected()) {
            burger = "Hamburguesa Clásica";
            precioBurger = 8.00;
        } else if (rh_3.isSelected()) {
            burger = "Hamburguesa Pavo";
            precioBurger = 12.00;
        } else if (rh_4.isSelected()) {
            burger = "Hamburguesa Vegana";
            precioBurger = 9.50;
        } else if (rh_5.isSelected()) {
            burger = "Hamburguesa BBQ";
            precioBurger = 11.00;
        } else if (rh_6.isSelected()) {
            burger = "Hamburguesa Pescado";
            precioBurger = 12.50;
        }

        // Verificar que la cantidad de hamburguesas sea válida
        String num = cantidad.getText().trim();
        int cantidadBurger = 0;
        if (!num.isEmpty() && num.matches("\\d+")) {
            cantidadBurger = Integer.parseInt(num);
        }

        if (cantidadBurger <= 0) {
            JOptionPane.showMessageDialog(this, "Por favor, ingresa una cantidad válida!!.");
            return;
        }

        // Calcular precio total
        precioBurger *= cantidadBurger;
        double precioTotal = precioBebida + precioCancha + precioBurger;

        // Obtener información del usuario
        String nombreUsuario = Login_us.nombreUsuarioLogeado;
        String codigoBoleta = "BOLETA_" + System.currentTimeMillis() + "_" + Login_us.idUsuarioLogeado;

        // Crear contenido de la boleta
        String boletaContent = "Orden de Reserva de CineRise\n\n"
                + "##################################" + "\n"
                + "Usuario: " + nombreUsuario + "\n"
                + "Bebida: " + bebida + "\n"
                + "Cancha: " + cancha + "\n"
                + "Hamburguesa: " + burger + "\n"
                + "Cantidad:  " + cantidadBurger +"\n"
                + "Precio:  S/." + precioBurger + "\n"
                + "##################################" + "\n"
                + "Precio Total: $ " + String.format("%.2f", precioTotal) + "\n";

        // Guardar en un archivo
        try {
            String directory = "Ordenes/";
            File folder = new File(directory);
            if (!folder.exists()) {
                folder.mkdirs();
            }

            String fileName = directory + "Boleta_Orden_" + codigoBoleta + ".txt";
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(boletaContent);
            bufferedWriter.close();

            JOptionPane.showMessageDialog(null, "Boleta generada con éxito! El archivo se guardó como: " + fileName);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al generar la boleta: " + e.getMessage());
        }

        // Desactivar el botón de orden
        btn_orden.setEnabled(false);
    }

    // Función para generar un código único de 8 caracteres
    private String generarCodigoBoleta() {
        String caracteres = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        StringBuilder codigo = new StringBuilder(8);

        for (int i = 0; i < 8; i++) {
            int indice = random.nextInt(caracteres.length());
            codigo.append(caracteres.charAt(indice));
        }

        return codigo.toString();
    }
}
