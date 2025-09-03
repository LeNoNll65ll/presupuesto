package com.saf.presupuesto.infrastructure.web.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public record AsignacionCreditoResponseDTO(
        Long id,
        Long idSaf,
        Long idUnidad,
        Long idAnexo,
        Long idFuenteFinanciacion,
        Long idInciso,
        BigDecimal montoTotal,
        LocalDate fecha,
        String observaciones
) {}
