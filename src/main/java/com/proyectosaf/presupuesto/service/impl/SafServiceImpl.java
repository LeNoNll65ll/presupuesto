package com.proyectosaf.presupuesto.service.impl;

import com.proyectosaf.presupuesto.persistence.entity.SafEntity;
import com.proyectosaf.presupuesto.persistence.repository.SafRepository;
import com.proyectosaf.presupuesto.service.SafService;
import org.springframework.stereotype.Service;

@Service
public class SafServiceImpl extends CrudServiceImpl<SafEntity, Integer> implements SafService {
    public SafServiceImpl(SafRepository repository) {
        super(repository, SafEntity.class);
    }
}
