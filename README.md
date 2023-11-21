# <h1 align="center">Biblioteca :books: </h1>
<br />

### Descrição: 
Nesse projeto, criado na Universidade São Francisco na matéria de Programação orientada a objetos, será apresentado uma estrutura capaz de realizar o lançamento, atualizar e deletar um objeto, nesse caso, o objeto será um livro.
<br /> <br />

### Vídeo de apresentação:
[Link](https://drive.google.com/file/d/1U4z3_XLzhxYJspIoh6XVKDBjR-zLvY2o/view)
<br /> <br />

### Nomes dos desenvolvedores:
Gabriel Guilherme Gutierre RA: 202111615 <br />
João Vitor Silva RA: 202114022 <br />
<br />

### Tecnologias empregadas:
Java: A linguagem de programação Java é a base do projeto. Ela é uma linguagem robusta e versátil, que pode ser usada para criar aplicações para diversos sistemas operacionais. <br />
Crud: O CRUD é um conjunto de operações básicas para manipular dados em um banco de dados. Ele permite criar, ler, atualizar e excluir registros.
<br /> <br />

### Descrição da arquitetura:

1. *Model (Modelo):* <br />
   - A classe Livro atua como o modelo de dados, representando a entidade "Livro" que é armazenada no banco de dados. <br />
    
2. *View (Visualização):* <br />
   - Não há uma camada de visualização explícita no código fornecido. Em aplicações Spring Boot, a visualização muitas vezes é implementada usando templates (por exemplo, Thymeleaf) ou retornando JSON para ser consumido por uma interface de usuário front-end. <br />

3. *Controller (Controlador):* <br />
   - A classe LivroController funciona como o controlador da aplicação. Ele recebe requisições HTTP, interage com o modelo (usando LivroRepository para acessar o banco de dados) e retorna os resultados (por exemplo, uma lista de livros, um livro recém-adicionado, etc.). <br />

4. *Repository (Repositório):* <br />
   - A interface LivroRepository estende JpaRepository do Spring Data JPA, fornecendo métodos para operações de acesso a dados relacionados à entidade Livro. Ela age como um repositório de dados, permitindo interações com o banco de dados de forma simplificada. <br />

5. *BibliotecaApplication (Aplicação):* <br />
   - A classe BibliotecaApplication é a classe principal que inicia a aplicação Spring Boot. Ela contém o método main, que é o ponto de entrada da aplicação.

<br /> <br />

### Funcionalidade:
Foi criado um sistema backend capaz de realizar a leitura dos livros presentes no banco de dados, adicionar, atualizar e também excluir caso seja necessário.
