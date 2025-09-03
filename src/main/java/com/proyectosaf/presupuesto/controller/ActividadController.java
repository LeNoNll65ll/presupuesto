package com.proyectosaf.presupuesto.controller;

import com.proyectosaf.presupuesto.persistence.entity.ActividadEntity;
import com.proyectosaf.presupuesto.service.ActividadService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/actividads")
public class ActividadController extends CrudController<ActividadEntity, Integer> {
    public ActividadController(ActividadService service) {
        super(service);
    }
}
