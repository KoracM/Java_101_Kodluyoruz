package diziler.odevler.hackerRankChallenge1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        int[] array=new int[size];

        for(int i=0;i<size;i++)
            array[i]=input.nextInt();

        for(int i:array)
            System.out.println(i);
    }
}