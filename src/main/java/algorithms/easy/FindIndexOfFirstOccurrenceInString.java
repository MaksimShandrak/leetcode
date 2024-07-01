package algorithms.easy;

public class FindIndexOfFirstOccurrenceInString {

    public int strStr(String haystack, String needle) {
        for(int i = 0; i + needle.length() < haystack.length(); i++) {
            if(haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

}
