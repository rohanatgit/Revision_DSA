package Recursion.Backtracking;

import java.util.Scanner;

public class RatChasesitscheese {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        char[][] maze=new char[n][m];
        for(int i=0;i<maze.length;i++){
           String s=sc.next();
           for(int j=0;j<s.length();j++){
               maze[i][j]=s.charAt(j);
           }
        }
    }

}
