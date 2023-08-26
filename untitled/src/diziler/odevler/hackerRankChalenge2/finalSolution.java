package diziler.odevler.hackerRankChalenge2;

import java.util.Scanner;

public class finalSolution {
        public static boolean canWin(int leap, int[] game, int i) {
            //ilk adimda buraya bakilmiyor
            if (i < 0 || i >= game.length || game[i] == 1)  //istenmeyen durumlar
                return false; // Hareket edilemez pozisyon

            if (i + leap >= game.length || i == game.length - 1)  //sondaysak ya da asmis isek boyutu
                return true;

            game[i] = 1; // Pozisyonu ziyaret edildi olarak işaretle ki geri donme

            return (canWin(leap, game, i + leap)) || (canWin(leap, game, i + 1) ) || (canWin(leap, game, i - 1) );
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int q = scanner.nextInt();

            for(int i=0;i<q;i++) {
                int n = scanner.nextInt();
                int leap = scanner.nextInt();
                int[] game = new int[n];
                for (int j = 0; j < n; j++)
                    game[i] = scanner.nextInt();

                System.out.println(canWin(leap, game, 0) ? "YES" : "NO");
            }
            scanner.close();
        }
}
