package shop;

import java.util.Arrays;

public class ShopApp {
    public static void main(String[] args) {
        Product product = new Product("Milk", 30.99);
        Product product1 = new Product("Rice");
        Product product2 = new Product();
            product2.setProductName("Milk");
            product2.setProductPrice(23.99);
            //product2.info();

        Product myShop[] = {product, product1, product2};

       ProductService productService = new ProductService();
       productService.viewAllProduct(myShop);


    }




}
