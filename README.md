# 📚 Bookstore API Manager

O **Bookstore API Manager** é uma aplicação desenvolvida em **Spring Boot** com o objetivo de disponibilizar uma **API REST** para o **cadastro e gerenciamento de livros** em uma livraria.

Este projeto foi criado como base do curso introdutório sobre **Spring Boot**, publicado na **Udemy** em **abril de 2020**.

---

## 🚀 Funcionalidades

- 📖 Cadastro de livros
- 🔍 Consulta de livros por ID
- 🧩 Estrutura baseada em arquitetura REST
- ☁️ Deploy do sistema na nuvem com Render

---

## 🧠 Conceitos abordados

Durante o desenvolvimento deste projeto, foram explorados os seguintes tópicos:

- ⚙️ **Setup inicial** do projeto com o [Spring Boot Initializr](https://start.spring.io/)
- 🗃️ **Mapeamento de entidades** no banco de dados
- 🧱 **Desenvolvimento das operações CRUD** (Create e Read)
- 🌐 **Conceitos REST** e sua aplicação nas operações da API
- ☁️ **Implantação do sistema** na nuvem utilizando o [Render](https://render.com)

---

## 🧩 Tecnologias utilizadas

- ☕ **Java 21**
- 🌱 **Spring Boot**
- 🧰 **Maven 3.6.3+**
- 🧑‍💻 **IntelliJ IDEA** (ou IDE de sua preferência)
- 🐘 **PostgreSQL** (pode ser adaptado)
- 🔗 **Git / GitHub**
- 🧪 **Postman** (para testes de integração)
- ☁️ **Render** (para deploy)

---

## 💻 Como executar o projeto

### 🔧 Pré-requisitos

Antes de começar, verifique se possui os seguintes itens instalados:

- [Java 21+](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html)
- [Maven 3.6.3+](https://maven.apache.org/download.cgi)
- [Git](https://git-scm.com/)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/) ou outra IDE de sua preferência
- [Postman](https://www.postman.com/)

---

### ▶️ Executando a aplicação localmente

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/bookstore-api-manager.git

2. Clone o repositório:
    ```bash
    cd bookstore-api-manager

3. Execute o comando Maven:
    ```bash
   mvn spring-boot:run

4. Após a execução, abra no navegador:
    ```bash
    http://localhost:8080/api/v1/books

## ☁️ Deploy na nuvem (Render)

O projeto está implantado na plataforma Render, acessível através do link:

👉 https://book-store-manager-4uz3.onrender.com/api/v1/books

## 🧪 Testes com Postman

Você pode testar os endpoints diretamente pelo Postman:

- **GET** → /api/v1/books — Lista todos os livros

- **GET** → /api/v1/books/{id} — Busca um livro pelo ID

- **POST** → /api/v1/books — Cadastra um novo livro

🧑‍🏫 Autor

## Raphael Fortunato Rodrigues das Neves
•🌐 [LinkedIn](https://www.linkedin.com/in/raphael-fortunato-developer/)


📝 Licença

Este projeto é distribuído sob a licença MIT.
Sinta-se à vontade para usar, estudar e aprimorar o código! 🚀