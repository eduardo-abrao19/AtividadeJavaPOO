package atividade13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LojaVirtual loja = new LojaVirtual();
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Exibir Produtos");
            System.out.println("3. Adicionar Produto ao Carrinho");
            System.out.println("4. Aplicar Desconto");
            System.out.println("5. Exibir Carrinho");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    double preco = scanner.nextDouble();
                    System.out.print("Digite a quantidade em estoque: ");
                    int quantidade = scanner.nextInt();
                    loja.cadastrarProduto(nome, preco, quantidade);
                    break;
                case 2:
                    loja.exibirProdutos();
                    break;
                case 3:
                    System.out.print("Digite o nome do produto: ");
                    nome = scanner.nextLine();
                    Produto produto = loja.buscarProdutoPorNome(nome);
                    if (produto != null) {
                        System.out.print("Digite a quantidade: ");
                        quantidade = scanner.nextInt();
                        carrinho.adicionarProduto(produto, quantidade);
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("Digite o percentual de desconto: ");
                    double desconto = scanner.nextDouble();
                    carrinho.aplicarDesconto(desconto);
                    break;
                case 5:
                    carrinho.exibirCarrinho();
                    break;
                case 6:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
