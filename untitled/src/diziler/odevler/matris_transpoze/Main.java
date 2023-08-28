package diziler.odevler.matris_transpoze;

import java.util.Scanner;

public class Main {
    public static int[][] create2DArray(int row,int col){
        Scanner in=new Scanner(System.in);
        int[][] a=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("["+i+"]["+j+"]: ");
                a[i][j]=in.nextInt();
            }
        }
        return a;
    }

    public static int[][] transpoze(int[][] a,int row,int col){
        int[][] t=new int[col][row];
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                t[j][i]=a[i][j];
            }
        }
        return t;
    }

    public static void printArray(int[][] a){
        for(int row[]:a){
            for(int j:row){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[][] array,transpoze;
        int row,col;

        System.out.print("Enter the [row] [col] with 1 space: ");
        row= input.nextInt();
        col= input.nextInt();
        array=create2DArray(row,col);
        System.out.println("\nArray: ");
        printArray(array);
        transpoze=transpoze(array,row,col);
        System.out.println("\nTranspoze: ");
        printArray(transpoze);
    }
}
