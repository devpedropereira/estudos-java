# Exercício: Streams e Lambdas (Java)

Fiz esse projeto para treinar a lógica de programação funcional no Java (API de Streams e Lambdas). 

O código lê um arquivo `.csv` com dados de funcionários (nome, email e salário) e faz duas coisas:
1. Busca todo mundo que ganha acima de um valor X e lista os e-mails em ordem alfabética.
2. Soma o salário de todos os funcionários que têm o nome começando com a letra 'M'.

### O que pratiquei nesse código:
- Leitura de arquivos usando `BufferedReader`.
- Criação de pipelines usando `.filter()`, `.map()`, e `.reduce()`.
- Criação de um `Comparator` para ordenar os e-mails ignorando letras maiúsculas e minúsculas.

