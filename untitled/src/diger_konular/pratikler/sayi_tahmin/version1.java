package diger_konular.pratikler.sayi_tahmin;

import java.util.Random;
import java.util.Scanner;

public class version1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random r=new Random();

        int sayi,tahmin,hak,temp,choose;

        while (true){
            sayi=r.nextInt(101);
            System.out.print("Kac adet hakkiniz olsun?: ");
            hak= input.nextInt();
            temp=hak;

            while (true){
                System.out.print("Tahmin: ");
                tahmin= input.nextInt();
                while (tahmin < 0 || tahmin > 100) { //while yerine continue kullanilabilir.
                    System.out.println("Yanlis deger girdiniz!\nLutfen 0-100 arasinda bir deger giriniz: ");
                    tahmin = input.nextInt();
                }
                hak--;
                if(hak==0)
                    break;
                if(tahmin>sayi)
                    System.out.println("Daha kucuk bir sayi giriniz!");
                else if (tahmin<sayi)
                    System.out.println("Daha buyuk bir sayi giriniz!");
                else {
                    System.out.println("Tebrikler! Sayiyi buldunuz!");
                    break;
                }
            }
            if(hak==0)
                System.out.printf("\nMalesef %d adet hakkiniz doldu!\nsayi: %d",temp,sayi);
            
            while (true){
                System.out.print("\n\n[1] - Devam\t[0] - Cikis\n->");
                choose= input.nextInt();
                if(choose==0) {
                    System.out.println("Cikis yapildi...");
                    return;
                }
                else if (choose==1)
                    break;
                else
                    System.out.println("Gecersiz deger girdiniz!");
            }
        }
    }
}
