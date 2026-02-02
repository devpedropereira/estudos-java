##📂 Processador de CSV (File I/O)

Uma aplicação robusta de console que automatiza a leitura e processamento de dados de vendas.

### 🎯 O Desafio
O sistema deve ler um arquivo `.csv` contendo itens vendidos (Nome, Preço Unitário, Quantidade), calcular o valor total de cada item e gerar automaticamente um relatório consolidado (`summary.csv`) em uma nova subpasta, garantindo a persistência dos dados.

### 🛠️ Competências Técnicas Aplicadas
* **Java I/O:** Uso de `BufferedReader` e `BufferedWriter` para leitura e escrita de alta performance.
* **Manipulação de Arquivos:** Criação dinâmica de diretórios e gerenciamento de caminhos com a classe `File`.
* **Boas Práticas:** Implementação do **Try-with-resources** para garantir o fechamento seguro de streams e evitar vazamento de memória.
* **POO:** Encapsulamento da lógica de negócio na entidade `Product` (cálculo de totais).
* **Tratamento de Exceções:** Proteção contra erros comuns como "Arquivo não encontrado" ou "Formato inválido".

### 📊 Exemplo de Execução

**Entrada (`input.csv`):**
```csv
TV LED,1290.99,1
Video Game Chair,350.50,3
Iphone X,900.00,2
```
**Saída Gerada (`out/summary.csv`):**
```csv
TV LED,1290.99
Video Game Chair,1051.50
Iphone X,1800.00
```
