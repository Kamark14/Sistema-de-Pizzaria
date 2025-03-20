import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SistemaPizzaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> menu = new HashMap<>();
        Map<Integer, Double> precos = new HashMap<>();

        // Preenchendo o menu com 100 pizzas (exemplo com alguns sabores)
        for (int i = 1; i <= 100; i++) {
            menu.put(i, "Pizza " + i + ": Sabor " + getSabor(i));
            precos.put(i, 35.00); // Todas as pizzas custam R$35,00
        }

        boolean fazerOutroPedido = true;

        System.out.println("Seja bem-vindo ao sistema de pedido de pizza! Vamos fazer seu pedido?");

        while (fazerOutroPedido) {
            // Mostrar o menu
            System.out.println("\nMenu de Pizzas:");
            for (Map.Entry<Integer, String> entry : menu.entrySet()) {
                System.out.println(entry.getValue());
            }

            // Escolher a pizza
            System.out.print("\nQual o sabor da pizza? (Digite o número ou o nome): ");
            String escolha = scanner.nextLine();

            int numeroPizza = -1;
            try {
                numeroPizza = Integer.parseInt(escolha);
            } catch (NumberFormatException e) {
                // Se não for um número, procurar pelo nome
                for (Map.Entry<Integer, String> entry : menu.entrySet()) {
                    if (entry.getValue().toLowerCase().contains(escolha.toLowerCase())) {
                        numeroPizza = entry.getKey();
                        break;
                    }
                }
            }

            if (numeroPizza == -1 || !menu.containsKey(numeroPizza)) {
                System.out.println("Pizza não encontrada. Tente novamente.");
                continue;
            }

            System.out.println("Pedido feito, aguarde...");

            // Simular tempo de preparo
            try {
                Thread.sleep(3000); // Espera 3 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Forma de pagamento
            System.out.println("\nQual a forma de pagamento?");
            System.out.println("1. Crédito");
            System.out.println("2. Débito");
            System.out.println("3. Pix");
            System.out.print("Escolha uma opção (1-3): ");
            int formaPagamento = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            if (formaPagamento < 1 || formaPagamento > 3) {
                System.out.println("Opção inválida. Tente novamente.");
                continue;
            }

            // Processar pagamento
            double valorPizza = precos.get(numeroPizza);
            System.out.printf("Efetuar pagamento, valor da pizza: R$%.2f%n", valorPizza);
            System.out.print("Digite o valor do pagamento: ");
            double valorPago = scanner.nextDouble();
            scanner.nextLine(); // Limpar o buffer

            if (valorPago < valorPizza) {
                System.out.println("Valor incompleto, pague novamente.");
            } else if (valorPago > valorPizza) {
                System.out.println("Pizza paga, obrigado pela gorjeta!");
            } else {
                System.out.println("Pizza paga, bom apetite!");
            }

            // Perguntar se deseja fazer outro pedido
            System.out.print("\nQuer fazer outro pedido? (sim ou não): ");
            String resposta = scanner.nextLine();

            if (!resposta.equalsIgnoreCase("sim")) {
                fazerOutroPedido = false;
                System.out.println("Ok, muito obrigado pela atenção. Peça sempre!");
            }
        }

        scanner.close();
    }

    // Método para gerar sabores de pizza (exemplo)
    private static String getSabor(int numero) {
        String[] sabores = {
            "Mussarela", "Calabresa", "Portuguesa", "Frango com Catupiry", "Margherita",
            "Quatro Queijos", "Pepperoni", "Napolitana", "Bacon", "Atum", "Vegetariana",
            "Chocolate", "Banana com Canela", "Romeu e Julieta", "Camarão", "Alho e Óleo",
            "Brócolis", "Palmito", "Lombo", "Escarola"
        };
        return sabores[numero % sabores.length];
    }
}
