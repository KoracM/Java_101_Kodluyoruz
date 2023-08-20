package diziler;

import java.util.Scanner;

public class foreach {
    public static void printArray(int[][] a){
        for(int[] i:a){
            for(int j:i){
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }

    public static int[][] createArray(int[][] a){
        int temp=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=temp+1;
                temp++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x,y;
        System.out.print("Enter the array[x][y] with space: ");
        x=input.nextInt();
        y=input.nextInt();

        int[][] a = new int[x][y];
        a=createArray(a);
        printArray(a);

        int[] scores = new int[10];
        scores = new int[3];
        scores = new int[]{215, 234, 218, 189, 221, 290};

        for (int score : scores) {
            System.out.print(score + "  ");
        }
    }
}
