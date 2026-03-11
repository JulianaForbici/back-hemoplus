/* Database: Oracle. Generation date: 2026-02-24 15:30:45:000 */
/* Entity Usuario */
create table usuario (
	id RAW(16) NOT NULL,
	nome_completo VARCHAR(80) NOT NULL /* nomeCompleto */,
	email VARCHAR(120) NOT NULL,
	telefone VARCHAR(20) NOT NULL,
	cpf VARCHAR(11) NOT NULL,
	data_nascimento DATE /* dataNascimento */,
	ativo NUMBER(1),
	data_cadastro TIMESTAMP /* dataCadastro */,
	tipo_sangue VARCHAR(255) NOT NULL /* tipoSangue */,
	fator_rh VARCHAR(255) NOT NULL /* fatorRh */,
	latitude NUMBER(19,4),
	longitude NUMBER(19,4),
	usuario_cloud VARCHAR(120) NOT NULL /* usuarioCloud */,
	tipo_usuario VARCHAR(255) NOT NULL /* tipoUsuario */,
	cep VARCHAR(9),
	rua VARCHAR(80),
	numero VARCHAR(10),
	complemento VARCHAR(60),
	bairro VARCHAR(40),
	cidade VARCHAR(40),
	uf VARCHAR(2),
	ext CLOB,
	CONSTRAINT usuario_JSON_ext CHECK (ext IS JSON)
);


/* Creating index for customization column */
CREATE INDEX usuario_ext ON usuario (ext) INDEXTYPE IS CTXSYS.CONTEXT PARAMETERS ('section group CTXSYS.JSON_SECTION_GROUP SYNC (ON COMMIT)');

/* Entity Hemocentro */
create table hemocentro (
	id RAW(16) NOT NULL,
	nome VARCHAR(60) NOT NULL,
	rua VARCHAR(60) NOT NULL,
	numero VARCHAR(10),
	bairro VARCHAR(40),
	cidade VARCHAR(40) NOT NULL,
	uf VARCHAR(2) NOT NULL,
	cep VARCHAR(9),
	latitude NUMBER(19,4),
	longitude NUMBER(19,4),
	telefone VARCHAR(20),
	ativo NUMBER(1),
	ext CLOB,
	CONSTRAINT hemocentro_JSON_ext CHECK (ext IS JSON)
);


/* Creating index for customization column */
CREATE INDEX hemocentro_ext ON hemocentro (ext) INDEXTYPE IS CTXSYS.CONTEXT PARAMETERS ('section group CTXSYS.JSON_SECTION_GROUP SYNC (ON COMMIT)');

/* Entity Agendamento */
create table agendamento (
	id RAW(16) NOT NULL,
	data_hora TIMESTAMP NOT NULL /* dataHora */,
	status VARCHAR(255) NOT NULL,
	observacao VARCHAR(150),
	motivo_status VARCHAR(150) /* motivoStatus */,
	data_criacao TIMESTAMP /* dataCriacao */,
	data_atualizacao TIMESTAMP /* dataAtualizacao */,
	token VARCHAR(80),
	token_expira_em TIMESTAMP /* tokenExpiraEm */,
	token_usado_em TIMESTAMP /* tokenUsadoEm */,
	usuario RAW(16) NOT NULL,
	hemocentro RAW(16),
	ext CLOB,
	CONSTRAINT agendamento_JSON_ext CHECK (ext IS JSON)
);


/* Creating index for customization column */
CREATE INDEX agendamento_ext ON agendamento (ext) INDEXTYPE IS CTXSYS.CONTEXT PARAMETERS ('section group CTXSYS.JSON_SECTION_GROUP SYNC (ON COMMIT)');

/* Entity Doacao */
create table doacao (
	id RAW(16) NOT NULL,
	data_hora_confirmacao TIMESTAMP NOT NULL /* dataHoraConfirmacao */,
	responsavel_validacao VARCHAR(55) /* responsavelValidacao */,
	usuario RAW(16),
	hemocentro RAW(16),
	agendamento RAW(16) NOT NULL,
	tipo_sangue VARCHAR(255) NOT NULL /* tipoSangue */,
	fator_rh VARCHAR(255) NOT NULL /* fatorRh */,
	ext CLOB,
	CONSTRAINT doacao_JSON_ext CHECK (ext IS JSON)
);


