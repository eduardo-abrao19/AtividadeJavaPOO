package atividade11;

public class Pessoa {
    private String nome;
    private int idade;
    private String profissao;

    public Pessoa(String nome, int idade, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

    public int calcularIdadeEmAnosBissextos() {
        int anosBissextos = 0;
        for (int i = 0; i < idade; i++) {
            int ano = 2024 - idade + i; // Considerando o ano atual como 2024
            if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                anosBissextos++;
            }
        }
        return anosBissextos;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Profissão: " + profissao);
        System.out.println("Idade em anos bissextos: " + calcularIdadeEmAnosBissextos());
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getProfissao() {
        return profissao;
    }
}

