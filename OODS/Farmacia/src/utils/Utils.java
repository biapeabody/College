package utils;

import java.util.*;
import produtos.*;
import carrinho.*;

public class Utils {
    
    ArrayList<Produto> listaDeProdutos = new ArrayList<>();
    ArrayList<Produto_Carrinho> carrinho = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    public void createProducts() {
        Produto medicamento1 = new Medicamento(1, "Desloratadina", 8.0, "Bom contra rinite", 20, "12/12/2021", "Drogaria S.A");
        Produto medicamento2 = new Medicamento(2, "Benegripe", 10.0, "Bom contra gripe", 10, "12/12/2021", "Drogaria S.A");
        Produto medicamento3 = new Medicamento(3, "Dorflex", 5.0, "Bom contra dores musculares", 30, "12/12/2021", "Drogaria S.A");
        Produto medicamento4 = new Medicamento(4, "Vitamina C", 15.0, "Bom contra escorbuto", 40, "12/12/2021", "Drogaria S.A");
        Produto cosmetico1 = new Cosmetico(5, "Esmalte Vermelho", 10.0, "Pinta com meu pinto", 25, "23/07/2022", "Beautiful S.A");
        Produto cosmetico2 = new Cosmetico(6, "Alcool em gel", 15.0, "Mata covid", 40, "25/07/2022", "Beautiful S.A");
        Produto cosmetico3 = new Cosmetico(7, "Algodão", 5.0, "Faz algo", 25, "22/07/2022", "Beautiful S.A");
        Produto cosmetico4 = new Cosmetico(8, "Desodorante", 7.0, "Remove CC", 25, "21/07/2022", "Beautiful S.A");
        
        listaDeProdutos.add(cosmetico1);
        listaDeProdutos.add(cosmetico2);
        listaDeProdutos.add(cosmetico3);
        listaDeProdutos.add(cosmetico4);
        listaDeProdutos.add(medicamento1);
        listaDeProdutos.add(medicamento2);
        listaDeProdutos.add(medicamento3);
        listaDeProdutos.add(medicamento4);
    }
    
    public void showMedicamentos() {
        for (int i = 0; i < 50; ++i) System.out.println (); // Limpa a tela
        
        
        System.out.println("\nMEDICAMENTOS!");
        for (Produto produto : listaDeProdutos){
            if (produto instanceof Medicamento){
                System.out.println("-------------------------------------------------------");
                System.out.printf("%d: %s - Em estoque %d - R$ %.2f\n", produto.getId(), produto.getName(), produto.getEstoque(), produto.getPreco());
            }
        }
    }
    
    public void showCosmeticos() {
        for (int i = 0; i < 50; ++i) System.out.println (); // Limpa a tela
        
        System.out.println("\nCOSMETICOS!");
        for (Produto produto : listaDeProdutos){
            if (produto instanceof Cosmetico){
                System.out.println("-------------------------------------------------------");
                System.out.printf("%d: %s - Em estoque %d - R$ %.2f\n", produto.getId(), produto.getName(), produto.getEstoque(), produto.getPreco());
            }
        }
    }
    
    public void addToCart(int productId, int productQuantity) {
        for (int i = 0; i < 50; ++i) System.out.println (); // Limpa a tela
        
        for(int i = 0 ; i < listaDeProdutos.size(); i++) {
            if(listaDeProdutos.get(i).getId() == productId) {
                Produto_Carrinho produto = new Produto_Carrinho(listaDeProdutos.get(i).getId(), 
                listaDeProdutos.get(i).getName(), 
                listaDeProdutos.get(i).getPreco(),
                listaDeProdutos.get(i).getMaxDiscount(),
                productQuantity);
                
                carrinho.add(produto);
                produto.setRandomDiscount();
                
                listaDeProdutos.get(i).setEstoque(-productQuantity);
            }
        }
    }
    
    public void showCart() {
        for (int i = 0; i < 50; ++i) System.out.println (); // Limpa a tela
        
        for(int i = 0; i < carrinho.size() ; i++) {
            System.out.printf("%dº- %s R$ %.2f - Qtd %d\n", i + 1, carrinho.get(i).getName(), carrinho.get(i).getPricePosDiscount(), carrinho.get(i).getQuantity());
        }
        System.out.println("------------------------------");
        System.out.printf("Valor total: R$ %.2f", this.totalValue());
        System.out.println("\n------------------------------");
        
        
        System.out.println("1- Voltar ao menu    2- Remover do carrinho    3- Pagar");
        System.out.printf("Digite a opção: ");
        int option = sc.nextInt();
        
        if(option == 1) {
            
        }
        else if(option == 2) {
            this.removeFromCart();
        }
        else if(option == 3) {
            this.payProducts();
        }
    }
    
    private double totalValue() {
        double totalValue = 0.0;
        for(int i = 0; i < carrinho.size() ; i++) {
            totalValue += (carrinho.get(i).getPricePosDiscount() * carrinho.get(i).getQuantity());
        }
        
        return totalValue;
    }
    
    private void removeFromCart() {
        System.out.print("Qual produto da lista deseja excluir: ");
        int productId = sc.nextInt();
        
        for(int i = 0; i < carrinho.size() ; i++) {
            if(i == productId - 1) 
            carrinho.remove(i);
        }
    }
    
    private void payProducts() {
        for (int i = 0; i < 50; ++i) System.out.println (); // Limpa a tela
        
        System.out.print("Digite o falor a ser pago: R$ ");
        double value = sc.nextDouble();
        
        if (value < this.totalValue()) {
            for (int i = 0; i < 50; ++i) System.out.println (); // Limpa a tela
            
            System.out.println("Se é pobre nem tente comprar!");
        }
        else if(value >= this.totalValue()) {
            for (int i = 0; i < 50; ++i) System.out.println (); // Limpa a tela

            System.out.print("Digite o cpf que vai na nota fiscal: ");
            String cpf = sc.next();

            System.out.println("Muito obrigado pela compra!!!");
            System.out.printf("Seu troco: R$ %.2f\n", value - this.totalValue());
            
            System.out.println("\n1- Sim    2- Não");
            System.out.print("Deseja ver a nota fiscal: ");
            int option = sc.nextInt();
            
            if (option == 1) {
                System.out.println("----------------------------------------");

            }

            for(int i = 0; i < carrinho.size() ; i++) {
                carrinho.remove(i);
            }
        }
    }
    
}
