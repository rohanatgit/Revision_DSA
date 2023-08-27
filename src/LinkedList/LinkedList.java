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

        }
    }
}
