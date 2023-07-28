public class Transpose_matrix {
    public static void main(String[] args) {
       int arr[][]={{2,3,4,7},{8,12,15,16},{18,1,2,4},{20,5,6,7}};
       transpose(arr);
    }
    public static void transpose(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr[0].length;j++){
//                arr[j][i]=arr[i][j];
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
