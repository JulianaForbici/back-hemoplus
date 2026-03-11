# Hemo+ 🩸 (SeniorX)

Plataforma para **agendamento de doação de sangue**, com **consulta de hemocentros**, **visualização de estoques por tipo sanguíneo** e **fluxo de validação de doação**.  
Projeto desenvolvido no GoDev com **SeniorX** (back-end) + **Angular** (front-end).

---

## Visão geral

O **Hemo+** facilita o processo de doação:
- o usuário encontra hemocentros no **mapa**,
- verifica o **estoque** por tipo sanguíneo,
- agenda a doação (data/horário),
- e acompanha o status do agendamento.

No lado administrativo, o sistema permite:
- gerenciar e ajustar **estoques**,
- acompanhar **agendamentos** e status,
- validar doações (ex.: por token/atendimento) e refletir no estoque.

---

## Funcionalidades

### Usuário (público)
- Login/registro
- Listagem de hemocentros ativos
- Mapa com hemocentros e localização do usuário (Leaflet)
- Estoque por hemocentro (cards por tipo sanguíneo + status visual)
- Criar agendamento e consultar “Meus agendamentos”

### Admin
- Dashboard/visão administrativa (agendamentos e/ou estoque)
- Ajuste de estoque por hemocentro (modal/fluxo com busca)
- Validação de doação (impacta estoque e gera retorno/mensagem)

---

## Stack / Tecnologias

### Back-end (SeniorX)
- Java (serviços/handlers do SeniorX)
- PostgreSQL
- Flyway (migrations + seed)
- TranslationHub 
- REST via Bridge

### Front-end
- Angular
- SCSS 
- RxJS
- Leaflet + OpenStreetMap
- Integração de CEP (ex.: ViaCEP) para geolocalização 
---

## Entidades principais

- **Usuario**
- **Hemocentro**
- **Agendamento**
- **Doacao**
- **Estoque**
---