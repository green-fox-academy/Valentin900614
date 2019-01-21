public class PrintAll {
    public static void main(String[] args) {
        // - Create an array variable named `numbers`
        //   with the following content: `[4, 5, 6, 7]`
        // - Print all the elements of `numbers`

        int[] numbers = new int[4];
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i] = i+4;
        }

        for (int all : numbers) {
            System.out.print(all + " ");
        }

    }
}
