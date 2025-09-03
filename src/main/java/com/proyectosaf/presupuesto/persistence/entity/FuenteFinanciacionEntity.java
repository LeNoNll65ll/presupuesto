package com.proyectosaf.presupuesto.persistence.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "fuente_financiacion",
        uniqueConstraints = @UniqueConstraint(columnNames = {"id_anexo","nombre"}))
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FuenteFinanciacionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(optional = false) @JoinColumn(name = "id_anexo", nullable = false)
    private AnexoEntity anexo;

    @Column(nullable = false, length = 120)
    private String nombre;

    @Column(length = 50)
    private String unidad;

    @Column(nullable = false)
    private Boolean activo = true;
}
