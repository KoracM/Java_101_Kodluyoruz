package kosullu_ifadeler_ve_kod_bloklari.odevler.artik_yil;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil;

        System.out.print("Yili giriniz: ");
        yil = input.nextInt();

        if (yil % 100 == 0 && yil % 400 == 0)
            System.out.println(yil + " bir artik yildir");

        else if (yil % 4 == 0 && yil % 100 != 0)
            System.out.println(yil + " bir artik yildir");

        else
            System.out.println(yil + " bir artik yil degildir!");
    }
}
