package com.proyectosaf.presupuesto.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "aprobacion_saf",
        uniqueConstraints = @UniqueConstraint(columnNames = {"id_saf","id_ejercicio","fecha_aprobacion"}))
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AprobacionSafEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(optional = false) @JoinColumn(name = "id_saf", nullable = false)
    private SafEntity saf;

    @ManyToOne(optional = false) @JoinColumn(name = "id_ejercicio", nullable = false)
    private EjercicioEntity ejercicio;

    @Column(name = "fecha_aprobacion", nullable = false)
    private LocalDate fechaAprobacion;

    @Column(name = "periodo_desde", nullable = false)
    private LocalDate periodoDesde;

    @Column(name = "periodo_hasta", nullable = false)
    private LocalDate periodoHasta;

    @Column(length = 60)
    private String resolucionNumero;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 10)
    private EstadoAprobacion estadoAprobacion;
}
