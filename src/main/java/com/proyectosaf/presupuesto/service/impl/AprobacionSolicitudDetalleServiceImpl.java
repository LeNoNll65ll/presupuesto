package com.proyectosaf.presupuesto.service.impl;

import com.proyectosaf.presupuesto.persistence.entity.AprobacionSolicitudDetalleEntity;
import com.proyectosaf.presupuesto.persistence.repository.AprobacionSolicitudDetalleRepository;
import com.proyectosaf.presupuesto.service.AprobacionSolicitudDetalleService;
import org.springframework.stereotype.Service;

@Service
public class AprobacionSolicitudDetalleServiceImpl extends CrudServiceImpl<AprobacionSolicitudDetalleEntity, Integer> implements AprobacionSolicitudDetalleService {
    public AprobacionSolicitudDetalleServiceImpl(AprobacionSolicitudDetalleRepository repository) {
        super(repository, AprobacionSolicitudDetalleEntity.class);
    }
}
