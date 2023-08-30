package diger_konular.pratikler.sayi_tahmin;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class version2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random r=new Random();


        int sayi,tahmin,hak,temp,choose;


        while (true){
            boolean isWin=false;
            boolean enteredInvalid=false;

            sayi=r.nextInt(100-1+1)+1; //r.nextInt(finish-start+1)+start
//            System.out.println("Uretilen sayi = "+sayi);
            System.out.print("Kac adet hakkiniz olsun?: ");
            hak= input.nextInt();
            temp=hak;
            int[] hataliTahminler=new int[temp];

            while (true){
                System.out.print("\nTahmin: ");
                tahmin= input.nextInt();
                if (tahmin < 0 || tahmin > 100) { //while yerine continue kullanilabilir.
                    System.out.println("Yanlis deger girdiniz!\nLutfen 0-100 arasinda bir deger giriniz: ");
                    if(enteredInvalid){
                        hak--;
                        System.out.println("Cok fazla hatali giris sebebiyle tahmin hakkiniz azaldi. Kalan tahmin hakki: "+hak);
                    }
                    else {
                        enteredInvalid=true;
                        System.out.println("Bir daha hatali deger girilirse tahmin hakkiniz azalmaya baslayacak!");
                    }
                    continue;
                }
                if(sayi==tahmin) {
                    System.out.println("Tebrikler! "+sayi+" sayisini buldunuz!");
                    isWin=true;
                    break;
                }
                hataliTahminler[temp-hak]=tahmin;
                hak--;
                if(hak==0)  // bu kisim arada cunku hak bittiginde kucuk buyuk yazmasi sacma olur
                    break;

                else if (tahmin<sayi)
                    System.out.println("Daha buyuk bir sayi giriniz!");
                else
                    System.out.println("Daha kucuk bir sayi giriniz!");


                System.out.println("Kalan hakkiniz: "+hak);
            }
            if(hak==0 && !isWin) {
                System.out.printf("\nMalesef %d adet hakkiniz doldu!\nsayi: %d", temp, sayi);
                System.out.println("\nHatali tahminler: "+ Arrays.toString(hataliTahminler));
            }

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
