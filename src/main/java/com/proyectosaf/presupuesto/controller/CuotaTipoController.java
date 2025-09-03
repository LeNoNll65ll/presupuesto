package com.proyectosaf.presupuesto.controller;

import com.proyectosaf.presupuesto.persistence.entity.CuotaTipoEntity;
import com.proyectosaf.presupuesto.service.CuotaTipoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cuotatipos")
public class CuotaTipoController extends CrudController<CuotaTipoEntity, Integer> {
    public CuotaTipoController(CuotaTipoService service) {
        super(service);
    }
}
