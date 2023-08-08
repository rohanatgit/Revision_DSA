package Recursion;

public class SubSequence {
    public static void main(String[] args) {
        String str="abc";
        printsubsequnec(str,"");
    }
    public static void printsubsequnec(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return ;
        }
        char ch=ques.charAt(0);
        printsubsequnec(ques.substring(1),ans);
        printsubsequnec(ques.substring(1),ans+ch);
    }
}
