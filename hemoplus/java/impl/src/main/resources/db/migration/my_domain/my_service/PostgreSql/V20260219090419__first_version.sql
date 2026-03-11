/* Database: PostgreSql. Generation date: 2026-02-20 13:56:13:432 */
/* Entity Usuario */
create table usuario (
                         id UUID NOT NULL,
                         nome_completo VARCHAR(80) NOT NULL /* nomeCompleto */,
                         email VARCHAR(120) NOT NULL,
                         telefone VARCHAR(20) NOT NULL,
                         cpf VARCHAR(11) NOT NULL,
                         data_nascimento DATE /* dataNascimento */,
                         ativo BOOLEAN,
                         data_cadastro TIMESTAMP /* dataCadastro */,
                         tipo_sangue VARCHAR(255) /* tipoSangue */,
                         fator_rh VARCHAR(255) /* fatorRh */,
                         ext JSONB
);


/* Creating index for customization column */
create index usuario_ext on usuario using gin (ext);

/* Entity Hemocentro */
create table hemocentro (
                            id UUID NOT NULL,
                            nome VARCHAR(60) NOT NULL,
                            rua VARCHAR(60) NOT NULL,
                            numero VARCHAR(10),
                            bairro VARCHAR(40),
                            cidade VARCHAR(40) NOT NULL,
                            uf VARCHAR(2) NOT NULL,
                            cep VARCHAR(9),
                            latitude NUMERIC(19,4),
                            longitude NUMERIC(19,4),
                            telefone VARCHAR(20),
                            ativo BOOLEAN,
                            ext JSONB
);


/* Creating index for customization column */
create index hemocentro_ext on hemocentro using gin (ext);

/* Entity Agendamento */
create table agendamento (
                             id UUID NOT NULL,
                             data_hora TIMESTAMP NOT NULL /* dataHora */,
                             status VARCHAR(255) NOT NULL,
                             observacao VARCHAR(150),
                             motivo_status VARCHAR(150) /* motivoStatus */,
                             data_criacao TIMESTAMP /* dataCriacao */,
                             data_atualizacao TIMESTAMP /* dataAtualizacao */,
                             token VARCHAR(80),
                             token_expira_em TIMESTAMP /* tokenExpiraEm */,
                             token_usado_em TIMESTAMP /* tokenUsadoEm */,
                             usuario UUID NOT NULL,
                             hemocentro UUID,
                             ext JSONB
);


/* Creating index for customization column */
create index agendamento_ext on agendamento using gin (ext);

/* Entity Doacao */
create table doacao (
                        id UUID NOT NULL,
                        data_hora_confirmacao TIMESTAMP NOT NULL /* dataHoraConfirmacao */,
                        responsavel_validacao VARCHAR(55) /* responsavelValidacao */,
                        usuario UUID,
                        hemocentro UUID,
                        agendamento UUID NOT NULL,
                        tipo_sangue VARCHAR(255) NOT NULL /* tipoSangue */,
                        fator_rh VARCHAR(255) NOT NULL /* fatorRh */,
                        ext JSONB
);


/* Creating index for customization column */
create index doacao_ext on doacao using gin (ext);

/* Entity Estoque */
create table estoque (
                         id UUID NOT NULL,
                         tipo_sangue VARCHAR(255) NOT NULL /* tipoSangue */,
                         fator_rh VARCHAR(255) NOT NULL /* fatorRh */,
                         quantidade_ml NUMERIC(19) NOT NULL /* quantidadeMl */,
                         minimo_ml NUMERIC(19) NOT NULL /* minimoMl */,
                         data_atualizacao TIMESTAMP NOT NULL /* dataAtualizacao */,
                         hemocentro UUID,
                         ext JSONB
);


/* Creating index for customization column */
create index estoque_ext on estoque using gin (ext);

/* Join Tables */
/* master: Usuario as usuario, detail: Doacao as doacao */
create table usuario_doacoes (
                                 usuario_id UUID NOT NULL,
                                 doacoes_id UUID NOT NULL
);

/* master: Hemocentro as hemocentro, detail: Agendamento as agendamento */
create table hemocentro_agendamentos (
                                         hemocentro_id UUID NOT NULL,
                                         agendamentos_id UUID NOT NULL
);

/* master: Hemocentro as hemocentro, detail: Doacao as doacao */
create table hemocentro_doacoes (
                                    hemocentro_id UUID NOT NULL,
                                    doacoes_id UUID NOT NULL
);

/* master: Hemocentro as hemocentro, detail: Estoque as estoque */
create table hemocentro_estoques (
                                     hemocentro_id UUID NOT NULL,
                                     estoques_id UUID NOT NULL
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
alter table usuario_doacoes add constraint fkxj3nsfwspdavniedt2pzzshplxim foreign key (usuario_id) references usuario (id);
alter table usuario_doacoes add constraint fkauuyd4henv4wpjhsb6qq8kmlnufq foreign key (doacoes_id) references doacao (id);
alter table hemocentro_agendamentos add constraint fk8dpxfmcwd2f0fjl0qdmxh0twcmvb foreign key (hemocentro_id) references hemocentro (id);
alter table hemocentro_agendamentos add constraint fki1msspgvecosfe0glteu5b74sxuc foreign key (agendamentos_id) references agendamento (id);
alter table hemocentro_doacoes add constraint fkm5iofbrzanjjdhauhbfs70s4tto5 foreign key (hemocentro_id) references hemocentro (id);
alter table hemocentro_doacoes add constraint fkdmnp6vajnr4rhzdgtblokrgnd3iv foreign key (doacoes_id) references doacao (id);
alter table hemocentro_estoques add constraint fkgozg27tzslj6vbfvd1t6aafirkom foreign key (hemocentro_id) references hemocentro (id);
alter table hemocentro_estoques add constraint fkr0uivxwav2jxc3zy1bvk5twch0s6 foreign key (estoques_id) references estoque (id);
alter table agendamento add constraint fkdxtpy04umr87ftzyubbo8tyynpnf foreign key (usuario) references usuario (id);
alter table agendamento add constraint fkl0blhbdrjpmvkh78ozlwxdaiq9nz foreign key (hemocentro) references hemocentro (id);
alter table doacao add constraint fkgn6adv1po7h9rrq2aw3ebdc3apwq foreign key (usuario) references usuario (id);
alter table doacao add constraint fkkhyvlbedta26tcp0l7lqm2t4jpip foreign key (hemocentro) references hemocentro (id);
alter table doacao add constraint fkhc3osa2zwl6d9xppyarz50lal9he foreign key (agendamento) references agendamento (id);
alter table estoque add constraint fkrsjdof8fn7llufq5kdp5egk7ocjo foreign key (hemocentro) references hemocentro (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
