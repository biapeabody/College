package utils;

import java.util.*;

import produtos.*;
import produtos.medicamentos.*;
import produtos.cosmeticos.*;
import carrinho.*;

public class Utils  {
    
    ArrayList<Produto> listaDeProdutos = new ArrayList<>();
    ArrayList<Produto_Carrinho> carrinho = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    public void createProducts() {
        Produto cabelo_unha1 = new Cabelos_Unhas(1, "Escova de Cabelo", 70.0, "Alisa os cabelos", 35, "21/02/2022", "Health S.A");
        Produto cabelo_unha2 = new Cabelos_Unhas(2, "Pente Fino", 5.0, "Pentea os cabelos", 35, "21/02/2022", "Health S.A");
        Produto cabelo_unha3 = new Cabelos_Unhas(3, "Unha Postiça", 15.0, "Engana Bem", 35, "21/02/2022", "Health S.A");
        Produto cabelo_unha4 = new Cabelos_Unhas(4, "Secador de Cabelos", 500.0, "Seca os cabelos e as vezes roupa", 35, "21/02/2022", "Health S.A");
        Produto maos_pes1 = new Maos_Pes(5, "Esmalte Vermelho", 10.0, "Deixa as unhas bonitas", 35, "21/02/2022", "Beautiful S.A");
        Produto maos_pes2 = new Maos_Pes(6, "Lixa de Pé", 5.0, "Retira pele morta", 35, "21/02/2022", "Beautiful S.A");
        Produto maos_pes3 = new Maos_Pes(7, "Lixa de Unha", 3.0, "Remove as partes afiadas", 35, "21/02/2022", "Beautiful S.A");
        Produto maos_pes4 = new Maos_Pes(8, "Cortador de Unha", 3.0, "Diminui as unhas", 35, "21/02/2022", "Beautiful S.A");
        Produto olhos_labios1 = new Olhos_Labios(9, "Batom Nude", 20.0, "Deixa os Lábios Bonitos", 35, "21/02/2022", "Health S.A");
        Produto olhos_labios2 = new Olhos_Labios(10, "Gloss", 8.0, "Aumenta imunidade", 35, "21/02/2022", "Health S.A");
        Produto olhos_labios3 = new Olhos_Labios(11, "Rímel", 12.0, "Vire uma gotica/gótico", 35, "21/02/2022", "Health S.A");
        Produto olhos_labios4 = new Olhos_Labios(12, "Sombra", 15.0, "Full Dark", 35, "21/02/2022", "Health S.A");
        Produto tratamento_facial1 = new Tratamento_Facial(13, "Remédio para Acne", 40.0, "Elimina espinhas", 35, "21/02/2022", "Health S.A");
        Produto tratamento_facial2 = new Tratamento_Facial(14, "Hidratante Noturno", 30.0, "Hidrata a pele durante o sono", 35, "21/02/2022", "Health S.A");
        Produto tratamento_facial3 = new Tratamento_Facial(15, "Máscara de Barro", 20.0, "Limpa a pele", 35, "21/02/2022", "Health S.A");
        Produto tratamento_facial4 = new Tratamento_Facial(16, "Removedor de Cravos", 10.0, "Remove os cravos", 35, "21/02/2022", "Health S.A");
        Produto bem_estar1 = new Bem_Estar(17, "Própolis", 10.0, "Aumenta imunidade", 35, "21/02/2022", "Health S.A");
        Produto bem_estar2 = new Bem_Estar(18, "Vitamina D3", 20.0, "Absorve melhor os nutrientes", 35, "21/02/2022", "Health S.A");
        Produto bem_estar3 = new Bem_Estar(19, "Vitamina C", 15.0, "Bom contra escorbuto", 40, "12/12/2021", "Drogaria S.A");
        Produto bem_estar4 = new Bem_Estar(20, "Ômega 3", 25.0, "Anti Inflamatório", 35, "21/02/2022", "Health S.A");
        Produto digestao1 = new Digestao(21, "Emosec", 3.0, "Deixa bom depois do PT", 35, "21/02/2022", "Health S.A");
        Produto digestao2 = new Digestao(22, "Chá de Boldo", 2.0, "Cura dor de barriga", 35, "21/02/2022", "Health S.A");
        Produto digestao3 = new Digestao(23, "Anil Estrelado", 3.0, "Cura o estômago de qualquer coisa", 35, "21/02/2022", "Health S.A");
        Produto digestao4 = new Digestao(24, "Epocler", 5.0, "Deixa bom depois de uma cana", 35, "21/02/2022", "Health S.A");
        Produto pele1 = new Pele(25, "Máscara Facial", 10.0, "Deixa a pele limpa", 35, "21/02/2022", "Beautiful S.A");
        Produto pele2 = new Pele(26, "Hidratante", 7.50, "Deixa a pele brilhante e nova", 48, "21/02/2022", "Beautiful S.A");
        Produto pele3 = new Pele(27, "Sabonete Íntimo", 9.50, "Deixa cherozin", 60, "21/02/2022", "Beautiful S.A");
        Produto pele4 = new Pele(28, "Creme contra Ácne", 25.0, "Remove espinhas indesejadas", 40, "21/02/2022", "Beautiful S.A");
        Produto visao1 = new Visao(29, "Soro Fisiológico", 12.0, "Lubrifica os olhos", 70, "21/02/2022", "Health S.A");
        Produto visao2 = new Visao(30, "Lacrifilm", 17.0, "Lubrifica os olhos", 80, "21/02/2022", "Health S.A");
        Produto visao3 = new Visao(31, "Optive", 17.50, "Lubrifica os olhos", 60, "21/02/2022", "Health S.A");
        Produto visao4 = new Visao(32, "Systane", 20.0, "Lubrifica os olhos", 50, "21/02/2022", "Health S.A");
        
        listaDeProdutos.add(cabelo_unha1);
        listaDeProdutos.add(cabelo_unha2);
        listaDeProdutos.add(cabelo_unha3);
        listaDeProdutos.add(cabelo_unha4);
        listaDeProdutos.add(maos_pes1);
        listaDeProdutos.add(maos_pes2);
        listaDeProdutos.add(maos_pes3);
        listaDeProdutos.add(maos_pes4);
        listaDeProdutos.add(olhos_labios1);
        listaDeProdutos.add(olhos_labios2);
        listaDeProdutos.add(olhos_labios3);
        listaDeProdutos.add(olhos_labios4);
        listaDeProdutos.add(tratamento_facial1);
        listaDeProdutos.add(tratamento_facial2);
        listaDeProdutos.add(tratamento_facial3);
        listaDeProdutos.add(tratamento_facial4);
        listaDeProdutos.add(bem_estar1);
        listaDeProdutos.add(bem_estar2);
        listaDeProdutos.add(bem_estar3);
        listaDeProdutos.add(bem_estar4);
        listaDeProdutos.add(digestao1);
        listaDeProdutos.add(digestao2);
        listaDeProdutos.add(digestao3);
        listaDeProdutos.add(digestao4);
        listaDeProdutos.add(pele1);
        listaDeProdutos.add(pele2);
        listaDeProdutos.add(pele3);
        listaDeProdutos.add(pele4);
        listaDeProdutos.add(visao1);
        listaDeProdutos.add(visao2);
        listaDeProdutos.add(visao3);
        listaDeProdutos.add(visao4);
    }
    
