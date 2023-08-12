package Recursion;

public class TOH {
    public static void main(String[] args) {
        int n=3;
        printstep(n,"src","hel","dis");
    }

    private static void printstep(int n, String s, String h,String d) {
       if(n==0){
           return ;
       }
       printstep(n-1,s,d,h);
        System.out.println("Move ");
    }

}
