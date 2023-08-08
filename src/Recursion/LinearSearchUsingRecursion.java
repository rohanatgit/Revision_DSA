package Recursion;

public class LinearSearchUsingRecursion {
    public static void main(String[] args) {
       int arr[]={1,2,3};
       int x=2;
        System.out.println(linear(arr,0,x));
    }
    public static int linear(int arr[],int i,int x){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==x){
            return i;
        }
        return linear(arr,i+1,x);
    }

}