    public void showMedicamentos() {
        for (int i = 0; i < 50; ++i) System.out.println (); // Limpa a tela
        
        System.out.println ("1- Bem Estar    2- Digestão    3- Pele    4- Visão");
        System.out.print ("Opção: ");
        int option = sc.nextInt();

        switch (option) {
            case 1: 
                showBemEstar();
                break;
            case 2: 
                showDigestao();
                break;
            case 3: 
                showPele();
                break;
            case 4: 
                showVisao();
                break;
        }
    }
    
    public void showCosmeticos() {
        for (int i = 0; i < 50; ++i) System.out.println (); // Limpa a tela
        
        System.out.println ("1- Cabelos e Unhas    2- Mãos e Pés    3- Olhos e Lábios    4- Tratamento Facial");
        System.out.print ("Opção: ");
        int option = sc.nextInt();

        switch (option) {
            case 1: 
                showCabelosUnhas();
                break;
            case 2: 
                showMaosPes();
                break;
            case 3: 
                showOlhosLabios();
                break;
            case 4: 
                showTratamentoFacial();
                break;
        }
    }
    
    public void showBemEstar() {
        for (Produto produto : listaDeProdutos){
            if (produto instanceof Bem_Estar){
                System.out.println("Produtos de Bem Estar");
                System.out.println("\n-------------------------------------------------------");
                System.out.printf("%d: %s - Em estoque %d - R$ %.2f\n", produto.getId(), produto.getName(), produto.getEstoque(), produto.getPreco());
            }
        }

        System.out.print("\nDigite algo para continuar...");
        sc.next();
    }

    public void showDigestao() {
        for (Produto produto : listaDeProdutos){
            if (produto instanceof Digestao){
                System.out.println("Produtos para Digestão");
                System.out.println("\n-------------------------------------------------------");
                System.out.printf("%d: %s - Em estoque %d - R$ %.2f\n", produto.getId(), produto.getName(), produto.getEstoque(), produto.getPreco());
            }
        }

        System.out.print("\nDigite algo para continuar...");
        sc.next();
    }

