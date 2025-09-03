package com.proyectosaf.presupuesto.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "inciso",
        uniqueConstraints = @UniqueConstraint(columnNames = {"id_ff","numero"}))
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IncisoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(optional = false) @JoinColumn(name = "id_ff", nullable = false)
    private FuenteFinanciacionEntity ff;

    @Column(nullable = false)
    private Integer numero;

    @Column(nullable = false)
    private Boolean activo = true;
}
