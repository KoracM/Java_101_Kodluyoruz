package temel_kavramlar_ve_degiskenler.odevler.vucut_kitle_indeksi;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Boy giriniz: ");
        float boy=input.nextFloat();
        System.out.print("Kilo giriniz: ");
        float kilo=input.nextFloat();
        System.out.println("Vucut kitle indeksi: "+(kilo)/(boy*boy));
    }
}
