package algorithms.medium;

import java.math.BigDecimal;

public class StringToInteger {

    public int myAtoi(String s) {
        if(s.isEmpty()) {
            return 0;
        }
        boolean positive = true;
        s = s.trim();
        if(s.isEmpty()) {
            return 0;
        }
        if(s.charAt(0) == '+') {
            s = s.substring(1);
        } else if(s.charAt(0) == '-') {
            positive = false;
            s = s.substring(1);
        }
        int i = 0;
        boolean goNext = true;
        while(goNext && i < s.length()) {
            if(Character.isDigit(s.charAt(i))) {
                i++;
            } else {
                goNext = false;
            }
        }
        s = s.substring(0, i);
        if(s.isEmpty())
            return 0;
        try {
            int result = Integer.valueOf(s);
        } catch (NumberFormatException ex) {
            if(positive) {
                return Integer.MAX_VALUE;
            } else {
                return Integer.MIN_VALUE;
            }
        }
        int result = Integer.valueOf(s);
        if(!positive) {
            result = result * -1;
        }
        if(result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if(result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return result;
    }

}
