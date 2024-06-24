package algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidParenthesesTest {

    @Test
    public void test1() {
        ValidParentheses vp = new ValidParentheses();
        assertTrue(vp.isValid("()"));
    }

    @Test
    public void test2() {
        ValidParentheses vp = new ValidParentheses();
        assertTrue(vp.isValid("()[]{}"));
    }

    @Test
    public void test3() {
        ValidParentheses vp = new ValidParentheses();
        assertFalse(vp.isValid("(){}}{"));
    }

}
