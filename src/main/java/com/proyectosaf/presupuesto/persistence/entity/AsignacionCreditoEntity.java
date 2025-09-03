package com.proyectosaf.presupuesto.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "asignacion_credito",
        uniqueConstraints = @UniqueConstraint(columnNames = {"id_tarea","id_ejercicio","fecha"}))
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AsignacionCreditoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(optional = false) @JoinColumn(name = "id_tarea", nullable = false)
    private TareaEntity tarea;

    @ManyToOne(optional = false) @JoinColumn(name = "id_ejercicio", nullable = false)
    private EjercicioEntity ejercicio;

    @Column(nullable = false)
    private LocalDate fecha;

    @Lob
    private String observacion;

    @Column(nullable = false, precision = 14, scale = 2)
    private BigDecimal credito;

    @Column(nullable = false)
    private Boolean activo = true;
}
