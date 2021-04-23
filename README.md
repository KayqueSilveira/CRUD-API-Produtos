# API-cliente

Componentizacao API de tratamento sobre cadastro de clientes com uma lista de produtos. Ao passar um ID do produto, vai por integração externa ao produto, e no retorno, guarda na base local.

Tecnologias:

* SpringBoot
* JPA e SpringData
* OpenFeign

## Executar a aplicação

Para rodar a aplicação na sua IDE, execute a classe main CadApplication.

Ao subir pode-se acessar:

```
Para verificar todos os clientes:
http://localhost:8080/cliente
Para verificar a lista de favoritos dos clientes:
http//localhost:8080/cliente/favoritos
```

## Documentação API

Esta disponivel o seguinte doc

```
JSON: http://localhost:8080/products/<NumeroDaPagina>/
o numero da pagina de produtos vai de 1 até 100
```

## Banco de Dados

Foi utilizado o banco MySQL. Para acessar o console:

```
Usuario: root
Senha: 210713
Banco: jdbc:mysql://localhost:3306/magalucliente
```

## Testes

Foi decido que os testes serão unitarios e ocorrerão na camada Controller e Service (regras) ao mesmo tempo, mockando o necessário.