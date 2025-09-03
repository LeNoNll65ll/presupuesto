package com.proyectosaf.presupuesto.controller;

import com.proyectosaf.presupuesto.persistence.entity.TareaEntity;
import com.proyectosaf.presupuesto.service.TareaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tareas")
public class TareaController extends CrudController<TareaEntity, Integer> {
    public TareaController(TareaService service) {
        super(service);
    }
}
