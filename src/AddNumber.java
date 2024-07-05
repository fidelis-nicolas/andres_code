import java.util.Scanner;

public class AddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int numberOne = input.nextInt();
        System.out.println("Enter second Number: ");
        int numbertwo = input.nextInt();

        System.out.println(numberOne + numbertwo);
    }
}
