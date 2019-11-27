package com.application.fabrica.Repositorio;

import com.application.fabrica.Modelo.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculoRepo extends JpaRepository<Vehiculo, Integer> {

}
