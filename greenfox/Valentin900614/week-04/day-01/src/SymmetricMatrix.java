import java.util.Scanner;
public class SymmetricMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of rows : ");

        int rows = sc.nextInt();

        System.out.println("Enter the no. of columns : ");

        int cols = sc.nextInt();

        int matrix[][] = new int[rows][cols];

        System.out.println("Enter the elements :");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }


        if (isSymmetric(matrix, rows, cols)){
            System.out.println("The given matrix is symmetric!");
        } else
            System.out.println("The given matrix is NOT symmetric!");
    }

    private static boolean isSymmetric (int[][] array, int rowNumber, int colNumber) {

        System.out.println("Printing the input matrix :");

        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                System.out.print(array[i][j] + "\t");
            }

            System.out.println();
        }

        //Checking the input matrix for symmetric
        boolean symmetric = true;

        if (rowNumber != colNumber) {
            System.out.println("The given matrix is not a square matrix, so it can't be symmetric.");
        } else {
            for (int i = 0; i < rowNumber; i++) {
                for (int j = 0; j < colNumber; j++) {
                    if (array[i][j] != array[j][i]) {
                        symmetric = false;
                        break;
                    }
                }
            }
        }

        if (symmetric && rowNumber == colNumber) {
            return true;
        } else
            return false;
    }
}