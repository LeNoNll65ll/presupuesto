package com.proyectosaf.presupuesto.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "unidad_militar",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"id_saf","nombre"}),
                @UniqueConstraint(columnNames = {"codigo"})
        })
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UnidadMilitarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(optional = false) @JoinColumn(name = "id_saf", nullable = false)
    private SafEntity saf;

    @Column(nullable = false, length = 120)
    private String nombre;

    @Column(length = 50)
    private String codigo;

    @Column(nullable = false)
    private Boolean activo = true;
}
