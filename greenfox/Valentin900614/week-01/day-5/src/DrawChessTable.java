public class DrawChessTable {
    public static void main(String[] args) {
        // Crate a program that draws a chess table like this
        //
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        //
        int num = 8;

        for (int i=1; i <= num; i++) {
            if (i%2==0)
                System.out.println("% % % %");
            else
                System.out.println(" % % % %");
        }


    }
}
