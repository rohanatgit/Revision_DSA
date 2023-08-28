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
    public void addLast(int item){
        if(this.size==0){
            addfirst(item);
        }
        else{
            Node nn=new Node(item);
            this.tail.next=nn;
            this.tail=nn;
            this.size++;
        }
    }

    //get
    public int getFirst() throws Exception {
        if(this.head==null){
            throw new Exception("pgl LL khali hai ");
        }
        return this.head.data;
    }

    public int getlast() throws Exception {
        if(head==null){
            throw new Exception("pgl hai ya LL khali hai ");
        }
        return this.tail.data;
    }

  public int getatindex(int k) throws Exception {
        if(k==0){
            return getFirst();
        }
        else if(k==this.size-1){
            return getlast();
        }
        else {
            return getnode(k).data;
        }
  }


  private Node getnode(int k) throws Exception {
        if(k<0 || k>=size){
            throw new Exception("idex out of bound pgl k ki value thoda shi de");
        }
        Node temp=head;
        for(int i=1;i<=k;i++){
            temp=temp.next;
        }
        return temp;
  }


  public int removefirst(){
        Node temp=this.head;
        this.head=this.head.next;
        temp.next=null;
        this.size--;
        return temp.data;

  }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addfirst(10);
        ll.addfirst(20);
        ll.addfirst(30);
        ll.Display();
        ll.addLast(90);
        ll.Display();
    }
}
