import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Produto playstation = new Produto();
        playstation.setNome("Playstation 5");
        playstation.setPreco(3.900);
        playstation.setQuantidade(1);

        Produto jogo =  new Produto("COd", 399,1);
        //jogo.setNome("COD");
        //jogo.setPreco(399.00);
       //jogo.setQuantidade(1);

        Produto headset = new Produto();
        headset.setNome("headset");
        headset.setPreco(199.99);
        headset.setQuantidade(1);

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel ("Carne",39,1,"12/01/2025");


        ArrayList<Produto>  listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(playstation);
        listaDeProdutos.add(jogo);
        listaDeProdutos.add(headset);
        listaDeProdutos.add(produtoPerecivel);





        System.out.println("Tamanho da lista de produtos é de " + listaDeProdutos.size() +  " quantidades");
        System.out.println("Produto: " + listaDeProdutos.get(0).getNome() + " está na promoção");
        System.out.println("Produto: " + listaDeProdutos.get(3));

    }
}