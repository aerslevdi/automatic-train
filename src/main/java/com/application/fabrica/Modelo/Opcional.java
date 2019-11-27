package com.application.fabrica.Modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name="extras")
public class Opcional {

    @Id
    @GeneratedValue
    private int id;
    @NotBlank
    @Column(name="precio")
    private long precio;
    @NotBlank
    @Column(name="nombre")
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
