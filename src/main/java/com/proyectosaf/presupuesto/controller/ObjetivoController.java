package com.proyectosaf.presupuesto.controller;

import com.proyectosaf.presupuesto.persistence.entity.ObjetivoEntity;
import com.proyectosaf.presupuesto.service.ObjetivoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/objetivos")
public class ObjetivoController extends CrudController<ObjetivoEntity, Integer> {
    public ObjetivoController(ObjetivoService service) {
        super(service);
    }
}
