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

        Human secondHuman = new Human();
        secondHuman.name = "fidelis";
        secondHuman.color = "Blue";
        secondHuman.height = 2.9;
        secondHuman.age = 29;

        System.out.println(secondHuman.name);
        System.out.println(secondHuman.age);
        System.out.println(secondHuman.height);
        System.out.println(secondHuman.color);
        secondHuman.eat();
        firstHuman.move("London");


        System.out.println(firstHuman.name);
        System.out.println(firstHuman.age);
        System.out.println(firstHuman.height);
        System.out.println(firstHuman.color);
        firstHuman.eat(); // calling eat method
        secondHuman.move("Los Angeles");


    }
}
