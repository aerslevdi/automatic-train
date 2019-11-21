package com.application.fabrica;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@EnableAutoConfiguration
public class Sedan extends Vehiculo {
    private long precioBase;

    public Sedan(int id, long precio, int puertas, String modelo, List<Opcional> extras) {
        super(id, precio, puertas, modelo, extras);
    }
}
