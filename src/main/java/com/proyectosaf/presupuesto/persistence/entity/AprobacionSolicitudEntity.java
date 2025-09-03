package com.proyectosaf.presupuesto.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "aprobacion_solicitud",
        uniqueConstraints = @UniqueConstraint(columnNames = {"id_aprob_saf","id_solicitud"}))
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AprobacionSolicitudEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(optional = false) @JoinColumn(name = "id_ejercicio", nullable = false)
    private EjercicioEntity ejercicio;

    @ManyToOne(optional = false) @JoinColumn(name = "id_aprob_saf", nullable = false)
    private AprobacionSafEntity aprobacionSaf;

    @ManyToOne(optional = false) @JoinColumn(name = "id_solicitud", nullable = false)
    private SolicitudPresupuestariaEntity solicitud;

    @Column(nullable = false, precision = 14, scale = 2)
    private BigDecimal compromisoAprobado = BigDecimal.ZERO;

    @Column(nullable = false, precision = 14, scale = 2)
    private BigDecimal devengadoAprobado = BigDecimal.ZERO;

    @Lob
    private String observacion;
}
