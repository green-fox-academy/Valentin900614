import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import static org.junit.Assert.*;

public class CountLettersTest {

    @Test
    public void countTest () {

        String string = "This is an example for this task";

        CountLetters count = new CountLetters();

        count.characterCount(string);
    }

}
