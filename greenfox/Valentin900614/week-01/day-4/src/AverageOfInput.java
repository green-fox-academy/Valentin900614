import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4
        System.out.println("Gimme the first number!");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println("Gimme the second number!");
        int b = scanner.nextInt();

        System.out.println("Gimme the third number!");
        int c = scanner.nextInt();

        System.out.println("Gimme the fourth number!");
        int d = scanner.nextInt();

        System.out.println("Gimme the fifth number!");
        int e = scanner.nextInt();

        int sum = a+b+c+d+e;

        System.out.println("The sum of your numbers is: " + sum + ". Their average is: " + sum/5 + ".");
    }
}
