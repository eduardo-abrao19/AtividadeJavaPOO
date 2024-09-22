package atividade16;

class Carta {
    private String cor;
    private String valor;

    public Carta(String cor, String valor) {
        this.cor = cor;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return cor + " " + valor;
    }
}

