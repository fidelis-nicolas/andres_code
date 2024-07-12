package shop;

public class Product {

    private String productName;
    private double productPrice;

    //Constructors -> Are like methods but are used to initialise the fields of the class
    // The concept of having more than one constructor in your class is called constructor overloading

    public Product(){

    }

    public Product(String productName, double productPrice){
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public Product(String productName){
        this.productName = productName;
    }


    //Gettters and Setters
   public void setProductName(String productName){
        this.productName = productName;
   }
   public void setProductPrice(double productPrice){
        this.productPrice = productPrice;
   }

   public String getProductName(){
        return this.productName;
   }
   public double getProductPrice(){
        return this.productPrice;
   }

    public void info(){
        System.out.println("Product Name: " + this.productName);
        System.out.println("Product price: " + this.productPrice);
    }

}
