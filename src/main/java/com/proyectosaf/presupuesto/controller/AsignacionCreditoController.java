package com.proyectosaf.presupuesto.controller;

import com.proyectosaf.presupuesto.persistence.entity.AsignacionCreditoEntity;
import com.proyectosaf.presupuesto.service.AsignacionCreditoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/asignacioncreditos")
public class AsignacionCreditoController extends CrudController<AsignacionCreditoEntity, Integer> {
    public AsignacionCreditoController(AsignacionCreditoService service) {
        super(service);
    }
}
