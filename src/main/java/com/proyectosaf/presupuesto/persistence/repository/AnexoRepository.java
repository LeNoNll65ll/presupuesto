package com.proyectosaf.presupuesto.persistence.repository;

import com.proyectosaf.presupuesto.persistence.entity.AnexoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnexoRepository extends JpaRepository<AnexoEntity, Integer> {
}
