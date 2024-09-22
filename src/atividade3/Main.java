package atividade3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a largura do retângulo: ");
        double largura = scanner.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();

        Retangulo meuRetangulo = new Retangulo(largura, altura);
        System.out.println("Área: " + String.format("%.2f", meuRetangulo.calcularArea()));
        System.out.println("Perímetro: " + String.format("%.2f", meuRetangulo.calcularPerimetro()));

        scanner.close();
    }
}
