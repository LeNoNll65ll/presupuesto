package com.proyectosaf.presupuesto.service.impl;

import com.proyectosaf.presupuesto.persistence.entity.ProgEntity;
import com.proyectosaf.presupuesto.persistence.repository.ProgRepository;
import com.proyectosaf.presupuesto.service.ProgService;
import org.springframework.stereotype.Service;

@Service
public class ProgServiceImpl extends CrudServiceImpl<ProgEntity, Integer> implements ProgService {
    public ProgServiceImpl(ProgRepository repository) {
        super(repository, ProgEntity.class);
    }
}
