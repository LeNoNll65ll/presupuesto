package com.proyectosaf.presupuesto.service.impl;

import com.proyectosaf.presupuesto.persistence.entity.ActividadEntity;
import com.proyectosaf.presupuesto.persistence.repository.ActividadRepository;
import com.proyectosaf.presupuesto.service.ActividadService;
import org.springframework.stereotype.Service;

@Service
public class ActividadServiceImpl extends CrudServiceImpl<ActividadEntity, Integer> implements ActividadService {
    public ActividadServiceImpl(ActividadRepository repository) {
        super(repository, ActividadEntity.class);
    }
}
