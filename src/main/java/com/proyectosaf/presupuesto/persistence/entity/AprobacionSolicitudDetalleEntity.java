package com.proyectosaf.presupuesto.persistence.entity;
import jakarta.persistence.*;
        import lombok.*;
        import java.math.BigDecimal;

@Entity
@Table(name = "aprobacion_solicitud_detalle",
        uniqueConstraints = @UniqueConstraint(columnNames = {"id_aprob_solicitud","id_asigsol"}))
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AprobacionSolicitudDetalleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(optional = false) @JoinColumn(name = "id_ejercicio", nullable = false)
    private EjercicioEntity ejercicio;

    @ManyToOne(optional = false) @JoinColumn(name = "id_aprob_solicitud", nullable = false)
    private AprobacionSolicitudEntity aprobacionSolicitud;

    @ManyToOne(optional = false) @JoinColumn(name = "id_asigsol", nullable = false)
    private AsignacionSolicitadoEntity asigsol;

    @Column(nullable = false, precision = 14, scale = 2)
    private BigDecimal compromisoAprobado = BigDecimal.ZERO;

    @Column(nullable = false, precision = 14, scale = 2)
    private BigDecimal devengadoAprobado = BigDecimal.ZERO;

    @Lob
    private String observacion;
}
