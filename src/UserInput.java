import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("enter your age: ");
        int age = input.nextInt();
        System.out.println("Enter your height: ");
        double weight = input.nextDouble();

        System.out.println("Your name is : " + name);
        System.out.println("You're " + age +" years old");
        System.out.println("Your weight is : " + weight);



    }
}
