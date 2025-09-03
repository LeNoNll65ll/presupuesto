package com.saf.presupuesto.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class FuenteFinanciacion extends Audit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Boolean activo;

    @ManyToOne(fetch = FetchType.LAZY)
    private UnidadMilitar unidad;

    @ManyToOne(fetch = FetchType.LAZY)
    private Anexo anexo;
}
