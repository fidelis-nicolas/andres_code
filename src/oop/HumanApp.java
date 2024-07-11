package oop;

public class HumanApp {
    public static void main(String[] args) {
        //An object is an instance of a class
        Human firstHuman = new Human();
        String name = "Sam";
        firstHuman.age = 19;
        firstHuman.name = name;
        firstHuman.color = "White";
        firstHuman.height = 2.1;

        double result = firstHuman.calculate(34.99, 56.90);
        System.out.println(result);

        System.out.println(firstHuman.humanPassword());

        Human secondHuman = new Human();
        secondHuman.name = "fidelis";
        secondHuman.color = "Blue";
        secondHuman.height = 2.9;
        secondHuman.age = 29;
        System.out.println(secondHuman.humanPassword());

        secondHuman.eat();
        firstHuman.move("London");


        firstHuman.eat(); // calling eat method
        secondHuman.move("Los Angeles");


    }
}
