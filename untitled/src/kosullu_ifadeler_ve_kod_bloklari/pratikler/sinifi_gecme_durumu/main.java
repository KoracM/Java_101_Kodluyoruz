package kosullu_ifadeler_ve_kod_bloklari.pratikler.sinifi_gecme_durumu;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

//        gecme notu =55
        float mat,fizik,turkce,kimya,muzik;
        float avg=0;
        int dersSayisi=5;

        System.out.print("Matematik notunuz: ");
        mat=input.nextFloat();
        System.out.print("Fizik notunuz: ");
        fizik=input.nextFloat();
        System.out.print("Turkce notunuz: ");
        turkce=input.nextFloat();
        System.out.print("Kimya notunuz: ");
        kimya=input.nextFloat();
        System.out.print("Muzik notunuz: ");
        muzik=input.nextFloat();

        if(mat>100 || mat<0){
            mat=0;
            dersSayisi--;
            //ayni satir icerisinde etki etmesine gerek olmadigi icin
            //burada -- en sonda gelebilir.
        }
        //Trinity "?" operatoru ile yapmak isteseydik.
/*        mat=(mat>=0 && mat<=100)? mat:0;
        dersSayisi=mat==0?--dersSayisi:dersSayisi;
        //dersSayisi-- olsaydi calismazdi cunku deger atanir daha sonra azaltma yapilirdi.
        //Yani ayni satirda degil sonraki satirda etki ederdi*/

        if(fizik>100 || fizik<0){
            fizik=0;
            dersSayisi--;
        }
        if(turkce>100 || turkce<0){
            turkce=0;
            dersSayisi--;
        }
        if(kimya>100 || kimya<0){
            kimya=0;
            dersSayisi--;
        }
        if(muzik>100 || muzik<0){
            muzik=0;
            dersSayisi--;
        }

        avg=(mat+fizik+turkce+kimya+muzik)/dersSayisi;
        if (avg<55)
            System.out.print("\nMaalesef kaldiniz.");
        else
            System.out.print("\nTebrikler gectiniz!");

        System.out.println("\tOrtalamaniz: "+avg);
    }
}
