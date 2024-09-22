package atividade8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a marca do carro: ");
        String marca = scanner.nextLine();

        System.out.print("Digite o modelo do carro: ");
        String modelo = scanner.nextLine();

        Carro meuCarro = new Carro(marca, modelo);

        System.out.print("Digite o valor para acelerar: ");
        double incremento = scanner.nextDouble();
        meuCarro.acelerar(incremento);

        System.out.print("Digite o valor para frear: ");
        double decremento = scanner.nextDouble();
        meuCarro.frear(decremento);

        meuCarro.exibirVelocidadeAtual();

        scanner.close();
    }
}
