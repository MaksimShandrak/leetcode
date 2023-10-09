package algorithms.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseIntegerTest {

    @Test
    public void test1() {
        ReverseInteger reverseInteger = new ReverseInteger();
        int actualResult = reverseInteger.reverse(-123);
        int expectedResult = -321;
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test2() {
        ReverseInteger reverseInteger = new ReverseInteger();
        int actualResult = reverseInteger.reverse(1534236469);
        int expectedResult = 0;
        assertEquals(actualResult, expectedResult);
    }

}
