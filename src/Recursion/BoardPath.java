package Recursion;

public class BoardPath {
    public static void main(String[] args) {
        int n=4;
        System.out.print("\n"+boardpath(n,0,""));
    }
    public static int boardpath(int end,int curr,String ans){
        if(curr==end){
            System.out.print(ans+" ");
            return 1;
        }
        if(curr>end){
            return 0;
        }
        int fp=boardpath(end,curr+1,ans+1);
        int sp=boardpath(end,curr+2,ans+2);
        int tp=boardpath(end,curr+3,ans+3);
        return fp+sp+tp;
    }
}
