package temel_kavramlar_ve_degiskenler.odevler.manav_kasa;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float armut=2.14F,elma=3.67F,domates=1.11F,muz=0.95F,patlican=5F;
        float armut_k,elma_k,domates_k,muz_k,patlican_k;


        System.out.print("Armut kac kilo?: ");
        armut_k=input.nextFloat();
        System.out.print("Elma kac kilo?: ");
        elma_k=input.nextFloat();
        System.out.print("Domates kac kilo?: ");
        domates_k=input.nextFloat();
        System.out.print("Muz kac kilo?: ");
        muz_k=input.nextFloat();
        System.out.print("Patlican kac kilo?: ");
        patlican_k=input.nextFloat();
        System.out.println("Toplam tutar: "+((armut*armut_k)+(elma*elma_k)+(domates*domates_k)+(muz*muz_k)+(patlican*patlican_k))+" TL");


    }
}
