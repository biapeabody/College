import java.util.*;

import utils.Utils;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Utils utilsFunctions = new Utils();
        
        utilsFunctions.createProducts();
        
        Boolean isUserActive = true;
        
        for (int i = 0; i < 50; ++i) System.out.println (); // Limpa a tela
        System.out.println("Farmácia UPE Caruaru 2021!!!\n");

        while (isUserActive) {
            
            System.out.println("\n1- Ver produtos    2- Adicionar ao carrinho    3- Ver carrinho    4- Sair\n");
            
            System.out.print("Digite uma opção: ");
            int option = sc.nextInt();
            
            if(option == 1) {
                for (int i = 0; i < 50; ++i) System.out.println (); // Limpa a tela

                System.out.println("\n1 - Medicamentos    2 - Cosméticos");

                System.out.print("Opção: ");
                int option2 = sc.nextInt();
                
                if (option2 == 1) {
                    utilsFunctions.showMedicamentos();
                }
                else if (option2 == 2){
                    utilsFunctions.showCosmeticos();
                }
            }
            else if(option == 2) {
                for (int i = 0; i < 50; ++i) System.out.println (); // Limpa a tela

                System.out.print("Digite o id do produto que deseja comprar: ");
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