package com.proyectosaf.presupuesto.controller;

import com.proyectosaf.presupuesto.service.CrudService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class CrudController<T, ID> {

    private final CrudService<T, ID> service;

    protected CrudController(CrudService<T, ID> service) {
        this.service = service;
    }

    @GetMapping
    public List<T> list() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public T get(@PathVariable ID id) {
        return service.findById(id);
    }

    @PostMapping
    public ResponseEntity<T> create(@RequestBody T entity) {
        T created = service.create(entity);
        return new ResponseEntity<>(created, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public T update(@PathVariable ID id, @RequestBody T entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable ID id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
