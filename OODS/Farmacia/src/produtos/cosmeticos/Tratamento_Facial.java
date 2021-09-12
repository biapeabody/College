package produtos.cosmeticos;

import produtos.Produto;

public class Tratamento_Facial extends Produto {
    
    public Tratamento_Facial() {}
    
    public Tratamento_Facial(int idProduto, 
                             String nomeProduto, 
                             double preco, 
                             String descricao, 
                             int estoque, 
                             String validade, 
                             String nomeFornecedor) {
        super(idProduto, nomeProduto, preco, descricao, estoque, validade, nomeFornecedor, /* desconto */ 0.20);
    }

}
