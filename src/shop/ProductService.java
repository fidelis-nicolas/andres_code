package shop;

public class ProductService {

    public void viewAllProduct(Product[] products){
        for(int i =0; i< products.length; i++){
            System.out.println("Product Name: " + products[i].getProductName());
            System.out.println("ProductPrice: " + products[i].getProductPrice());
            System.out.println();
        }
    }

    public void totalAmountOfProductPrice(Product products[]){

    }
    public void searchForProductByname(Product products[]){

    }
}
