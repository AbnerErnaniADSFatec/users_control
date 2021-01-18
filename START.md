# API Spring Boot RESTful

[![Java](https://img.shields.io/badge/java-8-green)](https://www.java.com/)
[![SpringBoot](https://img.shields.io/badge/spring-latest-green)](https://spring.io/)
[![Gradle](https://img.shields.io/badge/gradle-5+-green)](https://gradle.org/)

Chegando aqui, nós vamos levar em conta que você já executou todos os comandos para a configuração do banco de dados, e o seu docker está hospedando um container com este banco de dados, sendo que você já importou as tabelas e os dados que você quer editar.

## Gradle

Para começar a configuração inicial da nossa aplicação vamos executar o seguinte comando na pasta root do seu projeto. Por exemplo se você só deu clone neste projeto, não será necessário, mas para criar novo, é necessário criar uma pasta com o nome de sua preferência e abrir o terminal ou cmd:

```
gradle init
```

Um menu de opções deve abrir em resposta para a escolha da linguagem e do tipo da nossa aplicação:

```
Starting a Gradle Daemon, 1 incompatible and 1 stopped Daemons could not be reused, use --status for details

Select type of project to generate:
  1: basic
  2: cpp-application
  3: cpp-library
  4: groovy-application
  5: groovy-library
  6: java-application
  7: java-library
  8: kotlin-application
  9: kotlin-library
  10: scala-library
Enter selection (default: basic) [1..10]
```

Como queremos uma aplicação em Java vamos para a opção `java-application` número 6, a partir daqui outro menu deve se abrir com as opções para linguagem de build:

```
Select build script DSL:
  1: groovy
  2: kotlin
Enter selection (default: groovy) [1..2]
```

Vamos ecolher a opção 1, pois estamos desenvolvendo um aplicação em Java, e o groovy é uma linguagem de programação orientada a objetos para a plataforma Java, após isso outro menu irá se abrir para a escolha do framework de testes em Java:

```
Select test framework:
  1: junit
  2: testng
  3: spock
Enter selection (default: junit) [1..3]
```

Por questão de gosto e de uso, vamos escolher o JUnit, após esta escolha você poderá decidir qual será o nome do projeto, eu prefiro deixar por padrão, pelo nome da pasta em que você está executando o comando, é só digitar `ENTER` como resposta:

```
Project name (default: test): => (ENTER)
Source package (default: test): => (ENTER)
```

Bom se você pegou uma resposta parecida com a de baixo, parece que tudo ocorreu bem!

```
BUILD SUCCESSFUL in 27m 10s
2 actionable tasks: 2 executed
```

Mas vamos testar mesmo assim! Para isso ainda na linha de comando na pasta onde você criou seu projeto, vamos executar o seguinte comando:

```
gradle run
```

E mais uma vez, se você obteve um `hello world` como resposta tudo ocorreu bem!

```

> Task :run
Hello world.

BUILD SUCCESSFUL in 2s
2 actionable tasks: 2 executed
```

## Spring Boot

**UNDER DEVELOPMENT**
