package algorithms.medium;

public class ReverseInteger {

    public int reverse(int x) {
        int source = Math.abs(x);
        long target = 0;
        while(source / 10 > 0) {
            target = target*10 + source%10;
            source = source / 10;
        }
        target = target*10 + source;
        if(x < 0) {
            target = target * -1;
        }
        if(target > Integer.MAX_VALUE || target < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) target;
    }

}
