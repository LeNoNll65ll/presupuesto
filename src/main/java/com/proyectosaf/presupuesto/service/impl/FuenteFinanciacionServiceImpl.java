package com.proyectosaf.presupuesto.service.impl;

import com.proyectosaf.presupuesto.persistence.entity.FuenteFinanciacionEntity;
import com.proyectosaf.presupuesto.persistence.repository.FuenteFinanciacionRepository;
import com.proyectosaf.presupuesto.service.FuenteFinanciacionService;
import org.springframework.stereotype.Service;

@Service
public class FuenteFinanciacionServiceImpl extends CrudServiceImpl<FuenteFinanciacionEntity, Integer> implements FuenteFinanciacionService {
    public FuenteFinanciacionServiceImpl(FuenteFinanciacionRepository repository) {
        super(repository, FuenteFinanciacionEntity.class);
    }
}
