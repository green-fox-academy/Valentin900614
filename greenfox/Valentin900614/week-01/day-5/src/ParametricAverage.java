import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        // Write a program that asks for a number.
        // It would ask this many times to enter an integer,
        // if all the integers are entered, it should print the sum and average of these
        // integers like:
        //
        // Sum: 22, Average: 4.4

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gimme a number!");
        int a = scanner.nextInt();
        float sum = 0;
        float av = 0;

        for (int i = 1; i <=a; i++) {
            System.out.println("Gimme another number!");
            int b = scanner.nextInt();
            sum += b;
        }

        av = sum/a;

        System.out.println("Sum: " + sum + ", Average: " + av);


    }
}
