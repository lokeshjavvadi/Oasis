
import java.util.Scanner;

import java.util.Random;

public class GuessTheNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;

        int attempts = 0;

        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");

        while (true) {

            System.out.print("Enter your guess: ");

            int guess = scanner.nextInt();

            attempts++;

            if (guess < secretNumber) {

                System.out.println("Too low, try again.");

            } else if (guess > secretNumber) {

                System.out.println("Too high, try again.");

            } else {

                System.out.println("Congratulations, you guessed it!");

                System.out.println("It took you " + attempts + " attempts.");

                break;

            }

        }

        scanner.close();

    }

}
