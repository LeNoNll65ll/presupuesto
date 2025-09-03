package com.proyectosaf.presupuesto.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "anexo",
        uniqueConstraints = @UniqueConstraint(columnNames = {"id_unidad","nombre"}))
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AnexoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(optional = false) @JoinColumn(name = "id_unidad", nullable = false)
    private UnidadMilitarEntity unidad;

    @Column(nullable = false, length = 120)
    private String nombre;

    @Lob
    private String descripcion;

    @Column(nullable = false)
    private Boolean activo = true;
}
