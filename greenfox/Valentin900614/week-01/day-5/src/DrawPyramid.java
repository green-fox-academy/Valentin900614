import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {

    // Write a program that reads a number from the standard input, then draws a
    // pyramid like this:
    //
    //
    //    *
    //   ***
    //  *****
    // *******
    //
    // The pyramid should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gimme a number!");
        int a = scanner.nextInt();
        int b = 1;
        int c = a/2;

        for(int i=1; i<=a; i++) {
            for(int j=0; j<a-i; j++) {
                System.out.print(" ");
            }
            for(int j=0; j<(2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }

}
