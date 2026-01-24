package Leetcode.Recursion.PalindromeLinkedList234;

import Leetcode.Util.ListNode;

public class PalindromeLinkedList {
    static void main(String[] args) {
        ListNode list1 = ListNode.createListNode(new int[]{1, 2, 3, 4, 2, 1});
        ListNode.printList(list1);

        System.out.println(isPalindrome(list1));

        ListNode list2 = ListNode.createListNode(new int[]{1, 2, 3, 4, 2, 1});
        System.out.println(isPalindromeRecursive(list2));
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode slowNode = head;
        ListNode fastNode = head;
        ListNode previousNode = null;

        while (fastNode != null && fastNode.next != null) {
            fastNode = fastNode.next.next;

            ListNode nextNodeAfterMoving = slowNode.next;
            slowNode.next = previousNode;
            previousNode = slowNode;
            slowNode = nextNodeAfterMoving;
        }

        if (fastNode != null) {
            slowNode = slowNode.next;
        }

        while (slowNode != null && previousNode != null) {
            if (slowNode.val != previousNode.val) {
                return false;
            }
            slowNode = slowNode.next;
            previousNode = previousNode.next;
        }

        return true;
    }

    public static boolean isPalindromeRecursive(ListNode head) {
        return check(head, new ListNode[]{head});
    }

    private static boolean check(ListNode right, ListNode[] leftRef) {
        if (right == null) return true;

        if (!check(right.next, leftRef)) return false;

        boolean same = (leftRef[0].val == right.val);
        leftRef[0] = leftRef[0].next;

        return same;
    }

}
