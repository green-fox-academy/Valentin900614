import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        //  Create the usual class wrapper
        //  and main method on your own.

        // - Write a function called `sum` that sum all the numbers
        //   until the given parameter and returns with an integer

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gimme a number!");
        int in = scanner.nextInt();

        System.out.println(sum(in));

    }

    public static int sum (int num) {
        int all = 0;
        for (int i = 1; i < num ; i++) {
            all = all + i;
        }
        return all;
    }

}
