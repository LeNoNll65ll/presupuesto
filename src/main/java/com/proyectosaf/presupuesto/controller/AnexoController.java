package com.proyectosaf.presupuesto.controller;

import com.proyectosaf.presupuesto.persistence.entity.AnexoEntity;
import com.proyectosaf.presupuesto.service.AnexoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/anexos")
public class AnexoController extends CrudController<AnexoEntity, Integer> {
    public AnexoController(AnexoService service) {
        super(service);
    }
}
