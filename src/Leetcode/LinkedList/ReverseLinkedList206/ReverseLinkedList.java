package Leetcode.LinkedList.ReverseLinkedList206;

import Leetcode.Util.ListNode;

public class ReverseLinkedList {
    static void main(String[] args) {
        ListNode list1 = ListNode.createListNode(new int[]{2, 2, 1, 1, 2, 3, 3, 2});
        ListNode.printList(list1);
        System.out.println();
        ListNode.printList(reverseList(list1));
    }

    public static ListNode reverseList(ListNode head) {
        ListNode previousNode = null;
        ListNode currentNode = head;

        while (currentNode != null) {
            ListNode nextNodeAfterMoving = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNodeAfterMoving;
        }

        return previousNode;
    }
}
