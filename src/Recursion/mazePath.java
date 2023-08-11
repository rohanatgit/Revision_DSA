package Recursion;

public class mazePath {
    public static void main(String[] args) {
        int m=4;
        int n=5;
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
        printPath(er,ec,cr+1,cc,ans+"H");
    }
}
