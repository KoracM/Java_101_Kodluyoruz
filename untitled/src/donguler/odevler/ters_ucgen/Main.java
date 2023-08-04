package donguler.odevler.ters_ucgen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of the triangle: ");
        int n= input.nextInt();
        System.out.println();

        for(int i=0;i<n;i++){
            //bosluk
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            //yildizlar
            for(int k=((2*n)-1)-(2*i);k>0;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}