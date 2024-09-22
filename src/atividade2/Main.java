package atividade2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        String numeroConta = scanner.nextLine();

        System.out.print("Digite o nome do titular: ");
        String nomeTitular = scanner.nextLine();

        System.out.print("Digite o saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        ContaBancaria minhaConta = new ContaBancaria(numeroConta, nomeTitular, saldoInicial);

        System.out.println("Conta criada com sucesso!");
        System.out.println("Número da Conta: " + minhaConta.getNumeroConta());
        System.out.println("Nome do Titular: " + minhaConta.getNomeTitular());
        System.out.println("Saldo: R$ " + String.format("%.2f", minhaConta.getSaldo()));

        System.out.print("Digite o valor para depósito: ");
        double valorDeposito = scanner.nextDouble();
        minhaConta.depositar(valorDeposito);
        System.out.println("Saldo após depósito: R$ " + String.format("%.2f", minhaConta.getSaldo()));

        System.out.print("Digite o valor para saque: ");
        double valorSaque = scanner.nextDouble();
        minhaConta.sacar(valorSaque);
        System.out.println("Saldo após saque: R$ " + String.format("%.2f", minhaConta.getSaldo()));

        scanner.close();
    }
}
