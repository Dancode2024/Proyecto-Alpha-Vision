package com.Cine.View.user;

import java.util.Random;
import com.Cine.Model.user.Asiento;
import com.Cine.Model.user.Horario;
import com.Cine.Model.Listado_titulos;
import com.Cine.Model.Listar_Horario;
import com.Cine.Model.user.Listar_asiento;
import com.Cine.Model.user.Pelicula;
import com.Cine.Model.RoundBorder;
import com.Cine.View.Login_us;
import com.Cine.mysql.conexion.Cine_db;
import com.formdev.flatlaf.FlatDarkLaf;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.awt.Image;
import java.sql.ResultSet;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Peliculas extends javax.swing.JFrame {

    Cine_db db;

    public Peliculas() {
        boolean setup = FlatDarkLaf.setup();
        //Conexión a la base de datos
        db = new Cine_db(); // Instancia correctamente
        db.getConnection(); // Llama al método para establecer la conexión
        //Lanzamiento del Login
        initComponents();
        this.setTitle("Peliculas");
        setSize(1200, 1000);
        setLocationRelativeTo(null);
        // Image img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/Cine/View/image/foto.jpg"));
        Image ven = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/Cine/View/image/Venom.jpg"));
        Venom.setIcon(new ImageIcon(ven.getScaledInstance(Venom.getWidth(), Venom.getHeight(), Image.SCALE_SMOOTH)));

        ButtonGroup sala = new ButtonGroup();
        sala.add(sala_1);
        sala.add(sala_2);
        sala.add(sala_3);
        sala.add(sala_4);

        ButtonGroup pagos = new ButtonGroup();
        pagos.add(jc_t);
        pagos.add(jc_e);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        crearMetodo(titulo);//Combo_titulo
        MostrarHorario(horario);
        MostarCategoria(categoria);
        /*JComboBox<String> comboBox = new JComboBox<>();
        comboBox.setBorder(new RoundBorder(25));*/

    }

    @SuppressWarnings("checked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spider = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pelicula = new java.awt.Panel();
        title = new javax.swing.JLabel();
        titulo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        horario = new javax.swing.JComboBox<>();
        categoria = new javax.swing.JComboBox<>();
        Guardar = new javax.swing.JButton();
        peliculas1 = new javax.swing.JLabel();
        peliculas = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        sala_1 = new javax.swing.JRadioButton();
        sala_2 = new javax.swing.JRadioButton();
        sala_3 = new javax.swing.JRadioButton();
        sala_4 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jc_1 = new javax.swing.JCheckBox();
        jc_3 = new javax.swing.JCheckBox();
        jc_2 = new javax.swing.JCheckBox();
        jc_5 = new javax.swing.JCheckBox();
        jc_4 = new javax.swing.JCheckBox();
        jc_6 = new javax.swing.JCheckBox();
        jc_12 = new javax.swing.JCheckBox();
        jc_11 = new javax.swing.JCheckBox();
        jc_10 = new javax.swing.JCheckBox();
        jc_9 = new javax.swing.JCheckBox();
        jc_8 = new javax.swing.JCheckBox();
        jc_7 = new javax.swing.JCheckBox();
        jc_14 = new javax.swing.JCheckBox();
        jc_13 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        jc_t = new javax.swing.JRadioButton();
        jc_e = new javax.swing.JRadioButton();
        title1 = new javax.swing.JLabel();
        monto = new javax.swing.JTextField();
        Calcular = new javax.swing.JButton();
        btn_pelicula = new javax.swing.JButton();
        btn_combo = new javax.swing.JButton();
        btn_nosotros = new javax.swing.JButton();
        btn_inicio = new javax.swing.JButton();
        Venom = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Print = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        spider.setBackground(new java.awt.Color(3, 3, 5));
        spider.setForeground(new java.awt.Color(41, 128, 185));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("----------------------------------------------------------------------------------------------------------------------------------------");

        pelicula.setBackground(new java.awt.Color(52, 63, 84));
        pelicula.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        title.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        title.setForeground(new java.awt.Color(255, 204, 0));
        title.setText("Titulo: ");

        titulo.setBorder(new RoundBorder(10));
        titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("Fecha:");

        horario.setBorder(new RoundBorder(10));

        categoria.setBorder(new RoundBorder(10));
        categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaActionPerformed(evt);
            }
        });

        Guardar.setBackground(new java.awt.Color(191, 6, 3));
        Guardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Guardar.setForeground(new java.awt.Color(255, 255, 255));
        Guardar.setText("Guardar");
        Guardar.setBorder(new RoundBorder(10));
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        peliculas1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        peliculas1.setForeground(new java.awt.Color(255, 255, 255));
        peliculas1.setText("------------------- Metodos de Pago -------------------");

        peliculas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        peliculas.setForeground(new java.awt.Color(255, 255, 255));
        peliculas.setText("------------------- Boleteria -------------------");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 0));
        jLabel7.setText("Categoría:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Asientos:");

        sala_1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sala_1.setForeground(new java.awt.Color(255, 204, 0));
        sala_1.setText("Sala 1");

        sala_2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sala_2.setForeground(new java.awt.Color(255, 204, 0));
        sala_2.setText("Sala 2");
        sala_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sala_2ActionPerformed(evt);
            }
        });

        sala_3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sala_3.setForeground(new java.awt.Color(255, 204, 0));
        sala_3.setText("Sala 3");

        sala_4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sala_4.setForeground(new java.awt.Color(255, 204, 0));
        sala_4.setText("Sala 4");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sala: ");

        jc_1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jc_1.setForeground(new java.awt.Color(255, 204, 0));
        jc_1.setText("1");

        jc_3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jc_3.setForeground(new java.awt.Color(255, 204, 0));
        jc_3.setText("3");

        jc_2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jc_2.setForeground(new java.awt.Color(255, 204, 0));
        jc_2.setText("2");

        jc_5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jc_5.setForeground(new java.awt.Color(255, 204, 0));
        jc_5.setText("5");

        jc_4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jc_4.setForeground(new java.awt.Color(255, 204, 0));
        jc_4.setText("4");

        jc_6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jc_6.setForeground(new java.awt.Color(255, 204, 0));
        jc_6.setText("6");

        jc_12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jc_12.setForeground(new java.awt.Color(255, 204, 0));
        jc_12.setText("12");

        jc_11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jc_11.setForeground(new java.awt.Color(255, 204, 0));
        jc_11.setText("11");

        jc_10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jc_10.setForeground(new java.awt.Color(255, 204, 0));
        jc_10.setText("10");

        jc_9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jc_9.setForeground(new java.awt.Color(255, 204, 0));
        jc_9.setText("9");

        jc_8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jc_8.setForeground(new java.awt.Color(255, 204, 0));
        jc_8.setText("8");

        jc_7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jc_7.setForeground(new java.awt.Color(255, 204, 0));
        jc_7.setText("7");

        jc_14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jc_14.setForeground(new java.awt.Color(255, 204, 0));
        jc_14.setText("14");

        jc_13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jc_13.setForeground(new java.awt.Color(255, 204, 0));
        jc_13.setText("13");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 0));
        jLabel6.setText("Horario:");

        date.setBorder(new RoundBorder(10));

        jc_t.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jc_t.setForeground(new java.awt.Color(255, 204, 0));
        jc_t.setText("Tarjeta");
        jc_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc_tActionPerformed(evt);
            }
        });

        jc_e.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jc_e.setForeground(new java.awt.Color(255, 204, 0));
        jc_e.setText("Efectivo");
        jc_e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc_eActionPerformed(evt);
            }
        });

        title1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        title1.setForeground(new java.awt.Color(255, 204, 0));
        title1.setText("Monto: ");

        monto.setBorder(new RoundBorder(10));
        monto.setEnabled(false);

        Calcular.setBackground(new java.awt.Color(0, 48, 73));
        Calcular.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Calcular.setForeground(new java.awt.Color(255, 255, 255));
        Calcular.setText("Calcular");
        Calcular.setBorder(new RoundBorder(10));
        Calcular.setMaximumSize(new java.awt.Dimension(84, 30));
        Calcular.setMinimumSize(new java.awt.Dimension(84, 30));
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout peliculaLayout = new javax.swing.GroupLayout(pelicula);
        pelicula.setLayout(peliculaLayout);
        peliculaLayout.setHorizontalGroup(
            peliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(peliculaLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(peliculas)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, peliculaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(peliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(peliculaLayout.createSequentialGroup()
                        .addComponent(jc_1)
                        .addGap(18, 18, 18)
                        .addComponent(jc_2))
                    .addGroup(peliculaLayout.createSequentialGroup()
                        .addComponent(jc_8)
                        .addGap(18, 18, 18)
                        .addComponent(jc_9)))
                .addGap(18, 18, 18)
                .addGroup(peliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(peliculaLayout.createSequentialGroup()
                        .addComponent(jc_10)
                        .addGap(12, 12, 12)
                        .addComponent(jc_11)
                        .addGap(12, 12, 12)
                        .addComponent(jc_12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jc_13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jc_14))
                    .addGroup(peliculaLayout.createSequentialGroup()
                        .addComponent(jc_3)
                        .addGap(18, 18, 18)
                        .addComponent(jc_4)
                        .addGap(22, 22, 22)
                        .addComponent(jc_5)
                        .addGap(18, 18, 18)
                        .addComponent(jc_6)
                        .addGap(18, 18, 18)
                        .addComponent(jc_7))
                    .addGroup(peliculaLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)))
                .addGap(135, 135, 135))
            .addGroup(peliculaLayout.createSequentialGroup()
                .addGroup(peliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(peliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(peliculaLayout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addComponent(sala_1)
                            .addGap(46, 46, 46)
                            .addComponent(sala_2))
                        .addGroup(peliculaLayout.createSequentialGroup()
                            .addGap(75, 75, 75)
                            .addGroup(peliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(peliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(peliculaLayout.createSequentialGroup()
                                    .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel6))
                                .addGroup(peliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sala_3)
                                    .addGroup(peliculaLayout.createSequentialGroup()
                                        .addGroup(peliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3))))
                            .addGap(12, 12, 12)
                            .addGroup(peliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(sala_4)
                                .addGroup(peliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(horario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, peliculaLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(peliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(peliculas1)
                                .addGroup(peliculaLayout.createSequentialGroup()
                                    .addGroup(peliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jc_t)
                                        .addComponent(jc_e))
                                    .addGap(55, 55, 55)
                                    .addGroup(peliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(title1)
                                        .addComponent(monto, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(81, 81, 81)
                                    .addComponent(Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        peliculaLayout.setVerticalGroup(
            peliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, peliculaLayout.createSequentialGroup()
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jc_e)
                .addGap(105, 105, 105))
            .addGroup(peliculaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(peliculas)
                .addGap(25, 25, 25)
                .addGroup(peliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(peliculaLayout.createSequentialGroup()
                        .addGroup(peliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(horario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(peliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(title)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(peliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sala_1)
                    .addComponent(sala_2)
                    .addComponent(sala_3)
                    .addComponent(sala_4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(peliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jc_1)
                    .addComponent(jc_3)
                    .addComponent(jc_2)
                    .addComponent(jc_5)
                    .addComponent(jc_4)
                    .addComponent(jc_6)
                    .addComponent(jc_7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(peliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jc_9)
                    .addComponent(jc_8)
                    .addComponent(jc_11)
                    .addComponent(jc_10)
                    .addComponent(jc_14)
                    .addComponent(jc_13)
                    .addComponent(jc_12))
                .addGap(18, 18, 18)
                .addComponent(peliculas1)
                .addGroup(peliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(peliculaLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(peliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jc_t)
                            .addComponent(title1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(peliculaLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        titulo.getAccessibleContext().setAccessibleParent(titulo);

        btn_pelicula.setBackground(new java.awt.Color(3, 3, 5));
        btn_pelicula.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_pelicula.setForeground(new java.awt.Color(153, 255, 255));
        btn_pelicula.setText("Peliculas");
        btn_pelicula.setBorder(null);
        btn_pelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_peliculaActionPerformed(evt);
            }
        });

        btn_combo.setBackground(new java.awt.Color(3, 3, 5));
        btn_combo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_combo.setForeground(new java.awt.Color(255, 255, 255));
        btn_combo.setText("Combos");
        btn_combo.setBorder(null);
        btn_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_comboActionPerformed(evt);
            }
        });

        btn_nosotros.setBackground(new java.awt.Color(3, 3, 5));
        btn_nosotros.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_nosotros.setText("Nosotros");
        btn_nosotros.setBorder(null);
        btn_nosotros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nosotrosActionPerformed(evt);
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

        Venom.setBackground(new java.awt.Color(255, 153, 0));

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CineRise ");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 0));
        jLabel8.setText("Generar Boleto");

        Print.setBackground(new java.awt.Color(36, 36, 35));
        Print.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Print.setForeground(new java.awt.Color(255, 204, 0));
        Print.setText("Imprimir");
        Print.setBorder(new RoundBorder(10)
        );
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout spiderLayout = new javax.swing.GroupLayout(spider);
        spider.setLayout(spiderLayout);
        spiderLayout.setHorizontalGroup(
            spiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(spiderLayout.createSequentialGroup()
                .addGroup(spiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(spiderLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(spiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, spiderLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(507, 507, 507)
                                .addComponent(btn_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_pelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btn_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_nosotros, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, spiderLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(pelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(spiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, spiderLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(105, 105, 105))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, spiderLayout.createSequentialGroup()
                                .addComponent(Print, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, spiderLayout.createSequentialGroup()
                                .addComponent(Venom, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        spiderLayout.setVerticalGroup(
            spiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(spiderLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(spiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(btn_pelicula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_combo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_nosotros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(spiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(spiderLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(spiderLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(Venom, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel8)
                        .addGap(28, 28, 28)
                        .addComponent(Print, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(spider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloActionPerformed

    }//GEN-LAST:event_tituloActionPerformed

    private void btn_peliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_peliculaActionPerformed
        Peliculas peli = new Peliculas();
        peli.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_peliculaActionPerformed

    private void btn_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicioActionPerformed
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

    private void btn_nosotrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nosotrosActionPerformed
        // TODO add your handling code here:
        Nosotros our = new Nosotros();
        our.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_nosotrosActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        // TODO add your handling code here:
        Guardar.setEnabled(false);  // Deshabilita el botón al inicio

        // Obtener el valor calculado y guardado en 'monto'
        String montoText = monto.getText();
        System.out.println("Precio calculado: " + montoText);

        // Verificar si el campo monto tiene un valor válido
        if (montoText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El precio no ha sido calculado.");
            return;
        }

        // Convertir el monto a double
        double precioGuardado;
        try {
            precioGuardado = Double.parseDouble(montoText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error al convertir el precio. Verifica el formato.");
            return;
        }

        // Deshabilitar el botón de impresión
        Print.setEnabled(false);

        // Mostrar mensaje de confirmación
        int confirmacion = JOptionPane.showConfirmDialog(this,
                "¿Estás seguro de que deseas guardar esta reserva?",
                "Confirmación",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (confirmacion != JOptionPane.YES_OPTION) {
            // Si el usuario selecciona "No", se cancela la acción
            return;
        }

        // Verificar que se haya seleccionado un método de pago único
        if (!jc_t.isSelected() && !jc_e.isSelected()) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un método de pago.");
            return;
        }
        if (jc_t.isSelected() && jc_e.isSelected()) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona solo un método de pago.");
            return;
        }

        // Obtener los datos de la interfaz
        String tituloSeleccionado = titulo.getSelectedItem().toString();
        String horarioSeleccionado = horario.getSelectedItem().toString();
        String categoriaSeleccionado = categoria.getSelectedItem().toString();
        boolean tarjeta = jc_t.isSelected();
        boolean efectivo = jc_e.isSelected();
        boolean[] asientosSeleccionados = {
            jc_1.isSelected(), jc_2.isSelected(), jc_3.isSelected(), jc_4.isSelected(),
            jc_5.isSelected(), jc_6.isSelected(), jc_7.isSelected(), jc_8.isSelected(),
            jc_9.isSelected(), jc_10.isSelected(), jc_11.isSelected(), jc_12.isSelected(),
            jc_13.isSelected(), jc_14.isSelected()
        };

        // Obtener la sala seleccionada
        String salaSeleccionada = obtenerSalaSeleccionada();
        if (salaSeleccionada == null) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una sala.");
            return;
        }

        // Obtener y validar la fecha seleccionada
        Date fechaUtil = date.getDate();
        if (fechaUtil == null) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una fecha.");
            return;
        }
        java.sql.Date fechaSql = new java.sql.Date(fechaUtil.getTime());

        // Verificar si los asientos ya están ocupados
        if (isAsientoOcupado(asientosSeleccionados, salaSeleccionada, fechaSql)) {
            JOptionPane.showMessageDialog(this, "Uno o más asientos ya están ocupados en esta sala y fecha.");
            return;
        }

        // Obtener el precio final calculado
        String pago = tarjeta ? "Tarjeta" : "Efectivo";
        double precioFinal = ObtenerPrecio(salaSeleccionada, pago);

        // Depuración para verificar el precio calculado
        System.out.println("Precio final calculado: " + precioFinal);

        // SQL para guardar la reserva
        String sql = "INSERT INTO reservas (titulo, horario, categoria, fecha, pago_tarjeta, pago_efectivo, "
                + "asiento_1, asiento_2, asiento_3, asiento_4, asiento_5, asiento_6, asiento_7, asiento_8, asiento_9, asiento_10, "
                + "asiento_11, asiento_12, asiento_13, asiento_14, sala_1, sala_2, sala_3, sala_4, precio, usuario, usuario_id) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = (Connection) db.getConnection(); PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql)) {
            // Asignación correcta de los parámetros
            pst.setString(1, tituloSeleccionado); // Título
            pst.setString(2, horarioSeleccionado); // Horario
            pst.setString(3, categoriaSeleccionado); // Categoría
            pst.setDate(4, fechaSql); // Fecha
            pst.setBoolean(5, tarjeta); // Pago con tarjeta
            pst.setBoolean(6, efectivo); // Pago en efectivo

            // Asientos seleccionados
            for (int i = 0; i < asientosSeleccionados.length; i++) {
                pst.setBoolean(7 + i, asientosSeleccionados[i]); // Asientos 1 a 14
            }

            // Salas seleccionadas
            pst.setBoolean(21, sala_1.isSelected()); // Sala 1
            pst.setBoolean(22, sala_2.isSelected()); // Sala 2
            pst.setBoolean(23, sala_3.isSelected()); // Sala 3
            pst.setBoolean(24, sala_4.isSelected()); // Sala 4

            // Precio final
            pst.setDouble(25, precioGuardado); // Precio

            // Usuario y usuario_id
            pst.setString(26, Login_us.nombreUsuarioLogeado); // Usuario logueado
            pst.setInt(27, Login_us.idUsuarioLogeado); // ID del usuario logueado

            int resultado = pst.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(this, "Reserva guardada exitosamente.\n"
                        + "Título: " + tituloSeleccionado + "\n"
                        + "Fecha: " + fechaSql + "\n"
                        + "Sala: " + salaSeleccionada + "\n"
                        + "Método de pago: " + pago + "\n"
                        + "Precio final: " + precioGuardado);

                // Habilitar el botón de impresión
                Print.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(this, "Error al guardar la reserva.");
            }

        } catch (SQLException e) {
            // Capturar y mostrar errores de base de datos
            JOptionPane.showMessageDialog(this, "Error al guardar los datos: " + e.getMessage());
        }

    }//GEN-LAST:event_GuardarActionPerformed

    private void categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_categoriaActionPerformed

    private void sala_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sala_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sala_2ActionPerformed

    private void jc_eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc_eActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jc_eActionPerformed

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        // Desactivar el botón "Guardar" inicialmente
        Guardar.setEnabled(false);

        // Capturar la sala seleccionada
        String salaSeleccionada = "";
        if (sala_1.isSelected()) {
            salaSeleccionada = "Sala 1";
        } else if (sala_2.isSelected()) {
            salaSeleccionada = "Sala 2";
        } else if (sala_3.isSelected()) {
            salaSeleccionada = "Sala 3";
        } else if (sala_4.isSelected()) {
            salaSeleccionada = "Sala 4";
        }

        // Capturar el método de pago
        String metodoPago = "";
        if (jc_t.isSelected()) {
            metodoPago = "Tarjeta";
        } else if (jc_e.isSelected()) {
            metodoPago = "Efectivo";
        }

        // Validar que ambos campos estén seleccionados
        if (salaSeleccionada.isEmpty() || metodoPago.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una sala y un método de pago.",
                    "Error de Validación", JOptionPane.WARNING_MESSAGE);
            return; // Salir del método si no se han seleccionado ambos valores
        }

        // Calcular el precio final
        double precioFinal = ObtenerPrecio(salaSeleccionada, metodoPago);

        // Mostrar el precio en el campo de texto (formateado a 2 decimales)
        monto.setText(String.format("%.2f", precioFinal));

        // Habilitar el botón "Guardar" después de calcular
        Guardar.setEnabled(true);
    }//GEN-LAST:event_CalcularActionPerformed

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
        // TODO add your handling code here:
        Print.setEnabled(false);
        GenerarBoleta();
        Index inicio = new Index();
        inicio.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_PrintActionPerformed

    private void jc_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc_tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jc_tActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Print;
    private javax.swing.JLabel Venom;
    private javax.swing.JButton btn_combo;
    private javax.swing.JButton btn_inicio;
    private javax.swing.JButton btn_nosotros;
    private javax.swing.JButton btn_pelicula;
    private javax.swing.JComboBox<String> categoria;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JComboBox<String> horario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JCheckBox jc_1;
    private javax.swing.JCheckBox jc_10;
    private javax.swing.JCheckBox jc_11;
    private javax.swing.JCheckBox jc_12;
    private javax.swing.JCheckBox jc_13;
    private javax.swing.JCheckBox jc_14;
    private javax.swing.JCheckBox jc_2;
    private javax.swing.JCheckBox jc_3;
    private javax.swing.JCheckBox jc_4;
    private javax.swing.JCheckBox jc_5;
    private javax.swing.JCheckBox jc_6;
    private javax.swing.JCheckBox jc_7;
    private javax.swing.JCheckBox jc_8;
    private javax.swing.JCheckBox jc_9;
    private javax.swing.JRadioButton jc_e;
    private javax.swing.JRadioButton jc_t;
    private javax.swing.JTextField monto;
    private java.awt.Panel pelicula;
    private javax.swing.JLabel peliculas;
    private javax.swing.JLabel peliculas1;
    private javax.swing.JRadioButton sala_1;
    private javax.swing.JRadioButton sala_2;
    private javax.swing.JRadioButton sala_3;
    private javax.swing.JRadioButton sala_4;
    private javax.swing.JPanel spider;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JComboBox<String> titulo;
    // End of variables declaration//GEN-END:variables

    private void crearMetodo(JComboBox c) {
        DefaultComboBoxModel combo = new DefaultComboBoxModel();
        c.setModel(combo);
        Listado_titulos lt = new Listado_titulos();
        try {
            Connection conn = (Connection) db.getConnection();
            Statement st = (Statement) conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT titulo FROM peliculas"); //Consulta sql para obtener los titulos
            while (rs.next()) {
                Pelicula peli = new Pelicula();
                peli.setTitulo(rs.getString(1));
                lt.agregarTitulo(peli);
                combo.addElement(peli.getTitulo());
                //JOptionPane.showMessageDialog(null, "Exito: ");
                System.out.println("Conexión exitosa");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar los titulos: " + e);
        }
    }

    private void MostrarHorario(JComboBox h) {
        DefaultComboBoxModel hora = new DefaultComboBoxModel();
        h.setModel(hora);
        Listar_Horario ls = new Listar_Horario();
        //Capturar posibles errores
        try {
            Connection conn = (Connection) db.getConnection();
            Statement st = (Statement) conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT hora FROM horarios");
            while (rs.next()) {
                Horario hor = new Horario();
                hor.setHora(rs.getString(1));
                ls.agregarHorario(hor);
                hora.addElement(hor.getHora());
                System.out.println("Conexión exitosa");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar los titulos: " + e);
        }
    }

    private void MostarCategoria(JComboBox a) {
        DefaultComboBoxModel as = new DefaultComboBoxModel();
        a.setModel(as);
        Listar_asiento ls = new Listar_asiento();

        //Capturar posibles errores
        try {
            Connection conn = (Connection) db.getConnection();
            Statement st = (Statement) conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT genero FROM peliculas");
            while (rs.next()) {
                Asiento asiento = new Asiento();
                asiento.setAsiento(rs.getString(1));
                ls.agregarAsiento(asiento);
                as.addElement(asiento.getAsiento());
                System.out.println("Conexión exitosa");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar los titulos: " + e);
        }
    }

    /*private void GuardarDatos() {
        Print.setEnabled(false);

        // Mostrar mensaje de confirmación
        int confirmacion = JOptionPane.showConfirmDialog(this,
                "¿Estás seguro de que deseas guardar esta reserva?",
                "Confirmación",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (confirmacion != JOptionPane.YES_OPTION) {
            // Si el usuario selecciona "No", se cancela la acción
            return;
        }

        // Verificar que se haya seleccionado un método de pago único
        if (!jc_t.isSelected() && !jc_e.isSelected()) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un método de pago.");
            return;
        }
        if (jc_t.isSelected() && jc_e.isSelected()) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona solo un método de pago.");
            return;
        }

        // Obtener los datos de la interfaz
        String tituloSeleccionado = titulo.getSelectedItem().toString();
        String horarioSeleccionado = horario.getSelectedItem().toString();
        String categoriaSeleccionado = categoria.getSelectedItem().toString();
        boolean tarjeta = jc_t.isSelected();
        boolean efectivo = jc_e.isSelected();
        boolean[] asientosSeleccionados = {
            jc_1.isSelected(), jc_2.isSelected(), jc_3.isSelected(), jc_4.isSelected(),
            jc_5.isSelected(), jc_6.isSelected(), jc_7.isSelected(), jc_8.isSelected(),
            jc_9.isSelected(), jc_10.isSelected(), jc_11.isSelected(), jc_12.isSelected(),
            jc_13.isSelected(), jc_14.isSelected()
        };

        // Obtener la sala seleccionada
        String salaSeleccionada = obtenerSalaSeleccionada();
        if (salaSeleccionada == null) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una sala.");
            return;
        }

        // Obtener y validar la fecha seleccionada
        Date fechaUtil = date.getDate();
        if (fechaUtil == null) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una fecha.");
            return;
        }
        java.sql.Date fechaSql = new java.sql.Date(fechaUtil.getTime());

        // Verificar si los asientos ya están ocupados
        if (isAsientoOcupado(asientosSeleccionados, salaSeleccionada, fechaSql)) {
            JOptionPane.showMessageDialog(this, "Uno o más asientos ya están ocupados en esta sala y fecha.");
            return;
        }

        // Obtener el precio final calculado
        String pago = tarjeta ? "Tarjeta" : "Efectivo";
        double precioFinal = ObtenerPrecio(salaSeleccionada, pago);

        String sql = "INSERT INTO reservas (titulo, horario, categoria, fecha, pago_tarjeta, pago_efectivo, "
                + "asiento_1, asiento_2, asiento_3, asiento_4, asiento_5, asiento_6, asiento_7, asiento_8, asiento_9, asiento_10, "
                + "asiento_11, asiento_12, asiento_13, asiento_14, sala_1, sala_2, sala_3, sala_4, precio, usuario, usuario_id) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = (Connection) db.getConnection(); PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql)) {
            // Asignación correcta de los parámetros
            pst.setString(1, tituloSeleccionado); // Título
            pst.setString(2, horarioSeleccionado); // Horario
            pst.setString(3, categoriaSeleccionado); // Categoría
            pst.setDate(4, fechaSql); // Fecha
            pst.setBoolean(5, tarjeta); // Pago con tarjeta
            pst.setBoolean(6, efectivo); // Pago en efectivo

            // Asientos seleccionados
            for (int i = 0; i < asientosSeleccionados.length; i++) {
                pst.setBoolean(7 + i, asientosSeleccionados[i]); // Asientos 1 a 14
            }

            // Salas seleccionadas
            pst.setBoolean(21, sala_1.isSelected()); // Sala 1
            pst.setBoolean(22, sala_2.isSelected()); // Sala 2
            pst.setBoolean(23, sala_3.isSelected()); // Sala 3
            pst.setBoolean(24, sala_4.isSelected()); // Sala 4

            // Precio final
            //pst.setDouble(25, precioFinal); // Precio
            // Usuario y usuario_id
            pst.setString(26, Login_us.nombreUsuarioLogeado); // Usuario logueado
            pst.setInt(27, Login_us.idUsuarioLogeado); // ID del usuario logueado

            int resultado = pst.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(this, "Reserva guardada exitosamente.\n"
                        + "Título: " + tituloSeleccionado + "\n"
                        + "Fecha: " + fechaSql + "\n"
                        + "Sala: " + salaSeleccionada + "\n"
                        + "Método de pago: " + pago + "\n"
                        + "Precio final: " + precioFinal);

                Print.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(this, "Error al guardar la reserva.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar los datos: " + e.getMessage());
        }
    }*/

    private boolean isAsientoOcupado(boolean[] asientosSeleccionados, String salaSeleccionada, java.sql.Date fechaSql) {
        // Consulta que verifica si el asiento está ocupado
        String sql = "SELECT COUNT(*) FROM reservas WHERE fecha = ? "
                + "AND (sala_1 = ? OR sala_2 = ? OR sala_3 = ? OR sala_4 = ?) "
                + "AND ("
                + "asiento_1 = ? OR asiento_2 = ? OR asiento_3 = ? OR asiento_4 = ? "
                + "OR asiento_5 = ? OR asiento_6 = ? OR asiento_7 = ? OR asiento_8 = ? "
                + "OR asiento_9 = ? OR asiento_10 = ? OR asiento_11 = ? OR asiento_12 = ? "
                + "OR asiento_13 = ? OR asiento_14 = ?"
                + ")";

        try (Connection conn = (Connection) db.getConnection(); PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql)) {
            pst.setDate(1, fechaSql);

            // Para cada sala, asignamos un valor
            pst.setString(2, salaSeleccionada.equals("sala_1") ? "sala_1" : null);
            pst.setString(3, salaSeleccionada.equals("sala_2") ? "sala_2" : null);
            pst.setString(4, salaSeleccionada.equals("sala_3") ? "sala_3" : null);
            pst.setString(5, salaSeleccionada.equals("sala_4") ? "sala_4" : null);

            // Para cada asiento, asignamos un valor (1 si está seleccionado, 0 si no está seleccionado)
            for (int i = 0; i < 14; i++) {
                pst.setInt(6 + i, asientosSeleccionados[i] ? 1 : 0);
            }

            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next() && rs.getInt(1) > 0) {
                    return true; // Al menos un asiento está ocupado
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de excepciones
        }
        return false; // Ningún asiento está ocupado
    }

// Función para obtener la sala seleccionada
    private String obtenerSalaSeleccionada() {
        if (sala_1.isSelected()) {
            return "Sala_1";
        } else if (sala_2.isSelected()) {
            return "Sala_2";
        } else if (sala_3.isSelected()) {
            return "Sala_3";
        } else if (sala_4.isSelected()) {
            return "Sala_4";
        }
        return null; // Si no se ha seleccionado ninguna sala
    }

    private int contarAsientos() {
    int cantidad = 0;
    // Suponiendo que jc_1, jc_2, ..., jc_14 son los JCheckBox de los asientos
    if (jc_1.isSelected()) cantidad++;
    if (jc_2.isSelected()) cantidad++;
    if (jc_3.isSelected()) cantidad++;
    if (jc_4.isSelected()) cantidad++;
    if (jc_5.isSelected()) cantidad++;
    if (jc_6.isSelected()) cantidad++;
    if (jc_7.isSelected()) cantidad++;
    if (jc_8.isSelected()) cantidad++;
    if (jc_9.isSelected()) cantidad++;
    if (jc_10.isSelected()) cantidad++;
    if (jc_11.isSelected()) cantidad++;
    if (jc_12.isSelected()) cantidad++;
    if (jc_13.isSelected()) cantidad++;
    if (jc_14.isSelected()) cantidad++;
    return cantidad;
}


    private double ObtenerPrecio(String sala, String pago) {
        // Asignar el precio base según la sala seleccionada
        double precioBase = 0.0;

        // Modificado para que cada sala tenga un precio diferente (si es necesario)
        switch (sala.trim()) {  // Usamos trim para evitar espacios adicionales
            case "Sala 1":
                precioBase = 20.0;
                break;
            case "Sala 2":
                precioBase = 25.0;  // Puedes cambiar estos valores según tus necesidades
                break;
            case "Sala 3":
                precioBase = 30.0;
                break;
            case "Sala 4":
                precioBase = 35.0;
                break;
            default:
                precioBase = 0.0;  // Si no se seleccionó ninguna sala
                break;
        }

        // Si el pago es con tarjeta, agregar un 5% adicional
        if ("Tarjeta".equals(pago)) {
            precioBase += precioBase * 0.05;  // 5% adicional por tarjeta
        }

        // Contar los asientos seleccionados
        int cantidadAsientos = contarAsientos();

        // Si no se seleccionaron asientos, mostrar un mensaje y retornar 0
        if (cantidadAsientos == 0) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona al menos un asiento.");
            return 0.0;
        }

        // Aumentar el precio según la cantidad de asientos seleccionados
        double precioFinal = precioBase * cantidadAsientos;

        // Depuración
        System.out.println("Precio base: " + precioBase);
        System.out.println("Cantidad de asientos: " + cantidadAsientos);
        System.out.println("Precio final calculado: " + precioFinal);

        return precioFinal;
    }

    private void GenerarBoleta() {
        // Validar campos esenciales
        if (titulo.getSelectedItem() == null || horario.getSelectedItem() == null || categoria.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Por favor, asegúrate de seleccionar un título, horario y categoría.");
            return;
        }
        if (date.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Por favor, selecciona una fecha.");
            return;
        }
        if (!jc_t.isSelected() && !jc_e.isSelected()) {
            JOptionPane.showMessageDialog(null, "Por favor, selecciona un método de pago.");
            return;
        }

        // Obtener datos esenciales
        String tituloSeleccionado = titulo.getSelectedItem().toString();
        String horarioSeleccionado = horario.getSelectedItem().toString();
        String categoriaSeleccionado = categoria.getSelectedItem().toString();
        Date fechaUtil = date.getDate();
        java.sql.Date fechaSql = new java.sql.Date(fechaUtil.getTime());

        String salaSeleccionada = "";
        if (sala_1.isSelected()) {
            salaSeleccionada = "Sala 1";
        } else if (sala_2.isSelected()) {
            salaSeleccionada = "Sala 2";
        } else if (sala_3.isSelected()) {
            salaSeleccionada = "Sala 3";
        } else if (sala_4.isSelected()) {
            salaSeleccionada = "Sala 4";
        }

        if (salaSeleccionada.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, selecciona una sala.");
            return;
        }

        boolean tarjeta = jc_t.isSelected();
        String pago = tarjeta ? "Tarjeta" : "Efectivo";
        double precioFinal = ObtenerPrecio(salaSeleccionada, pago);

        String nombreUsuario = Login_us.nombreUsuarioLogeado;
        String codigoBoleta = generarCodigoBoleta();

        // Crear el contenido de la boleta
        StringBuilder boletaContent = new StringBuilder();
        boletaContent.append("Boleta de Reserva de CineRise\n\n")
                .append("Título: ").append(tituloSeleccionado).append("\n")
                .append("Horario: ").append(horarioSeleccionado).append("\n")
                .append("Categoría: ").append(categoriaSeleccionado).append("\n")
                .append("Fecha: ").append(fechaSql.toString()).append("\n")
                .append("Sala: ").append(salaSeleccionada).append("\n")
                .append("Método de Pago: ").append(pago).append("\n")
                .append("Precio Final: ").append(precioFinal).append("\n")
                .append("Usuario: ").append(nombreUsuario).append("\n")
                .append("Código de Boleta: ").append(codigoBoleta).append("\n\n")
                .append("Asientos Seleccionados: \n");

        for (int i = 1; i <= 14; i++) {
            try {
                JCheckBox asiento = (JCheckBox) getClass().getDeclaredField("jc_" + i).get(this);
                if (asiento.isSelected()) {
                    boletaContent.append("Asiento ").append(i).append("\n");
                }
            } catch (NoSuchFieldException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        // Guardar el archivo
        try {
            // Directorio donde se guardarán las boletas
            String directoryPath = "Reservas/";
            File directory = new File(directoryPath);
            if (!directory.exists()) {
                directory.mkdir();
            }

            String fileName = directoryPath + "Boleta_Reserva_" + codigoBoleta + ".txt";
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            bufferedWriter.write(boletaContent.toString());
            bufferedWriter.close();

            JOptionPane.showMessageDialog(null, "Boleta generada con éxito! El archivo se guardó como:\n" + fileName);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al generar la boleta: " + e.getMessage());
        }
    }

// Función para generar un código único de 8 caracteres
    private String generarCodigoBoleta() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder codigo = new StringBuilder(8);

        for (int i = 0; i < 8; i++) {
            int indice = random.nextInt(caracteres.length());
            codigo.append(caracteres.charAt(indice));
        }

        return codigo.toString();
    }

}
