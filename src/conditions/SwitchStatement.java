package conditions;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of Day: ");
        int numDay = scanner.nextInt();

        switch (numDay){
            case 1:
                System.out.println("The day is Monday");
                break;
            case 2:
                System.out.println("Teusday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("This is day does not exist on earth!!!");
        }
    }
}
