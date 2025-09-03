package com.saf.presupuesto.domain.repository;

import com.saf.presupuesto.domain.model.MovimientoPresupuestario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimientoPresupuestarioRepository extends JpaRepository<MovimientoPresupuestario, Long> {
}
