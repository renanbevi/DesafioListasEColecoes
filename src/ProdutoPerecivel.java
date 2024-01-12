public class ProdutoPerecivel extends Produto {

    private String dataValidade;


    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade){
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;

    }

    @Override
    public String toString() {
        return "Produto: " + this.getNome() + " no valor de: " + this.getPreco() + " com a quantidade de: " + getQuantidade() + " data de validade: " + getDataValidade() ;
    }



    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
