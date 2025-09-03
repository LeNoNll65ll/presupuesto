package com.proyectosaf.presupuesto.persistence.repository;

import com.proyectosaf.presupuesto.persistence.entity.AprobacionSolicitudEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AprobacionSolicitudRepository extends JpaRepository<AprobacionSolicitudEntity, Integer> {
}
