package algorithms.medium;

import algorithms.util.ListNode;
import org.junit.Test;

public class RemoveNthNodeFromEndOfListTest {

    @Test
    public void test1() {
        RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(4, l1);
        ListNode l3 = new ListNode(3, l2);
        ListNode l4 = new ListNode(2, l3);
        ListNode l5 = new ListNode(1, l4);
        removeNthNodeFromEndOfList.removeNthFromEnd(l5, 2);
    }

    @Test
    public void test2() {
        RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();
        ListNode l1 = new ListNode(1);
        removeNthNodeFromEndOfList.removeNthFromEnd(l1, 1);
    }

}
