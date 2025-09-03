CREATE TABLE saf (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255),
    activo BOOLEAN,
    created_at TIMESTAMP,
    created_by VARCHAR(255),
    updated_at TIMESTAMP,
    updated_by VARCHAR(255),
    version BIGINT
);

CREATE TABLE unidad_militar (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255),
    codigo VARCHAR(50),
    activo BOOLEAN,
    saf_id BIGINT,
    created_at TIMESTAMP,
    created_by VARCHAR(255),
    updated_at TIMESTAMP,
    updated_by VARCHAR(255),
    version BIGINT,
    CONSTRAINT fk_unidad_saf FOREIGN KEY (saf_id) REFERENCES saf(id)
);

CREATE TABLE anexo (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255),
    descripcion VARCHAR(255),
    activo BOOLEAN,
    unidad_id BIGINT,
    created_at TIMESTAMP,
    created_by VARCHAR(255),
    updated_at TIMESTAMP,
    updated_by VARCHAR(255),
    version BIGINT,
    CONSTRAINT fk_anexo_unidad FOREIGN KEY (unidad_id) REFERENCES unidad_militar(id)
);

CREATE TABLE fuente_financiacion (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255),
    activo BOOLEAN,
    unidad_id BIGINT,
    anexo_id BIGINT,
    created_at TIMESTAMP,
    created_by VARCHAR(255),
    updated_at TIMESTAMP,
    updated_by VARCHAR(255),
    version BIGINT,
    CONSTRAINT fk_fuente_unidad FOREIGN KEY (unidad_id) REFERENCES unidad_militar(id),
    CONSTRAINT fk_fuente_anexo FOREIGN KEY (anexo_id) REFERENCES anexo(id)
);

CREATE TABLE inciso (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    codigo VARCHAR(50),
    descripcion VARCHAR(255),
    activo BOOLEAN,
    created_at TIMESTAMP,
    created_by VARCHAR(255),
    updated_at TIMESTAMP,
    updated_by VARCHAR(255),
    version BIGINT
);

CREATE TABLE asignacion_credito (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    saf_id BIGINT,
    unidad_id BIGINT,
    anexo_id BIGINT,
    fuente_financiacion_id BIGINT,
    inciso_id BIGINT,
    monto_total DECIMAL(19,2),
    fecha DATE,
    observaciones VARCHAR(255),
    created_at TIMESTAMP,
    created_by VARCHAR(255),
    updated_at TIMESTAMP,
    updated_by VARCHAR(255),
    version BIGINT,
    CONSTRAINT fk_asig_saf FOREIGN KEY (saf_id) REFERENCES saf(id),
    CONSTRAINT fk_asig_unidad FOREIGN KEY (unidad_id) REFERENCES unidad_militar(id),
    CONSTRAINT fk_asig_anexo FOREIGN KEY (anexo_id) REFERENCES anexo(id),
    CONSTRAINT fk_asig_fuente FOREIGN KEY (fuente_financiacion_id) REFERENCES fuente_financiacion(id),
    CONSTRAINT fk_asig_inciso FOREIGN KEY (inciso_id) REFERENCES inciso(id)
);

CREATE TABLE movimiento_presupuestario (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    tipo VARCHAR(50),
    referencia_id BIGINT,
    referencia_tabla VARCHAR(100),
    fecha DATE,
    monto DECIMAL(19,2),
    saf_id BIGINT,
    unidad_id BIGINT,
    anexo_id BIGINT,
    inciso_id BIGINT,
    saldo_posterior DECIMAL(19,2),
    metadata TEXT,
    created_at TIMESTAMP,
    created_by VARCHAR(255),
    updated_at TIMESTAMP,
    updated_by VARCHAR(255),
    version BIGINT,
    CONSTRAINT fk_mov_saf FOREIGN KEY (saf_id) REFERENCES saf(id),
    CONSTRAINT fk_mov_unidad FOREIGN KEY (unidad_id) REFERENCES unidad_militar(id),
    CONSTRAINT fk_mov_anexo FOREIGN KEY (anexo_id) REFERENCES anexo(id),
    CONSTRAINT fk_mov_inciso FOREIGN KEY (inciso_id) REFERENCES inciso(id)
);
