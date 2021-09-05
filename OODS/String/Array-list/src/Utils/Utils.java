package Utils;

import java.util.Scanner;

import Contas.Conta;
import Contas.ColecaoDeContas;
import Contas.Poupanca;

public class Utils {
    
    int CONTADOR = 1;
    
    Scanner sc = new Scanner(System.in);

    ColecaoDeContas contas = new ColecaoDeContas();
    
    public void abrirConta() {
        for (int i = 0; i < 50; ++i) System.out.println (); // Limpa a tela
        
        System.out.println("Qual tipo de conta você deseja abrir?\n1- Conta padrão    2- Poupança\n");
        
        int tipoConta = sc.nextInt();
        
        if(tipoConta == 1){
            
            for (int i = 0; i < 50; ++i) System.out.println (); // Limpa a tela
            
            int idCliente = CONTADOR;
            
            System.out.print("Digite seu nome: ");
            String nomeCliente = sc.next();
            
            System.out.print("\nDigite o valor do depósito inicial: R$ ");
            double saldoCliente = sc.nextDouble();
            
            Conta cliente = new Conta(idCliente, nomeCliente, saldoCliente);
            
            contas.adicionarConta(cliente);
            
            CONTADOR = CONTADOR + 1;
            
        }
        else if(tipoConta == 2){
            for (int i = 0; i < 50; ++i) System.out.println (); // Limpa a tela
            
            int idCliente = CONTADOR;
            
            System.out.print("Digite seu nome: ");
            String nomeCliente = sc.next();
            
            System.out.print("\nDigite o valor do depósito inicial: R$ ");
            double saldoCliente = sc.nextDouble();
            
            Poupanca cliente = new Poupanca(idCliente, nomeCliente, saldoCliente);
            
            contas.adicionarConta(cliente);
            
            CONTADOR = CONTADOR + 1;
        }
        else {
            for (int i = 0; i < 50; ++i) System.out.println (); // Limpa a tela
            System.out.println ("Opção inválida!");
        }
    }
    
    public void depositarNaConta() {
        if(contas.getSize() <= 0) {
            for (int i = 0; i < 50; ++i) System.out.println (); // Limpa a tela
            
            System.out.println ("Não existe nenhuma conta cadastrada!\n");
        }
        else {
            for (int i = 0; i < 50; ++i) System.out.println (); // Limpa a tela
            
            System.out.print ("Digite o id da conta que deseja depositar o valor: ");
            int id = sc.nextInt();
            
            System.out.print ("\nDigite o valor do deposito: ");
            double deposito = sc.nextDouble();
            
            contas.depositarNaConta(id, deposito);
        }
    }
    
    public void sacarNaConta() {
        if(contas.getSize() <= 0) {
            for (int i = 0; i < 50; ++i) System.out.println (); // Limpa a tela
            System.out.println ("Não existe nenhuma conta cadastrada!\n");
        }
        else {
            for (int i = 0; i < 50; ++i) System.out.println ();
            
            System.out.print ("Digite o id da conta que deseja sacar: ");
            int id = sc.nextInt();
            
            System.out.print ("\nDigite o valor do saque: ");
            double saque = sc.nextDouble();
            
            contas.sacarNaConta(id, saque);
        }
    }
    
    public void fecharConta() {
        if(contas.getSize() <= 0) {
            for (int i = 0; i < 50; ++i) System.out.println (); // Limpa a tela
            System.out.println ("Não existe nenhuma conta cadastrada!\n");
        }
        else {
            for (int i = 0; i < 50; ++i) System.out.println ();
            
            System.out.print ("Digite o id da conta que deseja excluir: ");
            int id = sc.nextInt();
            
            contas.removerConta(id);
        }
    }
    
    public void listarClientes() {
        for (int i = 0; i < 50; ++i) System.out.println (); // Limpa a tela
        
        contas.listarClientes();
    }

    public void addJuros() {
        System.out.print("Digite o id da conta: ");
        int idCliente = sc.nextInt();

        contas.juros(idCliente);
    }
    
}
