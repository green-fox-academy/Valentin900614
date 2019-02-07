import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void FiboTest () {

        int a = 10;

        Fibonacci proba = new Fibonacci();

        proba.fibonacci(a);
        System.out.println(proba.fibonacci(a));
    }

}
