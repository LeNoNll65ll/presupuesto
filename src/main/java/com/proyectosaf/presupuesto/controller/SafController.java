package com.proyectosaf.presupuesto.controller;

import com.proyectosaf.presupuesto.persistence.entity.SafEntity;
import com.proyectosaf.presupuesto.service.SafService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/safs")
public class SafController extends CrudController<SafEntity, Integer> {
    public SafController(SafService service) {
        super(service);
    }
}
