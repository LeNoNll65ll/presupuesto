package com.proyectosaf.presupuesto.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "solicitud_presupuestaria")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SolicitudPresupuestariaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(optional = false) @JoinColumn(name = "id_cuota_tipo", nullable = false)
    private CuotaTipoEntity cuotaTipo;

    @ManyToOne(optional = false) @JoinColumn(name = "id_ejercicio", nullable = false)
    private EjercicioEntity ejercicio;

    @Column(nullable = false)
    private LocalDate fecha;

    @Lob
    private String detalle;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 10)
    private EstadoSolicitud estado = EstadoSolicitud.BORRADOR;
}
