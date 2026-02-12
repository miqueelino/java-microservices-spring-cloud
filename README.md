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


```
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
```

##  Tecnologias

### 🔹 Backend

* Java 17  
* Spring Boot  
* Spring Cloud  
* Spring Security  
* OAuth2  
* JWT  

### 🔹 Infraestrutura

* Maven  
* Git  
* Git Submodules  

---

##  Microsserviços

* **hr-eureka-server** – Service Discovery  
* **hr-config-server** – Configuração centralizada  
* **hr-api-gateway-zuul** – Roteamento e segurança  
* **hr-oauth** – Autenticação e emissão de JWT  
* **hr-user** – Gestão de usuários  
* **hr-worker** – Serviço de domínio  
* **hr-payroll** – Comunicação entre serviços (Feign Client)  
* **ms-configs** – Repositório externo de configurações  

---

##  Segurança

### 🔹 Fluxo implementado

1. Login via `hr-oauth`  
2. Geração de JWT  
3. Validação no API Gateway  
4. Autorização entre microsserviços  

### 🔹 Características

* Stateless authentication  
* Tokens assinados  
* Segurança centralizada  

---

##  Execução

###  Pré-requisitos

* Java 17+
* Maven
* Git

###  Ordem de inicialização

1. `hr-eureka-server`  
2. `hr-config-server`  
3. `hr-oauth`  
4. `hr-user`, `hr-worker`, `hr-payroll`  
5. `hr-api-gateway-zuul`  

---

##  Objetivo

Demonstrar domínio de:

* Arquitetura de microsserviços  
* Comunicação entre serviços  
* Segurança com OAuth2 + JWT  
* Ecossistema Spring Cloud
* 
---


## Autor

João Miquelino
Backend Developer | Java • Spring Boot • Microsservices

LinkedIn: https://www.linkedin.com/in/joão-miquelino-95ba34202

GitHub: https://github.com/miqueelino
