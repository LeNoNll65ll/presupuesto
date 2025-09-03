package com.proyectosaf.presupuesto.service.impl;

import com.proyectosaf.presupuesto.persistence.entity.ObjetivoEntity;
import com.proyectosaf.presupuesto.persistence.repository.ObjetivoRepository;
import com.proyectosaf.presupuesto.service.ObjetivoService;
import org.springframework.stereotype.Service;

@Service
public class ObjetivoServiceImpl extends CrudServiceImpl<ObjetivoEntity, Integer> implements ObjetivoService {
    public ObjetivoServiceImpl(ObjetivoRepository repository) {
        super(repository, ObjetivoEntity.class);
    }
}
