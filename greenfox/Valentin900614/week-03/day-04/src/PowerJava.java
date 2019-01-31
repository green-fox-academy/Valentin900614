public class PowerJava {
    public static void main(String[] args) {
        // Given base and n that are both 1 or more, compute recursively (no loops)
        // the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

        System.out.println(powerN(10, 3));

    }

    public static int powerN(int base, int n) {

        if ( n == 0 ) {
            return 1;
        }
        if ( n % 2 == 1 ) {
            // Odd n
            return base * powerN( base, n/2 ) * powerN(base, n/2 );
        } else {
            // Even n
            return powerN( base, n/2 ) * powerN( base, n/2 );
        }

    }

}
