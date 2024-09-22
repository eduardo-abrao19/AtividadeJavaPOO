package atividade17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RedeSocial redeSocial = new RedeSocial();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar amigo");
            System.out.println("2. Publicar mensagem");
            System.out.println("3. Comentar em post");
            System.out.println("4. Buscar usuário");
            System.out.println("5. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Nome do usuário: ");
                    String nomeUsuario = scanner.nextLine();
                    System.out.print("Nome do amigo: ");
                    String nomeAmigo = scanner.nextLine();
                    redeSocial.adicionarAmigo(nomeUsuario, nomeAmigo);
                    break;
                case 2:
                    System.out.print("Nome do usuário: ");
                    nomeUsuario = scanner.nextLine();
                    System.out.print("Mensagem: ");
                    String mensagem = scanner.nextLine();
                    redeSocial.publicarMensagem(nomeUsuario, mensagem);
                    break;
                case 3:
                    System.out.print("Nome do usuário: ");
                    nomeUsuario = scanner.nextLine();
                    System.out.print("Nome do amigo: ");
                    nomeAmigo = scanner.nextLine();
                    System.out.print("Índice do post: ");
                    int postIndex = scanner.nextInt();
                    scanner.nextLine();  
                    
                    System.out.print("Comentário: ");
                    String comentario = scanner.nextLine();
                    redeSocial.comentarPost(nomeUsuario, nomeAmigo, postIndex, comentario);
                    break;
                case 4:
                    System.out.print("Nome do usuário: ");
                    nomeUsuario = scanner.nextLine();
                    Usuario usuario = redeSocial.buscarUsuario(nomeUsuario);
                    if (usuario != null) {
                        System.out.println("Usuário encontrado: " + usuario.getNome());
                    } else {
                        System.out.println("Usuário não encontrado.");
                    }
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
