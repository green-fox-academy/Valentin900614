import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class PokerTest {

    @Test
    public void compareHandsTest_sameHands_returnsCheat(){
        assertEquals("Cheat", Poker.compareHands("2C 3H 4S 8C AH", "2C 3H 4S 8C AH"));
    }

    @Test
    public void compareHandsTest_straightFlushFrom2_returnsHigher(){
        assertEquals("Tie", Poker.compareHands("2S 3S 4S 5S 6S", "2H 3H 4H 5H 6H"));
    }

    @Test
    public void compareHandsTest_straightFlushFrom4_returnsHigher(){
        assertEquals("Tie", Poker.compareHands("3S 4S 5S 6S 7S", "3H 4H 5H 6H 7H"));
    }

    @Test
    public void compareHandsTest_straightFlushFrom7_returnsHigher(){
        assertEquals("Tie", Poker.compareHands("7S 8S 9S 1S JS", "7H 8H 9H 1H JH"));
    }

}
