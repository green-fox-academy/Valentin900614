import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {

    @Test
    public void appleTest() {
        Apples alma = new Apples();
        assertEquals("apple", alma.getApple());
    }


}
