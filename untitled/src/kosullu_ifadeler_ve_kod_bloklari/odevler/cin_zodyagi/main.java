package kosullu_ifadeler_ve_kod_bloklari.odevler.cin_zodyagi;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int yas;
        String burc="";

        System.out.print("Yasiniz giriniz: ");
        yas=input.nextInt()%12;
        switch (yas){
            case 0:
                burc="Maymun";
                break;
            case 1:
                burc="Horoz";
                break;
            case 2:
                burc="Kopek";
                break;
            case 3:
                burc="Domuz";
                break;
            case 4:
                burc="Fare";
                break;
            case 5:
                burc="Okuz";
                break;
            case 6:
                burc="Kaplan";
                break;
            case 7:
                burc="Tavsan";
                break;
            case 8:
                burc="Ejderha";
                break;
            case 9:
                burc="Yilan";
                break;
            case 10:
                burc="At";
                break;
            case 11:
                burc="Koyun";
                break;
            default:
                System.out.println("Gecersiz deger girdiniz!");
                break;
        }
        System.out.println("Cin Zodyagi burcunuz: "+burc);

    }
}
