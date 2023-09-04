package medium;

public class AddTwoNumbers {

    public static int inMemory = 0;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int l1val = 0;
        ListNode l1next = null;
        if(l1 != null) {
            l1val = l1.val;
            l1next = l1.next;
        }

        int l2val = 0;
        ListNode l2next = null;
        if(l2 != null) {
            l2val = l2.val;
            l2next = l2.next;
        }
        int sum = l1val + l2val + inMemory;
        if(sum >= 10) {
            inMemory = 1;
        } else {
            inMemory = 0;
        }

        int val = sum % 10;
        ListNode next = null;
        if (inMemory != 0 || l1next != null || l2next != null) {
            next = addTwoNumbers(l1next, l2next);
        }

        return new ListNode(val, next);
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}
