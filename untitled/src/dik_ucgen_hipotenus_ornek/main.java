package dik_ucgen_hipotenus_ornek;

import java.util.Scanner;


/*
Dik Üçgende Hipotenüs Bulan Program
Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

Formül
Uc𝑔𝑒𝑛𝑖𝑛 c𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

𝑢 = (a+b+c) / 2

Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
 */
public class main {
    public static void main(String[] args) {
        System.out.println("\n\nUcgenin hipotenusunu bulma ornegi\n");
        int dik_kenar_1,dik_kenar_2;
        Scanner input=new Scanner(System.in);
        System.out.print("1. dik kenari giriniz: ");
        dik_kenar_1=input.nextInt();
        System.out.print("2. dik kenari giriniz: ");
        dik_kenar_2=input.nextInt();
        System.out.println("Hipotenus: "+Math.sqrt(((dik_kenar_1*dik_kenar_1)+(dik_kenar_2*dik_kenar_2))));

        System.out.println("\n\nUcgenin alanini bulma ornegi\n");
        int kenar_1,kenar_2,kenar_3;
        float u,alan;
        Scanner input_2=new Scanner(System.in);
        System.out.print("1. kenari giriniz: ");
        kenar_1=input_2.nextInt();
        System.out.print("2. kenari giriniz: ");
        kenar_2=input_2.nextInt();
        System.out.print("3. kenari giriniz: ");
        kenar_3=input_2.nextInt();
        u=(kenar_1+kenar_2+kenar_3)/2;
        alan= (float) Math.sqrt(u*(u-kenar_1)*(u-kenar_2)*(u-kenar_3));
        System.out.println("Ucgenin alani: "+alan);
    }
}
