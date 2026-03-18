# Exercício: Apuração de Votos com Map

Código que fiz para praticar a estrutura de dados Map no Java. 

A ideia do exercício é ler um arquivo de texto onde aparecem os nomes de vários candidatos e os votos que eles receberam. Como o mesmo nome aparece várias vezes no arquivo, o programa precisa consolidar e somar os votos de cada um.

### Como resolvi o problema:
Usei um `Map<String, Integer>`, onde a chave é o nome do candidato e o valor é o total de votos. 

Conforme o programa lê as linhas do arquivo, ele confere se o candidato já está no Map. Se não estiver, ele adiciona. Se já estiver, ele pega os votos atuais e soma com os novos. Acabei usando o `LinkedHashMap` para garantir que o resultado final saia na mesma ordem em que os nomes apareceram no arquivo original.

---
**Pedro Henrique (PH)**
Estudante de Ciência da Computação - UNIP
