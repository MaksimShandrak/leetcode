package algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestCommonPrefixTest {

    @Test
    public void test1() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String actualResult = longestCommonPrefix.longestCommonPrefix(new String[]{"ab", "a"});
        String expectedResult = "a";
        assertEquals(actualResult, expectedResult);
    }

}
