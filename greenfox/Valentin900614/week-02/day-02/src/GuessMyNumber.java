import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {
        guessing();
    }

    private static void guessing () {
        int randomNumber = 1 + (int) (Math.random() * 99); //nem hajlandó mást generálni csak 1-est
        Scanner scanner = new Scanner(System.in);
        int guessedNumber;
        int lives = 5;

        do {
            System.out.println("I have a number between 1 and 100. Guess a number! You have " + lives + " lives left.");
            guessedNumber = scanner.nextInt();
            if (guessedNumber > randomNumber) {
                lives--;
                System.out.println("Too high! You have " + lives + " lives left.");
            } else if (guessedNumber < randomNumber) {
                lives--;
                System.out.println("Too low! You have " + lives + " lives left.");
            } else
                break;
        } while (lives != 0);

        if (lives > 0) {
            System.out.println("You won!");
        } else
            System.out.println("You lost!");
    }
}
