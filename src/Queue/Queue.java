package Queue;

public class Queue {
    private int data[];
    private int front;
    private int size=0;

    public Queue(){
        this.data=new int[5];
    }
    public Queue(int cap){
        this.data=new int[cap];
    }
    public boolean isEmpty(){
        return this.size==0;
    }
    public boolean isFull(){
        return this.size==this.data.length;
    }
    public int size(){
        return this.size;
    }
    public void Enqueue(int item) throws Exception {
        if(isFull()){
            throw new Exception("Sun pagal hai kya Queue khali hai toh add karna jaruri hai");
        }
        int i=(this.size+this.front)%this.data.length;
        this.data[i]=item;
        this.size++;
    }
    public int dequeue() throws Exception {
        if(isEmpty()){
            throw new Exception("ave bhai pagal hai kya queue khali hai");
        }
        int rv=this.data[this.front];
        this.front=this.front+1;
        this.size--;
        return rv;
    }
    public int getfront(){
        return this.data[this.front];
    }
    public void dispay(){
        for(int i=0;i<this.size;i++){
            int idx=(this.front+i)%this.data.length;
            System.out.println(this.data[idx]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        Queue qq=new Queue();
        qq.Enqueue(10);
        qq.Enqueue(20);
        qq.Enqueue(30);
        qq.Enqueue(40);
        qq.dequeue();//10
        qq.dequeue();//20
        qq.Enqueue(50);
        qq.Enqueue(60);
        qq.Enqueue(70);

    }
}
