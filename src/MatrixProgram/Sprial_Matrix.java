package MatrixProgram;

public class Sprial_Matrix {
    public static void main(String[] args) {
         //TODO AUTO-GENRATED MATHEROD STUB
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        sprialmatrix(arr);
    }
    public static void sprialmatrix(int arr[][]){
        int minr=0;
        int maxr=arr.length-1;
        int minc=0;
        int maxc=arr[0].length-1;
        for(int i=minc;i<=maxc;i++){
            System.out.println(arr[minr][i]+" ");
        }
        minr++;
        for(int i=minr;i<=maxr;i++){
            System.out.println(arr[i][maxc]);
        }
        minc--;
        for(int i=maxc;i<=minc;i--){
            System.out.println(arr[maxr][i]);
        }
        maxr--;
        for (int i=)
    }
}
