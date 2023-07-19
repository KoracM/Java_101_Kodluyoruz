package ornek;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int km;
        Scanner scan = new Scanner(System.in);

        System.out.println("km cins girin");
        km = scan.nextInt();

        double tutar = (km * (2.20)) + 10;

        if (tutar <= 20) {

            System.out.print("tutar: "+tutar+" ama yukari yuvarlandigi icin en son tutariniz 20 tl");
        } else {

            System.out.print("tutar " + tutar);
        }
        tutar=(tutar <20) ? 20: tutar;
        int yas=0;
        yas=(yas<18)? 18: (yas<18 && yas>=20) ? 20:(yas>20 && yas<=40)? 30 :50;
        System.out.println("\n\nEn son Tutar(citten): "+tutar);
    }
}


/*

import java.util.Scanner;
public class Main {
  public static void main(String[] args){
  int km;
  Scanner scan =new Scanner(System.in);

  System.out.println("km cins girin");
  km = scan.nextInt();

  double tutar = (km * (2.20)) +10;

 if(tutar<=20) {

 System.out.print("tutar 20 tl");{
 else {

 System.out.print("tutar " + tutar);
 */