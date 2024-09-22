package atividade6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.print("Digite a quantidade em estoque: ");
        int quantidadeEmEstoque = scanner.nextInt();

        Produto produto = new Produto(nome, preco, quantidadeEmEstoque);

        System.out.println("Nome do Produto: " + produto.getNome());
        System.out.println("Preço: R$ " + String.format("%.2f", produto.getPreco()));
        System.out.println("Quantidade em Estoque: " + produto.getQuantidadeEmEstoque());
        System.out.println("Valor Total em Estoque: R$ " + String.format("%.2f", produto.calcularValorTotalEmEstoque()));
        System.out.println("Disponível: " + (produto.isDisponivel() ? "Sim" : "Não"));

        scanner.close();
    }
}
