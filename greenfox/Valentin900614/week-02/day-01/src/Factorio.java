public class Factorio {
    public static void main(String[] args) {
        //  Create the usual class wrapper
        //  and main method on your own.

        // - Create a function called `factorio`
        //   that returns it's input's factorial

        int num = 4;

        System.out.println(factorio(num));

    }

    public static int factorio (int a) {
        int fact = 1;
        if (a > 0){
            for (int i = 1; i <= a; i++) {
                fact = fact * i;
            }
        }
        return fact;
    }

}
