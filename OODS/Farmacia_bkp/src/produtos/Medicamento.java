package produtos;

public class Medicamento extends Produto {

    public Medicamento() {
        super();
    }

    public Medicamento(int idProduto ,String nomeProduto ,double preco, String descricao, int estoque, String validade, String nomeFornecedor) {
        super(idProduto ,nomeProduto, preco, descricao, estoque, validade, nomeFornecedor, 0.10);
    }

}
