package br.edu.ifpb.padroes.atv2.cardapio;

public class Loader {

    public static void main(String[] args) {

        // Itens individuais
        ItemMenu burger = new Produto("Cheeseburger", 25.00);
        ItemMenu batata = new Produto("Batata Frita", 12.00);
        ItemMenu refri = new Produto("Coca-Cola", 8.00);
        ItemMenu sorvete = new Produto("Casquinha", 5.00);

        // Criando um combo simples (Burger + Batata)
        Combo comboDuplo = new Combo("Combo Galera", 10.0); // 10% de desconto
        comboDuplo.adicionar(burger);
        comboDuplo.adicionar(batata);

        // Criando um combo mestre (Combo Simples + Refri + Sobremesa)
        Combo comboSupremo = new Combo("Combo Supremo", 15.0); // 15% de desconto
        comboSupremo.adicionar(comboDuplo); // Adicionando um combo dentro de outro
        comboSupremo.adicionar(refri);
        comboSupremo.adicionar(sorvete);

        // Exibindo o cardápio com indentação
        System.out.println("=== CARDÁPIO ===");
        comboSupremo.exibir("");
    }
}
