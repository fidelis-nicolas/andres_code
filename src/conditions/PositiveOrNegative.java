package conditions;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int number = input.nextInt();

        if(number > 0){
            System.out.println(number + " is positive");
        } else if (number == 0) {
            System.out.println(number + " is zero");
        } else {
            System.out.println(number + " is negative");
        }
    }
}
