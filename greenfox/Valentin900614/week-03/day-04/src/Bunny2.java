public class Bunny2 {
    public static void main(String[] args) {
        // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
        // (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
        // have 3 ears, because they each have a raised foot. Recursively return the
        // number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

        System.out.println(ears(12));

    }

    public static int ears (int n) {
        int a = 0;
        if (n == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            a += 3 + ears(n - 1);
            return a;
        } else {
            a += 2 + ears(n - 1);
        }
        return a;
    }
}
