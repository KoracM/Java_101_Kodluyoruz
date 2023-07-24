package temel_kavramlar_ve_degiskenler.pratikler.taksimetre_ornek;

/*Taksimetre Programı
        Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.*/


import java.util.Scanner;

//step 1
/*public class main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float mesafe;
        while (true){
            System.out.print("Gidilecek mesafeyi giriniz: ");
             mesafe=input.nextFloat();
             if(mesafe<0){System.out.println("Mesafe negatif olamaz!");}
            if(mesafe>=0){break;}
        }

        float tutar= (float) (10+mesafe*2.20);
        if (tutar<=20){tutar=20;}
        else {tutar= (float) (10+mesafe*2.20);}
        System.out.println("Tutar: "+tutar);
    }
}*/

//step 2
public class main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float mesafe;
        while (true){
            System.out.print("Gidilecek mesafeyi giriniz: ");
            mesafe=input.nextFloat();
            if(mesafe<0){System.out.println("Mesafe negatif olamaz!");}
            if(mesafe>=0){break;}
        }

        float tutar= (float) (10+mesafe*2.20);
        tutar= (tutar<=20)?20: (float) (10 + mesafe * 2.20);
        System.out.println("Tutar: "+tutar);
    }
}
