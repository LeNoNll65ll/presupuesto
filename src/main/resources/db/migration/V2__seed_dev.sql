INSERT INTO saf (id, nombre, activo) VALUES (1, 'SAF 1', true);
INSERT INTO unidad_militar (id, nombre, codigo, activo, saf_id) VALUES (1, 'Unidad 1', 'U1', true, 1);
INSERT INTO anexo (id, nombre, descripcion, activo, unidad_id) VALUES (1, 'Anexo 1', 'Anexo base', true, 1);
INSERT INTO fuente_financiacion (id, nombre, activo, unidad_id, anexo_id) VALUES (1, 'Fuente 1', true, 1, 1);
INSERT INTO inciso (id, codigo, descripcion, activo) VALUES (1, '1', 'Inciso 1', true);
