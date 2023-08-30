package diziler.odevler.hackerRankChallenge2;

import java.util.Scanner;
public class SolutionV2 {

    public static String checkWinOrNot(int[] a, int leap) {
        boolean status = false;
        int i = 0, l = a.length;

        while (i < l) { //while sarti || i>0 cikarildi
            //Check win or not
            if ( i + leap >= l || i==l-1) { // i+l>=l cikarildi
//                System.out.println("Win");
                return "YES";
            }

            //Leap
            else if (a[i + leap] == 0) {
//                System.out.println("Leap");
                i += leap;
                status = false;
            }

            //Back Step
            else if (i-1>=0 && a[i - 1] == 0) {
//                System.out.println("Back Step");
                i--;
                status = true;
            }

            //Forward Step
            else if (!status && a[i+1] == 0) {
//                System.out.println("Forward Step");
                i++;
            }

            //No way to get back
            else {
//                System.out.println("Bumped into 1 or Back to the index 0");
                break;
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int query, size, leap;
        int[] game;

        query = input.nextInt();

        for (int i = 0; i < query; i++) {
            size = input.nextInt();
            game = new int[size];
            leap = input.nextInt();

            for (int j = 0; j < size; j++)
                game[j] = input.nextInt();
            long startTime = System.nanoTime();
            System.out.println(checkWinOrNot(game, leap));
            long endTime = System.nanoTime();
            System.out.println("Run time ns(nanoseconds): "+(endTime-startTime));
        }
    }
}
