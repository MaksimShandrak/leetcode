package medium;

import org.junit.Test;

public class AddTwoNumbersTest {

    @Test
    public void addTwoNumbersTest() {
        AddTwoNumbers.ListNode l1 = new AddTwoNumbers.ListNode(2);
        AddTwoNumbers.ListNode l1next = new AddTwoNumbers.ListNode(4);
        l1.next = l1next;
        AddTwoNumbers.ListNode l1nextnext = new AddTwoNumbers.ListNode(3);
        l1next.next = l1nextnext;

        AddTwoNumbers.ListNode l2 = new AddTwoNumbers.ListNode(5);
        AddTwoNumbers.ListNode l2next = new AddTwoNumbers.ListNode(6);
        l2.next = l2next;
        AddTwoNumbers.ListNode l2nextnext = new AddTwoNumbers.ListNode(4);
        l2next.next = l2nextnext;

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        AddTwoNumbers.ListNode actual = addTwoNumbers.addTwoNumbers(l1, l2);

        assert(actual.val == 7);
        assert(actual.next.val == 0);
        assert(actual.next.next.val == 8);
        assert(actual.next.next.next == null);
    }

}
