package shop;

public class ShopApp {
    public static void main(String[] args) {
        Product product = new Product("Milk", 30.99);
        Product product1 = new Product("Rice");
        Product product2 = new Product();

        product.info();
        product1.productPrice = 23.99;
        product1.info();


    }
}
