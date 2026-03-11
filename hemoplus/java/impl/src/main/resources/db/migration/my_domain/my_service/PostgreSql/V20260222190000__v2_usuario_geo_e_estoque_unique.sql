alter table usuario add column if not exists latitude numeric(19,4);
alter table usuario add column if not exists longitude numeric(19,4);

create unique index if not exists uk_estoque_hemocentro_tipo_rh on estoque (hemocentro, tipo_sangue, fator_rh);
