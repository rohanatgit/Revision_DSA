package Recursion;

public class mazePath {
    public static void main(String[] args) {
        int m=3;
        int n=3;
        printPath(n-1,m-1,0,0,"");
    }
    public static void printPath(int er,int ec,int cr,int cc,String ans){
        //er=end row
        //ec = end column
        // cc=currect column
        //cr=current row
        if(cc==ec && cr==er){
            System.out.println(ans+" ");
            return;
        }
        if(cc>ec || cr>er){
            return;
        }
        printPath(er,ec,cr,cc+1,ans+"H");
        printPath(er,ec,cr+1,cc,ans+"V");
    }
}
