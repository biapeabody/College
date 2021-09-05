package Contas;
public class Conta {
    
    private int id;
    public String nome;
    public double saldo;

    public Conta(int id, String nome, double saldo) {
        this.id = id;
        this.nome = nome;
        this.saldo = saldo;
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double novoValor) {
        this.saldo = novoValor;
    }

    public void depositar(double novoDeposito) {
        if(novoDeposito <= 0) {
            System.out.println("Valor inválido!");
        } 
        else {
            this.saldo += novoDeposito;
        }
    }

    public void sacar(double novoDebito) {
        if(novoDebito <= 0) {
            System.out.println("Valor inválido!");
        } 
        else {
            this.saldo -= novoDebito;
        }
    }

}