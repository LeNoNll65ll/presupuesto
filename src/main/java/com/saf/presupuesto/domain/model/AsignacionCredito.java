package com.saf.presupuesto.domain.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class AsignacionCredito extends Audit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Saf saf;

    @ManyToOne(fetch = FetchType.LAZY)
    private UnidadMilitar unidad;

    @ManyToOne(fetch = FetchType.LAZY)
    private Anexo anexo;

    @ManyToOne(fetch = FetchType.LAZY)
    private FuenteFinanciacion fuenteFinanciacion;

    @ManyToOne(fetch = FetchType.LAZY)
    private Inciso inciso;

    private BigDecimal montoTotal;
    private LocalDate fecha;
    private String observaciones;
}
