package Leetcode.LinkedList.RemoveLinkedListElements203;

import Leetcode.Util.ListNode;

public class RemoveLinkedListElements {
    static void main(String[] args) {
        ListNode list1 = ListNode.createListNode(new int[]{2, 2, 1, 1, 2, 3, 3, 2});
        ListNode.printList(list1);
        System.out.println();
        ListNode.printList(removeElements(list1, 2));
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode startNode = new ListNode(0);
        startNode.next = head;

        ListNode previousNode = startNode;
        ListNode currentNode = head;

        while (currentNode != null) {
            if (currentNode.val == val) {
                previousNode.next = currentNode.next;
            } else {
                previousNode = currentNode;
            }

            currentNode = currentNode.next;
        }

        return startNode.next;
    }
}
