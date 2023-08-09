package Recursion;

public class generateParanthesis {
    public static void main(String[] args) {

    }
    public static void paranthesis(int n,int opennig,int closing,String ans){
        if(opennig==n && closing==n){
            System.out.println(ans);
            return ;
        }
        if(opennig<n)
        {
            paranthesis(n,opennig+1,closing,ans+"(");
        }
        if(closing<opennig){
            paranthesis(n,opennig,closing+1,ans+")");
        }
    }
}
