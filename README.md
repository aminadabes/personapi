# **Desenvolvendo um sistema de gerenciamento de pessoas em API REST com Spring Boot**

O desafio foi desenvolver um pequeno sistema para o gerenciamento de pessoas de uma empresa através de uma API REST, criada com o Spring Boot.

### **Setup inicial do projeto com o Spring Boot Initializr:**

#### **- Spring Web WEB**

Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.

#### **- Lombok DEVELOPER TOOLS**

Java annotation library which helps to reduce boilerplate code.

#### **- Spring Boot DevTools DEVELOPER TOOLS**

Provides fast application restarts, LiveReload, and configurations for enhanced development experience.

#### **- Spring Data JPA SQL**

Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.

#### **- H2 Database SQL**

Provides a fast in-memory database that supports JDBC API and R2DBC access, with a small (2mb) footprint. Supports embedded and server modes as well as a browser based console application.

#### **- Spring Boot Actuator OPS**

Supports built in (or custom) endpoints that let you monitor and manage your application - such as application health, metrics, sessions, etc.

### Pré-requisitos para a execução do projeto:

Java 11 ou versões superiores. Utilizado o **[SDKMan] <https://sdkman.io/>** para gerenciamento e instalação do Java e Maven
Maven 3.6.3 ou versões superiores.

Controle de versão GIT instalado na sua máquina.</br>
Conta no GitHub para o armazenamento do seu projeto na nuvem.</br>
Conta no Heroku para o deploy do projeto na nuvem</br>
Para testar as funcionalidades dos métodos HTTP, foi usado o postman.

### **O que fiz no arquivo application.properties?** 
Criei três arquivos application.properties: 
* application.properties - nessa escolho qual banco vou conectar
* application-h2.properties - banco de teste não guarda nada em memória
* application-mysql.properties
* application-postgresql.properties


### Descrição das atividades

 - Criação de modelo de dados para o mapeamento de entidades em bancos de dados.
 - Desenvolvimento de operações de gerenciamento de usuários, como:
   Cadastro e atualização, listagem e busca de pessoas e remoção de pessoas de um sistema.
 - Relação de cada uma das operações acima com o padrão arquitetural REST.
 - Desenvolvimento de testes unitários para validação das funcionalidades **por fazer**
 - Implantação do sistema na nuvem através do Heroku

Para executar o projeto no terminal, digite o seguinte comando:

`mvn spring-boot:run`

Após executar o comando acima, basta apenas abrir o seguinte endereço no navegador e visualizar a execução do projeto:

<http://localhost:8080/api/v1/people>

