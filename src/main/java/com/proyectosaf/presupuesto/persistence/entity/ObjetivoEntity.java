package com.proyectosaf.presupuesto.persistence.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(
        name = "objetivo",
        uniqueConstraints = @UniqueConstraint(columnNames = {"id_proyecto","numero"})
)
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ObjetivoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_proyecto", nullable = false)
    private ProyectoEntity proyecto;

    @Column(nullable = false)
    private Integer numero;

    @Column(nullable = false)
    private Boolean activo = true;
}
