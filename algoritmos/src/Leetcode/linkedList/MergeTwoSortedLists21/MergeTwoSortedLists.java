package Leetcode.linkedList.MergeTwoSortedLists21;

import Leetcode.linkedList.Util.ListNode;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode list1 = ListNode.createListNode(new int[]{1, 2, 4});

        ListNode list2 = ListNode.createListNode(new int[]{1, 3, 4});

        ListNode mergedResult = mergeTwoLists(list1, list2);

        System.out.print("Resultado do merge: ");
        ListNode.printList(mergedResult);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode startNode = new ListNode(0);
        ListNode lastNode = startNode;

        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {
                lastNode.next = list1;
                list1 = list1.next;
            } else {
                lastNode.next = list2;
                list2 = list2.next;
            }

            lastNode = lastNode.next;
        }

        lastNode.next = (list1 != null) ? list1 : list2;

        return startNode.next;
    }
}
