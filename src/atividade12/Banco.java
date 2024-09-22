package atividade12;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Cliente> clientes;
    private List<ContaBancaria> contas;

    public Banco() {
        this.clientes = new ArrayList<>();
        this.contas = new ArrayList<>();
    }

    public void cadastrarCliente(String nome, String cpf) {
        Cliente cliente = new Cliente(nome, cpf);
        clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso: " + nome);
    }

    public void abrirConta(String numeroConta, String cpf, double saldoInicial) {
        Cliente cliente = buscarClientePorCpf(cpf);
        if (cliente != null) {
            ContaBancaria conta = new ContaBancaria(numeroConta, cliente, saldoInicial);
            contas.add(conta);
            System.out.println("Conta aberta com sucesso para o cliente: " + cliente.getNome());
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    public void realizarDeposito(String numeroConta, double valor) {
        ContaBancaria conta = buscarContaPorNumero(numeroConta);
        if (conta != null) {
            conta.depositar(valor);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public void realizarSaque(String numeroConta, double valor) {
        ContaBancaria conta = buscarContaPorNumero(numeroConta);
        if (conta != null) {
            conta.sacar(valor);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public void realizarTransferencia(String numeroContaOrigem, String numeroContaDestino, double valor) {
        ContaBancaria contaOrigem = buscarContaPorNumero(numeroContaOrigem);
        ContaBancaria contaDestino = buscarContaPorNumero(numeroContaDestino);
        if (contaOrigem != null && contaDestino != null) {
            contaOrigem.transferir(contaDestino, valor);
        } else {
            System.out.println("Conta de origem ou destino não encontrada.");
        }
    }

    public void exibirInformacoesClientesEContas() {
        System.out.println("\nInformações dos Clientes e Contas:");
        for (ContaBancaria conta : contas) {
            Cliente cliente = conta.getTitular();
            System.out.println("Cliente: " + cliente.getNome() + " | CPF: " + cliente.getCpf());
            System.out.println("Conta: " + conta.getNumeroConta() + " | Saldo: R$ " + String.format("%.2f", conta.getSaldo()));
            System.out.println("--------------------------------------------------");
        }
    }

    private Cliente buscarClientePorCpf(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

    private ContaBancaria buscarContaPorNumero(String numeroConta) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta().equals(numeroConta)) {
                return conta;
            }
        }
        return null;
    }
}
