import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %%  %
        // % % %
        // %  %%
        // %%%%%
        //
        // The square should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gimme a number!");
        int a = scanner.nextInt();

        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
                if(i>1 && i<a && j>1 && j< a){
                    if(i==j){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                } else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
