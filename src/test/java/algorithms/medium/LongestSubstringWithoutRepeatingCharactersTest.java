package algorithms.medium;

import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void test1(){
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        String s = "abcabcbb";
        int actual = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        int expected = 3;
        assert(actual == expected);
    }

    @Test
    public void test2(){
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        String s = " ";
        int actual = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        int expected = 1;
        assert(actual == expected);
    }

    @Test
    public void test3(){
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        String s = "";
        int actual = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        int expected = 0;
        assert(actual == expected);
    }

}
