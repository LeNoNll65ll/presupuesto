package com.proyectosaf.presupuesto.service;

import com.proyectosaf.presupuesto.persistence.entity.SafEntity;
import com.proyectosaf.presupuesto.persistence.repository.SafRepository;
import com.proyectosaf.presupuesto.service.impl.SafServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SafServiceImplTest {

    @Mock
    private SafRepository repository;

    @InjectMocks
    private SafServiceImpl service;

    @Test
    void createDelegatesToRepository() {
        SafEntity input = SafEntity.builder().nombre("Test").activo(true).build();
        when(repository.save(any(SafEntity.class))).thenReturn(input);

        SafEntity result = service.create(input);

        verify(repository).save(input);
        assertEquals("Test", result.getNombre());
    }
}
