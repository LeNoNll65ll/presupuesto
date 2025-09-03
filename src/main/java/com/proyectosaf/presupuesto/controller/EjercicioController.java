package com.proyectosaf.presupuesto.controller;

import com.proyectosaf.presupuesto.persistence.entity.EjercicioEntity;
import com.proyectosaf.presupuesto.service.EjercicioService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ejercicios")
public class EjercicioController extends CrudController<EjercicioEntity, Integer> {
    public EjercicioController(EjercicioService service) {
        super(service);
    }
}
