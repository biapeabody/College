package produtos;

public class Cosmetico extends Produto{
    
    public Cosmetico() {
        super();
    }

    public Cosmetico(int idProduto, String nomeProduto, double preco, String descricao, int estoque, String validade, String nomeFornecedor) {
        super(idProduto ,nomeProduto, preco, descricao, estoque, validade, nomeFornecedor, 0.20);
    }

}
