package com.proyectosaf.presupuesto.service.impl;

import com.proyectosaf.presupuesto.persistence.entity.AprobacionSolicitudEntity;
import com.proyectosaf.presupuesto.persistence.repository.AprobacionSolicitudRepository;
import com.proyectosaf.presupuesto.service.AprobacionSolicitudService;
import org.springframework.stereotype.Service;

@Service
public class AprobacionSolicitudServiceImpl extends CrudServiceImpl<AprobacionSolicitudEntity, Integer> implements AprobacionSolicitudService {
    public AprobacionSolicitudServiceImpl(AprobacionSolicitudRepository repository) {
        super(repository, AprobacionSolicitudEntity.class);
    }
}
