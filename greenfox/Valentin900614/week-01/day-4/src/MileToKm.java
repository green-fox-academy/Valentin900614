import java.util.Scanner;

public class MileToKm {
        public static void main(String[] args) {
            // Write a program that asks for an integer that is a distance in kilometers,
            // then it converts that value to miles and prints it
            System.out.println("Gimme a distance in km!");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            double b;
            b = 1.6*a;
            System.out.println("The gives distance is " + b + " in miles.");
        }
}
