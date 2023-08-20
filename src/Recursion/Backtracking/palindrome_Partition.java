package Recursion.Backtracking;

public class palindrome_Partition {
    public static void main(String[] args) {
        String str="nitin";
        String ans="";
        printPartiotion(str,ans);
    }
    public static void printPartiotion(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return ;
        }
        for(int i=1;i<=ques.length();i++){
            printPartiotion(ques.substring(i),ans+ques.substring(0,i)+"|");
        }
    }
}
