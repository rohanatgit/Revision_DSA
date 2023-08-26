package Stack.StackQps;

import java.util.Stack;

public class StsckRevsrse {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        System.out.println("*************");
        reverse(st);
        System.out.println(st);

    }
    public static void reverse(Stack<Integer>st){
      if(st.isEmpty()){
          return ;
      }
      int x=st.pop();
      reverse(st);
      //insert bottom
      Insert_Down(st,x);
    }

    private static void Insert_Down(Stack<Integer> st, int x) {
        //TODO Auto-generate method stub
        if(st.isEmpty()){
            st.push(x);
            return;
        }
        int y=st.pop();
        Insert_Down(st,x);
        st.push(y);
    }
}
