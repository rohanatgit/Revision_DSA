package Recursion;

import java.util.ArrayList;
import java.util.List;

public class generateParanthesis {
    public static void main(String[] args) {
         int n=3;
         List<String> list=new ArrayList<>();
        paranthesis(n,0,0,"",list);
    }
    public static void paranthesis(int n,int opennig,int closing,String ans, List<String> list){
        if(opennig==n && closing==n){
            list.add(ans);
            return ;
        }
        if(opennig<n)
        {
            paranthesis(n,opennig+1,closing,ans+"(",list);
        }
        if(closing<opennig){
            paranthesis(n,opennig,closing+1,ans+")",list);
        }
    }
}
