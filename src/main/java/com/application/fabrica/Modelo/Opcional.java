package com.application.fabrica.Modelo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
public class Opcional {

    private int id;
    private long precio;
    private String nombre;

    public Opcional(long precio, String nombre, int id) {
        this.id = id;
        this.precio = precio;
        this.nombre = nombre;
    }


    public int getId(){
        return id;
    }

    public void setId(int idNum){
        this.id = idNum;
    }

    public long getPrecio() {
        return precio;
    }


    public void setPrecio(long num) {
        this.precio = num;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nuevo) {
        this.nombre = nuevo;
    }
}
