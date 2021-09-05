package produtos;

public class Produto {
    
    int idProduto;
    String nomeProduto;
    double preco;
    String descricao;
    double maxDescount;
    private int estoque;
    private String validade;
    private String nomeFornecedor;

    public Produto() {}

    public Produto(int idProduto ,String nomeProduto, double preco, String descriçao, int estoque, String validade, String nomeFornecedor, double maxDescount) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.descricao = descriçao;
        this.estoque = estoque;
        this.validade = validade;
        this.nomeFornecedor = nomeFornecedor;
        this.maxDescount = maxDescount;
    }

    public int getId() { return this.idProduto; }

    public String getName() { return this.nomeProduto; }

    public double getPreco() { return this.preco; }

    public String getDescricao() { return this.descricao; }

    public int getEstoque() { return this.estoque; }

    public String getValidade() { return this.validade; }

    public String getNomeFornecedor() { return this.nomeFornecedor; }

    public double getMaxDiscount() { return this.maxDescount; }

    public void setPreco(double novoPreco) { this.preco = novoPreco; }

    public void setEstoque(int estoqueAtualizado) { this.estoque += estoqueAtualizado; }

}