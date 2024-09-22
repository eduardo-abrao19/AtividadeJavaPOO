package atividade15;

import java.util.ArrayList;
import java.util.List;

public class MáquinaDeVendas {
    private List<Produto> produtos;
    private double saldo;

    public MáquinaDeVendas() {
        this.produtos = new ArrayList<>();
        this.saldo = 0.0;
    }

    public void cadastrarProduto(String nome, double preco, int quantidade) {
        Produto produto = new Produto(nome, preco, quantidade);
        produtos.add(produto);
        System.out.println("Produto cadastrado: " + produto);
    }

    public void selecionarProduto(String nome) {
        Produto produto = buscarProdutoPorNome(nome);
        if (produto != null && produto.getQuantidade() > 0) {
            System.out.println("Produto selecionado: " + produto);
        } else {
            System.out.println("Produto não disponível.");
        }
    }

    public void inserirDinheiro(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Dinheiro inserido: R$ " + String.format("%.2f", valor));
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public void comprarProduto(String nome) {
        Produto produto = buscarProdutoPorNome(nome);
        if (produto != null && produto.getQuantidade() > 0) {
            if (saldo >= produto.getPreco()) {
                saldo -= produto.getPreco();
                produto.setQuantidade(produto.getQuantidade() - 1);
                System.out.println("Produto comprado: " + produto);
                System.out.println("Troco: R$ " + String.format("%.2f", saldo));
                saldo = 0.0; // Resetar saldo após a compra
            } else {
                System.out.println("Saldo insuficiente. Insira mais dinheiro.");
            }
        } else {
            System.out.println("Produto não disponível.");
        }
    }

    public void exibirEstoque() {
        System.out.println("Estoque disponível:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    private Produto buscarProdutoPorNome(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }
}
