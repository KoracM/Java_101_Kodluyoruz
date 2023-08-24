package diziler.pratikler.cok_boyutlu_dizilerle_harf;

import java.util.Scanner;

public class Main {
    public static void a(int size) {
        String[][] a = new String[size][size];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == 0 || i == (a.length/2)-1) {
                    a[i][j] = " * ";
                } else if (j == 0 || j == a.length-1) {
                    a[i][j] = " * ";
                } else {
                    a[i][j] = "   ";
                }
            }
        }
        print(a);
    }

    public static void b(int size) {
        String[][] a = new String[size][size];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == 0 || i == (a.length/2)-1 || i==a.length-1) {
                    a[i][j] = " * ";
                } else if (j == 0 || j == a.length) {
                    a[i][j] = " * ";
                } else {
                    a[i][j] = "   ";
                }
            }
        }
        print(a);
    }

    public static void print(String[][] a) {
        for (String[] row : a) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size, select;

        do {
            System.out.print("Enter the size: ");
            size = input.nextInt();
            a(size);
            b(size);
            System.out.print("[1] - Continue\t[0] - Exit\n->");
            select = input.nextInt();
        }
        while (select == 1);
    }
}
