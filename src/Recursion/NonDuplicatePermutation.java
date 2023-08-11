package Recursion;

public class NonDuplicatePermutation {
    public static void main(String[] args) {
       String ques="abcd";
       printPermutation(ques,"");
    }
    public static void printPermutation(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return ;
        }
        for(int i=0;i<ques.length();i++) {
            char ch = ques.charAt(i);
            boolean flag = true;
            for (int j = i; j < ques.length(); j++) {
                if (ques.charAt(j) == ch) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                String ros = ques.substring(0, i) + ques.substring(i + 1);
            }
        }
    }
}
