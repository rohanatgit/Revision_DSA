package Recursion;

public class Laxico_Counting {
    public static void main(String[] args) {
        int n=1000;
        printcounting(0,n);
    }
    public static void printcounting(int curr,int end){
        if(curr>end){
            return ;
        }
        System.out.println(curr);
        int i=0;
        if(curr==0){
            i=1;
        }
        for(;i<=9;i++){
            printcounting(curr*10+i,end);
        }
    }
}
