package Recursion;

public class coinTossWithoutTwoHeads {
    public static void main(String[] args) {
        int n=3;

    }
    public static void printcoint(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
       if(ans.length()>=1 && ans.charAt(ans.length()-1)!='H'){
           printcoint(n-1,ans+"H");
       }
       printcoint(n-1,ans+"T");
    }
}
