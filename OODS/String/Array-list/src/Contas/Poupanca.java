package Contas;

public class Poupanca extends Conta{
    
    public Poupanca(int idConta, String nomeConta, double saldoConta) {
        super(idConta, nomeConta, saldoConta);
    }

    public void renderJuros() {
        double juros = 0.15;

        super.saldo = super.saldo + (super.saldo * juros);
    }
}
