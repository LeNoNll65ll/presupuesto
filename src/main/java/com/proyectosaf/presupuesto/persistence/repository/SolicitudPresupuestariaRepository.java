package com.proyectosaf.presupuesto.persistence.repository;

import com.proyectosaf.presupuesto.persistence.entity.SolicitudPresupuestariaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitudPresupuestariaRepository extends JpaRepository<SolicitudPresupuestariaEntity, Integer> {
}
