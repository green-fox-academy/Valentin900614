public class Refactorio {
    public static void main(String[] args) {
        // Create a recursive function called `refactorio`
        // that returns it's input's factorial

        System.out.println(factorio(8));

    }

    public static int factorio (int num) {
        int sum = 0;
        if (num == 0) {
            return 1;
        } else {
            sum = num * factorio(num - 1);
            return sum;
        }
    }

}
