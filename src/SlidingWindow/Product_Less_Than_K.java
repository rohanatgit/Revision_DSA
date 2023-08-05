package SlidingWindow;

public class Product_Less_Than_K {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,2,3};
        int k=10;
        System.out.println(countsubarray(arr,k));
    }
    public static int countsubarray(int[] arr,int k){
        int si=0;
        int ei=0;
        int ans=0;
        int p=1;
        while(ei<arr.length){


            //window grow
            p=p*arr[ei];


            //window small
            while (p>=k){
                p=p/arr[si];
                si++;
            }

            //ans calculate
            ans=ans+ei-si+1;
            ei++;
        }
        return ans;
    }
}
