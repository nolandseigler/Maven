import org.junit.Test;
import static org.junit.Assert.*;
public class PracticeTest {
    @Test
    public void testIfCompanyNameIsEquals() {
        String expected = "Codeup";
        String actual = "Codeup";

        assertEquals(expected, actual);
    }

// When you're using floating points values a third parameter is required (Delta) which represents a positive margin of error of decimals.

    @Test
    public void testIfChangeIsCorrect() {
        Double price = 10.0;
        Double discount = 4.5;

        assertEquals(5.5, price - discount, 0);
        assertEquals(5.1, price - discount, 0.5);
        assertNotEquals(4.9, price - discount, 0.5);
    }

    @Test
    public void testComp() {
        //Equal To
        assertEquals("If a is equal to b return the String 'a = b'", "5 = 5", Practice.comp(5, 5));
        //Greater Than
        assertEquals("If a is less than b return the String  'a < b'", "4 < 5", Practice.comp(4, 5));
        //Less Than
        assertEquals("If a is greater than b return the String 'a > b'", "5 > 4", Practice.comp(5, 4));
    }
}
