import org.junit.Test;

public class FibonacciTest {

    @Test
    public void FiboTest () {

        int a = 10;

        Fibonacci proba = new Fibonacci();

        proba.fibonacci(a);
        System.out.println(proba.fibonacci(a));
    }

}
