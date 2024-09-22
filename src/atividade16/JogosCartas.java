package atividade16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class JogoCartas {
    private List<Carta> baralho;
    private List<List<Carta>> jogadores;
    private static final String[] CORES = {"Vermelho", "Verde", "Azul", "Amarelo"};
    private static final String[] VALORES = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "Pular", "Inverter", "+2"};

    public JogoCartas() {
        baralho = new ArrayList<>();
        for (String cor : CORES) {
            for (String valor : VALORES) {
                baralho.add(new Carta(cor, valor));
            }
        }
        jogadores = new ArrayList<>();
    }

    public void embaralhar() {
        Collections.shuffle(baralho);
    }

    public void distribuir(int numJogadores, int numCartas) {
        jogadores.clear();
        for (int i = 0; i < numJogadores; i++) {
            jogadores.add(new ArrayList<>());
        }
        for (int i = 0; i < numCartas; i++) {
            for (List<Carta> jogador : jogadores) {
                if (!baralho.isEmpty()) {
                    jogador.add(baralho.remove(0));
                }
            }
        }
    }

    public void jogar(int jogadorIndex, int cartaIndex) {
        if (jogadorIndex >= 0 && jogadorIndex < jogadores.size() && cartaIndex >= 0 && cartaIndex < jogadores.get(jogadorIndex).size()) {
            Carta carta = jogadores.get(jogadorIndex).remove(cartaIndex);
            System.out.println("Jogador " + (jogadorIndex + 1) + " jogou " + carta);
        } else {
            System.out.println("Jogada inválida");
        }
    }
}

