package Recursion;

public class keypadNOKIA {
    static String[] key={"","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
    public  static void main(String[] args) {
    }
    public static void keyPad(String ques,String ans){
        if(ques.length()==0){
            System.out.print(ans);
            return ;
        }
        char ch=ques.charAt(0);//'1'-->49
        String pressString=key[ch-48];//ch-->49
        for(int i=0;i<pressString.length();i++){
            keyPad(ques,ans+pressString.charAt(i));
        }
    }
}
