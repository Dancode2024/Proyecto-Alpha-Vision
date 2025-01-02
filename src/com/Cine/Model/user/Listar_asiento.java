/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Cine.Model.user;

import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class Listar_asiento {
    ArrayList<Asiento>lista;
    
    public Listar_asiento(){
        lista=new ArrayList();
    }
    
    public void agregarAsiento(Asiento a){
        lista.add(a);
    }
    
}
