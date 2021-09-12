package produtos.cosmeticos;

import produtos.Produto;

public class Cabelos_Unhas extends Produto {
    
    public Cabelos_Unhas() {}
    
    public Cabelos_Unhas(int idProduto, 
                         String nomeProduto, 
                         double preco, 
                         String descricao, 
                         int estoque, 
                         String validade, 
                         String nomeFornecedor) {
        super(idProduto, nomeProduto, preco, descricao, estoque, validade, nomeFornecedor, /* desconto máximo */ 0.20);
    }

}
