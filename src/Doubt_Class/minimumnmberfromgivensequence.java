package Doubt_Class;

public class minimumnmberfromgivensequence {
    public static void main(String[] args) {
        String str="DDIID";
        from_minimum_number(str);
    }
    public static void from_minimum_number(String str){
        int n=str.length();
        int ans[]=new int[n+1];
        int count=1;
        for(int i=0;i<=n;i++){
            if(i==n || str.charAt(i)=='I'){
                ans[i]=count;
                count++;
                for(int j=i-1;j>=0 && str.charAt(j) != 'I' ;j--) {
                        ans[j] = count;
                        count++;
                }
            }
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]);
        }
    }
}
