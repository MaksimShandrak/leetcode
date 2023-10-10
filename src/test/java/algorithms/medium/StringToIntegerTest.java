package algorithms.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringToIntegerTest {

    @Test
    public void test1() {
        StringToInteger stringToInteger = new StringToInteger();
        int actualResult = stringToInteger.myAtoi("42");
        int expectedResult = 42;
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test2() {
        StringToInteger stringToInteger = new StringToInteger();
        int actualResult = stringToInteger.myAtoi("   -42");
        int expectedResult = -42;
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test3() {
        StringToInteger stringToInteger = new StringToInteger();
        int actualResult = stringToInteger.myAtoi("words and 987");
        int expectedResult = 0;
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test4() {
        StringToInteger stringToInteger = new StringToInteger();
        int actualResult = stringToInteger.myAtoi("-91283472332");
        int expectedResult = -2147483648;
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test5() {
        StringToInteger stringToInteger = new StringToInteger();
        int actualResult = stringToInteger.myAtoi("");
        int expectedResult = 0;
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test6() {
        StringToInteger stringToInteger = new StringToInteger();
        int actualResult = stringToInteger.myAtoi(" ");
        int expectedResult = 0;
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test7() {
        StringToInteger stringToInteger = new StringToInteger();
        int actualResult = stringToInteger.myAtoi("20000000000000000000");
        int expectedResult = Integer.MAX_VALUE;
        assertEquals(actualResult, expectedResult);
    }

}
