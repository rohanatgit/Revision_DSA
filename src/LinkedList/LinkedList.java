package LinkedList;

public class LinkedList {
  public class Node {
      int data;
      Node next;

      public Node(int data) {
          this.data = data;
      }
  }
  private Node head;
  private Node tail;
  private int size;
    public void addfirst(int item){
        Node nn=new Node(item);
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
    public void Display(){
        Node temp=this.head;
        while(temp!=null){
            System.out.print(temp.data+"--->");
            temp=temp.next;
        }
        System.out.println(".");
    }

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addfirst(10);
        ll.addfirst(20);
        ll.addfirst(30);
        ll.Display();
    }
}
