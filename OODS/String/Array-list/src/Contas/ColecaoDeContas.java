package Contas;

import java.util.ArrayList;
import Contas.Poupanca;

public class ColecaoDeContas {
    
    ArrayList<Conta> contas = new ArrayList<Conta>();

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void removerConta(int idConta) {
        for(int i = 0 ; i < contas.size() ; i++) {
            if(contas.get(i).getId() == idConta) {
                contas.remove(contas.get(i));
            }
            else {
                System.out.println("Não existe nenhuma conta com esse id!");
            }
        }
    }

    public void listarClientes() {
        for(int i = 0 ; i < contas.size() ; i++) {
            System.out.printf("%d - %s \nSaldo disponível: R$ %.2f\n--------------------------------------------------------------------\n", contas.get(i).getId(), contas.get(i).getNome(), contas.get(i).getSaldo());
        }
    }

    public int getSize() {
        return contas.size();
    }

    public void depositarNaConta(int idConta, double valorDeposito) {
        double valor = valorDeposito;

        for(int i = 0 ; i < contas.size() ; i++) {
            if(contas.get(i).getId() == idConta) {
                contas.get(i).depositar(valor);
            }
        }
    }
    
    public void sacarNaConta(int idConta, double valorSaque) {
        double valor = valorSaque;
        
        for(int i = 0 ; i < contas.size() ; i++) {
            if(contas.get(i).getId() == idConta) {
                contas.get(i).sacar(valor);
            }
        }
    }

    public void juros(int idConta) {
        for (int i = 0; i < contas.size() ; i++) {
            if(contas.get(i).getId() == idConta) {
                if(contas.get(i) instanceof Poupanca) {
                    Poupanca poup;

                    poup = (Poupanca)contas.get(i);

                    poup.renderJuros();
                }
                else {
                    System.out.println("\nEsta conta não é do tipo poupanca!");
                }
            }
        }
    }

}
