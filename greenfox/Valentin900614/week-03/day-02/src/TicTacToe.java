import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TicTacToe {

    public static void main(String[] args) {
        // Write a function that takes a filename as a parameter
        // The file contains an ended Tic-Tac-Toe match
        // We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
        // Return "X", "O" or "Draw" based on the input file

        System.out.println(ticTacResult("win-o.txt"));
        // Should print "O"

        System.out.println(ticTacResult("win-x.txt"));
        // Should print "X"

        System.out.println(ticTacResult("draw.txt"));
        // Should print "Draw"
    }

    private static String ticTacResult (String s) {
        Path p = Paths.get(s);
        String out = "";
        try {
        List<String> map = Files.readAllLines(p);
        String[][] chars = new String[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                String temporary = map.get(i).substring(j, j+1);
                chars[i][j] = temporary;
            }
        }

            if ((chars[0][0].equals(chars[1][0])) && (chars[0][0].equals(chars[2][0])))
                System.out.println(chars[0][0]);
            else if ((chars[0][1].equals(chars[1][1])) && (chars[0][1].equals(chars[2][1])))
                System.out.println(chars[0][1]);
            else if ((chars[0][2].equals(chars[1][2])) && (chars[0][2].equals(chars[2][2])))
                System.out.println(chars[0][2]);
            else if ((chars[0][0].equals(chars[0][1])) && (chars[0][0].equals(chars[0][2])))
                System.out.println(chars[0][0]);
            else if ((chars[1][0].equals(chars[2][1])) && (chars[1][0].equals(chars[1][2])))
                System.out.println(chars[1][0]);
            else if ((chars[2][0].equals(chars[2][1])) && (chars[2][0].equals(chars[2][2])))
                System.out.println(chars[2][0]);
            else if ((chars[0][0].equals(chars[1][1])) && (chars[0][0].equals(chars[2][2])))
                System.out.println(chars[0][0]);
            else if ((chars[2][0].equals(chars[1][1])) && (chars[2][0].equals(chars[0][2])))
                System.out.println(chars[2][0]);
            else {
                out = "Draw";
            }

        } catch (Exception ex) {
            System.err.println("error");
        }
        return out;
    }

}