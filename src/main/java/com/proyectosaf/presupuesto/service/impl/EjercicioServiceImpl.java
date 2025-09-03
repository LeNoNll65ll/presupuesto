package com.proyectosaf.presupuesto.service.impl;

import com.proyectosaf.presupuesto.persistence.entity.EjercicioEntity;
import com.proyectosaf.presupuesto.persistence.repository.EjercicioRepository;
import com.proyectosaf.presupuesto.service.EjercicioService;
import org.springframework.stereotype.Service;

@Service
public class EjercicioServiceImpl extends CrudServiceImpl<EjercicioEntity, Integer> implements EjercicioService {
    public EjercicioServiceImpl(EjercicioRepository repository) {
        super(repository, EjercicioEntity.class);
    }
}
