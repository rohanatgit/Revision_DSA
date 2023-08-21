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
        int[][] ans=new int[n][m];
        printpath(maze,0,0,ans);
    }

    public static void printpath(char[][] maze, int cr, int cc, int[][] ans) {

        if(cc<0 || cc>=maze.length || cr<0 || cr>=maze.length || maze[cr][cc]=='X'){
            return;
        }
        int r[]={0,-1,0,1};
        int c[]={1,0,-1,0};

        maze[cr][cc]='X';
        ans[cr][cc]=1;

        for(int i=0;i<c.length;i++)
        {
            printpath(maze,cr+r[i],cc+c[i],ans);
        }
        maze[cr][cc]='X';
        ans[cr][cc]=0;

    }


}
