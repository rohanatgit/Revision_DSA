package LinkedList;

public class IntersentionOfTwoLL {
    class Node{
        int data;
       Node next;
        public Node(int data){
            this.data=data;
        }
    }
    public Node Intersection(Node headA,Node headB){
        Node A=headA;
        Node B=headB;
        while(A!=B){
            if(A==null){
                A=headB;
            }
            else{
                A=A.next;
            }
            if(B==null){
                B=headA;
            }
            else {
                B=B.next;
            }
        }
        return A;
    }
}
