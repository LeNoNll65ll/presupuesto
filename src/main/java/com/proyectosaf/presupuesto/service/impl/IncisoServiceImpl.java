package com.proyectosaf.presupuesto.service.impl;

import com.proyectosaf.presupuesto.persistence.entity.IncisoEntity;
import com.proyectosaf.presupuesto.persistence.repository.IncisoRepository;
import com.proyectosaf.presupuesto.service.IncisoService;
import org.springframework.stereotype.Service;

@Service
public class IncisoServiceImpl extends CrudServiceImpl<IncisoEntity, Integer> implements IncisoService {
    public IncisoServiceImpl(IncisoRepository repository) {
        super(repository, IncisoEntity.class);
    }
}