    public void showPele() {
        for (Produto produto : listaDeProdutos){
            if (produto instanceof Pele){
                System.out.println("Produtos para Pele");
                System.out.println("\n-------------------------------------------------------");
                System.out.printf("%d: %s - Em estoque %d - R$ %.2f\n", produto.getId(), produto.getName(), produto.getEstoque(), produto.getPreco());
            }
        }

        System.out.print("\nDigite algo para continuar...");
        sc.next();
    }

    public void showVisao() {
        for (Produto produto : listaDeProdutos){
            if (produto instanceof Visao){
                System.out.println("Produtos para Visao");
                System.out.println("\n-------------------------------------------------------");
                System.out.printf("%d: %s - Em estoque %d - R$ %.2f\n", produto.getId(), produto.getName(), produto.getEstoque(), produto.getPreco());
            }
        }

        System.out.print("\nDigite algo para continuar...");
        sc.next();
    }

    public void showCabelosUnhas() {
        for (Produto produto : listaDeProdutos){
            if (produto instanceof Cabelos_Unhas){
                System.out.println("Produtos para cabelos e unhas");
                System.out.println("\n-------------------------------------------------------");
                System.out.printf("%d: %s - Em estoque %d - R$ %.2f\n", produto.getId(), produto.getName(), produto.getEstoque(), produto.getPreco());
            }
        }

        System.out.print("\nDigite algo para continuar...");
        sc.next();
    }

    public void showMaosPes() {
        for (Produto produto : listaDeProdutos){
            if (produto instanceof Maos_Pes){
                System.out.println("Produtos para Mãos e Pés");
                System.out.println("\n-------------------------------------------------------");
                System.out.printf("%d: %s - Em estoque %d - R$ %.2f\n", produto.getId(), produto.getName(), produto.getEstoque(), produto.getPreco());
            }
        }

        System.out.print("\nDigite algo para continuar...");
        sc.next();
    }

    public void showOlhosLabios() {
        for (Produto produto : listaDeProdutos){
            if (produto instanceof Olhos_Labios){
                System.out.println("Produtos para lábios");
                System.out.println("\n-------------------------------------------------------");
                System.out.printf("%d: %s - Em estoque %d - R$ %.2f\n", produto.getId(), produto.getName(), produto.getEstoque(), produto.getPreco());
            }
        }

        System.out.print("\nDigite algo para continuar...");
        sc.next();
    }

    public void showTratamentoFacial() {
        for (Produto produto : listaDeProdutos){
            if (produto instanceof Tratamento_Facial){
                System.out.println("Produtos para tratamento facial");
                System.out.println("\n-------------------------------------------------------");
                System.out.printf("%d: %s - Em estoque %d - R$ %.2f\n", produto.getId(), produto.getName(), produto.getEstoque(), produto.getPreco());
            }
        }

        System.out.print("\nDigite algo para continuar...");
        sc.next();
    }

