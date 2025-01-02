
package com.Cine.Model.user;

public class Horario {
     private int id;
    private String hora;

    public Horario() {
    }

    public Horario(int id, String hora) {
        this.id = id;
        this.hora = hora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
}
