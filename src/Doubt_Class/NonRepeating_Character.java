package Doubt_Class;

public class NonRepeating_Character {
    public static void main(String[] args) {

    }
    public static int nonrepeatingcharter(String s){
        int si=0;
        int ei=0;
        int ans=0;
        int freq[]=new int[256];
        while(ei<s.length()){
            char ch=s.charAt(ei);
            freq[ch]=freq[ch]+1;

            ////window shrink

            while(freq[ch]>1){
                char c=s.charAt(si);
                freq[c]=freq[c]-1;
                si++;
            }

            //ans calculate
            ans=Math.max(ans,ei-si+1);
            ei++;
        }
        return ans;


    }
}
