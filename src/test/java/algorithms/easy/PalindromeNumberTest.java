package algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeNumberTest {

    @Test
    public void test1() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean actualResult = palindromeNumber.isPalindrome(121);
        boolean expectedResult = true;
        assertEquals(actualResult, expectedResult);
    }

}
