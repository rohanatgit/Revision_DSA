package String;

public class Good_Substring {
    public static void main(String[] args) {
        String s="eaiousss";
        System.out.println(playing_with_good_substring(s));
    }
    public static int playing_with_good_substring(String s){
        int ans=0;
        int c=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(isVowel(ch)){
                c++;
            }
            else{
                ans=Math.max(ans,c);
                c=0;
            }
        }
        return ans;
    }
    public static boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
}
