package oop;

//Assignment create a class Car with 5 properties and 4 different methods. Create two instances of Car print details on the screen
public class Human {


    // A class is a blueprint of an object

    /*
        ACCESS SPECIFIERS
        1. public -> Accessible by every class in the project
        2. protected -> Accessible to class in the same package
        3. private -> Accessible only inside the class
     */
    /*
        Convention for naming classes
        1. Class names have to begin with uppercase
        2. Class names cannot begin with numbers and special characters except underscore
        3. It has to be one word
     */

    // Properties, State, Fields
    public String name;
    public int age;
    public String color;
    public double height;

    //Methods

    /*
        access specifier return-type method-name (parameters){
            body of program.....
        }
     */

    public void eat(){
        System.out.println(name + " is eating.....");
    }

    public void move(String destination){
        System.out.println("Moving to " + destination );
    }

    public String humanPassword(){
        StringBuilder info = new StringBuilder();
        info.append("Name : " + name+"\n");
        info.append("Age :" + age +"\n");
        info.append("Color :" + color +"\n");
        info.append("Height :" + height +"\n");

        return info.toString();
    }

    public double calculate(double firstNum, double secondNum){
        double total = firstNum + secondNum;
        return total;
    }
}
