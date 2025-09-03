package com.saf.presupuesto.application;

import com.saf.presupuesto.domain.model.*;
import com.saf.presupuesto.domain.repository.*;
import com.saf.presupuesto.infrastructure.web.dto.AsignacionCreditoCreateDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class AsignacionCreditoServiceTest {

    @Autowired
    private AsignacionCreditoService service;
    @Autowired private SafRepository safRepository;
    @Autowired private UnidadMilitarRepository unidadRepository;
    @Autowired private AnexoRepository anexoRepository;
    @Autowired private FuenteFinanciacionRepository fuenteRepository;
    @Autowired private IncisoRepository incisoRepository;
    @Autowired private MovimientoPresupuestarioRepository movimientoRepository;

    @Test
    void crearAsignacionGeneraMovimiento() {
        Saf saf = new Saf();
        saf.setNombre("SAF 1");
        saf.setActivo(true);
        safRepository.save(saf);
        UnidadMilitar unidad = new UnidadMilitar();
        unidad.setNombre("Unidad 1"); unidad.setCodigo("U1"); unidad.setActivo(true); unidad.setSaf(saf);
        unidadRepository.save(unidad);
        Anexo anexo = new Anexo();
        anexo.setNombre("Anexo 1"); anexo.setDescripcion("A"); anexo.setActivo(true); anexo.setUnidad(unidad);
        anexoRepository.save(anexo);
        FuenteFinanciacion ff = new FuenteFinanciacion();
        ff.setNombre("Fuente"); ff.setActivo(true); ff.setUnidad(unidad); ff.setAnexo(anexo);
        fuenteRepository.save(ff);
        Inciso inciso = new Inciso();
        inciso.setCodigo("1"); inciso.setDescripcion("Inciso"); inciso.setActivo(true);
        incisoRepository.save(inciso);

        AsignacionCreditoCreateDTO dto = new AsignacionCreditoCreateDTO(saf.getId(), unidad.getId(), anexo.getId(), ff.getId(), inciso.getId(),
                new BigDecimal("1000"), LocalDate.now(), "obs");
        var resp = service.crear(dto);
        assertNotNull(resp.id());
        assertEquals(1, movimientoRepository.count());
        MovimientoPresupuestario mov = movimientoRepository.findAll().get(0);
        assertEquals(TipoMovimiento.ASIGNACION, mov.getTipo());
        assertEquals(resp.id(), mov.getReferenciaId());
    }
}
