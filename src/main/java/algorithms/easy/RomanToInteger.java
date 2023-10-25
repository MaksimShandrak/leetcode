package algorithms.easy;

public class RomanToInteger {

    public int romanToInt(String s) {
        int result = 0;
        for(int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            char nextLetter = '0';
            if(i + 1 < s.length()) nextLetter = s.charAt(i + 1);
            switch(letter) {
                case('M'): result = result + 1000; break;
                case('D'): result = result + 500; break;
                case('C'):
                    if(nextLetter == 'M') {
                        result = result + 900;
                        i++;
                    } else if(nextLetter == 'D') {
                        result = result + 400;
                        i++;
                    } else {
                        result = result + 100;
                    }
                    break;
                case('L'): result = result + 50; break;
                case('X'):
                    if(nextLetter == 'C') {
                        result = result + 90;
                        i++;
                    } else if(nextLetter == 'L') {
                        result = result + 40;
                        i++;
                    } else {
                        result = result + 10;
                    }
                    break;
                case('V'): result = result + 5; break;
                case('I'):
                    if(nextLetter == 'X') {
                        result = result + 9;
                        i++;
                    } else if(nextLetter == 'V') {
                        result = result + 4;
                        i++;
                    } else {
                        result = result + 1;
                    }
                    break;
            }
        }
        return result;
    }

}
