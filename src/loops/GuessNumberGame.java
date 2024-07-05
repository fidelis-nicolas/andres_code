package loops;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        // Ask the user after winning or loosing if the user still wants to play before quitting the game.
        // User can choose difficulty level by increasing the boundary of random number
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int randomNumber = rand.nextInt(1,20);

        boolean loop = true;
        int attempts = 5;
        while(loop){
            System.out.print("Guess a number: ");
            int guessNumber = scanner.nextInt();

            if (guessNumber==randomNumber){
                System.out.println("Congratulations!!!");
                loop = false;
            }
            else {
                attempts -=1;
                System.out.println("You have " + attempts +" guesses left");
                if(attempts == 0){
                    System.out.println("Game over");
                    loop = false;
                }
            }
        }
    }
}
