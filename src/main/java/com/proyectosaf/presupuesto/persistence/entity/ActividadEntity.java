package com.proyectosaf.presupuesto.persistence.entity;


import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(
        name = "actividad",
        uniqueConstraints = @UniqueConstraint(columnNames = {"id_prog","numero"})
)
public class ActividadEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_prog", nullable = false)
    private ProgEntity prog;

    @Column(nullable = false)
    private Integer numero;

    @Column(nullable = false)
    private Boolean activo = true;
}
