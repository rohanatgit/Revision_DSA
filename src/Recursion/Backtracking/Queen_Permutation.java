package Recursion.Backtracking;

import com.sun.nio.sctp.ShutdownNotification;

public class Queen_Permutation {
    public static void main(String[] args) {
        boolean[] board=new boolean[4];
        int n=2;//kitne queen bethane hai
        Queen(board,n,0,"");

    }
    public static void Queen(boolean[] board,int tq,int qpsf,String ans){
        //tq=total Queen
        //qpsf = queen place so for
        //jitni size utni choice
        if(tq==qpsf){
            System.out.println(ans);
            return ;
        }

        for(int i=0;i<board.length;i++){
            if(board[i]==false){//Queen placed nahi hai
                board[i]=true;
                Queen(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf);

            }
        }
    }
}
