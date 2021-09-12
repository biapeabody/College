package produtos.cosmeticos;

import produtos.Produto;

public class Olhos_Labios extends Produto {
    
    public Olhos_Labios() {}
    
    public Olhos_Labios(int idProduto, 
                        String nomeProduto, 
                        double preco, 
                        String descricao, 
                        int estoque, 
                        String validade, 
                        String nomeFornecedor) {
        super(idProduto, nomeProduto, preco, descricao, estoque, validade, nomeFornecedor, /* desconto */ 0.20);
    }

}
