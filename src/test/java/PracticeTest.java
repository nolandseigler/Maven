import org.apache.commons.lang3.builder.ToStringExclude;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;
public class PracticeTest {
    private ArrayList<Integer> intList;
    private int[] testArr1;
    @Before
    public void setup() {
        intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        testArr1 = new int[]{3, 2, 1};
    }
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
    @Test
    public void testFindAddEnds() {
        ArrayList<ArrayList<Integer>> resultList = new ArrayList<>();
        ArrayList<Integer> addList = new ArrayList<>();
        addList.add(0);
        addList.add(3);
        resultList.add(addList);
        addList = new ArrayList<>();
        addList.add(1);
        addList.add(2);
        resultList.add(addList);
        addList = new ArrayList<>();
        addList.add(2);
        addList.add(1);
        resultList.add(addList);
        addList = new ArrayList<>();
        addList.add(3);
        addList.add(0);
        resultList.add(addList);
        assertEquals(resultList,Practice.findAddInsIndex(intList, 5));
//        assertEquals(resultList,Practice.findAddIns(intList, 5));
    }
    @Test
    public void testMultElems() {
        assertArrayEquals(new int[] {2, 3, 6}, Practice.multElems(testArr1));
    }

    @Test
    public void testFactors() {
        intList = new ArrayList<>(Arrays.asList(new Integer[]{1, 2, 3, 6}));
        assertEquals(intList, Practice.factors(6));
    }

}
