### Java Microservices Architecture – Spring Cloud Ecosystem

---
Projeto backend completo desenvolvido com Java 17 + Spring Boot + Spring Cloud, implementando uma arquitetura de microsserviços distribuídos com foco em escalabilidade, segurança e boas práticas adotadas em ambientes corporativos.

---


## O sistema inclui:

*  **Service Discovery (Eureka)**

*  **Configuração centralizada (Spring Cloud Config)**

*  **API Gateway (Zuul)**

*  **Autenticação e Autorização com OAuth2 + JWT**

*  **Comunicação entre microsserviços**

*  **Configurações externas via Git Submodule**

---

## Arquitetura

O projeto simula um ecossistema distribuído real, com separação clara de responsabilidades.

                    ┌────────────────────┐
                    │   Config Server     │
                    └─────────▲──────────┘
                              │
                    ┌─────────┴──────────┐
                    │   Eureka Server     │
                    └─────────▲──────────┘
                              │
                    ┌─────────┴──────────┐
                    │   API Gateway       │
                    │      (Zuul)         │
                    └───────▲───────▲────┘
                            │       │
          ┌─────────────────┘       └─────────────────┐
          │                                           │
   ┌─────────────┐                           ┌─────────────┐
   │ hr-user     │                           │ hr-worker   │
   └─────────────┘                           └─────────────┘
                                                    ▲
                                                    │
                                            ┌─────────────┐
                                            │ hr-payroll  │
                                            └─────────────┘

                   ┌──────────────┐
                   │  hr-oauth    │
                   └──────────────┘

                   

*  **Tecnologias Utilizadas**

---

## Backend

Java 17

Spring Boot

Spring Cloud

Spring Security

OAuth2

JWT

## Infraestrutura

Maven

Git

Git Submodules

Configuração centralizada via Spring Cloud Config


## Microsserviços

🔹 hr-eureka-server

Responsável pelo Service Discovery, permitindo que os serviços se registrem e se descubram dinamicamente.

🔹 hr-config-server

Servidor de configuração centralizada que consome o repositório ms-configs.

Permite:

Externalização de propriedades

Mudança de configuração sem recompilação

Centralização de ambientes

🔹 hr-api-gateway-zuul

API Gateway responsável por:

Roteamento dinâmico

Filtro de requisições

Segurança centralizada

Validação de JWT

🔹 hr-oauth

Serviço responsável por:

Autenticação de usuários

Emissão de tokens JWT

Validação de credenciais

Integração com Spring Security OAuth2

🔹 hr-user

Microsserviço de usuários:

CRUD de usuários

Persistência em banco de dados

Integração com autenticação

🔹 hr-worker

Microsserviço de domínio utilizado para simulação de entidade de negócio.

🔹 hr-payroll

Microsserviço responsável por regras de cálculo de folha de pagamento, demonstrando:

Comunicação entre microsserviços

Uso de Feign Client

Resiliência

🔹 ms-configs

Repositório externo de configurações adicionado como Git Submodule, utilizado pelo Config Server.

## Segurança

A arquitetura implementa um fluxo completo de autenticação e autorização:

Usuário realiza login no hr-oauth

Serviço gera um JWT Token

Token é validado pelo API Gateway

Microsserviços autorizam requisições com base no token

Características:

Tokens assinados

Stateless authentication

Controle de acesso centralizado

▶️ Como Executar o Projeto
✅ Pré-requisitos

Java 17+

Maven

Git

📌 Ordem de Inicialização

1️⃣ Iniciar hr-eureka-server
2️⃣ Iniciar hr-config-server
3️⃣ Iniciar hr-oauth
4️⃣ Iniciar hr-user, hr-worker, hr-payroll
5️⃣ Iniciar hr-api-gateway-zuul

🎯 Objetivos Técnicos

Este projeto demonstra:

Arquitetura de microsserviços real

Padrões de sistemas distribuídos

Comunicação entre serviços

Centralização de configurações

Segurança baseada em token

Aplicação prática de Spring Cloud


## Autor

João Miquelino
Backend Developer | Java • Spring Boot • Microsservices

🔗 LinkedIn: https://www.linkedin.com/in/joão-miquelino-95ba34202

🔗 GitHub: https://github.com/miqueelino
