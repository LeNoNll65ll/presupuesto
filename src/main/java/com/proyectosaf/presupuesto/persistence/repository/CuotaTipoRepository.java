package com.proyectosaf.presupuesto.persistence.repository;

import com.proyectosaf.presupuesto.persistence.entity.CuotaTipoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuotaTipoRepository extends JpaRepository<CuotaTipoEntity, Integer> {
}
