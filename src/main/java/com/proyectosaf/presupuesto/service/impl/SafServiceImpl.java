package com.proyectosaf.presupuesto.service.impl;

import com.proyectosaf.presupuesto.persistence.entity.SafEntity;
import com.proyectosaf.presupuesto.persistence.repository.SafRepository;
import com.proyectosaf.presupuesto.service.SafService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SafServiceImpl implements SafService {

    private final SafRepository repository;

    @Override
    public List<SafEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public SafEntity findById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Saf not found"));
    }

    @Override
    public SafEntity create(SafEntity saf) {
        saf.setId(null);
        return repository.save(saf);
    }

    @Override
    public SafEntity update(Integer id, SafEntity saf) {
        SafEntity existing = findById(id);
        existing.setNombre(saf.getNombre());
        existing.setActivo(saf.getActivo());
        return repository.save(existing);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
