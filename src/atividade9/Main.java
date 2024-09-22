package atividade9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do paciente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade do paciente: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); 

        Paciente paciente = new Paciente(nome, idade);

        boolean continuar = true;
        while (continuar) {
            System.out.print("Digite a descrição da consulta (ou 'sair' para finalizar): ");
            String consulta = scanner.nextLine();
            if (consulta.equalsIgnoreCase("sair")) {
                continuar = false;
            } else {
                paciente.adicionarConsulta(consulta);
            }
        }

        paciente.exibirConsultas();
        scanner.close();
    }
}
