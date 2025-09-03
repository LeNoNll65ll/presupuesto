package com.proyectosaf.presupuesto.persistence.repository;

import com.proyectosaf.presupuesto.persistence.entity.ProgEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgRepository extends JpaRepository<ProgEntity, Integer> {
}
