package atividade4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a matrícula do aluno: ");
        String matricula = scanner.nextLine();

        System.out.print("Digite o número de notas: ");
        int numNotas = scanner.nextInt();
        double[] notas = new double[numNotas];

        for (int i = 0; i < numNotas; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        Aluno aluno = new Aluno(nome, matricula, notas);
        System.out.println("Média: " + String.format("%.2f", aluno.calcularMedia()));
        System.out.println("Situação: " + aluno.verificarSituacao());

        scanner.close();
    }
}
