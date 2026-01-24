package Leetcode.LinkedList.MergeTwoSortedLists21;

import Leetcode.Util.ListNode;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode list1 = ListNode.createListNode(new int[]{1, 2, 4});
        ListNode list2 = ListNode.createListNode(new int[]{1, 3, 4});

        ListNode list4 = ListNode.createListNode(new int[]{2, 3, 4});
        ListNode list3 = ListNode.createListNode(new int[]{5, 6, 9});

        ListNode mergedResult = mergeTwoLists(list1, list2);

        System.out.print("Resultado do merge: ");
        ListNode.printList(mergedResult);

        System.out.print("\n Resultado do merge recursivo: ");
        ListNode.printList(mergeTwoListsRecursive(list4, list3));
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

    public static ListNode mergeTwoListsRecursive(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list1.val <= list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}
