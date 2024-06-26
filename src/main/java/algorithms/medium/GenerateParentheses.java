package algorithms.medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        build(ans, n*2, "", 0, 0, n);
        return ans;
    }

    void build(List ans, int length, String temp, int open, int close, int n) {
        if(temp.length() >= length) {
            ans.add(temp);
            return;
        }
        if(open < n) {
            temp = temp + "(";
            build(ans, length, temp, open + 1, close, n);
        }
        if(close < open) {
            temp = temp + ")";
            build(ans, length, temp, open, close + 1, n);
            System.out.println("af");
        }
    }

}
