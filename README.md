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
   - A classe Livro representa um livro, com atributos como título, autor e ano de publicação. Ela é armazenada no banco de dados. <br />
    
2. *View (Visualização):* <br />
   - A visualização é responsável por apresentar os dados ao usuário. Em aplicações Spring Boot, ela pode ser implementada usando templates ou retornando JSON. <br />

3. *Controller (Controlador):* <br />
   - O controlador recebe requisições HTTP do usuário e as processa. Ele interage com o modelo para acessar os dados e retorna os resultados ao usuário. <br />

4. *Repository (Repositório):* <br />
   - O repositório é responsável por acessar os dados no banco de dados. Ele fornece métodos para operações comuns, como salvar, buscar, atualizar e excluir dados. <br />

5. *BibliotecaApplication (Aplicação):* <br />
   - A classe principal inicia a aplicação Spring Boot. Ela contém o método main, que é o ponto de entrada da aplicação.

<br /> <br />

### Funcionalidade:
Foi criado um sistema backend capaz de realizar a leitura dos livros presentes no banco de dados, adicionar, atualizar e também excluir caso seja necessário.
