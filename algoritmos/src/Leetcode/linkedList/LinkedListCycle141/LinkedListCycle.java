package Leetcode.linkedList.LinkedListCycle141;

import Leetcode.linkedList.Util.ListNode;

public class LinkedListCycle {
    static void main(String[] args) {
        ListNode list1 = ListNode.createListNode(new int[]{2, 2, 1, 1, 2, 3, 3, 2});
        list1.next.next.next.next.next.next.next.next = list1.next.next;
        System.out.println(hasCycle(list1));
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode movingNode = head;
        ListNode fasterNode = head;

        while (fasterNode != null && fasterNode.next != null) {
            movingNode = movingNode.next;
            fasterNode = fasterNode.next.next;

            if (movingNode == fasterNode) {
                return true;
            }
        }

        return false;
    }
}
