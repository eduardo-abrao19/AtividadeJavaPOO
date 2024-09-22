package atividade13;

import java.util.ArrayList;
import java.util.List;

public class LojaVirtual {
    private List<Produto> produtos;

    public LojaVirtual() {
        this.produtos = new ArrayList<>();
    }

    public void cadastrarProduto(String nome, double preco, int quantidadeEmEstoque) {
        Produto produto = new Produto(nome, preco, quantidadeEmEstoque);
        produtos.add(produto);
        System.out.println("Produto cadastrado: " + nome);
    }

    public Produto buscarProdutoPorNome(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }

    public void exibirProdutos() {
        System.out.println("Produtos disponíveis na loja:");
        for (Produto produto : produtos) {
            System.out.println("- " + produto.getNome() + " | Preço: R$ " + String.format("%.2f", produto.getPreco()) + " | Estoque: " + produto.getQuantidadeEmEstoque());
        }
    }
}

