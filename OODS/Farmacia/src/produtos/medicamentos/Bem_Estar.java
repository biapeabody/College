package produtos.medicamentos;

import produtos.Produto;

public class Bem_Estar extends Produto {
    
    public Bem_Estar() {}
    
    public Bem_Estar(int idProduto, 
                     String nomeProduto, 
                     double preco, 
                     String descricao, 
                     int estoque, 
                     String validade, 
                     String nomeFornecedor) {
        super(idProduto, nomeProduto, preco, descricao, estoque, validade, nomeFornecedor, /* desconto */ 0.10);
    }
    
}
