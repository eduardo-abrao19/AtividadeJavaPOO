package atividade9;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private String nome;
    private int idade;
    private List<String> historicoConsultas;

    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.historicoConsultas = new ArrayList<>();
    }

    public void adicionarConsulta(String consulta) {
        historicoConsultas.add(consulta);
        System.out.println("Consulta adicionada: " + consulta);
    }

    public void exibirConsultas() {
        System.out.println("Histórico de Consultas de " + nome + ":");
        for (String consulta : historicoConsultas) {
            System.out.println(consulta);
        }
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public List<String> getHistoricoConsultas() {
        return historicoConsultas;
    }
}
