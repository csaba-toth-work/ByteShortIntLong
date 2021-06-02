package debuggerandunittesting.unittesting.challenge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilitiesTest {

    private Utilities utilities;

    @Before
    public void setup() {
        utilities = new Utilities();
    }

    @Test
    public void everyNthChar() {
        char[] actual = utilities.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 2);
        assertArrayEquals(new char[]{'e', 'l'}, actual);
        char[] actual2 = utilities.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 8);
        assertArrayEquals(new char[]{'h', 'e', 'l', 'l', 'o'}, actual2);
    }

    @Test
    public void removePairs() {
        String example = utilities.removePairs("AABCDDEFF");
        String expected = "ABCDEF";
        assertEquals(expected, example);

        String example2 = utilities.removePairs("ABCCABDEEF");
        String expected2 = "ABCABDEF";
        assertEquals(expected2, example2);
    }

    @Test
    public void removePairsForChallenge() {
        String example = utilities.removePairs("1234455");
        String expected = "12345";
        assertEquals(expected, example);

        String example2 = utilities.removePairs("a");
        String expected2 = "a";
        assertEquals(expected2, example2);

        String example3 = utilities.removePairs("");
        String expected3 = "";
        assertEquals(expected3, example3);


        assertNull("did not get null returned when argument passed was null", utilities.removePairs(null));
    }

    @Test(expected = ArithmeticException.class)
    public void converter_arithmeticException() {
        assertEquals(0, utilities.converter(10, 0));
    }

    @Test()
    public void converter() {
        assertEquals(300, utilities.converter(10, 5));
    }

    @Test
    public void nullIfOddLength() {
        assertNull(utilities.nullIfOddLength("odd"));
        assertNotNull(utilities.nullIfOddLength("even"));
    }
}