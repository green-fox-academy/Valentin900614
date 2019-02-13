import org.junit.Test;

public class CountLettersTest {

    @Test
    public void countTest () {

        String string = "This is an example for this task";

        CountLetters count = new CountLetters();

        count.characterCount(string);
    }

}
