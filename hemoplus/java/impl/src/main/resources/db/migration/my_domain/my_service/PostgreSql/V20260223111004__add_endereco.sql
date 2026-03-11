alter table usuario add column if not exists cep VARCHAR(9);

alter table usuario add column if not exists rua VARCHAR(80);

alter table usuario add column if not exists numero VARCHAR(10);

alter table usuario add column if not exists cidade VARCHAR(40);

alter table usuario add column if not exists uf VARCHAR(2);

alter table usuario add column if not exists complemento VARCHAR(60);

alter table usuario add column if not exists bairro VARCHAR(40);