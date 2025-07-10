

// public  class midElement{
//     Node head;
//     static class Node{

//         int val;
//         Node next;

//         Node(int val){
//             this.val = val;
//             this.next = null;
//         }
       
//     }
//     midElement(){
//         head =null;
//     } 
//         public static Node findMid(Node head){
//             Node slow = head;
//             Node fast = head;
//             while(fast!= null && fast.next!= null && fast.next.next!= null){
//                 slow = slow.next;
//                 fast  = fast.next.next;

                
//             }
//             return slow;
//         }

//         public static void main(String[] args) {
//             midElement list = new midElement();
//             Node head = new Node(1);
//         Node node2 = new Node(2);
//         Node node3 = new Node(3);
//         Node node4 = new Node(4);
//         Node node5 = new Node(5);

//         head.next = node2;
//         node2.next = node3;
//         node3.next = node4;
//         node4.next = node5;

//         Node result = findMid(head );
        
//         System.out.println(result.val);
//         }
     

// }

