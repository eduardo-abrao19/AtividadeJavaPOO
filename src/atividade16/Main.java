package atividade16;

public class Main {
    public static void main(String[] args) {
        JogoCartas jogo = new JogoCartas();
        jogo.embaralhar();
        jogo.distribuir(4, 7);

        // Jogador 1 joga a primeira carta
        jogo.jogar(0, 0);

        // Jogador 2 joga a primeira carta
        jogo.jogar(1, 0);

        // Jogador 3 joga a primeira carta
        jogo.jogar(2, 0);

        // Jogador 4 joga a primeira carta
        jogo.jogar(3, 0);
    }
}

