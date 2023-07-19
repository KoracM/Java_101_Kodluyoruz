package not_ort_ornek;
/*
1-mat   2-fizik     3-turkce    4-tarih     5-muzik
derslerinin sinav puanlari kullanicidan alinip ort hesaplanacak
if-else kullanilmadan sinif gecti kaldi yazdir
 */

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        float ort=0;
        float matNot,fizikNot,turkceNot,tarihNot,muzikNot;

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen degerleri ',' ile giriniz!");
        System.out.print("Mat notu?: ");
        matNot=input.nextFloat();
        System.out.print("Fizik notu?: ");
        fizikNot= input.nextFloat();
        System.out.print("Turkce notu?: ");
        turkceNot= input.nextFloat();
        System.out.print("Tarih notu?: ");
        tarihNot= input.nextFloat();
        System.out.print("Fizik notu?: ");
        muzikNot= input.nextFloat();
        ort=(matNot+fizikNot+turkceNot+tarihNot+muzikNot)/5;
        System.out.println("Ort: "+ort);
        String durum=(ort>=60) ? "Sinifi gecti!":"Sinifta kaldi :/";
        System.out.println("Durum: "+durum);
        //tek satirda bu sekilde yazilabilir.
        //if(ort>=60){System.out.println("Sinifi gecti!");System.out.println("Sinifi gecti2!");} else {System.out.println("Sinifta kaldi :/");System.out.println("Sinifta kaldi2 :/");}
    }
}
