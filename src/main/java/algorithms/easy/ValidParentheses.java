package algorithms.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if(stack.isEmpty() || !match(stack.peek(),s.charAt(i))) {
                    return false;
                }
                stack.pop();
            }
        }
        if(stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    private boolean match(char ch1, char ch2) {
        if(ch1 == '(' && ch2 == ')') {
            return true;
        } else if(ch1 == '{' && ch2 == '}') {
            return true;
        } else if(ch1 == '[' && ch2 == ']') {
            return true;
        } else {
            return false;
        }
    }

}
