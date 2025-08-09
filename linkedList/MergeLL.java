class MergeLL {

    public static Node solution(Node t1, Node t2){
        Node dummyNode  = new Node(-1);
        Node temp = dummyNode;

        while(t1 != null && t2 != null){
            if(t1.data <= t2.data){
                temp.next = t1;
                t1 = t1.next;


            }else{
                temp.next = t2;
                t2 = t2.next;
            }
            temp = temp.next;

            
        }
        if(t1 != null){
            temp.next = t1;
        }else{
            temp.next = t2;
        }


        return dummyNode.next;

    }

    static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            // Print the data of the current node
            System.out.print(temp.data + " ");
            // Move to the next node
            temp = temp.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Node list1 = new Node(1);
        list1.next = new Node(3);
        list1.next.next = new Node(5);

        Node list2 = new Node(2);
        list2.next = new Node(4);
        list2.next.next = new Node(6);

        System.out.print("First sorted linked list: ");
        printLinkedList(list1);

        System.out.print("Second sorted linked list: ");
        printLinkedList(list2);

        Node mergedList = solution(list1, list2);

        System.out.print("Merged sorted linked list: ");
        printLinkedList(mergedList);
    }
        
    }


class Node{
    int data;

    Node next;

    Node(int data1, Node next){
        this.data = data1;
        this.next = next;
    }
    Node(int data1) {
        data = data1;
        next = null;
    }
}