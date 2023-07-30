package MatrixProgram;

import java.util.Scanner;

public class Divisible_SubArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
        }
    }
    public static long goodSubarray(int [] arr){
        int n=arr.length;
        long[] freq=new long[n];
        int s=0;
        //long[] frew=new long[n];
        freq[0]=1;
        for(int i=0;i<freq.length;i++){
            s+=arr[i];
            s=s%n;
            freq[s]=freq[s]+1;
        }
        long ans=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>=2){
                ans=ans+(freq[i]*(freq[i]-1))/2;
            }
        }
        return ans;
    }
}
