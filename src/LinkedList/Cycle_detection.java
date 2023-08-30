package LinkedList;

public class Cycle_detection {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }
    private Node head;
    private int size;
    private Node tail;
    public void addFirst(int item){
        Node nn =new Node(item);
        if(this.size==0){
            this.head=nn;
            this.tail=nn;
            this.size++;
        }
        else{
            nn.next=this.head;
            this.head=nn;
            this.size++;
        }
    }
    public void CreateCycle(){
        this.tail.next=this.head;//circular


    }
}
