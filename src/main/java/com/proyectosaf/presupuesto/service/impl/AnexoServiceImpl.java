package com.proyectosaf.presupuesto.service.impl;

import com.proyectosaf.presupuesto.persistence.entity.AnexoEntity;
import com.proyectosaf.presupuesto.persistence.repository.AnexoRepository;
import com.proyectosaf.presupuesto.service.AnexoService;
import org.springframework.stereotype.Service;

@Service
public class AnexoServiceImpl extends CrudServiceImpl<AnexoEntity, Integer> implements AnexoService {
    public AnexoServiceImpl(AnexoRepository repository) {
        super(repository, AnexoEntity.class);
    }
}
