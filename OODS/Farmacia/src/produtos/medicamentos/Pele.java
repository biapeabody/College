package produtos.medicamentos;

import produtos.Produto;

public class Pele extends Produto {
    
    public Pele() {}
    
    public Pele(int idProduto, 
                String nomeProduto, 
                double preco, 
                String descricao, 
                int estoque, 
                String validade, 
                String nomeFornecedor) {
        super(idProduto, nomeProduto, preco, descricao, estoque, validade, nomeFornecedor, /* desconto */ 0.10);
    }

}
