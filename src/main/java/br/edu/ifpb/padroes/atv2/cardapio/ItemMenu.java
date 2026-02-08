package br.edu.ifpb.padroes.atv2.cardapio;

public abstract class ItemMenu {
    protected String nome;

    public String getNome() { return nome; }
    public abstract double getPreco();
    public abstract void exibir(String indentacao);
}
