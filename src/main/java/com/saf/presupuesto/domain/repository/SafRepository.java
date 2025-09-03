package com.saf.presupuesto.domain.repository;

import com.saf.presupuesto.domain.model.Saf;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SafRepository extends JpaRepository<Saf, Long> {
}
