package carrinho;

import java.util.Random;

public class Produto_Carrinho {
    
    int productId;
    String productName;
    int productQuantity;
    double price;
    double pricePosDiscount;
    double maxDiscount;
    
    public Produto_Carrinho() {}
    
    public Produto_Carrinho(int productId, String productName, double price, double maxDiscount, int productQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.maxDiscount = maxDiscount;
        this.productQuantity = productQuantity;
    }
    
    public String getName() { return this.productName; }
    
    public double getPrice() { return this.price; }
    
    public int getQuantity() { return this.productQuantity; }

    public double getPricePosDiscount() { return this.pricePosDiscount; }
    
    public void setRandomDiscount() {
        Random random = new Random();

        double randomDiscount = random.nextDouble() * this.maxDiscount;

        this.pricePosDiscount = this.price - (randomDiscount * this.price);
    }

}
