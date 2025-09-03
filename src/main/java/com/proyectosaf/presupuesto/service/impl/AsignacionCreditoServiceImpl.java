package com.proyectosaf.presupuesto.service.impl;

import com.proyectosaf.presupuesto.persistence.entity.AsignacionCreditoEntity;
import com.proyectosaf.presupuesto.persistence.repository.AsignacionCreditoRepository;
import com.proyectosaf.presupuesto.service.AsignacionCreditoService;
import org.springframework.stereotype.Service;

@Service
public class AsignacionCreditoServiceImpl extends CrudServiceImpl<AsignacionCreditoEntity, Integer> implements AsignacionCreditoService {
    public AsignacionCreditoServiceImpl(AsignacionCreditoRepository repository) {
        super(repository, AsignacionCreditoEntity.class);
    }
}
