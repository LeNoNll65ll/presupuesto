package com.saf.presupuesto.domain.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "movimiento_presupuestario")
@Getter
@Setter
public class MovimientoPresupuestario extends Audit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TipoMovimiento tipo;

    @Column(name = "referencia_id")
    private Long referenciaId;

    @Column(name = "referencia_tabla")
    private String referenciaTabla;

    private LocalDate fecha;
    private BigDecimal monto;

    @ManyToOne(fetch = FetchType.LAZY)
    private Saf saf;

    @ManyToOne(fetch = FetchType.LAZY)
    private UnidadMilitar unidad;

    @ManyToOne(fetch = FetchType.LAZY)
    private Anexo anexo;

    @ManyToOne(fetch = FetchType.LAZY)
    private Inciso inciso;

    @Column(name = "saldo_posterior")
    private BigDecimal saldoPosterior;

    @Column(columnDefinition = "TEXT")
    private String metadata;
}
