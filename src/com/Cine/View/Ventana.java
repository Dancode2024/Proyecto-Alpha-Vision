package com.Cine.View;

import com.Cine.View.Login_us;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;

public class Ventana {
    public static void main(String[] args) {
        FlatDarkLaf.setup();
        Login_us login = new Login_us();
        login.setVisible(true);
        
    }
}
