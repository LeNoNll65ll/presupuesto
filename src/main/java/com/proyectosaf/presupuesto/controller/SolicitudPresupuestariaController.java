package com.proyectosaf.presupuesto.controller;

import com.proyectosaf.presupuesto.persistence.entity.SolicitudPresupuestariaEntity;
import com.proyectosaf.presupuesto.service.SolicitudPresupuestariaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/solicitudpresupuestarias")
public class SolicitudPresupuestariaController extends CrudController<SolicitudPresupuestariaEntity, Integer> {
    public SolicitudPresupuestariaController(SolicitudPresupuestariaService service) {
        super(service);
    }
}
