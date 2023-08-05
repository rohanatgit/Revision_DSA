package SlidingWindow;

public class Kartik_Bhaiya_and_String {
    public static void main(String[] args) {
      String s="abbabb";
      int k=2;
      int flipa=maximumlength(s,k,'a');
        int flipb=maximumlength(s,k,'b');
        System.out.println(Math.max(flipa,flipb));
    }
    public static int maximumlength(String s,int k,char ch){
        int si=0;
        int ei=0;
        int ans=0;
        int flip=0;
        while(ei<s.length()){

            //window grow
          if(s.charAt(ei)==ch){
              flip++;
          }


            //window small
           while(flip>k && si<=ei){
               if(s.charAt(si)==ch){
                   flip--;
               }
               si++;
            }

            //window calculate
            ans=Math.max(ans,ei-si+1);
           ei++;

        }
        return ans;
    }
}
