package algorithms.medium;

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        for(int i = s.length(); i > 0; i--) {
            for(int j = 0; j + i <= s.length(); j++) {
                if(check(j, j + i, s)) {
                    return s.substring(j, j + i);
                }
            }
        }
        return "";
    }

    private boolean check(int i, int j, String s) {
        int left = i;
        int right = j - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

}
