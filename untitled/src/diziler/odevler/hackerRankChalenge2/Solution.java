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
        boolean status = false;
        int i = 0, l = a.length;

        while (i < l) {
            //Check win or not
            if (a[i] == 0 && ((i + 1 >= l) || (i + leap >= l)))
                return "YES";

                //If we can leap why not
            else if (a[i] == 0 && a[i + leap] == 0)
                i += leap;

                //Continue to until 1
            else if (!status && a[i] == 0 )
                i++;

                //If we bump into 1
            else {
                status = true;
                i--;
                if (i < 0 || a[i] == 1)
                    return "NO";

                else if ((i+leap<l) && (a[i] == 0) && (a[i + leap] == 0)) {
                    i += leap;
                    status = false;
                }
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();

        int query, size, leap;
        int[] game;

        query = input.nextInt();

        for (int i = 0; i < query; i++) {
            size = input.nextInt();
//            size=r.nextInt(10-3+1)+3;
            game = new int[size];
//            leap=r.nextInt(10-1+1)+1;
            leap = input.nextInt();

            /*createGameArray(game);
            System.out.println("\n");
            printArray(game);
            System.out.print("\nleap: "+leap+"\t");*/
            for (int j = 0; j < size; j++)
                game[j] = input.nextInt();

            System.out.println(checkWinOrNot(game, leap));
        }

    }
}
