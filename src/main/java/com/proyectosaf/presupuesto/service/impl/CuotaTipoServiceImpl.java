package com.proyectosaf.presupuesto.service.impl;

import com.proyectosaf.presupuesto.persistence.entity.CuotaTipoEntity;
import com.proyectosaf.presupuesto.persistence.repository.CuotaTipoRepository;
import com.proyectosaf.presupuesto.service.CuotaTipoService;
import org.springframework.stereotype.Service;

@Service
public class CuotaTipoServiceImpl extends CrudServiceImpl<CuotaTipoEntity, Integer> implements CuotaTipoService {
    public CuotaTipoServiceImpl(CuotaTipoRepository repository) {
        super(repository, CuotaTipoEntity.class);
    }
}
