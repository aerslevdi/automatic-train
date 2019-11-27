package com.application.fabrica.Modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name="vehiculo")
public abstract class Vehiculo {
    @Id
    @GeneratedValue
    private int id;
    @NotBlank
    @Column(name="modelo")
    private String modelo;
    @NotBlank
    @Column (name="precio_base")
    private long precioBase;
    @NotBlank
    @ElementCollection
    @CollectionTable(name="extra", joinColumns=@JoinColumn(name="extra_id"))
    @Column (name="extras")
    private List<Opcional> extras;





    public List<Opcional> agregarExtras(Opcional opcional){
        if(extras == null ){
            extras = new ArrayList<Opcional>();
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
