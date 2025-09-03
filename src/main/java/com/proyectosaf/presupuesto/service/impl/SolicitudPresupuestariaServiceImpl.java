package com.proyectosaf.presupuesto.service.impl;

import com.proyectosaf.presupuesto.persistence.entity.SolicitudPresupuestariaEntity;
import com.proyectosaf.presupuesto.persistence.repository.SolicitudPresupuestariaRepository;
import com.proyectosaf.presupuesto.service.SolicitudPresupuestariaService;
import org.springframework.stereotype.Service;

@Service
public class SolicitudPresupuestariaServiceImpl extends CrudServiceImpl<SolicitudPresupuestariaEntity, Integer> implements SolicitudPresupuestariaService {
    public SolicitudPresupuestariaServiceImpl(SolicitudPresupuestariaRepository repository) {
        super(repository, SolicitudPresupuestariaEntity.class);
    }
}
