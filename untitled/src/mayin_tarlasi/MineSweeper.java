package mayin_tarlasi;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    Scanner input=new Scanner(System.in);

    public int size;


    public String[][] field;
    public String[][] fieldPlayer;

    public int[][] mines;
    public int[] guess;

    //Constructor method

    public void run(){
        int size;


        do {
            System.out.print("The minesweeper field size must be at least 3. Enter the size: ");
            size = input.nextInt();
        } while (size < 3);
        this.size=size;
        this.mines=new int[(size*size)/4][2];
        this.field=createField(size);
        this.fieldPlayer=createFieldPlayer(size);
        showField(field);
        showField(fieldPlayer);
        showMines(mines);
        this.guess=new int[size*size];
        while (true){
            System.out.print("x-y: ");
            this.guess[0]= input.nextInt();
            this.guess[1]= input.nextInt();
//            if(Arrays.)
        }


    }
    private int[] getCoordinates(int size){
        int[] c=new int[2];
        Random r=new Random();
        c[0]=r.nextInt(size); //nextInt(finish-start+1)+start
        c[1]=r.nextInt(size);
        return c;
    }
    public String[][] createFieldPlayer(int size){
        //Just creating field
        String[][] a=new String[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                a[i][j]="-";
            }
        }
        return a;
    }
    public String[][] createField(int size){
        int k=0;
        String[][] f=new String[size][size];


        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                f[i][j]="-";
            }
        }
        //Amount of mines: field/4
        //Also adding mines
        int amountOfMines=(size*size)/4;
        for(int i=0;i<amountOfMines;i++){
            int[] c=getCoordinates(size);

            while (Objects.equals(f[c[0]][c[1]], "x"))
                c = getCoordinates(size);

            f[c[0]][c[1]]="x";
            this.mines[k][0]=c[0];
            this.mines[k++][1]=c[1];
        }
        return f;
    }
    public void showMines(int[][] a){
        for(int[] row:a) {
            System.out.print("[ ");
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println("]");
        }
    }
    public void showField(String[][] a){
        System.out.println();
        for(String[] row:a) {
            for (String col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
