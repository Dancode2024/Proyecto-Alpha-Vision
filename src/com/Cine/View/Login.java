
package com.Cine.View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Panel;
import javax.swing.JFrame;


public class Login extends JFrame {
    public Login(){
        setSize(500,500);
        //setLocation(450,150);
        //setBounds(100,100,500,500);
        setLocationRelativeTo(null);
        setTitle("Login");
        setMinimumSize(new Dimension (500,500));
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void iniciarComponentes(){
        Panel pn = new Panel();
        /*float []vals =  new float [3];
        Color.RGBtoHSB(163,288,215,vals);
        pn.setBackground(Color.getHSBColor(vals[0], vals[1], vals[2]));
        //pn.setBackground(Color.red);*/
        pn.setBackground(Color.black);//Asignar el color
        this.getContentPane().add(pn);//Agregar el Panel
    }
}
