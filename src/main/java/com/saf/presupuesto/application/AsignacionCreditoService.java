package com.saf.presupuesto.application;

import com.saf.presupuesto.domain.model.*;
import com.saf.presupuesto.domain.repository.AsignacionCreditoRepository;
import com.saf.presupuesto.domain.repository.MovimientoPresupuestarioRepository;
import com.saf.presupuesto.infrastructure.web.dto.AsignacionCreditoCreateDTO;
import com.saf.presupuesto.infrastructure.web.dto.AsignacionCreditoResponseDTO;
import com.saf.presupuesto.infrastructure.web.mapper.AsignacionCreditoMapper;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AsignacionCreditoService {

    private final AsignacionCreditoRepository asignacionRepo;
    private final MovimientoPresupuestarioRepository movimientoRepo;
    private final AsignacionCreditoMapper mapper;
    @PersistenceContext
    private EntityManager em;

    public AsignacionCreditoService(AsignacionCreditoRepository asignacionRepo,
                                    MovimientoPresupuestarioRepository movimientoRepo,
                                    AsignacionCreditoMapper mapper) {
        this.asignacionRepo = asignacionRepo;
        this.movimientoRepo = movimientoRepo;
        this.mapper = mapper;
    }

    public AsignacionCreditoResponseDTO crear(AsignacionCreditoCreateDTO dto) {
        AsignacionCredito entity = new AsignacionCredito();
        entity.setSaf(em.getReference(Saf.class, dto.idSaf()));
        entity.setUnidad(em.getReference(UnidadMilitar.class, dto.idUnidad()));
        entity.setAnexo(em.getReference(Anexo.class, dto.idAnexo()));
        entity.setFuenteFinanciacion(em.getReference(FuenteFinanciacion.class, dto.idFuenteFinanciacion()));
        entity.setInciso(em.getReference(Inciso.class, dto.idInciso()));
        entity.setMontoTotal(dto.montoTotal());
        entity.setFecha(dto.fecha());
        entity.setObservaciones(dto.observaciones());
        AsignacionCredito saved = asignacionRepo.save(entity);

        MovimientoPresupuestario mov = new MovimientoPresupuestario();
        mov.setTipo(TipoMovimiento.ASIGNACION);
        mov.setReferenciaId(saved.getId());
        mov.setReferenciaTabla("asignacion_credito");
        mov.setFecha(saved.getFecha());
        mov.setMonto(saved.getMontoTotal());
        mov.setSaf(saved.getSaf());
        mov.setUnidad(saved.getUnidad());
        mov.setAnexo(saved.getAnexo());
        mov.setInciso(saved.getInciso());
        mov.setSaldoPosterior(saved.getMontoTotal());
        movimientoRepo.save(mov);

        return mapper.toDto(saved);
    }
}
