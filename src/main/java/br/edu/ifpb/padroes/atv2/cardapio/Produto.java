package br.edu.ifpb.padroes.atv2.cardapio;

public class Produto extends ItemMenu {
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double getPreco() { return preco; }

    @Override
    public void exibir(String indentacao) {
        System.out.println(indentacao + "- " + nome + ": R$ " + String.format("%.2f", preco));
    }
}
