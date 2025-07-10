
// //Finding the LL containing loop or not:
// public class CustomLL{
//     Node head;

//   static class Node{
//         int val;
//         Node next;

//         Node(int val){
//             this.val = val;
//             this.next = null;
//         }
//     }
//     CustomLL(){
//         head = null;

//     }

//     public static  boolean hasCycle(Node head){
//         if( head == null || head.next ==null ){
//             return false;
//         }
//         Node slow = head;
//         Node fast = head.next;

//         //loop through the linked list to find whether the loop is in LL or not
//         while( fast!= null && fast.next!= null  ){
//             if(slow == fast)return true;

//             slow = slow.next;
//             fast = fast.next.next;
//         }

        
//         return false;
//     };

//     public static  void main(String[] args) {
//         System.out.println("Starting of the Program");
//         CustomLL list = new CustomLL();
//         Node n1 = new Node(3);
//         Node n2 = new Node(4);
//         Node n3 = new Node(6);
//         Node n4 = new Node(7);
//         Node n5 = new Node(10);

//         n1.next = n2;
//         n2.next = n3;
//         n3.next = n4;
//         n4.next = n5;
//         n5.next = n2;

//         boolean result = hasCycle(n1);
//         System.out.println(result);


//     }



// } 



