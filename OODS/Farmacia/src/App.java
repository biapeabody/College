import java.util.*;

import utils.Utils;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Utils utilsFunctions = new Utils();
        
        utilsFunctions.createProducts();
        
        Boolean isUserActive = true;
        
        while (isUserActive) {
            for (int i = 0; i < 50; ++i) System.out.println (); // Limpa a tela
            
            System.out.println("Farmácia UPE Caruaru 2021!!!\n");
            
            System.out.println("\n1- Ver produtos    2- Adicionar ao carrinho    3- Ver carrinho    4- Sair\n");
            
            System.out.print("Digite uma opção: ");
            int option = sc.nextInt();
            
            if(option == 1) {
                for (int i = 0; i < 50; ++i) System.out.println (); // Limpa a tela

                utilsFunctions.showProducts();
            }
            else if(option == 2) {
                for (int i = 0; i < 50; ++i) System.out.println (); // Limpa a tela

                utilsFunctions.showAllProducts();

                System.out.print("\nDigite o id do produto que deseja comprar: ");
                int productId = sc.nextInt();
                
                System.out.print("Quantos produtos: ");
                int productQuantity = sc.nextInt();
                
                utilsFunctions.addToCart(productId, productQuantity);
            }
            else if(option == 3) {
                utilsFunctions.showCart();
            }
            else if(option == 4) {
                System.out.println("Muito obrigado e volte sempre!!!");
                isUserActive = false;
            }
        }
        sc.close();
    }
}   