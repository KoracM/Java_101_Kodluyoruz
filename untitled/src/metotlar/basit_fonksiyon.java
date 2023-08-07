package metotlar;

import java.util.Scanner;

public class basit_fonksiyon {

    static float pow(int base, int pow) {
        float sum = 1;
        if (pow >= 0) {
            for (int i = 0; i < pow; i++) {
                sum *= base;
            }
        } else {
            for (int i = 0; i < (pow * -1); i++) {
                sum *= 1.0 / base;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Find the x^y, enter the numbers like seperated  space (x y) :");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(a + "^" + b + " = " + pow(a, b));
    }
}
