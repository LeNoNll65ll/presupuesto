package com.proyectosaf.presupuesto.controller;

import com.proyectosaf.presupuesto.persistence.entity.FuenteFinanciacionEntity;
import com.proyectosaf.presupuesto.service.FuenteFinanciacionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/fuentefinanciacions")
public class FuenteFinanciacionController extends CrudController<FuenteFinanciacionEntity, Integer> {
    public FuenteFinanciacionController(FuenteFinanciacionService service) {
        super(service);
    }
}
