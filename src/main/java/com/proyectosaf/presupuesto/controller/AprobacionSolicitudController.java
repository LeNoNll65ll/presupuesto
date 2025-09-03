package com.proyectosaf.presupuesto.controller;

import com.proyectosaf.presupuesto.persistence.entity.AprobacionSolicitudEntity;
import com.proyectosaf.presupuesto.service.AprobacionSolicitudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/aprobacionsolicituds")
public class AprobacionSolicitudController extends CrudController<AprobacionSolicitudEntity, Integer> {
    public AprobacionSolicitudController(AprobacionSolicitudService service) {
        super(service);
    }
}
