import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gimme a number!");
        int a = scanner.nextInt();
        int b = 1;
        for(int i=1; i<=a; i++) {
            for(int j=1; j<=b; j++) {
                System.out.print("*");
            }
            System.out.println();
            b++;
        }


    }
}
