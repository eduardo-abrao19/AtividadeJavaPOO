	package atividade12;
	import java.util.Scanner;

	public class Main {
	    public static void main(String[] args) {
	        Banco banco = new Banco();
	        Scanner scanner = new Scanner(System.in);
	        boolean continuar = true;

	        while (continuar) {
	            System.out.println("\nMenu:");
	            System.out.println("1. Cadastrar Cliente");
	            System.out.println("2. Abrir Conta");
	            System.out.println("3. Realizar Depósito");
	            System.out.println("4. Realizar Saque");
	            System.out.println("5. Realizar Transferência");
	            System.out.println("6. Sair");
	            System.out.print("Escolha uma opção: ");
	            int opcao = scanner.nextInt();
	            scanner.nextLine(); // Consumir a nova linha

	            switch (opcao) {
	                case 1:
	                    System.out.print("Digite o nome do cliente: ");
	                    String nome = scanner.nextLine();
	                    System.out.print("Digite o CPF do cliente: ");
	                    String cpf = scanner.nextLine();
	                    banco.cadastrarCliente(nome, cpf);
	                    break;
	                case 2:
	                    System.out.print("Digite o número da conta: ");
	                    String numeroConta = scanner.nextLine();
	                    System.out.print("Digite o CPF do cliente: ");
	                    cpf = scanner.nextLine();
	                    System.out.print("Digite o saldo inicial: ");
	                    double saldoInicial = scanner.nextDouble();
	                    banco.abrirConta(numeroConta, cpf, saldoInicial);
	                    break;
	                case 3:
	                    System.out.print("Digite o número da conta: ");
	                    numeroConta = scanner.nextLine();
	                    System.out.print("Digite o valor do depósito: ");
	                    double valorDeposito = scanner.nextDouble();
	                    banco.realizarDeposito(numeroConta, valorDeposito);
	                    break;
	                case 4:
	                    System.out.print("Digite o número da conta: ");
	                    numeroConta = scanner.nextLine();
	                    System.out.print("Digite o valor do saque: ");
	                    double valorSaque = scanner.nextDouble();
	                    banco.realizarSaque(numeroConta, valorSaque);
	                    break;
	                case 5:
	                    System.out.print("Digite o número da conta de origem: ");
	                    String numeroContaOrigem = scanner.nextLine();
	                    System.out.print("Digite o número da conta de destino: ");
	                    String numeroContaDestino = scanner.nextLine();
	                    System.out.print("Digite o valor da transferência: ");
	                    double valorTransferencia = scanner.nextDouble();
	                    banco.realizarTransferencia(numeroContaOrigem, numeroContaDestino, valorTransferencia);
	                    break;
	                case 6:
	                    continuar = false;
	                    banco.exibirInformacoesClientesEContas();
	                    break;
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	            }
	        }

	        scanner.close();
	    }
	}
