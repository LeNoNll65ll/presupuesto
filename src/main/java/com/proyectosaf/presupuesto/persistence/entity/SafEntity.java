package com.proyectosaf.presupuesto.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "saf", uniqueConstraints = @UniqueConstraint(columnNames = "nombre"))
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SafEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 120)
    private String nombre;

    @Column(nullable = false)
    private Boolean activo = true;
}
