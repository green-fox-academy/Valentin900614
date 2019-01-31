public class Counter {
    public static void main(String[] args) {
        // Write a recursive function that takes one parameter: n and counts down from n.

        countdown(10);

    }

    public static void countdown(int n) {
        System.out.println(n);
        if (n > 0) {
            countdown(n-1);
        }
    }

}
