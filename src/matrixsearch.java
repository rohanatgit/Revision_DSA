public class matrixsearch {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{3,1,3,4},{4,5,6,7}};
        int x=5;
        System.out.println(search(arr,x));
    }
    public static int search (int arr[][],int x){
        int row=0;
        int col=arr[0].length-1;
        while(col>=0 && row<arr.length){
            if(arr[row][col]==x){
                return 1;
            }
            else if(arr[row][col]>x){
                col--;
            }
            else{
                row++;
            }
        }
        return -1;
    }
}
