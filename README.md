# Brewpub API

Java RESTful API criada para Negócios Cervejeiros!

## Principais Tecnologias
 - **Java 17**
 - **Spring Boot 3**
 - **Spring Data JPA**
 - **OpenAPI (Swagger)**

## Diagrama de Classes (Domínio da API)

```mermaid
classDiagram
  class Cliente {
    -Number id
    -String nome
    -Cervejas cervejas
  }

  class Cervejas {
    -Number id
    -String estilo
  }

  class ClienteService {
    -ClienteRepository clienteRepository
  }
  
  class ClienteController {
    -ClienteService clienteService 
  } 

  Cliente "1" *-- "1..*" Cervejas
  ClienteService <-- ClienteRepository
  ClienteController <-- ClienteService
  Cliente --> ClienteController
```

## IMPORTANTE

Projeto criado para disponibilizar uma API local, sendo possível salvar (método HTTP POST) e buscar (método HTTP GET) utilizando a interface prática do Swagger através da URL:

### [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)
