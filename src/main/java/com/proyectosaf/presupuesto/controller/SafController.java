package com.proyectosaf.presupuesto.controller;

import com.proyectosaf.presupuesto.persistence.entity.SafEntity;
import com.proyectosaf.presupuesto.service.SafService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/safs")
@RequiredArgsConstructor
public class SafController {

    private final SafService service;

    @GetMapping
    public List<SafEntity> list() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public SafEntity get(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping
    public ResponseEntity<SafEntity> create(@RequestBody SafEntity saf) {
        SafEntity created = service.create(saf);
        return new ResponseEntity<>(created, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public SafEntity update(@PathVariable Integer id, @RequestBody SafEntity saf) {
        return service.update(id, saf);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
