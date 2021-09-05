import java.util.*;
import java.io.IOException;

import Utils.Utils;

public class App {
    public static void main(String[] args) throws Exception {
        Utils funcoes = new Utils();

        Scanner sc = new Scanner(System.in);

        int online = 1;
        
        for (int i = 0; i < 50; ++i) System.out.println (); // Limpa a tela
        
        System.out.println("Bem vindo ao banco da UPE Caruaru!!\n");
        
        while(online != 0) {
            System.out.println("1- Abrir conta    2- Depositar    3- Sacar    4- Excluir Conta    5- Ver clientes   6- Adicionar juros   7- Sair\n");
            
            System.out.print("Digite qual operação deseja realizar: ");
            
            int opcao;
            
            opcao = sc.nextInt();
            
            if(opcao == 1) {
                funcoes.abrirConta();
            }
            else if(opcao == 2) {
                funcoes.depositarNaConta();
            }
            else if(opcao == 3) {
                funcoes.sacarNaConta();
            }
            else if(opcao == 4) {
                funcoes.fecharConta();
            }
            else if(opcao == 5) {
                funcoes.listarClientes();
            }
            else if(opcao == 6) {
                funcoes.addJuros();
            }
            else if(opcao == 7) {
                System.out.println("\n\nVolte sempre!!!");
                
                online = 0;
            }
            else {
                for (int i = 0; i < 50; ++i) System.out.println (); // Limpa a tela
                
                System.out.println("Opção inválida, digite uma correta!");
            }
            
        }
        
        sc.close();
        
    }
}