/* Creating index for customization column */
CREATE INDEX doacao_ext ON doacao (ext) INDEXTYPE IS CTXSYS.CONTEXT PARAMETERS ('section group CTXSYS.JSON_SECTION_GROUP SYNC (ON COMMIT)');

/* Entity Estoque */
create table estoque (
	id RAW(16) NOT NULL,
	tipo_sangue VARCHAR(255) NOT NULL /* tipoSangue */,
	fator_rh VARCHAR(255) NOT NULL /* fatorRh */,
	quantidade_ml NUMBER(19) NOT NULL /* quantidadeMl */,
	minimo_ml NUMBER(19) NOT NULL /* minimoMl */,
	data_atualizacao TIMESTAMP NOT NULL /* dataAtualizacao */,
	hemocentro RAW(16),
	ext CLOB,
	CONSTRAINT estoque_JSON_ext CHECK (ext IS JSON)
);


/* Creating index for customization column */
CREATE INDEX estoque_ext ON estoque (ext) INDEXTYPE IS CTXSYS.CONTEXT PARAMETERS ('section group CTXSYS.JSON_SECTION_GROUP SYNC (ON COMMIT)');

/* Join Tables */
/* master: Usuario as usuario, detail: Doacao as doacao */
create table usuario_doacoes (
	usuario_id RAW(16) NOT NULL,
	doacoes_id RAW(16) NOT NULL
);

/* master: Hemocentro as hemocentro, detail: Agendamento as agendamento */
create table hemocentro_agendamentos (
	hemocentro_id RAW(16) NOT NULL,
	agendamentos_id RAW(16) NOT NULL
);

/* master: Hemocentro as hemocentro, detail: Doacao as doacao */
create table hemocentro_doacoes (
	hemocentro_id RAW(16) NOT NULL,
	doacoes_id RAW(16) NOT NULL
);

/* master: Hemocentro as hemocentro, detail: Estoque as estoque */
create table hemocentro_estoques (
	hemocentro_id RAW(16) NOT NULL,
	estoques_id RAW(16) NOT NULL
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
alter table usuario_doacoes add constraint fkglhkm4k6cpm8pbqktclitcnglc5v foreign key (usuario_id) references usuario (id);
alter table usuario_doacoes add constraint fkhoxbg3u8aigqylzllx68qdtqg7kq foreign key (doacoes_id) references doacao (id);
alter table hemocentro_agendamentos add constraint fkysabn11dourkztscavnovssaxssp foreign key (hemocentro_id) references hemocentro (id);
alter table hemocentro_agendamentos add constraint fkcne2hvd3qtbsz5axwt7tfovynrwr foreign key (agendamentos_id) references agendamento (id);
alter table hemocentro_doacoes add constraint fk4qoyjtopgat5rhol0a3foyqbov2k foreign key (hemocentro_id) references hemocentro (id);
alter table hemocentro_doacoes add constraint fkqytt5xld36lf2yvf4m7ewtobps9s foreign key (doacoes_id) references doacao (id);
alter table hemocentro_estoques add constraint fkfegdrlv5tj4ykgeamtegggofys3g foreign key (hemocentro_id) references hemocentro (id);
alter table hemocentro_estoques add constraint fko8rpcpxi8o6f4a5wwerznnp14djw foreign key (estoques_id) references estoque (id);
alter table agendamento add constraint fkjtnn1s4jnb7qz7ycblwgnemvzyza foreign key (usuario) references usuario (id);
alter table agendamento add constraint fk3mlx0fp1l7xy3vhvnrph18xjce2g foreign key (hemocentro) references hemocentro (id);
alter table doacao add constraint fkv0cf5646ocfe6haipbdajsbyf0qz foreign key (usuario) references usuario (id);
alter table doacao add constraint fkedkjta2auvsu8tuenphwj2aah9kl foreign key (hemocentro) references hemocentro (id);
alter table doacao add constraint fklzmlbpat64dphdgsjyvne0vlimmu foreign key (agendamento) references agendamento (id);
alter table estoque add constraint fkh9gju3dfh7fjx2fyfap97ewev29l foreign key (hemocentro) references hemocentro (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
