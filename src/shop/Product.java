package shop;

public class Product {
    String productName;
    double productPrice;

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



    public void info(){
        System.out.println("Product Name: " + this.productName);
        System.out.println("Product price: " + this.productPrice);
    }

}
