package com.proyectosaf.presupuesto.controller;

import com.proyectosaf.presupuesto.persistence.entity.UnidadMilitarEntity;
import com.proyectosaf.presupuesto.service.UnidadMilitarService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/unidadmilitars")
public class UnidadMilitarController extends CrudController<UnidadMilitarEntity, Integer> {
    public UnidadMilitarController(UnidadMilitarService service) {
        super(service);
    }
}
