public class SumDigit {
    public static void main(String[] args) {
        // Given a non-negative int n, return the sum of its digits recursively (no loops).
        // Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
        // divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

        System.out.println(sum(132));

    }

    public static int sum (int n) {
        int sum = 0;
        if (n > 0) {
            sum = sum + n % 10 + sum(n / 10);
        }
        return sum;
    }

}
