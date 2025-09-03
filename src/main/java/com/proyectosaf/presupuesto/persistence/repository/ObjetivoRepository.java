package com.proyectosaf.presupuesto.persistence.repository;

import com.proyectosaf.presupuesto.persistence.entity.ObjetivoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjetivoRepository extends JpaRepository<ObjetivoEntity, Integer> {
}
