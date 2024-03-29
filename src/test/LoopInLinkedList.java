package test;

public class LoopInLinkedList {
    static class Node {
        int data;
        Node next;
        int flag;
    };

    static Node push(Node head_ref, int new_data)
    {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.flag = 0;
        new_node.next = head_ref;
        head_ref = new_node;
        return head_ref;
    }

    static boolean detectLoop(Node h)
    {
        while (h != null) {
            if (h.flag == 1)
                return true;

            h.flag = 1;

            h = h.next;
        }
        return false;
    }

    static boolean detectLoopTwoPtr(Node n) {
        Node fast = n;
        Node slow = n;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args)
    {

        // Start with the empty list
        Node head = null;

        head = push(head, 20);
        head = push(head, 4);
        head = push(head, 15);
        head = push(head, 10);

        // Create a loop for testing
        head.next.next.next.next = head;

        if (detectLoop(head))
            System.out.print("Loop found");
        else
            System.out.print("No Loop");

        System.out.println(detectLoopTwoPtr(head));
    }
}
