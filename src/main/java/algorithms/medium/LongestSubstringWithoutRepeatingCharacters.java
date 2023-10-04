package algorithms.medium;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        int result = 0;

        for(int i = 0; i < s.length(); i++) {
            for(int j = i + result + 1; j <= s.length(); j++) {
                String testS = s.substring(i, j);
                if(checkIfUnique(testS)) {
                    result = testS.length();
                } else {
                    break;
                }
            }
        }
        return result;
    }

    private boolean checkIfUnique(String s) {
        char[] arr = s.toCharArray();
        List<Character> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(list.contains(arr[i])) {
                return false;
            } else {
                list.add(arr[i]);
            }
        }
        return true;
    }

}
