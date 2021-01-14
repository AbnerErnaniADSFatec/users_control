# API Spring Boot RESTful

[![Docker](https://img.shields.io/badge/docker-latest-green)](https://www.docker.com/)
[![Postgres](https://img.shields.io/badge/postgres-latest-green)](https://www.postgresql.org/)


Construindo a base da aplicação com o gerenciador de containers docker, onde baixar a imagem docker para o banco de dados Postgres;

## Docker

Para começar a desenvolver nossa API, precisamos configurar um banco de dados. Nesta etapa vamos utilizar o Sistema Gerenciador de Banco de Dados PostgreSQL hospedado em um container Docker.

Com o [**Docker**](https://www.docker.com/) instalado, vamos baixar a imagem docker do banco de dados Postgres:

```
docker pull postgres
```

Vamos executar um container com esta imagem com o seguinte comando:

```
docker run --name postgresql -p 5480:5432 -e POSTGRES_PASSWORD=postgres -d postgres
```

Verifique se o container está rodando na porta selecionada, com o comando:

```
docker ps
```

Este comando deve gerar uma saída parecida com esta:

```
CONTAINER ID        IMAGE               COMMAND                  CREATED             STATUS              PORTS                    NAMES
b47947e7ba5e        postgres            "docker-entrypoint.s…"   6 seconds ago       Up 2 seconds        0.0.0.0:5480->5432/tcp   postgresql
```

## PostgreSQL

**Under development**


> **Obs.: Todos os comandos e tecnologias são explicados nos [vídeos no youtube](https://www.youtube.com/playlist?list=PLyBgv5rSdkMYgPsmDJg-6sgh4UmmSmnOd).**