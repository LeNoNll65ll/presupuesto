package com.proyectosaf.presupuesto.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tarea")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TareaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_objetivo", nullable = false)
    private ObjetivoEntity objetivo;

    @Lob
    @Column(nullable = false)
    private String detalle;

    @Column(nullable = false)
    private Boolean activo = true;
}
