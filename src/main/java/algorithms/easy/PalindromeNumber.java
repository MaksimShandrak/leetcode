package algorithms.easy;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        int source = x;
        long target = 0;
        while(source / 10 > 0) {
            target = target*10 + source%10;
            source = source / 10;
        }
        target = target*10 + source;
        if(x == target) {
            return true;
        } else {
            return false;
        }
    }

}
