package com.proyectosaf.presupuesto.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(
        name = "proyecto",
        uniqueConstraints = @UniqueConstraint(columnNames = {"id_actividad","numero"})
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProyectoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_actividad", nullable = false)
    private ActividadEntity actividad;

    @Column(nullable = false)
    private Integer numero;

    @Column(nullable = false)
    private Boolean activo = true;
}
