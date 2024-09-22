package atividade5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();

        scanner.nextLine(); // Consumir a nova linha

        System.out.print("Digite o cargo do funcionário: ");
        String cargo = scanner.nextLine();

        Funcionario funcionario = new Funcionario(nome, salario, cargo);

        System.out.print("Digite o valor dos descontos: ");
        double descontos = scanner.nextDouble();

        System.out.print("Digite o valor dos benefícios: ");
        double beneficios = scanner.nextDouble();

        double salarioLiquido = funcionario.calcularSalarioLiquido(descontos, beneficios);
        System.out.println("Salário líquido: R$ " + String.format("%.2f", salarioLiquido));

        scanner.close();
    }
}
