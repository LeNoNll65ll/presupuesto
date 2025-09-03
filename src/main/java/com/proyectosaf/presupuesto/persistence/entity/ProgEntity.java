package com.proyectosaf.presupuesto.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(
        name = "prog",
        uniqueConstraints = @UniqueConstraint(columnNames = {"id_inciso","numero"})
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProgEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProg;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_inciso", nullable = false)
    private IncisoEntity inciso;

    @Column(nullable = false)
    private Integer numero;

    @Column(nullable = false)
    private Boolean activo = true;
}
