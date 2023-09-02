package mayin_tarlasi;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    Scanner input = new Scanner(System.in);
    public int size;

    public String[][] field;
    public String[][] fieldPlayer;
    public int[][] mines;
    public int[] guess;
    public int[][] corners = new int[4][2]; //corners[0]:left top   corners[1]:right top    corners[2]:right bottom   corners[3]:left bottom

    private int[] getCoordinates(int size) {
        int[] c = new int[2];
        Random r = new Random();
        c[0] = r.nextInt(size); //nextInt(finish-start+1)+start
        c[1] = r.nextInt(size);
        return c;
    }

    public String[][] createFieldPlayer(int size) {
        //Just creating field
        String[][] a = new String[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                a[i][j] = "-";
            }
        }
        return a;
    }

    public String[][] createField(int size) {
        int k = 0;
        String[][] f = new String[size][size];


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                f[i][j] = "-";
            }
        }
        //Amount of mines: field/4
        //Also adding mines
        int amountOfMines = (size * size) / 4;
        for (int i = 0; i < amountOfMines; i++) {
            int[] c = getCoordinates(size);

            while (Objects.equals(f[c[0]][c[1]], "x"))
                c = getCoordinates(size);

            f[c[0]][c[1]] = "x";
            this.mines[k][0] = c[0];
            this.mines[k++][1] = c[1];
        }
        return f;
    }

    //For testing
    public void showMines(int[][] a) {
        for (int[] row : a) {
            System.out.print("[ ");
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.print("]\t");
        }
        System.out.println();
    }

    public void showField(String[][] a) {
        System.out.println();
        for (String[] row : a) {
            for (String col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public boolean isThereMine(String[][] a, int x, int y) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if ((i == x) && (j == y) && (Objects.equals(a[i][j], "x"))) {
                    return true;
                }
            }
        }
        return false;
    }

    public int howManyMinesNear(String[][] field, int[] guess) {
        /*There is 3 situation here:
         1-Corners
           a-Left Top     :[0][0]                      to look-> [ x ][y+1],[x+1][y+1],[x+1][ y ]
           b-Right Top    :[0][length-1]               to look-> [x+1][ y ],[x+1][y-1],[ x ][y-1]
           c-Right Bottom :[length-1][length-1]        to look-> [ x ][y-1],[x-1][y-1],[x-1][ y ]
           d-Left Bottom  :[length-1][0]               to look-> [x-1][ y ],[x-1][y+1],[ x ][y+1]
         2-Edges
           a-Top    :[0][1-(length-2)]                 to look-> [ x ][y-1],[x+1][y-1],[x+1][ y ],[ x ][y+1],[x+1][y+1]
           d-Left   :[1-(length-2)][0]                 to look-> [x-1][ y ],[x-1][y+1],[x+1][ y ],[ x ][y+1],[x+1][y+1]
           b-Right  :[1-(length-2)][length-1]          to look-> [ x ][y-1],[x-1][y-1],[x+1][ y ],[x-1][ y ],[x+1][y-1]
           c-Bottom :[length-1][1-(length-2)]          to look-> [x-1][y+1],[x-1][ y ],[x-1][y-1],[ x ][y+1],[ x ][y-1]
         3-Other spots

                                                       to look->[x-1][y],[x-1][y+1],[x][y+1],[x+1][y+1],[x+1][y],[x+1][y-1],[x][y-1],[x-1][y-1]
         */
        int x = guess[0];
        int y = guess[1];
        int counter = 0;
        int l = field.length;

        //If its corner
        boolean isLeftTop = Arrays.equals(guess, this.corners[0]);
        boolean isRightTop = Arrays.equals(guess, this.corners[1]);
        boolean isRightBottom = Arrays.equals(guess, this.corners[2]);
        boolean isLeftBottom = Arrays.equals(guess, this.corners[3]);

        if (isLeftTop) {
            if (isThereMine(this.field, x, (y + 1)))
                counter++;
            if (isThereMine(this.field, (x + 1), (y + 1)))
                counter++;
            if (isThereMine(this.field, (x + 1), (y)))
                counter++;
        } else if (isRightTop) {
            if (isThereMine(this.field, x, (y - 1)))
                counter++;
            if (isThereMine(this.field, (x + 1), (y - 1)))
                counter++;
            if (isThereMine(this.field, (x + 1), (y)))
                counter++;
        } else if (isRightBottom) {
            if (isThereMine(this.field, x, (y - 1)))
                counter++;
            if (isThereMine(this.field, (x - 1), (y - 1)))
                counter++;
            if (isThereMine(this.field, (x - 1), (y)))
                counter++;
        } else if (isLeftBottom) {
            if (isThereMine(this.field, x, (y + 1)))
                counter++;
            if (isThereMine(this.field, (x - 1), (y + 1)))
                counter++;
            if (isThereMine(this.field, (x - 1), (y)))
                counter++;
        }

        //no need to continue
        if (counter != 0)
            return counter;

        //If its edge
        boolean isTop = (x == 0) && (y != 0) && (y != l - 1);
        boolean isLeft = (y == 0) && (x != 0) && (x != l - 1);
        boolean isRight = (y == l - 1) && (x != 0) && (x != l - 1);
        boolean isBottom = (y == l - 1) && (x != 0) && (x != l - 1);

        if (isTop) {
            if (isThereMine(this.field, x, (y - 1)))
                counter++;
            if (isThereMine(this.field, (x + 1), (y - 1)))
                counter++;
            if (isThereMine(this.field, (x + 1), (y)))
                counter++;
            if (isThereMine(this.field, x, (y + 1)))
                counter++;
            if (isThereMine(this.field, (x + 1), (y + 1)))
                counter++;
        } else if (isLeft) {
            if (isThereMine(this.field, (x - 1), (y)))
                counter++;
            if (isThereMine(this.field, (x - 1), (y + 1)))
                counter++;
            if (isThereMine(this.field, (x + 1), (y)))
                counter++;
            if (isThereMine(this.field, x, (y + 1)))
                counter++;
            if (isThereMine(this.field, (x + 1), (y + 1)))
                counter++;
        } else if (isRight) {
            if (isThereMine(this.field, (x), (y - 1)))
                counter++;
            if (isThereMine(this.field, (x - 1), (y - 1)))
                counter++;
            if (isThereMine(this.field, (x + 1), (y)))
                counter++;
            if (isThereMine(this.field, (x - 1), (y)))
                counter++;
            if (isThereMine(this.field, (x + 1), (y - 1)))
                counter++;
        } else if (isBottom) {
            if (isThereMine(this.field, (x - 1), (y + 1)))
                counter++;
            if (isThereMine(this.field, (x - 1), (y)))
                counter++;
            if (isThereMine(this.field, (x - 11), (y - 1)))
                counter++;
            if (isThereMine(this.field, x, (y + 1)))
                counter++;
            if (isThereMine(this.field, (x), (y - 1)))
                counter++;
        }
        //no need to continue
        if (counter != 0)
            return counter;

        //If it's neither corner nor edge
        if (isThereMine(this.field, (x - 1), y))
            counter++;
        if (isThereMine(this.field, (x - 1), (y + 1)))
            counter++;
        if (isThereMine(this.field, (x), (y + 1)))
            counter++;
        if (isThereMine(this.field, (x + 1), (y + 1)))
            counter++;
        if (isThereMine(this.field, (x + 1), y))
            counter++;
        if (isThereMine(this.field, (x + 1), (y - 1)))
            counter++;
        if (isThereMine(this.field, (x), (y - 1)))
            counter++;
        if (isThereMine(this.field, (x - 1), (y - 1)))
            counter++;

        return counter;
    }

    public void cornerInitialize(int size) {
        int[][] a = new int[4][2];
        //corners[0]:left top   corners[1]:right top    corners[2]:right bottom   corners[3]:left bottom
        a[0][0] = 0;
        a[0][1] = 0;

        a[1][0] = 0;
        a[1][1] = this.size - 1;

        a[2][0] = this.size - 1;
        a[2][1] = this.size - 1;

        a[3][0] = this.size - 1;
        a[3][1] = 0;
        this.corners = a;
    }

    public void fieldUpdate(int amountOfMine, int[] guess) {
        int x = guess[0];
        int y = guess[1];
        String value = String.valueOf(amountOfMine);
        this.fieldPlayer[x][y] = value;
        this.field[x][y] = value;
    }

    public boolean isWin(String[][] a) {
        for (String row[] : a) {
            for (String col : row) {
                if (Objects.equals(col, "-"))
                    return false;
            }
        }
        return true;
    }

    public void run() {
        int size;
        int score = 0;
        int mine;

        do {
            System.out.print("The minesweeper field size must be at least 3. Enter the size: ");
            size = input.nextInt();
        } while (size < 3);
        this.size = size;

        cornerInitialize(size);

        this.mines = new int[(size * size) / 4][2];
        this.field = createField(size);
        this.fieldPlayer = createFieldPlayer(size);

        System.out.println("Field:");
        showField(field);
        System.out.println("Player Field:");
        showField(fieldPlayer);


        this.guess = new int[size * size];
        while (true) {
            if (isWin(this.field)) {
                System.out.println("Tebrikler kazandınız!\nSkorunuz: " + score);
                showField(field);
                return;
            }
            System.out.print("x-y: ");
            this.guess[0] = input.nextInt();
            this.guess[1] = input.nextInt();
            if (Objects.equals(this.field[guess[0]][guess[1]], "x")) {
                showField(this.field);
                System.out.println("Kaybettiniz!\nSkorunuz: " + score);
                return;
            }
            mine = howManyMinesNear(this.field, guess);
            score++;
            fieldUpdate(mine, guess);
            System.out.println("Player Field:");
            showField(fieldPlayer);
        }
    }
}
