import java.lang.reflect.Array;
import java.util.Arrays;

public class DiagonalMatrix {
    public static void main(String[] args) {
        // - Create (dynamically) a two dimensional array
        //   with the following matrix. Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        // - Print this two dimensional array to the output

        int[][] matrix = new int[4][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j==i)
                    matrix[i][j]=1;
                else
                    matrix[i][j]=0;
            }

        }

        for (int[] all : matrix) {
            System.out.println(Arrays.toString(all));
        }

    }
}
