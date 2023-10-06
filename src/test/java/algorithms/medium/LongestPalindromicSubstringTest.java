package algorithms.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestPalindromicSubstringTest {

    @Test
    public void test1() {
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        String actualResult = longestPalindromicSubstring.longestPalindrome("cbbd");
        String expectedResult = "bb";
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test2() {
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        String actualResult = longestPalindromicSubstring.longestPalindrome("abb");
        String expectedResult = "bb";
        assertEquals(actualResult, expectedResult);
    }

}
