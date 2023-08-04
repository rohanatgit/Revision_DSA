package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Diagonal_Traverse {
    public static void main(String[] args) {

    }
    public static int [] findDiagonalOrder(int[][] mat){
        int n=mat.length;
        int m=mat[0].length;
        int ans[]=new int[n*m];
        for(int d=0;d<n+m-1;d++){
          int r=0;
          int c=0;
          if(d<m){
              r=0;
              c=d;
          }
          else {
              r = d - m + 1;
              c = m - 1;

          }
          ArrayList<Integer> al=new ArrayList<>();
          int i=0;
          while(r<n || c>=0) {
              al.add(mat[r][c]);
              r++;
              c--;
          }
          if(d%2==0){
              Collections.reverse(al);
          }

              for(int val:al){
                  ans[i]=val;
                  i++;

          }

        }
        return ans;
    }
}
