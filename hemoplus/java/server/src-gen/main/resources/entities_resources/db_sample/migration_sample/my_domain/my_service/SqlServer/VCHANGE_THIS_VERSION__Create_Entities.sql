/* Database: SqlServer. Generation date: 2026-02-24 15:30:44:988 */
/* Entity Usuario */
create table usuario (
	id UNIQUEIDENTIFIER NOT NULL,
	nome_completo VARCHAR(80) NOT NULL /* nomeCompleto */,
	email VARCHAR(120) NOT NULL,
	telefone VARCHAR(20) NOT NULL,
	cpf VARCHAR(11) NOT NULL,
	data_nascimento DATE /* dataNascimento */,
	ativo BIT,
	data_cadastro DATETIME /* dataCadastro */,
	tipo_sangue VARCHAR(255) NOT NULL /* tipoSangue */,
	fator_rh VARCHAR(255) NOT NULL /* fatorRh */,
	latitude FLOAT(32),
	longitude FLOAT(32),
	usuario_cloud VARCHAR(120) NOT NULL /* usuarioCloud */,
	tipo_usuario VARCHAR(255) NOT NULL /* tipoUsuario */,
	cep VARCHAR(9),
	rua VARCHAR(80),
	numero VARCHAR(10),
	complemento VARCHAR(60),
	bairro VARCHAR(40),
	cidade VARCHAR(40),
	uf VARCHAR(2),
	ext VARCHAR(4000)
);


/* Creating index for customization column */
/* column type JSON not supported */

/* Entity Hemocentro */
create table hemocentro (
	id UNIQUEIDENTIFIER NOT NULL,
	nome VARCHAR(60) NOT NULL,
	rua VARCHAR(60) NOT NULL,
	numero VARCHAR(10),
	bairro VARCHAR(40),
	cidade VARCHAR(40) NOT NULL,
	uf VARCHAR(2) NOT NULL,
	cep VARCHAR(9),
	latitude FLOAT(32),
	longitude FLOAT(32),
	telefone VARCHAR(20),
	ativo BIT,
	ext VARCHAR(4000)
);


/* Creating index for customization column */
/* column type JSON not supported */

/* Entity Agendamento */
create table agendamento (
	id UNIQUEIDENTIFIER NOT NULL,
	data_hora DATETIME NOT NULL /* dataHora */,
	status VARCHAR(255) NOT NULL,
	observacao VARCHAR(150),
	motivo_status VARCHAR(150) /* motivoStatus */,
	data_criacao DATETIME /* dataCriacao */,
	data_atualizacao DATETIME /* dataAtualizacao */,
	token VARCHAR(80),
	token_expira_em DATETIME /* tokenExpiraEm */,
	token_usado_em DATETIME /* tokenUsadoEm */,
	usuario UNIQUEIDENTIFIER NOT NULL,
	hemocentro UNIQUEIDENTIFIER,
	ext VARCHAR(4000)
);


/* Creating index for customization column */
/* column type JSON not supported */

/* Entity Doacao */
create table doacao (
	id UNIQUEIDENTIFIER NOT NULL,
	data_hora_confirmacao DATETIME NOT NULL /* dataHoraConfirmacao */,
	responsavel_validacao VARCHAR(55) /* responsavelValidacao */,
	usuario UNIQUEIDENTIFIER,
	hemocentro UNIQUEIDENTIFIER,
	agendamento UNIQUEIDENTIFIER NOT NULL,
	tipo_sangue VARCHAR(255) NOT NULL /* tipoSangue */,
	fator_rh VARCHAR(255) NOT NULL /* fatorRh */,
	ext VARCHAR(4000)
);


/* Creating index for customization column */
/* column type JSON not supported */

/* Entity Estoque */
create table estoque (
	id UNIQUEIDENTIFIER NOT NULL,
	tipo_sangue VARCHAR(255) NOT NULL /* tipoSangue */,
	fator_rh VARCHAR(255) NOT NULL /* fatorRh */,
	quantidade_ml NUMERIC(19) NOT NULL /* quantidadeMl */,
	minimo_ml NUMERIC(19) NOT NULL /* minimoMl */,
	data_atualizacao DATETIME NOT NULL /* dataAtualizacao */,
	hemocentro UNIQUEIDENTIFIER,
	ext VARCHAR(4000)
);


