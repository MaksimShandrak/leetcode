package algorithms.medium;

import algorithms.util.ListNode;

public class SwapNodesinPairs {

    public ListNode swapPairs(ListNode head) {
        if(head == null) return head;
        int tmp = head.val;
        if(head.next != null) {
            head.val = head.next.val;
            head.next.val = tmp;
        }
        if(head.next != null && head.next.next != null) {
            swapPairs(head.next.next);
        }
        return head;
    }

}
