package Leetcode.LinkedList.RemoveDuplicatesFromSortedList83;

import Leetcode.Util.ListNode;

public class RemoveDuplicatesFromSortedList {

    static void main(String[] args) {
        ListNode list1 = ListNode.createListNode(new int[]{1, 1, 2, 3, 3});
        ListNode.printList(list1);
        System.out.println();
        ListNode.printList(deleteDuplicates(list1));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode startNewNode = head;
        ListNode movingNode = startNewNode.next;
        while (movingNode != null) {
            if (movingNode.val != startNewNode.val) {
                startNewNode.next = movingNode;
                startNewNode = movingNode;
            } else if (movingNode.next == null) {
                startNewNode.next = movingNode.next;
            }
            movingNode = movingNode.next;
        }
        return head;
    }
}
