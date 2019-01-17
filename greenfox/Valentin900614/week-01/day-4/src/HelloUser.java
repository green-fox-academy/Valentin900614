import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        System.out.println("Gimme your name!");
        Scanner scanner = new Scanner(System.in);

        // The program stops and waits for user input and to press enter
        String nev = scanner.nextLine();
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user
        System.out.println("Hello, " + nev + "!");
    }
}