    public void addToCart(int productId, int productQuantity) {
        for (int i = 0; i < 50; ++i) System.out.println (); // Limpa a tela
        
        for(int i = 0 ; i < listaDeProdutos.size(); i++) {
            if(listaDeProdutos.get(i).getId() == productId) {
                if(listaDeProdutos.get(i).getEstoque() < productQuantity) {
                    System.out.println("Estoque indisponível!");
                    System.out.println("Digite algo para continuar...");
                    sc.next();
                }
                else {
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
        
            System.out.println("1- Dinheiro   2- Cartão");
            System.out.printf("Digite a opção: ");
            int opc = sc.nextInt();

            if (opc == 1) {
                this.payProductsMoney();
            }else if (opc == 2){
                this.payProductsCard();
            }
            
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
        
        System.out.print("\n\nQuantos produtos deseja excluir: ");
        int productQuantity = sc.nextInt();

        for(int i = 0; i < carrinho.size() ; i++) {
            if(i == productId - 1) 
                carrinho.remove(i);
        }

        for(int i = 0; i < listaDeProdutos.size(); i++) {
            if(i == productId - 1)
                listaDeProdutos.get(i).setEstoque(productQuantity);
        }
    }
    
    private void payProductsMoney() {
        for (int i = 0; i < 50; ++i) System.out.println (); // Limpa a tela
        
        System.out.print("Digite seu nome: ");
        String clienteName = sc.next();

        System.out.print("Digite seu cpf: ");
        String cpf = sc.next();

        Cliente cliente = new Cliente(clienteName, cpf);

        if(cliente.verifyClientData()) {

            for(int i = 0; i < carrinho.size() ; i++) {
                System.out.printf("%dº- %s R$ %.2f - Qtd %d\n", i + 1, carrinho.get(i).getName(), carrinho.get(i).getPricePosDiscount(), carrinho.get(i).getQuantity());
            }
            System.out.println("------------------------------");
            System.out.printf("Valor total: R$ %.2f", this.totalValue());
            System.out.println("\n------------------------------");
            
            System.out.print("Digite o valor a ser pago: R$ ");
            double value = sc.nextDouble();
            
            if (value < this.totalValue()) {
                System.out.println("Dinheiro insuficiente!");
                
                System.out.print("\nDigite algo para continuar...");
                sc.next();
            }
            else if(value >= this.totalValue()) {
                System.out.println("Muito obrigado pela compra!!!");
                System.out.printf("\nSeu troco: R$ %.2f\n", value - this.totalValue());
                
                System.out.print("\nDeseja ver a nota fiscal: ");
                System.out.println("\n1- Sim    2- Não");
                System.out.print("Opção:  ");
                int option = sc.nextInt();
                
                if (option == 1) {
                    System.out.println("\n|----------------------------------------");
                    for(int i = 0; i < carrinho.size() ; i++) {
                        System.out.printf("|%dº- %s R$ %.2f - Qtd %d\n", i + 1, carrinho.get(i).getName(), carrinho.get(i).getPricePosDiscount(), carrinho.get(i).getQuantity());
                    }
                    System.out.println("|----------------------------------------");
                    System.out.printf("|Valor total: R$ %.2f", this.totalValue());
                    System.out.println("\n|----------------------------------------");
                    System.out.printf("|Nome: %s", cliente.getName());
                    System.out.printf("\n|CPF: %s", cliente.getCpf());
                    System.out.println("\n|----------------------------------------");
                    
                    System.out.print("\nDigite algo para continuar...");
                    sc.next();
                }
                
                carrinho.clear();
            }
        }
        else {
            System.out.println("\nDados de usuário inválidos");
            System.out.print("\nDigite algo para continuar...");
            sc.next();
        }
    }

    public void payProductsCard(){

        for (int i = 0; i < 50; ++i) System.out.println (); // Limpa a tela
        
        System.out.print("Digite seu nome: ");
        String clienteName = sc.next();
        System.out.print("Digite seu cpf: ");
        String cpf = sc.next();

        Cliente cliente = new Cliente(clienteName, cpf);

        if(cliente.verifyClientData()) {
            for(int i = 0; i < carrinho.size() ; i++) {
                System.out.printf("%dº- %s R$ %.2f - Qtd %d\n", i + 1, carrinho.get(i).getName(), carrinho.get(i).getPricePosDiscount(), carrinho.get(i).getQuantity());
            }
            System.out.println("------------------------------");
            System.out.printf("Valor total: R$ %.2f", this.totalValue());
            System.out.println("\n------------------------------");
            
            System.out.println("Número do cartão: ");
            String numberCard = sc.next();
            System.out.println("Código de Segurança: ");
            String codSecurity = sc.next();
            System.out.println("Data validade (MM/AA): ");
            String date = sc.next();

            if (testConnection()){

                if (numberCard.length() == 16 && codSecurity.length() == 3 && date.length() == 5){
                    System.out.println("Muito obrigado pela compra!!!");
                    carrinho.clear();
                    System.out.print("\nDigite algo para continuar...");
                    sc.next();
                }else{
                System.out.println("Dados do cartão inválidos");
                System.out.print("\nDigite algo para tentar novamente...");
                sc.next();
                }
                
            }else{
                System.out.println("Erro de conexão na transação!");
                System.out.print("\nDigite algo para tentar novamente...");
                sc.next();
            }
        }
        
    }
    
    public void showProducts() {
        System.out.println("\n1 - Medicamentos    2 - Cosméticos");
        
        System.out.print("Opção: ");
        int option2 = sc.nextInt();
        
        if (option2 == 1) {
            this.showMedicamentos();
        }
        else if (option2 == 2){
            this.showCosmeticos();
        }
    }
    
    public void showAllProducts() {
        for(Produto produto : listaDeProdutos) {
            System.out.printf("%d: %s - Em estoque %d - R$ %.2f\n", produto.getId(), produto.getName(), produto.getEstoque(), produto.getPreco());
        }
    }

    public boolean testConnection(){
        Random random = new Random();

        int connection = random.nextInt(100);

        if (connection >= 90 && connection <= 100) {
            return false;
        }else 
        return true;
    }
    
}
