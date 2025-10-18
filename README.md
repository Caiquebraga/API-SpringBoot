# 🚀 API REST com Java e Spring Boot

Este projeto é uma **API RESTful** desenvolvida em **Java 17** utilizando o **Spring Boot**, seguindo boas práticas de arquitetura em camadas (Controller, Service, Repository, DTO, Mapper e Exception Handling).

---

## 🧰 Stack Tecnológica

### 🔹 Backend
- ☕ **Java 17**
- 🌱 **Spring Boot 3**
  - `spring-boot-starter-web` — para criação da API REST  
  - `spring-boot-starter-data-jpa` — para persistência com JPA/Hibernate  
  - `spring-boot-starter-validation` — para validações de dados  
  - `spring-boot-starter-test` — para testes automatizados  
  - `lombok` — para reduzir boilerplate  
- 🗄️ **Banco de dados:** H2 (memória) ou MySQL  
- 📦 **Maven** — build e gerenciamento de dependências

---
## Exemplo de requisição POST:
curl -X POST http://localhost:8080/api/companies \
     -H "Content-Type: application/json" \
     -d '{"name": "SEOAI", "email": "contato@seoai.com"}'
     
## 🏗️ Estrutura do Projeto

```text
src/
 └── main/
     └── java/com/seoai/company
         ├── common/exception   # Tratamento de erros e exceções personalizadas
         ├── controller         # Endpoints REST da aplicação
         ├── dto                # Objetos de transferência de dados (Data Transfer Objects)
         ├── entity             # Entidades do domínio (mapeadas para o banco)
         ├── mapper             # Conversão entre entidades e DTOs
         ├── repository         # Interfaces de persistência (JPA)
         └── service            # Regras de negócio da aplicação



