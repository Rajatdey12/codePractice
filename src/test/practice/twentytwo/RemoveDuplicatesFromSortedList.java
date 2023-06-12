package test.practice.twentytwo;

public class RemoveDuplicatesFromSortedList {

    static class ListNode {
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

    public ListNode deleteDuplicates(ListNode head) {

        ListNode l2 = head;

        while (l2 != null && l2.next != null) {
            if (l2.val == l2.next.val) {
                l2.next = l2.next.next;
            } else {
                l2 = l2.next;
            }
        }
        return head;

    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedList rdsl = new RemoveDuplicatesFromSortedList();
        ListNode l1 = new ListNode(1, new ListNode());
        l1.next.val = 1;
        l1.next.next = new ListNode();
        l1.next.next.val = 2;
        l1.next.next.next = new ListNode();
        l1.next.next.next.val = 3;
        l1.next.next.next.next = new ListNode();
        l1.next.next.next.next.val = 3;

        rdsl.deleteDuplicates(l1);
    }
}
