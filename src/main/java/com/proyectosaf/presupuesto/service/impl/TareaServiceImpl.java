package com.proyectosaf.presupuesto.service.impl;

import com.proyectosaf.presupuesto.persistence.entity.TareaEntity;
import com.proyectosaf.presupuesto.persistence.repository.TareaRepository;
import com.proyectosaf.presupuesto.service.TareaService;
import org.springframework.stereotype.Service;

@Service
public class TareaServiceImpl extends CrudServiceImpl<TareaEntity, Integer> implements TareaService {
    public TareaServiceImpl(TareaRepository repository) {
        super(repository, TareaEntity.class);
    }
}
