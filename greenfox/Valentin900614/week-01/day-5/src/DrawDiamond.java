import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gimme a number!");
        int a = scanner.nextInt();

        for(int i=1; i<=a; i++) {
            for(int j=0; j<a-i; j++) {
                System.out.print(" ");
            }
            for(int j=0; j<(2*i-1); j++) {
                System.out.print("*");
            }
                System.out.println();
        }

        for (int i=1; i<a; i++) {
            for (int j=a; j>a-i; j--) {
                System.out.print(" ");
            }
            for (int j=a+3; j>=(2*i); j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
