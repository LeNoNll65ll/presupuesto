package com.proyectosaf.presupuesto.service.impl;

import com.proyectosaf.presupuesto.persistence.entity.UnidadMilitarEntity;
import com.proyectosaf.presupuesto.persistence.repository.UnidadMilitarRepository;
import com.proyectosaf.presupuesto.service.UnidadMilitarService;
import org.springframework.stereotype.Service;

@Service
public class UnidadMilitarServiceImpl extends CrudServiceImpl<UnidadMilitarEntity, Integer> implements UnidadMilitarService {
    public UnidadMilitarServiceImpl(UnidadMilitarRepository repository) {
        super(repository, UnidadMilitarEntity.class);
    }
}
