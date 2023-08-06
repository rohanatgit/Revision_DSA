package Doubt_Class;

import java.util.Scanner;

public class k_unique_Character_Substring {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            String str = sc.next();
            int k = sc.nextInt();
        }
    }
    public static int k_Unique(String str,int k){
        int si=0;
        int ei=0;
        int ans=-1;
        int freq[]=new int[256];
        int unique_count=0;
        while(ei<str.length()){
            //window grow
            char ch=str.charAt(ei);
            if(freq[ch]==0){
                unique_count++;
            }
            freq[ch]=freq[ch]+1;


            //window shirink
            while(unique_count>k){
                 char c=str.charAt(si);
                 freq[c]=freq[c]-1;
                 if(freq[c]==0){
                     unique_count--;
                 }
            }


            //calculate ans
           if(unique_count==k){
               ans=Math.max(ans,ei-si+1);

           }



        }
        return ans;
    }
}
