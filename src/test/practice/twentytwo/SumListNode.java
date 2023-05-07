package test.practice.twentytwo;

public class SumListNode {

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


    public void addTwoNumbers(ListNode l1, ListNode l2, int carry) {

        if (l1 == null || l2 == null) {
            return;
        }

        int sum = l1.val + l2.val + carry;
        carry = sum / 10;
        sum = sum % 10;
        System.out.println(sum);
        // recursion..
        addTwoNumbers(l1.next, l2.next, carry);
    }


    public ListNode addTwoNums(ListNode l1, ListNode l2) {

        int carry = 0;

        if (l1 == null || l2 == null) {
            return null;
        }

        ListNode l3 = new ListNode();
        l3.next = new ListNode();

        // recursion..
        addTwoNums(l1.next, l2.next);


        while (l3.next != null) {

            int sum = l1.val + l2.val + carry;
            carry = sum / 10;
            sum = sum % 10;

            l3.val = sum;
            System.out.println(l3.val);
            l3 = l3.next;
        }
        return l3;
    }

    // Add Two Numbers (Java improved)
    public ListNode addTwoNumbersWithoutRecurse(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode head = l3;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            head.next = new ListNode(sum % 10);
            head = head.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        return l3.next;
    }


    public static void main(String[] args) {

        /*[2,4,3]
        [5,6,4]*/
        SumListNode sln = new SumListNode();
        ListNode l1 = new ListNode(2, new ListNode());
        l1.next.val = 4;
        l1.next.next = new ListNode();
        l1.next.next.val = 3;

        ListNode l2 = new ListNode(5, new ListNode());
        l2.next.val = 6;
        l2.next.next = new ListNode();
        l2.next.next.val = 4;

        sln.addTwoNumbers(l1, l2, 0);
//        sln.addTwoNums(l1, l2);
//        sln.addTwoNumbersWithoutRecurse(l1, l2);
    }
}
