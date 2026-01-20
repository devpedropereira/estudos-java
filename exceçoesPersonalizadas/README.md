# 🏦 Conta Bancária (Tratamento de Exceções)

Este projeto simula as operações de saque em uma conta bancária, com foco principal na aplicação de **Lógica Defensiva** e **Tratamento de Exceções Personalizadas**.

O objetivo foi eliminar o uso excessivo de `if-else` no programa principal, delegando a validação das regras de negócio para a própria classe de domínio.

## ⚙️ Funcionalidades e Regras

O sistema permite criar uma conta e solicitar saques, aplicando as seguintes validações automáticas:

1.  **Limite de Saque:** O valor solicitado não pode superar o limite definido para a conta.
2.  **Saldo Insuficiente:** O valor solicitado não pode ser maior que o saldo atual.

Caso alguma regra seja violada, o sistema interrompe a operação e lança uma `BusinessException` com uma mensagem clara, mantendo a integridade dos dados.

## 🛠 Estrutura do Código

* **`application/Program.java`**: Responsável pela interação com o usuário. Utiliza um bloco `try-catch` para capturar erros e exibir mensagens amigáveis, sem quebrar a execução.
* **`entities/Account.java`**: Contém os dados da conta (Número, Titular, Saldo, Limite). Possui o método `withdraw()` que chama a validação interna `validateWithdraw()`.
* **`exceptions/BusinessException.java`**: Uma exceção customizada (`RuntimeException`) criada especificamente para representar erros de regra de negócio deste domínio.
