package algorithms.easy;

import algorithms.util.ListNode;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        if(list1 == null && list2 == null) {
            return result;
        }
        if(list1 == null) {
            result.val = list2.val;
            list2 = list2.next;
        } else if(list2 == null) {
            result.val = list1.val;
            list1 = list1.next;
        } else if(list1.val <= list2.val) {
            result.val = list1.val;
            list1 = list1.next;
        } else {
            result.val = list2.val;
            list2 = list2.next;
        }
        if(list1 == null && list2 == null) {
            return result;
        }
        result.next = mergeTwoLists(list1, list2);
        return result;
    }

}
