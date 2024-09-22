package atividade15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MáquinaDeVendas maquina = new MáquinaDeVendas();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Selecionar Produto");
            System.out.println("3. Inserir Dinheiro");
            System.out.println("4. Comprar Produto");
            System.out.println("5. Exibir Estoque");
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
                    System.out.print("Digite a quantidade do produto: ");
                    int quantidade = scanner.nextInt();
                    maquina.cadastrarProduto(nome, preco, quantidade);
                    break;
                case 2:
                    System.out.print("Digite o nome do produto: ");
                    nome = scanner.nextLine();
                    maquina.selecionarProduto(nome);
                    break;
                case 3:
                    System.out.print("Digite o valor a ser inserido: ");
                    double valor = scanner.nextDouble();
                    maquina.inserirDinheiro(valor);
                    break;
                case 4:
                    System.out.print("Digite o nome do produto: ");
                    nome = scanner.nextLine();
                    maquina.comprarProduto(nome);
                    break;
                case 5:
                    maquina.exibirEstoque();
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

