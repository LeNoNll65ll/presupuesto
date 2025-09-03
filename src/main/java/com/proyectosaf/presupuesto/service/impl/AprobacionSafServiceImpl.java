package com.proyectosaf.presupuesto.service.impl;

import com.proyectosaf.presupuesto.persistence.entity.AprobacionSafEntity;
import com.proyectosaf.presupuesto.persistence.repository.AprobacionSafRepository;
import com.proyectosaf.presupuesto.service.AprobacionSafService;
import org.springframework.stereotype.Service;

@Service
public class AprobacionSafServiceImpl extends CrudServiceImpl<AprobacionSafEntity, Integer> implements AprobacionSafService {
    public AprobacionSafServiceImpl(AprobacionSafRepository repository) {
        super(repository, AprobacionSafEntity.class);
    }
}
