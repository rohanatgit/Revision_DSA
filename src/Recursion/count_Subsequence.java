package Recursion;

public class count_Subsequence {
    static int c=0;
    public static void main(String[] args) {
        String str="abc";
        printsubsequnec(str,"");
        System.out.println(c);
    }
    public static void printsubsequnec(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            c++;
            return ;
        }
        char ch=ques.charAt(0);
        printsubsequnec(ques.substring(1),ans);
        printsubsequnec(ques.substring(1),ans+ch);
    }
}
