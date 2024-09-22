package atividade10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o título do livro: ");
        String titulo = scanner.nextLine();

        System.out.print("Digite o autor do livro: ");
        String autor = scanner.nextLine();

        System.out.print("Digite o número de páginas do livro: ");
        int numeroPaginas = scanner.nextInt();

        Livro livro = new Livro(titulo, autor, numeroPaginas);

        System.out.println("Livro criado com sucesso!");
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Número de Páginas: " + livro.getNumeroPaginas());
        System.out.println("Disponível: " + (livro.isDisponivel() ? "Sim" : "Não"));

        System.out.print("Deseja emprestar o livro? (sim/não): ");
        scanner.nextLine(); 
        String resposta = scanner.nextLine();
        if (resposta.equalsIgnoreCase("sim")) {
            livro.emprestar();
        }

        System.out.print("Deseja devolver o livro? (sim/não): ");
        resposta = scanner.nextLine();
        if (resposta.equalsIgnoreCase("sim")) {
            livro.devolver();
        }

        System.out.println("Disponível: " + (livro.isDisponivel() ? "Sim" : "Não"));

        scanner.close();
    }
}
