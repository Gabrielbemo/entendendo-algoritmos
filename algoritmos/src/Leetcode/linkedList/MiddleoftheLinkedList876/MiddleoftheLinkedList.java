package Leetcode.linkedList.MiddleoftheLinkedList876;

import Leetcode.linkedList.Util.ListNode;

public class MiddleoftheLinkedList {

    static void main(String[] args) {
        ListNode list1 = ListNode.createListNode(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12});
        ListNode.printList(list1);
        System.out.println();
        ListNode.printList(middleNode(list1));
    }

    public static ListNode middleNode(ListNode head) {
        ListNode movingNode = head;
        ListNode fastNode = head;

        while (fastNode != null && fastNode.next != null) {
            movingNode = movingNode.next;
            //System.out.println("moving1:" + movingNode.val);
            fastNode = fastNode.next.next;
            //System.out.println("fast2: " + fastNode.val);
        }

        return movingNode;
    }

}
