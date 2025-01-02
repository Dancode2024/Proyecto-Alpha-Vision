package com.Cine.View.user;

import com.Cine.View.user.Peliculas;
import com.Cine.Model.user.Horario;
import com.Cine.Model.Listado_titulos;
import com.Cine.Model.Listar_Horario;
import com.Cine.Model.user.Pelicula;
import com.Cine.mysql.conexion.Cine_db;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.awt.Dimension;
import java.awt.Image;
import java.sql.ResultSet;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Nosotros extends javax.swing.JFrame {

    Cine_db db;

    public Nosotros() {
        //Conexión a la base de datos
        db = new Cine_db(); // Instancia correctamente
        db.getConnection(); // Llama al método para establecer la conexión
        //Lanzamiento del Login
        initComponents();
        this.setTitle("Nosotros");
        setSize(550, 500);
        setLocationRelativeTo(null);
        Image pag = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/Cine/View/image/404.jpg"));
        
        page.setIcon(new ImageIcon(pag.getScaledInstance(page.getWidth(), page.getHeight(), Image.SCALE_SMOOTH)));
        
        Image img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/Cine/View/image/logo.jpg"));

      
     /*  fot.setIcon(new ImageIcon(img.getScaledInstance(fot.getWidth(), fot.getHeight(), Image.SCALE_SMOOTH)));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        crearMetodo(titulo);//Combo_titulo
        CrearSala(Sala);
        MostrarHorario(horario);*/
    }

    @SuppressWarnings("checked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn_pelicula = new javax.swing.JButton();
        btn_combo = new javax.swing.JButton();
        btn_nosotros = new javax.swing.JButton();
        btn_inicio = new javax.swing.JButton();
        page = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(3, 3, 5));
        jPanel1.setForeground(new java.awt.Color(41, 128, 185));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("---------------------------------------------------------------------------------");

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
        btn_nosotros.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_nosotros.setForeground(new java.awt.Color(153, 255, 255));
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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CineRise");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btn_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_pelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_nosotros, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(256, 256, 256))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(page, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_nosotros, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_combo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_pelicula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(page, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_peliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_peliculaActionPerformed
        Peliculas peli = new Peliculas();
        peli.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_peliculaActionPerformed

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

    private void btn_nosotrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nosotrosActionPerformed
        // TODO add your handling code here:
         Nosotros our = new Nosotros();
        our.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_nosotrosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_combo;
    private javax.swing.JButton btn_inicio;
    private javax.swing.JButton btn_nosotros;
    private javax.swing.JButton btn_pelicula;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel page;
    // End of variables declaration//GEN-END:variables

    

    
}
