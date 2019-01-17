import java.util.Scanner;

public class AnimalsAndLegs {
        public static void main(String[] args) {
            // Write a program that asks for two integers
            // The first represents the number of chickens the farmer has
            // The second represents the number of pigs owned by the farmer
            // It should print how many legs all the animals have
            System.out.println("How much chickens do you have?");
            Scanner scanner = new Scanner(System.in);
            int chickens = scanner.nextInt();
            int a = 2*chickens;
            System.out.println("How much pigs do you have?");
            int pigs = scanner.nextInt();
            int b = 4*pigs;

            System.out.println("Your animals have " + (a+b) + " legs all together!" );

        }
}
