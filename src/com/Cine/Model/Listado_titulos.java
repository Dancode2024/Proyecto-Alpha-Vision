
package com.Cine.Model;

import com.Cine.Model.user.Pelicula;
import java.util.ArrayList;

public class Listado_titulos {
    ArrayList<Pelicula> lista;
    
    public Listado_titulos(){
        lista = new ArrayList();
    }
    public void agregarTitulo(Pelicula p){
        lista.add(p);
    }        
}
