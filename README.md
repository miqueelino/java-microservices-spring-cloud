#  Microservices Architecture – Spring Cloud

Projeto backend desenvolvido em **Java** utilizando **Spring Boot** e **Spring Cloud**, com arquitetura de **microsserviços**, focado em autenticação, descoberta de serviços, gateway e configuração centralizada.

Este projeto tem como objetivo demonstrar, na prática, a construção de um ecossistema distribuído seguindo boas práticas de backend, segurança e escalabilidade, próximo a cenários reais de empresas e ambientes corporativos.

---

## 🛠️ Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **Spring Cloud**
  - Eureka Server (Service Discovery)
  - Spring Cloud Config (Config Server)
  - Zuul API Gateway
- **Spring Security**
- **OAuth2**
- **JWT (JSON Web Token)**
- **Maven**
- **Git / Git Submodules**

---

## 🧱 Arquitetura do Projeto

O sistema é composto pelos seguintes microsserviços:

### 🔹 `hr-eureka-server`
Servidor de descoberta de serviços (**Service Registry**), responsável por registrar e localizar os microsserviços da aplicação.

---

### 🔹 `hr-config-server`
Servidor de configuração centralizada (**Spring Cloud Config**), responsável por fornecer configurações externas para os microsserviços, consumindo um repositório Git (`ms-configs`).

---

### 🔹 `hr-api-gateway-zuul`
API Gateway responsável por:
- Roteamento de requisições
- Centralização de autenticação e autorização
- Integração com OAuth2 e JWT

---

### 🔹 `hr-oauth`
Serviço de autenticação e autorização:
- Login de usuários
- Emissão de **JWT Tokens**
- Validação de tokens
- Integração com Spring Security OAuth2

---

### 🔹 `hr-user`
Microsserviço responsável pelo gerenciamento de usuários:
- Persistência de usuários
- Endpoints REST
- Integração com autenticação e autorização

---

### 🔹 `hr-worker`
Microsserviço de domínio utilizado como exemplo de serviço de negócio, configurado para consumir configurações externas via Config Server.

---

### 🔹 `hr-payroll`
Microsserviço responsável por regras de negócio relacionadas à folha de pagamento, demonstrando comunicação entre microsserviços.

---

### 🔹 `ms-configs`
Repositório de configurações externas utilizado pelo **Config Server**, adicionado ao projeto como **Git Submodule**.

---

## 🔐 Segurança

- Autenticação baseada em **OAuth2**
- Autorização utilizando **JWT**
- Controle de acesso centralizado via **API Gateway**
- Tokens assinados e validados entre microsserviços

---

## ▶️ Como Executar o Projeto

### Pré-requisitos

- Java 17 ou superior
- Maven
- Git

---

