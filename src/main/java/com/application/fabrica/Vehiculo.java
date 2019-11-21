package com.application.fabrica;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
@Configuration
@EnableAutoConfiguration

public abstract class Vehiculo {
    private int id;
    private String modelo;
    private long precioBase;
    private List<Opcional> extras;

    public Vehiculo(int id, long precioBase, int puertas, String modelo, List<Opcional> extras) {
        this.id = id;
        this.precioBase = precioBase;
        this.modelo = modelo;
        this.extras = extras;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(long precio) {
        this.precioBase = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public List<Opcional> getExtras() {
        return extras;
    }

    public void setExtras(List<Opcional> extras) {
        this.extras = extras;
    }

    public List<Opcional> agregarExtras(Opcional opcional){
        if(extras == null ){
            extras = new ArrayList<>();
            extras.add(opcional);
        }else{
            extras.add(opcional);
        }
        return extras;
    }

    public long calcularPrecio(List<Opcional>opcion){
        long total = precioBase;
        for (Opcional extra: opcion) {
            total=+ extra.getPrecio();
        }
        return total;
    }


}
