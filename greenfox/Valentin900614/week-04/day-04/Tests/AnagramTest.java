import org.junit.Test;


import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void isTwoStringsAnagrams () {
        String a = "asd";
        String b = "dsa";

        Anagram isAnagram = new Anagram();

        boolean isTrue = isAnagram.anagram(a, b);

        assertTrue(isTrue);

    }

}
