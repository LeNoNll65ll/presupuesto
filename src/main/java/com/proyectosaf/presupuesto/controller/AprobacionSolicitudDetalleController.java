package com.proyectosaf.presupuesto.controller;

import com.proyectosaf.presupuesto.persistence.entity.AprobacionSolicitudDetalleEntity;
import com.proyectosaf.presupuesto.service.AprobacionSolicitudDetalleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/aprobacionsolicituddetalles")
public class AprobacionSolicitudDetalleController extends CrudController<AprobacionSolicitudDetalleEntity, Integer> {
    public AprobacionSolicitudDetalleController(AprobacionSolicitudDetalleService service) {
        super(service);
    }
}
