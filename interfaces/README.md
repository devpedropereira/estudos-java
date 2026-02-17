# ☕ Sistema de Processamento de Contratos (Interfaces & Injeção de Dependência)

Este projeto é uma aplicação Java construída para exercitar conceitos fundamentais da Orientação a Objetos, focando no desacoplamento entre camadas através de **Interfaces** e **Injeção de Dependência**.

O sistema simula o processamento de um contrato, gerando parcelas mensais que incluem juros e taxas baseadas em regras de negócio flexíveis (ex: PayPal).

## 🚀 Tecnologias e Conceitos Aplicados

- **Java 21**
- **Interfaces:** Para definir contratos de serviço (ex: `OnlinePaymentService`), permitindo que a regra de pagamento mude sem afetar o processamento principal.
- **Injeção de Dependência (DI):** O `ContractService` não cria a instância do serviço de pagamento; ele a recebe via construtor (Inversão de Controle).
- **Camada de Domínio e Serviços:** Separação clara entre Entidades (`Contract`, `Installment`) e Serviços (`ContractService`, `PaypalService`).
- **Manipulação de Datas:** Uso da API moderna `java.time.LocalDate` e `DateTimeFormatter`.

## ⚙️ Regra de Negócio (Simulação PayPal)

O serviço de pagamento implementado (`PaypalService`) aplica:
1.  **Juros Simples:** 1% a cada mês acumulado.
2.  **Taxa de Pagamento:** 2% sobre o valor já com juros.

**Exemplo de Cálculo:**
- Valor: 200.00
- Parcela 1 (1 mês depois): 
  - Juros: 200 * 1% * 1 = 2.00
  - Taxa: (200 + 2) * 2% = 4.04
  - Total: 206.04

## 📂 Estrutura do Projeto

```text
src/
├── application/
│   └── Program.java           # Classe principal (UI via Console)
├── entities/
│   ├── Contract.java          # Entidade Contrato
│   └── Installment.java       # Entidade Parcela
└── services/
    ├── ContractService.java       # Lógica de geração de parcelas
    ├── OnlinePaymentService.java  # Interface (Contrato do serviço)
    └── PaypalService.java         # Implementação concreta (Regra PayPal)
