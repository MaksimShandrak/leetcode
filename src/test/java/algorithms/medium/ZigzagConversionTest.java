package algorithms.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ZigzagConversionTest {

    @Test
    public void test1() {
        ZigzagConversion zigzagConversion = new ZigzagConversion();
        String actualResult = zigzagConversion.convert("PAYPALISHIRING", 3);
        String expectedResult = "PAHNAPLSIIGYIR";
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test2() {
        ZigzagConversion zigzagConversion = new ZigzagConversion();
        String actualResult = zigzagConversion.convert("PAYPALISHIRING", 4);
        String expectedResult = "PINALSIGYAHRPI";
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test3() {
        ZigzagConversion zigzagConversion = new ZigzagConversion();
        String actualResult = zigzagConversion.convert("A", 1);
        String expectedResult = "A";
        assertEquals(actualResult, expectedResult);
    }

}
