package algorithms.medium;

import algorithms.util.ListNode;

public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode temp = head;
        while(temp != null) {
            length++;
            temp = temp.next;
        }
        int toUpdate = length - n;
        if(toUpdate == 0) return head.next;
        int i = 1;
        temp = head;
        while(i < toUpdate) {
            temp = temp.next;
            i++;
        }
        if(n == 1) {
            temp.next = null;
        } else {
            temp.next = temp.next.next;
        }
        return head;
    }

}
