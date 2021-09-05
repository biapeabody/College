package produtos;

public class Cosmetico extends Produto{
    
    public Cosmetico(int idProduto, String nomeProduto, double preco, String descricao, int estoque, String validade, String nomeFornecedor) {
        super(idProduto ,nomeProduto, preco, descricao, estoque, validade, nomeFornecedor, /*desconto*/ 0.20);
    }

}
