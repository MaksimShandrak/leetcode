package algorithms.easy;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder("");
        String firstStr = strs[0];
        for(int i = 0; i < firstStr.length(); i++) {
            char ch = firstStr.charAt(i);
            for(int j = 1; j < strs.length; j++) {
                if(strs[j].length() < i + 1 || ch != strs[j].charAt(i)) {
                    return result.toString();
                }
            }
            result.append(ch);
        }
        return result.toString();
    }

}
