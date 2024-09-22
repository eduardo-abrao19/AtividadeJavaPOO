package atividade7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do lado 1: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Digite o valor do lado 2: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Digite o valor do lado 3: ");
        double lado3 = scanner.nextDouble();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

        if (triangulo.isTrianguloValido()) {
            System.out.println("Área do triângulo: " + String.format("%.2f", triangulo.calcularArea()));
        } else {
            System.out.println("Os lados fornecidos não formam um triângulo válido.");
        }

        scanner.close();
    }
}
