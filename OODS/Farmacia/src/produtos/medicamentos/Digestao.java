package produtos.medicamentos;

import produtos.Produto;

public class Digestao extends Produto {
    
    public Digestao() {}
    
    public Digestao(int idProduto, 
                    String nomeProduto, 
                    double preco, 
                    String descricao, 
                    int estoque, 
                    String validade, 
                    String nomeFornecedor) {
        super(idProduto, nomeProduto, preco, descricao, estoque, validade, nomeFornecedor, /* desconto */ 0.10);
    }

}
