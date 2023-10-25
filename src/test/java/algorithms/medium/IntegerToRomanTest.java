package algorithms.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerToRomanTest {

    @Test
    public void test1() {
        IntegerToRoman integerToRoman = new IntegerToRoman();
        String actualResult = integerToRoman.intToRoman(3);
        String expectedResult = "III";
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test2() {
        IntegerToRoman integerToRoman = new IntegerToRoman();
        String actualResult = integerToRoman.intToRoman(58);
        String expectedResult = "LVIII";
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test3() {
        IntegerToRoman integerToRoman = new IntegerToRoman();
        String actualResult = integerToRoman.intToRoman(1994);
        String expectedResult = "MCMXCIV";
        assertEquals(actualResult, expectedResult);
    }

}
