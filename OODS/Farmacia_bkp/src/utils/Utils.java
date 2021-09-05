package utils;

import java.util.*;
import produtos.*;
import carrinho.*;

public class Utils {
    
    ArrayList<Produto> listaDeProdutos = new ArrayList<>();
    ArrayList<Produto_Carrinho> carrinho = new ArrayList<>();

    public void createMedicamentos() {
        Medicamento medicamento1 = new Medicamento(1, "Desloratadina", 8.0, "Bom contra rinite", 20, "12/12/2021", "Drogaria S.A");
        Medicamento medicamento2 = new Medicamento(2, "Benegripe", 10.0, "Bom contra gripe", 10, "12/12/2021", "Drogaria S.A");
        Medicamento medicamento3 = new Medicamento(3, "Dorflex", 5.0, "Bom contra dores musculares", 30, "12/12/2021", "Drogaria S.A");
        Medicamento medicamento4 = new Medicamento(4, "Vitamina C", 15.0, "Bom contra escorbuto", 40, "12/12/2021", "Drogaria S.A");

        listaDeProdutos.add(medicamento1);
        listaDeProdutos.add(medicamento2);
        listaDeProdutos.add(medicamento3);
        listaDeProdutos.add(medicamento4);
    }
    
    public void createCosmeticos() {
        Cosmetico cosmetico1 = new Cosmetico(5, "Esmalte Vermelho", 10.0, "Pinta com meu pinto", 25, "23/07/2022", "Beautiful S.A");
        Cosmetico cosmetico2 = new Cosmetico(6, "Alcool em gel", 15.0, "Mata covid", 40, "25/07/2022", "Beautiful S.A");
        Cosmetico cosmetico3 = new Cosmetico(7, "Algodão", 5.0, "Faz algo", 25, "22/07/2022", "Beautiful S.A");
        Cosmetico cosmetico4 = new Cosmetico(8, "Desodorante", 7.0, "Remove CC", 25, "21/07/2022", "Beautiful S.A");
        
        listaDeProdutos.add(cosmetico1);
        listaDeProdutos.add(cosmetico2);
        listaDeProdutos.add(cosmetico3);
        listaDeProdutos.add(cosmetico4);
    }

    public void showMedicamentos() {
        System.out.println("\nMEDICAMENTOS!");
        for(int i = 0 ; i < listaDeProdutos.size() ; i++) {
            if(listaDeProdutos.get(i) instanceof Medicamento) {
                System.out.println("-------------------------------------------------------");
                System.out.printf("%d: %s - Em estoque %d - R$ %.2f\n", listaDeProdutos.get(i).getId(), listaDeProdutos.get(i).getName(), listaDeProdutos.get(i).getEstoque(), listaDeProdutos.get(i).getPreco());
            }
        }   
    }
    
    public void showCosmeticos() {
        System.out.println("\nCOSMETICOS!");
        for(int i = 0 ; i < listaDeProdutos.size() ; i++) {
            if(listaDeProdutos.get(i) instanceof Cosmetico) {
                System.out.println("-------------------------------------------------------");
                System.out.printf("%d: %s - Em estoque %d - R$ %.2f\n", listaDeProdutos.get(i).getId(), listaDeProdutos.get(i).getName(), listaDeProdutos.get(i).getEstoque(), listaDeProdutos.get(i).getPreco());
            }
        }   
    }
    
    public void addToCart(int productId, int productQuantity) {
        for(int i = 0 ; i < listaDeProdutos.size(); i++) {
            if(listaDeProdutos.get(i).getId() == productId) {
                Produto_Carrinho produto = new Produto_Carrinho(listaDeProdutos.get(i).getId(), 
                                                                listaDeProdutos.get(i).getName(), 
                                                                listaDeProdutos.get(i).getPreco(),
                                                                listaDeProdutos.get(i).getMaxDiscount(),
                                                                productQuantity);

                carrinho.add(produto);
                listaDeProdutos.get(i).setEstoque(-productQuantity);
            }
        }
    }

    public void showCart() {
        for(int i = 0; i < carrinho.size() ; i++) {
            System.out.printf("%dº- %s R$ %.2f - Qtd %d\n", i + 1, carrinho.get(i).getName(), carrinho.get(i).getPrice(), carrinho.get(i).getQuantity());
        }
    }

    // private Cosmetico findCosmetico(int productId) {
    //     for(int i = 0 ; i < listaDeProdutos.size() ; i++) {
    //         if(listaDeProdutos.get(i).getId() == productId) {
    //             return listaDeProdutos.get(i);
    //         }
    //     }
    // }
    
    // private Medicamento findMedicamento(int productId) {
    //     for(int i = 0; i < listaDeProdutos.size() ; i++) {
    //         if(listaDeProdutos.get(i).getId() == productId) {
    //             return listaDeProdutos.get(i);
    //         }
    //     }
    // }


}
