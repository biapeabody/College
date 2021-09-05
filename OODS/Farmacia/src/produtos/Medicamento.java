package produtos;

public class Medicamento extends Produto {

    public Medicamento(int idProduto ,String nomeProduto ,double preco, String descricao, int estoque, String validade, String nomeFornecedor) {
        super(idProduto ,nomeProduto, preco, descricao, estoque, validade, nomeFornecedor, /*desconto*/ 0.10);
    }

}
