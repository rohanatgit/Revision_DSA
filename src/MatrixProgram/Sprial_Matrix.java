package MatrixProgram;

public class Sprial_Matrix {
    public static void main(String[] args) {
        //TODO AUTO-GENRATED MATHEROD STUB
        int arr[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        sprialmatrix(arr);
    }

    public static void sprialmatrix(int arr[][]) {
        int minr = 0;
        int maxr = arr.length - 1;
        int minc = 0;
        int maxc = arr[0].length - 1;
        int total=arr.length*arr[0].length;
        int c=0;
        while (c<total) {
            for (int i = minc; i <= maxc && c<total; i++) {
                System.out.print(arr[minr][i] + " ");
                c++;
            }
            minr++;
            for (int i = minr; i <= maxr && c<total; i++) {
                System.out.print(arr[i][maxc] + " ");
                c++;
            }
            minc--;
            for (int i = maxc; i >= minc && c<total; i--) {
                System.out.print(arr[maxr][i] + " ");
                c++;
            }
            maxr--;
            for (int i = maxr; i >= minr && c<total; i--) {
                System.out.print(arr[i][minc] + " ");
                c++;
            }
            minc++;
        }
    }
}