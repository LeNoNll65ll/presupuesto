package com.proyectosaf.presupuesto.controller;

import com.proyectosaf.presupuesto.persistence.entity.ProgEntity;
import com.proyectosaf.presupuesto.service.ProgService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/progs")
public class ProgController extends CrudController<ProgEntity, Integer> {
    public ProgController(ProgService service) {
        super(service);
    }
}
