package com.saf.presupuesto.infrastructure.web.mapper;

import com.saf.presupuesto.domain.model.AsignacionCredito;
import com.saf.presupuesto.infrastructure.web.dto.AsignacionCreditoResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AsignacionCreditoMapper {

    @Mapping(target = "idSaf", source = "saf.id")
    @Mapping(target = "idUnidad", source = "unidad.id")
    @Mapping(target = "idAnexo", source = "anexo.id")
    @Mapping(target = "idFuenteFinanciacion", source = "fuenteFinanciacion.id")
    @Mapping(target = "idInciso", source = "inciso.id")
    AsignacionCreditoResponseDTO toDto(AsignacionCredito entity);
}
