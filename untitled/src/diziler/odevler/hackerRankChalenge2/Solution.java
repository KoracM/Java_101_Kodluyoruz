package diziler.odevler.hackerRankChalenge2;

import java.util.Random;
import java.util.Scanner;

public class Solution {

    public static int[] createGameArray(int[] a) {
        Random r = new Random();
        a[0] = 0;
        for (int i = 1; i < a.length; i++) {
            a[i] = r.nextInt(1 - 0 + 1) + 0;
        }
        return a;
    }

    public static void printArray(int[] a) {
        for (int i : a)
            System.out.print(i + " ");
    }
    //0 0 1 1  ->leap 2 i:2
    public static String checkWinOrNot(int[] a, int leap) {
        int i=0,l=a.length;
        boolean status=false;
        while (i>=0){
            if(i+leap<l && a[i+leap]==0){
                i+=leap;
                status=false;
            }
            else if (i+leap>l && a[i]==0 ) {
                return "YES";

            } else if(a[i]==0)
                i++;

            else{
                status=true;
                if(a[i-1]==1){
                    return "NO";
                }
                else if (a[i-1]==0) {
                    i--;
                }
                else if(a[i+leap]==0)
                    i+=leap;


            }
            System.out.println("i: "+i);
        }
        return "NO";
/*
l=9 leap=4

i:5
i:4

 */
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r=new Random();

        int query, size, leap;
        int[] game;

        query = input.nextInt();

        for(int i=0;i<query;i++){
            size = input.nextInt();
//            size=r.nextInt(10-3+1)+3;
            game=new int[size];
//            leap=r.nextInt(10-1+1)+1;
            leap = input.nextInt();

            /*createGameArray(game);
            System.out.println("\n");
            printArray(game);
            System.out.print("\nleap: "+leap+"\t");*/
            for(int j=0;j<size;j++)
                game[j]=input.nextInt();

            System.out.println(checkWinOrNot(game, leap));
        }

    }
}
