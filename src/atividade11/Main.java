package atividade11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Digite a profissão da pessoa: ");
        String profissao = scanner.nextLine();

        Pessoa pessoa = new Pessoa(nome, idade, profissao);
        pessoa.exibirInformacoes();

        scanner.close();
    }
}

