---

# 🍕 Sistema de Pedido de Pizzas em Java

Bem-vindo ao **Sistema de Pedido de Pizzas**! Este é um projeto simples em Java que simula um sistema de pedidos de pizzas, onde os clientes podem escolher entre 100 sabores de pizza, selecionar a forma de pagamento e efetuar o pagamento. O sistema é interativo e fácil de usar, perfeito para praticar conceitos de programação em Java.

---

## 🚀 Funcionalidades

- **Menu com 100 pizzas**: Escolha entre uma variedade de sabores, como Mussarela, Calabresa, Frango com Catupiry e muito mais.
- **Pedido personalizado**: O cliente pode digitar o número ou o nome da pizza desejada.
- **Formas de pagamento**: Crédito, débito ou Pix.
- **Processamento de pagamento**: Verifica se o valor pago é correto e fornece feedback (valor incompleto, valor exato ou gorjeta).
- **Loop de pedidos**: Permite que o cliente faça vários pedidos até decidir sair.
- **Interface simples e interativa**: Feita para ser intuitiva e divertida de usar.

---

## 📋 Pré-requisitos

Antes de começar, você precisará ter o seguinte instalado em sua máquina:

- **Java Development Kit (JDK)**: Versão 8 ou superior.
- **Git**: Para clonar o repositório.
- **IDE (opcional)**: Recomendamos o uso de uma IDE como [IntelliJ IDEA](https://www.jetbrains.com/idea/) ou [Eclipse](https://www.eclipse.org/) para facilitar a execução do código.

---

## 🛠️ Como executar o projeto

Siga os passos abaixo para configurar e executar o projeto:

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/seu-usuario/sistema-pedido-pizzas.git
   cd sistema-pedido-pizzas
   ```

2. **Compile o código**:
   - Se estiver usando o terminal, execute:
     ```bash
     javac SistemaPizzaria.java
     ```

3. **Execute o programa**:
   - No terminal, execute:
     ```bash
     java SistemaPizzaria
     ```

4. **Siga as instruções no terminal**:
   - O sistema exibirá o menu de pizzas e guiará você pelo processo de pedido e pagamento.

---

## 🍴 Menu de Pizzas (Exemplo)

Aqui estão alguns dos sabores disponíveis no sistema:

| Número | Sabor               |
|--------|---------------------|
| 1      | Mussarela           |
| 2      | Calabresa           |
| 3      | Portuguesa          |
| 4      | Frango com Catupiry |
| 5      | Quatro Queijos      |
| ...    | ...                 |
| 100    | Camarão             |

---

## 💻 Como usar

1. **Início**:
   - O sistema exibirá uma mensagem de boas-vindas e perguntará se você deseja fazer um pedido.

2. **Escolha da Pizza**:
   - Digite o número ou o nome da pizza desejada.

3. **Forma de Pagamento**:
   - Escolha entre crédito, débito ou Pix.

4. **Pagamento**:
   - Digite o valor do pagamento. O sistema verificará se o valor está correto:
     - **Valor incompleto**: Solicitará que você pague novamente.
     - **Valor exato**: Confirmará o pagamento.
     - **Valor a mais**: Agradecerá pela gorjeta.

5. **Fazer outro pedido**:
   - Após o pagamento, o sistema perguntará se você deseja fazer outro pedido. Digite `sim` para continuar ou `não` para sair.

---

## 🧩 Estrutura do Código

O projeto é composto por um único arquivo Java (`SistemaPizzaria.java`) que contém:

- **Menu de Pizzas**: Um `HashMap` armazena os sabores e preços das pizzas.
- **Loop de Pedidos**: Um loop `while` permite que o cliente faça vários pedidos.
- **Processamento de Pagamento**: Verifica o valor pago e fornece feedback.
- **Método `getSabor`**: Gera sabores de pizza de forma dinâmica.

---

## 🤝 Como contribuir

Contribuições são bem-vindas! Siga os passos abaixo:

1. Faça um **fork** do projeto.
2. Crie uma nova branch com sua feature ou correção:
   ```bash
   git checkout -b minha-feature
   ```
3. Faça commit das suas alterações:
   ```bash
   git commit -m "Adicionei uma nova feature"
   ```
4. Envie para o repositório remoto:
   ```bash
   git push origin minha-feature
   ```
5. Abra um **Pull Request** no GitHub.

---

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

## 🙏 Agradecimentos

- À comunidade Java por fornecer tantos recursos incríveis.
- Aos amantes de pizza por inspirar este projeto. 🍕

---

Feito por [kamark14](https://github.com/kamark14).  
Se gostou do projeto, deixe uma ⭐ no meu repositório!
