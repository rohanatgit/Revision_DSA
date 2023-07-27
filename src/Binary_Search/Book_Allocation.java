package Binary_Search;

public class Book_Allocation {
    public static void main(String[] args) {
        int page[]={10,20,30,40};
        int student=2;
        int nos=2;//number of students
        System.out.println(minimumpages(page,nos));

    }
    public static int minimumpages(int[] pages,int nos){
        int lo=0;
        int hi=0;
        for(int i=0;i<pages.length;i++){
            hi=hi+pages[i];
        }
        int ans=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(itispossible(pages,mid,nos)==true){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;

    }

    private static boolean itispossible(int[] pages, int mid, int nos) {
        int student=1;
        int read_page=0;
        int i=0;
        while(i<pages.length){
            if(read_page+pages[i]<=mid){
                read_page+=pages[i];
                i++;
            }
            else
            {
                student++;
                read_page=0;
            }
            if(student>nos){
                return false;
            }
        }
        return true;
    }
}
