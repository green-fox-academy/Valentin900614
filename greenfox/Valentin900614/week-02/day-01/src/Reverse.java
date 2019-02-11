public class Reverse {
    public static void main(String[] args) {
        // - Create an array variable named `aj`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements in `aj`
        // - Print the elements of the reversed `aj`

        int[] aj = {3, 4, 5, 6, 7};

        for (int k = 0; k < (aj.length - 1) / 2; k++) {
            int temp = aj[k];
            aj[k] = aj[aj.length - 1 - k];
            aj[aj.length - 1 - k] = temp;
        }

        for (int row : aj) {
            System.out.print(row + " ");
        }

    }
}
