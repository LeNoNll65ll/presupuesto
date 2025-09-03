package com.saf.presupuesto.infrastructure.web;

import com.saf.presupuesto.application.AsignacionCreditoService;
import com.saf.presupuesto.infrastructure.web.dto.AsignacionCreditoCreateDTO;
import com.saf.presupuesto.infrastructure.web.dto.AsignacionCreditoResponseDTO;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import java.net.URI;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/asignaciones")
public class AsignacionCreditoController {

    private final AsignacionCreditoService service;

    public AsignacionCreditoController(AsignacionCreditoService service) {
        this.service = service;
    }

    @PostMapping
    @Operation(summary = "Crea una asignación de crédito")
    public ResponseEntity<AsignacionCreditoResponseDTO> crear(@Valid @RequestBody AsignacionCreditoCreateDTO dto) {
        AsignacionCreditoResponseDTO resp = service.crear(dto);
        return ResponseEntity.created(URI.create("/api/asignaciones/" + resp.id())).body(resp);
    }
}
