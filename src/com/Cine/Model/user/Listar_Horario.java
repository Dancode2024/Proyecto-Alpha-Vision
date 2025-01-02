
package com.Cine.Model;

import com.Cine.Model.user.Horario;
import java.util.ArrayList;

public class Listar_Horario {
   ArrayList<Horario>lista;
   

    public Listar_Horario() {
        lista = new ArrayList();
    }

    public void agregarHorario(Horario h){
        lista.add(h);
    }
    
    
}
