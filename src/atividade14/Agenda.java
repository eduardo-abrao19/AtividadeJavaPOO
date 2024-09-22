package atividade14;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(String nome, String telefone) {
        Contato contato = new Contato(nome, telefone);
        contatos.add(contato);
        System.out.println("Contato adicionado: " + contato);
    }

    public void editarContato(String nome, String novoNome, String novoTelefone) {
        Contato contato = buscarContatoPorNome(nome);
        if (contato != null) {
            contato.setNome(novoNome);
            contato.setTelefone(novoTelefone);
            System.out.println("Contato editado: " + contato);
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    public void removerContato(String nome) {
        Contato contato = buscarContatoPorNome(nome);
        if (contato != null) {
            contatos.remove(contato);
            System.out.println("Contato removido: " + contato);
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    public Contato buscarContatoPorNome(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null;
    }

    public Contato buscarContatoPorTelefone(String telefone) {
        for (Contato contato : contatos) {
            if (contato.getTelefone().equals(telefone)) {
                return contato;
            }
        }
        return null;
    }

    public void exibirContatos() {
        System.out.println("Contatos na agenda:");
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }
}
