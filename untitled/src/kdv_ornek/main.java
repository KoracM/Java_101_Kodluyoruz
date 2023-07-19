package kdv_ornek;

import java.util.Scanner;

/*
KDV Tutari Hesaplayan Program

Ornek:
KDV'siz Fiyat = 10, KDV'li Fiyat = 11.8, KDV tutarı = 1.8

Ödev
Eger girilen tutar 0 ve 1000 TL arasinda ise KDV orani %18 , tutar 1000 TL'den buyuk ise KDV oranini %8 olarak KDV tutari hesaplayan programi yaziniz.
 */
public class main {
    public static void main(String[] args) {
        float kdvli_para;
        float kdv_tutari;
        System.out.print("\nPara miktarini giriniz: ");
        Scanner input=new Scanner(System.in);
        float para=input.nextFloat();
        while(para<=0){
            System.out.print("Lutfen miktari dogru giriniz: ");
            Scanner input2=new Scanner(System.in);
            para=input.nextFloat();
        }
        if(para<=1000){kdvli_para=(float) (para+para*0.18);kdv_tutari= 0.18F;}
        else{kdvli_para= (float) (para+para*0.08);kdv_tutari=0.08F;}
        System.out.println("KDV'li fiyat: "+kdvli_para+"\tKDV'siz fiyat: "+para+"\tKDV miktari: "+kdv_tutari);

    }
}
