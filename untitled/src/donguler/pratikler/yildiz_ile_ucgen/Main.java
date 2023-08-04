package donguler.pratikler.yildiz_ile_ucgen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter the number: ");
        number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = number - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println(); //satir atlamak icin
        }
        //odev: elmas sekli yapin /\
//                            \/
//-------------------------------------------------------------
        System.out.println();

        for (int i = 1; i <= number; i++) {
            for (int j = (number) - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println(); //satir atlamak icin
        }
        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < i-1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= ((2 * number)+1) - (2*i); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
