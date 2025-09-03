package com.proyectosaf.presupuesto.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ejercicio", uniqueConstraints = @UniqueConstraint(columnNames = "anio"))
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EjercicioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Short anio;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 10)
    private EstadoEjercicio estado = EstadoEjercicio.ABIERTO;
}
