package Leetcode.linkedList.Util;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static void printList(ListNode node) {
        ListNode currentNode = node;

        while (currentNode != null) {
            System.out.print(currentNode.val + " ");
            currentNode = currentNode.next;
        }
    }

    public static ListNode createListNode(int[] input) {
        if (input == null || input.length == 0) {
            return null;
        }

        ListNode head = new ListNode(input[0]);
        ListNode current = head;

        for (int i = 1; i < input.length; i++) {
            current.next = new ListNode(input[i]);
            current = current.next;
        }

        return head;
    }
}
