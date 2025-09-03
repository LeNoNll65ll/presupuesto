package com.proyectosaf.presupuesto.controller;

import com.proyectosaf.presupuesto.persistence.entity.ProyectoEntity;
import com.proyectosaf.presupuesto.service.ProyectoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/proyectos")
public class ProyectoController extends CrudController<ProyectoEntity, Integer> {
    public ProyectoController(ProyectoService service) {
        super(service);
    }
}
