package atividade14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Editar Contato");
            System.out.println("3. Remover Contato");
            System.out.println("4. Buscar Contato por Nome");
            System.out.println("5. Buscar Contato por Telefone");
            System.out.println("6. Exibir Todos os Contatos");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do contato: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o telefone do contato: ");
                    String telefone = scanner.nextLine();
                    agenda.adicionarContato(nome, telefone);
                    break;
                case 2:
                    System.out.print("Digite o nome do contato a ser editado: ");
                    nome = scanner.nextLine();
                    System.out.print("Digite o novo nome do contato: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Digite o novo telefone do contato: ");
                    String novoTelefone = scanner.nextLine();
                    agenda.editarContato(nome, novoNome, novoTelefone);
                    break;
                case 3:
                    System.out.print("Digite o nome do contato a ser removido: ");
                    nome = scanner.nextLine();
                    agenda.removerContato(nome);
                    break;
                case 4:
                    System.out.print("Digite o nome do contato a ser buscado: ");
                    nome = scanner.nextLine();
                    Contato contato = agenda.buscarContatoPorNome(nome);
                    if (contato != null) {
                        System.out.println("Contato encontrado: " + contato);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 5:
                    System.out.print("Digite o telefone do contato a ser buscado: ");
                    telefone = scanner.nextLine();
                    contato = agenda.buscarContatoPorTelefone(telefone);
                    if (contato != null) {
                        System.out.println("Contato encontrado: " + contato);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 6:
                    agenda.exibirContatos();
                    break;
                case 7:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
