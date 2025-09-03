package com.proyectosaf.presupuesto.service.impl;

import com.proyectosaf.presupuesto.persistence.entity.ProyectoEntity;
import com.proyectosaf.presupuesto.persistence.repository.ProyectoRepository;
import com.proyectosaf.presupuesto.service.ProyectoService;
import org.springframework.stereotype.Service;

@Service
public class ProyectoServiceImpl extends CrudServiceImpl<ProyectoEntity, Integer> implements ProyectoService {
    public ProyectoServiceImpl(ProyectoRepository repository) {
        super(repository, ProyectoEntity.class);
    }
}
