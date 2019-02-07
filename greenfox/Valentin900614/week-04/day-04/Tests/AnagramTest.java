import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void isTwoStringsAnagrams () {
        String a = "indul a gorog aludni";
        String b = "indul a gorog aludni";

        Anagram isAnagram = new Anagram();

        boolean isTrue = isAnagram.anagram(a, b);

        assertTrue(isTrue);

    }

}
