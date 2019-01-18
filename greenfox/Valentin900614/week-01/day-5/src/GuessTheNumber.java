import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        //
        // The stored number is higher
        // The stried number is lower
        // You found the number: 8

        Scanner scanner = new Scanner(System.in);
        int storedNumber = 13;
        int a = 0;

        while (a!=storedNumber) {
            System.out.println("Guess the number between 1 and 20!");
            a = scanner.nextInt();
            if (storedNumber>a)
                System.out.println("The stored number is higher!");
            else if (storedNumber<a)
                System.out.println("The stored number is lower!");
            else
                System.out.println("You found the number: " + storedNumber);
        }
    }
}
