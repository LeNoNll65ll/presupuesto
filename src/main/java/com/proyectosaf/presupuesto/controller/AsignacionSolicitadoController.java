package com.proyectosaf.presupuesto.controller;

import com.proyectosaf.presupuesto.persistence.entity.AsignacionSolicitadoEntity;
import com.proyectosaf.presupuesto.service.AsignacionSolicitadoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/asignacionsolicitados")
public class AsignacionSolicitadoController extends CrudController<AsignacionSolicitadoEntity, Integer> {
    public AsignacionSolicitadoController(AsignacionSolicitadoService service) {
        super(service);
    }
}
