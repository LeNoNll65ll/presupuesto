package com.saf.presupuesto.infrastructure.exception;

import java.time.Instant;

public record ApiError(
        Instant timestamp,
        String path,
        int status,
        String code,
        String message
) {}
