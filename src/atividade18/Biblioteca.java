package atividade18;

import java.util.ArrayList;
import java.util.List;

class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
    }

    public void emprestarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo) && livro.isDisponivel()) {
                livro.emprestar();
                System.out.println("Livro emprestado: " + livro);
            }
        }
        System.out.println("Livro não disponível para empréstimo.");
        return;

    }

    public void devolverLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo) && !livro.isDisponivel()) {
                livro.devolver();
                System.out.println("Livro devolvido: " + livro);
                
            }
        }
        System.out.println("já está disponível.");
        return;

    }

    public void verificarDisponibilidade(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                if (livro.isDisponivel()) {
                    System.out.println("Livro disponível: " + livro);
                } else {
                    System.out.println("Livro não disponível: " + livro);
                }
            }
        }
        System.out.println("Livro encontrado.");
        return;

    }
}

