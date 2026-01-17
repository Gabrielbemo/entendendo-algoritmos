package Leetcode.linkedList.MergeTwoSortedLists21;

public class MergeTwoSortedLists {

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

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode mergedResult = mergeTwoLists(list1, list2);

        System.out.print("Resultado do merge: ");
        printList(mergedResult);
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

    public static void printList(ListNode node) {
        ListNode currentNode = node;

        while (currentNode != null) {
            System.out.print(currentNode.val + " ");
            currentNode = currentNode.next;
        }
    }
}
