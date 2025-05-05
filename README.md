# Cadastro de Pessoas com Endereços

Projeto Java standalone com JPA (Hibernate) e PostgreSQL para realizar operações CRUD de pessoas e seus endereços (relação 1:N). A persistência é gerenciada via `persistence.xml` e utiliza Maven para gerenciamento de dependências.

## 🧰 Tecnologias Utilizadas

- Java 17
- Maven
- Jakarta EE (JPA, EJB, JSF)
- Hibernate
- PostgreSQL
- PrimeFaces
- Apache Tomcat 10+

## 📘 Funcionalidades

- Criar uma pessoa com múltiplos endereços
- Listar todas as pessoas e seus endereços
- Buscar pessoa por ID
- Atualizar nome ou endereços
- Remover pessoa (e seus endereços em cascata)

## 🗃️ Banco de Dados

O projeto usa **PostgreSQL**. Certifique-se de que você tenha um banco chamado `usuarios` criado:

```sql
CREATE DATABASE usuarios;
🖥️ Executando o Projeto

Instale o PostgreSQL e crie o banco usuarios.

Atualize o persistence.xml com usuário/senha do seu banco.

Compile o projeto com:

bash
Copiar
Editar
mvn clean package
Gere o .war e implante no Apache Tomcat (webapps/).

Acesse no navegador:

bash
Copiar
Editar
http://localhost:8080/nome-do-projeto/pessoa.xhtml

1️⃣ Clone the repository:

https://github.com/JacquelineCasali/desafio-cadastro-pessoa

## 📝 Author / Autor
Jacqueline Casali