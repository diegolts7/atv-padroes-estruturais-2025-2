package br.edu.ifpb.padroes.atv2.cardapio;

import java.util.ArrayList;
import java.util.List;

public class Combo extends ItemMenu {
    private List<ItemMenu> itens = new ArrayList<>();
    private double descontoPercentual;

    public Combo(String nome, double descontoPercentual) {
        this.nome = nome;
        this.descontoPercentual = descontoPercentual;
    }

    public void adicionar(ItemMenu item) {
        itens.add(item);
    }

    @Override
    public double getPreco() {
        double total = itens.stream().mapToDouble(ItemMenu::getPreco).sum();
        return total * (1 - (descontoPercentual / 100));
    }

    @Override
    public void exibir(String indentacao) {
        System.out.println(indentacao + "[Combo: " + nome + " | Desconto: " + descontoPercentual + "%]");
        for (ItemMenu item : itens) {
            item.exibir(indentacao + "  ");
        }
        System.out.println(indentacao + "Preço Total do Combo: R$ " + String.format("%.2f", getPreco()));
    }
}
