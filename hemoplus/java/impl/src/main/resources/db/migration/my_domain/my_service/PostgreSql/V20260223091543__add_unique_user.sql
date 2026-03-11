alter table usuario add column if not exists usuario_cloud VARCHAR(120);

alter table usuario add constraint uk_usuario_usuario_cloud unique (usuario_cloud);