import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gimme the first number!");
        int a = scanner.nextInt();

        System.out.println("Gimme the second number!");
        int b = scanner.nextInt();

        if(a>b) {
            System.out.println(a + " is bigger.");
        } else if (a<b) {
            System.out.println(b + " is bigger.");
        } /* else
            System.out.println(a + " and " + b + " are even!"); */

    }
}
