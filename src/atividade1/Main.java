package atividade1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        double raio = scanner.nextDouble();

        Circulo meuCirculo = new Circulo(raio);
        System.out.println("Área: " + String.format("%.2f", meuCirculo.getArea()));
        System.out.println("Perímetro: " + String.format("%.2f", meuCirculo.getPerimetro()));

        scanner.close();
    }
}