/* Creating index for customization column */
/* column type JSON not supported */

/* Join Tables */
/* master: Usuario as usuario, detail: Doacao as doacao */
create table usuario_doacoes (
	usuario_id UNIQUEIDENTIFIER NOT NULL,
	doacoes_id UNIQUEIDENTIFIER NOT NULL
);

/* master: Hemocentro as hemocentro, detail: Agendamento as agendamento */
create table hemocentro_agendamentos (
	hemocentro_id UNIQUEIDENTIFIER NOT NULL,
	agendamentos_id UNIQUEIDENTIFIER NOT NULL
);

/* master: Hemocentro as hemocentro, detail: Doacao as doacao */
create table hemocentro_doacoes (
	hemocentro_id UNIQUEIDENTIFIER NOT NULL,
	doacoes_id UNIQUEIDENTIFIER NOT NULL
);

/* master: Hemocentro as hemocentro, detail: Estoque as estoque */
create table hemocentro_estoques (
	hemocentro_id UNIQUEIDENTIFIER NOT NULL,
	estoques_id UNIQUEIDENTIFIER NOT NULL
);

/* Primary Key Constraints */
alter table usuario_doacoes add constraint pk_usuario_doacoes primary key(usuario_id, doacoes_id);
alter table usuario add constraint pk_usuario_id primary key(id);
alter table hemocentro_agendamentos add constraint pk_hemocentro_agendamentos primary key(hemocentro_id, agendamentos_id);
alter table hemocentro_doacoes add constraint pk_hemocentro_doacoes primary key(hemocentro_id, doacoes_id);
alter table hemocentro_estoques add constraint pk_hemocentro_estoques primary key(hemocentro_id, estoques_id);
alter table hemocentro add constraint pk_hemocentro_id primary key(id);
alter table agendamento add constraint pk_agendamento_id primary key(id);
alter table doacao add constraint pk_doacao_id primary key(id);
alter table estoque add constraint pk_estoque_id primary key(id);

/* Foreign Key Constraints */
alter table usuario_doacoes add constraint fk4v2n6jjkhniw1g2hjtqqy31xmobl foreign key (usuario_id) references usuario (id);
alter table usuario_doacoes add constraint fkr6pdwwlcixenrcrotscfupzabs2p foreign key (doacoes_id) references doacao (id);
alter table hemocentro_agendamentos add constraint fk8zlg6vnsgfwocnulqhefb4xxkunx foreign key (hemocentro_id) references hemocentro (id);
alter table hemocentro_agendamentos add constraint fkdcbs2ibc0ufdwmrhlgdwrql14k6y foreign key (agendamentos_id) references agendamento (id);
alter table hemocentro_doacoes add constraint fkb87uxzuvs9yi4gmps1es47vumh08 foreign key (hemocentro_id) references hemocentro (id);
alter table hemocentro_doacoes add constraint fkrmvvdypiz5hmqlw5culql9byh2bi foreign key (doacoes_id) references doacao (id);
alter table hemocentro_estoques add constraint fkpldm92vap91puzpi6vr5lfbs5xbz foreign key (hemocentro_id) references hemocentro (id);
alter table hemocentro_estoques add constraint fkzofzfisfsz58accakybziseg5hrp foreign key (estoques_id) references estoque (id);
alter table agendamento add constraint fknnoeuxyprybahugxzqi92n4o30vv foreign key (usuario) references usuario (id);
alter table agendamento add constraint fk0thwhbcedjewloboabyh9ylert9z foreign key (hemocentro) references hemocentro (id);
alter table doacao add constraint fkesqxwk7btho2pm2bfj8wye9gbhpy foreign key (usuario) references usuario (id);
alter table doacao add constraint fkmu1exjuhszekodvioo7mp90xblah foreign key (hemocentro) references hemocentro (id);
alter table doacao add constraint fkelk4hfwyfkcgwnuhn1glo4vzpy0y foreign key (agendamento) references agendamento (id);
alter table estoque add constraint fkfvcqf2aqwzjxdcftofgwcsmkomjn foreign key (hemocentro) references hemocentro (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
