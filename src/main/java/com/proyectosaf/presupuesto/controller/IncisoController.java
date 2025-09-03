package com.proyectosaf.presupuesto.controller;

import com.proyectosaf.presupuesto.persistence.entity.IncisoEntity;
import com.proyectosaf.presupuesto.service.IncisoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/incisos")
public class IncisoController extends CrudController<IncisoEntity, Integer> {
    public IncisoController(IncisoService service) {
        super(service);
    }
}
