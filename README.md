# Hemo+

Sistema web para facilitar o agendamento de doações de sangue, a localização de hemocentros e o acompanhamento de estoque por tipo sanguíneo.

## Sobre o projeto

O **Hemo+** surgiu com a proposta de tornar o processo de doação de sangue mais simples, acessível e organizado. Muitas vezes, quem deseja doar encontra dificuldade para localizar um hemocentro, verificar disponibilidade ou realizar um agendamento de forma rápida.

Pensando nisso, o sistema foi desenvolvido para conectar doadores e hemocentros em uma única plataforma, permitindo:

- cadastro e autenticação de usuários;
- localização de hemocentros;
- visualização em mapa;
- agendamento de doações;
- acompanhamento do histórico do usuário;
- gerenciamento administrativo de hemocentros, agendamentos e estoque de sangue.

Além da experiência do doador, o projeto também possui uma área administrativa para apoiar a gestão interna, com dashboards e indicadores relevantes para acompanhamento do sistema.

## Objetivo

O objetivo do Hemo+ é **facilitar o processo de doação de sangue por meio de uma plataforma web intuitiva**, promovendo mais organização no agendamento, maior visibilidade dos hemocentros e melhor apoio à gestão do estoque sanguíneo.

## Problema que o sistema busca resolver

A doação de sangue é essencial para salvar vidas, porém o processo de encontrar um local para doar e agendar uma visita ainda pode ser pouco prático. Em muitos casos, faltam informações centralizadas sobre hemocentros, disponibilidade e controle de estoque.

O Hemo+ busca resolver esse problema oferecendo uma solução digital que:

- aproxima o doador dos hemocentros;
- simplifica o agendamento;
- melhora a organização dos atendimentos;
- auxilia no controle de estoque por tipo sanguíneo;
- fornece dados administrativos para tomada de decisão.

## Funcionalidades principais

### Área do usuário

- Cadastro e login
- Edição de perfil
- Visualização de hemocentros disponíveis
- Busca de hemocentros por localização
- Exibição de hemocentros em mapa
- Agendamento de doação
- Consulta dos próprios agendamentos
- Cancelamento de agendamentos
- Visualização de informações de estoque

### Área administrativa

- Cadastro e gerenciamento de hemocentros
- Gerenciamento de usuários
- Controle de estoque sanguíneo
- Ajuste de quantidade por tipo sanguíneo
- Dashboard administrativo de agendamentos
- Dashboard administrativo de estoque
- Indicadores e métricas para acompanhamento
- Visualização de alertas de estoque crítico

## Tecnologias utilizadas

### Front-end

- Angular
- TypeScript
- HTML
- SCSS
- Leaflet
- OpenStreetMap

### Back-end

- Java
- Senior X
- Spring / estrutura de serviços
- SDL / EDL
- Flyway
- PostgreSQL

### Outros recursos

- Integração com APIs de geolocalização
- Versionamento com Git e GitHub/GitLab
- Organização por camadas (componentes, services, models, entidades, handlers)

## Estrutura do sistema

O projeto foi dividido em duas partes principais:

### Front-end

Responsável pela interface do usuário, navegação, formulários, dashboards e mapa interativo.

### Back-end

Responsável pelas regras de negócio, persistência de dados, validações, autenticação, consultas e integrações com banco de dados.

## Entidades principais

O sistema foi construído com base em entidades que representam o domínio da aplicação:

- **Usuário**: responsável pelo acesso ao sistema e realização de agendamentos
- **Hemocentro**: representa os locais de doação cadastrados
- **Agendamento**: registra a intenção de doação com data, horário e status
- **Doação**: representa o comparecimento e confirmação da doação
- **Estoque**: controla a quantidade de sangue disponível por tipo sanguíneo
- **Endereço / localização**: utilizado para mapa e busca geográfica

Também foram utilizadas enums e estruturas auxiliares, como:

- tipo sanguíneo;
- fator RH;
- status do agendamento;
- tipo de usuário.

## Diferenciais do projeto

- Interface moderna e intuitiva
- Uso de mapa para exibir hemocentros
- Controle administrativo com dashboards
- Organização do fluxo de agendamento
- Apoio visual ao controle de estoque sanguíneo
- Aplicação de conceitos reais de desenvolvimento full stack

## Telas do sistema

Entre as principais telas desenvolvidas, estão:

- Home
- Login e cadastro
- Perfil do usuário
- Lista de hemocentros
- Mapa de hemocentros
- Novo agendamento
- Meus agendamentos
- Dashboard administrativo de estoque
- Dashboard administrativo de agendamentos

## Como executar o projeto

### Pré-requisitos

Antes de iniciar, é necessário ter instalado:

- Node.js
- Angular CLI
- Java
- PostgreSQL
- Git

### Executando o front-end

```bash
cd hemo-plus-web
npm install
ng serve
```

A aplicação estará disponível em:

`http://localhost:4200`

### Executando o back-end

> Ajuste esta seção conforme a estrutura real do teu projeto SeniorX.

Passos gerais:

1. Configurar o banco de dados PostgreSQL
2. Ajustar as variáveis de ambiente e conexão
3. Executar as migrations com Flyway
4. Subir o serviço back-end

Exemplo de configuração esperada:

- schema do banco
- credenciais de acesso
- porta da aplicação
- domínio e serviço do SeniorX

## Banco de dados

O sistema utiliza **PostgreSQL** como banco de dados relacional, com versionamento de estrutura por meio do **Flyway**, garantindo controle das migrations e evolução segura do projeto.

## Organização do código

### Front-end

A estrutura do front-end foi organizada em módulos e camadas como:

- `core`
- `features`
- `shared`
- `services`
- `models`
- `auth`

### Back-end

A estrutura do back-end foi organizada com foco em:

- entidades
- services
- repositories
- handlers
- queries
- validações
- migrations

## Aprendizados com o projeto

Durante o desenvolvimento do Hemo+, foram aplicados conhecimentos importantes de desenvolvimento web full stack, como:

- modelagem de sistema
- criação de entidades e relacionamentos
- construção de APIs
- integração entre front-end e back-end
- manipulação de mapas e geolocalização
- controle de estado na interface
- criação de dashboards
- versionamento de banco com Flyway
- organização visual e experiência do usuário

Além disso, o projeto também contribuiu para o desenvolvimento de habilidades em arquitetura de software, design de interface e resolução de problemas reais.

## Status do projeto

🚧 Projeto em desenvolvimento / evolução acadêmica

## Possíveis melhorias futuras

- Notificações automáticas para agendamentos
- Filtros avançados por localização
- Relatórios administrativos mais completos
- Histórico detalhado de doações
- Integração com campanhas de doação
- Melhorias de acessibilidade e responsividade
- Exportação de relatórios

Projeto desenvolvido para fins acadêmicos, com foco em aprendizagem prática de desenvolvimento de sistemas web e mobile.

Este projeto foi desenvolvido para fins acadêmicos e educacionais.
