package atividade1;

public class Circulo {
    private double raio;
    private double area;
    private double perimetro;

    public Circulo(double raio) {
        this.raio = raio;
        calcularValores();
    }

    private void calcularValores() {
        this.area = Math.PI * Math.pow(raio, 2);
        this.perimetro = 2 * Math.PI * raio;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }
}