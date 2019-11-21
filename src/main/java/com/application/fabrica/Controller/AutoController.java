package com.application.fabrica.Controller;

import com.application.fabrica.Modelo.Vehiculo;
import com.application.fabrica.Repositorio.VehiculoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AutoController {

    @Autowired
    private VehiculoRepo vehiculoRepo;
    @GetMapping("/")
    public List<Vehiculo> allVehiculo() {
        return vehiculoRepo.findAll();
    }
}
