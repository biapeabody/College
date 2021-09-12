package produtos.cosmeticos;

import produtos.Produto;

public class Maos_Pes extends Produto {
    
    public Maos_Pes() {}
    
    public Maos_Pes(int idProduto, 
                    String nomeProduto, 
                    double preco, 
                    String descricao,
                    int estoque, 
                    String validade, 
                    String nomeFornecedor) {
        super(idProduto, nomeProduto, preco, descricao, estoque, validade, nomeFornecedor, /* desconto máximo */ 0.20);
    }

}
