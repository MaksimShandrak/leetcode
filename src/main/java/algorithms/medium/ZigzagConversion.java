package algorithms.medium;

public class ZigzagConversion {

    public String convert(String s, int numRows) {
        StringBuilder result = new StringBuilder("");
        int step = 2*numRows - 2;
        if(numRows == 1)
            return s;
        //first line
        for(int i = 0; i < s.length(); i = i + step) {
            result.append(s.charAt(i));
        }
        //intermediate lines
        int intermediateLines = numRows - 2;
        for(int i = 0; i < intermediateLines; i++) {
            int innerStep = (intermediateLines - i - 1)*2 + 2;
            for(int j = i; j + 1 < s.length(); j = j + step) {
                result.append(s.charAt(j + 1));
                if(j + 1 + innerStep < s.length()) {
                    result.append(s.charAt(j + 1 + innerStep));
                }
            }
        }
        //last line
        for(int i = numRows - 1; i < s.length(); i = i + step) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }

}
