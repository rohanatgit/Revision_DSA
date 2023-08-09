package Recursion;

public class coinTossWithoutTwoHeads {
    public static void main(String[] args) {
        int n=3;
     printcoint(n,"");
    }
    public static void printcoint(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
       if(ans.length()==0 || ans.charAt(ans.length()-1)!='H'){
           printcoint(n-1,ans+"H");
       }
       printcoint(n-1,ans+"T");
    }
}
