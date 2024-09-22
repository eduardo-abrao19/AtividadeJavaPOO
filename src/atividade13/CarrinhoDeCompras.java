package atividade13;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> produtos;
    private double desconto;

    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<>();
        this.desconto = 0.0;
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        if (produto.getQuantidadeEmEstoque() >= quantidade) {
            produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque() - quantidade);
            for (int i = 0; i < quantidade; i++) {
                produtos.add(produto);
            }
            System.out.println("Produto adicionado ao carrinho: " + produto.getNome());
        } else {
            System.out.println("Quantidade em estoque insuficiente para o produto: " + produto.getNome());
        }
    }

    public void aplicarDesconto(double desconto) {
        this.desconto = desconto;
        System.out.println("Desconto de " + desconto + "% aplicado.");
    }

    public double calcularValorTotal() {
        double total = 0.0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total * (1 - desconto / 100);
    }

    public void exibirCarrinho() {
        System.out.println("Produtos no carrinho:");
        for (Produto produto : produtos) {
            System.out.println("- " + produto.getNome() + " | Preço: R$ " + String.format("%.2f", produto.getPreco()));
        }
        System.out.println("Valor total com desconto: R$ " + String.format("%.2f", calcularValorTotal()));
    }
}

