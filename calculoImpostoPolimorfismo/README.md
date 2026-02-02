# 💼 Sistema de Cálculo de Impostos (Polimorfismo)

Este projeto aplica o conceito de **Polimorfismo** para resolver um problema de negócio: o cálculo diferenciado de impostos para Pessoas Físicas e Jurídicas.

## 🎯 Regras de Negócio Aplicadas

O sistema processa uma lista mista de contribuintes e aplica a lógica correta automaticamente:

* **Pessoa Física:**
    * Renda abaixo de 20k: 15% de imposto.
    * Renda acima de 20k: 25% de imposto.
    * *Benefício:* Abate 50% dos gastos com saúde.
* **Pessoa Jurídica:**
    * Imposto fixo de 16%.
    * *Benefício:* Se tiver mais de 10 funcionários, o imposto cai para 14%.

## 🚀 Conceitos Técnicos
* **Classe Abstrata (`Contribuintes`):** Define o contrato que obriga as classes filhas a implementarem o método `imposto()`.
* **Polimorfismo:** A lista `List<Contribuintes>` aceita objetos de diferentes tipos, e o Java decide qual regra aplicar em tempo de execução.
* **Encapsulamento:** Atributos protegidos (`protected`) para acesso correto nas subclasses.

## 📂 Estrutura
* `entities`: Classes de modelo (`PessoaFisica`, `PessoaJuridica`).
* `application`: Classe `Program.java` com a interação via console.
