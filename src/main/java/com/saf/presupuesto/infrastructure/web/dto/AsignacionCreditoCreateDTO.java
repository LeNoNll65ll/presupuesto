package com.saf.presupuesto.infrastructure.web.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.LocalDate;

public record AsignacionCreditoCreateDTO(
        @NotNull Long idSaf,
        @NotNull Long idUnidad,
        @NotNull Long idAnexo,
        @NotNull Long idFuenteFinanciacion,
        @NotNull Long idInciso,
        @NotNull @Positive BigDecimal montoTotal,
        @NotNull LocalDate fecha,
        String observaciones
) {}
