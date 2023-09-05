package RecursionANDbacktracking;

import java.util.ArrayList;
import java.util.Collections;

public class Subset1 {
    public static void func(int ind, int sum, ArrayList<Integer> arr, int N, ArrayList<Integer> sumSubset) {
             if(ind==N){
                 sumSubset.add(sum);
                 return ;
             }

        func(ind+1,sum+arr.get(ind),arr,N,sumSubset);
        func(ind+1,sum,arr,N,sumSubset);
    }

    public static void main(String[] args) {

    }

    ArrayList<Integer> subsetSum(ArrayList<Integer> arr, int n) {
        ArrayList<Integer> subSet = new ArrayList<>();
        func(0,0,arr,n,subSet);
        Collections.sort(subSet);
        return subSet;

    }


}
