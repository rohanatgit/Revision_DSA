package String;

public class SubString_Method {
    public static void main(String[] args) {
        String abc="abcd";
        printSubstring(abc);
    }
    public static void printSubstring(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
}
