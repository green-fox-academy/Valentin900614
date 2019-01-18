import java.util.Scanner;

public class MileToKm {
        public static void main(String[] args) {
            // Write a program that asks for an integer that is a distance in kilometers,
            // then it converts that value to miles and prints it
            Scanner scanner = new Scanner(System.in);
            System.out.println("Gimme a distance in km!");
            int a = scanner.nextInt();
            double b;
            b = 1.609344*a;
            System.out.println("The gives distance is " + b + " in miles.");
        }
}
