public class FlattenTheLL {

    public Node_ flattenFull(Node_ head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node_ mergedHead = flattenFull(head.next);
        return flattenOnce(head, mergedHead);
    }

    public Node_ flattenOnce(Node_ l1, Node_ l2) {
        Node_ dummy = new Node_(-1);
        Node_ result = dummy;

        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                result.child = l1;
                l1 = l1.child;
            } else {
                result.child = l2;
                l2 = l2.child;
            }
            result.next = null; // break horizontal links as we go
            result = result.child;
        }

        // Attach remaining nodes
        if (l1 != null) result.child = l1;
        else result.child = l2;

        // Remove all next pointers in merged list
        Node_ temp = dummy.child;
        while (temp != null) {
            temp.next = null;
            temp = temp.child;
        }

        return dummy.child;
    }
}

class Node_ {
    int data;
    Node_ next;
    Node_ child;

    Node_() {}
    Node_(int x) { this.data = x; }
    Node_(int x, Node_ nextNode, Node_ childNode) {
        this.data = x;
        this.next = nextNode;
        this.child = childNode;
    }
}
