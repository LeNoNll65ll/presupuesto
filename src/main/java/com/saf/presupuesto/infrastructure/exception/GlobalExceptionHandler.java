package com.saf.presupuesto.infrastructure.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.Instant;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiError> handleValidation(MethodArgumentNotValidException ex, HttpServletRequest req) {
        String msg = ex.getBindingResult().getAllErrors().stream()
                .findFirst().map(e -> e.getDefaultMessage()).orElse("Validation error");
        ApiError error = new ApiError(Instant.now(), req.getRequestURI(), HttpStatus.BAD_REQUEST.value(),
                "VALIDATION_ERROR", msg);
        return ResponseEntity.badRequest().body(error);
    }

    @ExceptionHandler(BusinessRuleException.class)
    public ResponseEntity<ApiError> handleBusiness(BusinessRuleException ex, HttpServletRequest req) {
        ApiError error = new ApiError(Instant.now(), req.getRequestURI(), HttpStatus.BAD_REQUEST.value(),
                "BUSINESS_RULE", ex.getMessage());
        return ResponseEntity.badRequest().body(error);
    }
}
