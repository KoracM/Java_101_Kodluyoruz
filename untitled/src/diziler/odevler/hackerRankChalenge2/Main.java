package diziler.odevler.hackerRankChalenge2;

import java.util.Random;
import java.util.Scanner;

public class Main {
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

    public static String checkWinOrNot(int[] a, int leap) {
        int ctr=0;

        for (int i=0;i<a.length;i++) {
            /*if (a[i] == 0)
                ctr = 0;*/

            if((a[i]==1)  && i+leap-1<a.length && (a[i+leap-1]==1)){
                return "NO";
            }

           /* if (ctr >= leap)
                return "NO";*/

        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int query, size, leap;
        int[] game;

//        System.out.print("Querry: ");
        query = input.nextInt();

      /*  for (int i = 0; i < query; i++) {
            System.out.print("Size-leap: ");
            size = input.nextInt();
            leap = input.nextInt();
            game = new int[size];
            createGameArray(game);
            printArray(game);
            System.out.println(checkWinOrNot(game, leap));
        }*/
        for(int i=0;i<query;i++){
            size = input.nextInt();
            game=new int[size];
            leap = input.nextInt();
            for(int j=0;j<size;j++){
                game[j]=input.nextInt();
            }
            System.out.println(checkWinOrNot(game, leap));
        }

       /* game=new int[]{0,0,1,1,1,0};
        printArray(game);
        System.out.println(checkWinOrNot(game,3));

        game=new int[]{0,1,0};
        printArray(game);
        System.out.println(checkWinOrNot(game,1));*/

        /*
        10 6
        0 0 1 1 0 0 1 1 0 0
        No olmali yes veriyor
         */
    }
}
