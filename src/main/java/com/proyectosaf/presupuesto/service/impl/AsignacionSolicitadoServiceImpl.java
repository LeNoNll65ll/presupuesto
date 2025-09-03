package com.proyectosaf.presupuesto.service.impl;

import com.proyectosaf.presupuesto.persistence.entity.AsignacionSolicitadoEntity;
import com.proyectosaf.presupuesto.persistence.repository.AsignacionSolicitadoRepository;
import com.proyectosaf.presupuesto.service.AsignacionSolicitadoService;
import org.springframework.stereotype.Service;

@Service
public class AsignacionSolicitadoServiceImpl extends CrudServiceImpl<AsignacionSolicitadoEntity, Integer> implements AsignacionSolicitadoService {
    public AsignacionSolicitadoServiceImpl(AsignacionSolicitadoRepository repository) {
        super(repository, AsignacionSolicitadoEntity.class);
    }
}
