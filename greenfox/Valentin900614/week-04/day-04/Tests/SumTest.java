import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {

    @Test
    public void sumTest () {
        ArrayList<Integer> arrayList = new ArrayList(Arrays.asList(new Integer[]{5, -4, 3}));
        Sum sum = new Sum();

        Integer osszeg = sum.sumOfList(arrayList);

        assertEquals((Integer) 4, osszeg);
    }

}
