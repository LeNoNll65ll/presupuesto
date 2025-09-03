package com.proyectosaf.presupuesto.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "asignacion_solicitado",
        uniqueConstraints = @UniqueConstraint(columnNames = {"id_solicitud","id_asignacion"}))
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AsignacionSolicitadoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(optional = false) @JoinColumn(name = "id_ejercicio", nullable = false)
    private EjercicioEntity ejercicio;

    @ManyToOne(optional = false) @JoinColumn(name = "id_asignacion", nullable = false)
    private AsignacionCreditoEntity asignacion;

    @ManyToOne(optional = false) @JoinColumn(name = "id_solicitud", nullable = false)
    private SolicitudPresupuestariaEntity solicitud;

    @Column(nullable = false, precision = 14, scale = 2)
    private BigDecimal montoSolicitado = BigDecimal.ZERO;

    @Column(nullable = false, precision = 14, scale = 2)
    private BigDecimal compromisoSolicitado = BigDecimal.ZERO;

    @Column(nullable = false, precision = 14, scale = 2)
    private BigDecimal devengadoSolicitado = BigDecimal.ZERO;

    @Lob
    private String detalle;
}
