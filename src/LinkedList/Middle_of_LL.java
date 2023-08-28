package LinkedList;

public class Middle_of_LL {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }
    class Solution{
        public Node middleNode(Node head){
            Node fast=head;
            Node slow=head;
            while(fast!=null && fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
            }
            return slow;
        }
    }
}
