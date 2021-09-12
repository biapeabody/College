package carrinho;

public class Cliente {
    String nome;
    String cpf;

    public Cliente() {}

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getName() { return this.nome; }

    public String getCpf() { return this.cpf; }

    public Boolean verifyClientData() {
        if(this.nome.length() >= 2 && this.cpf.length() == 11) {
            return true;
        }
        else {
            return false;
        }
    }
}
