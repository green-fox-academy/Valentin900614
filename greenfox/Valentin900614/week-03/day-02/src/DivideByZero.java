public class DivideByZero {
    public static void main(String[] args) {
        // Create a function that takes a number
        // divides ten with it,
        // and prints the result.
        // It should print "fail" if the parameter is 0

        try {
            calculate(0);
        } catch (ArithmeticException ex) {
            System.err.println("fail");
        }
    }

    private static void calculate(int a) {
        System.out.println(10 / a);
    }

}
