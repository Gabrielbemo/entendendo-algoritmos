package Leetcode.linkedList.RemoveDuplicatesfromSortedList83;

public class RemoveDuplicatesfromSortedList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static void main(String[] args) {
        ListNode list1 = createListNode(new int[]{1, 1, 2, 3, 3});
        printList(list1);
        System.out.println();
        printList(deleteDuplicates(list1));
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
