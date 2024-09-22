package atividade10;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private boolean disponivel;

    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.disponivel = true; // O livro está disponível por padrão
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("O livro foi emprestado.");
        } else {
            System.out.println("O livro não está disponível para empréstimo.");
        }
    }

    public void devolver() {
        if (!disponivel) {
            disponivel = true;
            System.out.println("O livro foi devolvido.");
        } else {
            System.out.println("O livro já está disponível.");
        }
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }
}
