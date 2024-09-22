package atividade8;

public class Carro {
    private String marca;
    private String modelo;
    private double velocidadeAtual;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeAtual = 0.0;
    }

    public void acelerar(double incremento) {
        if (incremento > 0) {
            velocidadeAtual += incremento;
            System.out.println("O carro acelerou. Velocidade atual: " + String.format("%.2f", velocidadeAtual) + " km/h");
        } else {
            System.out.println("Valor de incremento inválido.");
        }
    }

    public void frear(double decremento) {
        if (decremento > 0 && velocidadeAtual >= decremento) {
            velocidadeAtual -= decremento;
            System.out.println("O carro freou. Velocidade atual: " + String.format("%.2f", velocidadeAtual) + " km/h");
        } else {
            System.out.println("Valor de decremento inválido ou velocidade insuficiente.");
        }
    }

    public void exibirVelocidadeAtual() {
        System.out.println("Velocidade atual: " + String.format("%.2f", velocidadeAtual) + " km/h");
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }
}

