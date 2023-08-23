package Stack;

public class Stack {
    private int[] data;
    int top=0;
    public Stack(){
        this.data=new int[5];
    }
    public Stack(int cap){
        this.data=new int[cap];
    }

    public boolean isEmpty(){
        if(top==0){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        return top==this.data.length;
    }

    public void push(int item){
        this.data[this.top]=item;
        top++;
    }

    public int pop(){
        this.top--;
        return this.data[top];
    }
    public int peek(){
        return this.data[this.top-1];
    }
    public int size(){
        return this.top;
    }

    public void display(){
        for(int i=0;i<top;i++){
            System.out.println(this.data[i]+" ");
        }
    }

}
