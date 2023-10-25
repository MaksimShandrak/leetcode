package algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanToIntegerTest {

    @Test
    public void test1() {
        RomanToInteger romanToInteger = new RomanToInteger();
        int actualResult = romanToInteger.romanToInt("III");
        int expectedResult = 3;
        assertEquals(actualResult, expectedResult);
    }

}
