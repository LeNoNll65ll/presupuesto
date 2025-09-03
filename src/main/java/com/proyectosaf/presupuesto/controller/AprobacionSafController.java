package com.proyectosaf.presupuesto.controller;

import com.proyectosaf.presupuesto.persistence.entity.AprobacionSafEntity;
import com.proyectosaf.presupuesto.service.AprobacionSafService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/aprobacionsafs")
public class AprobacionSafController extends CrudController<AprobacionSafEntity, Integer> {
    public AprobacionSafController(AprobacionSafService service) {
        super(service);
    }
}
