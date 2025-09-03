package com.proyectosaf.presupuesto.service;

import com.proyectosaf.presupuesto.persistence.entity.SafEntity;

import java.util.List;

public interface SafService {
    List<SafEntity> findAll();
    SafEntity findById(Integer id);
    SafEntity create(SafEntity saf);
    SafEntity update(Integer id, SafEntity saf);
    void delete(Integer id);
}
