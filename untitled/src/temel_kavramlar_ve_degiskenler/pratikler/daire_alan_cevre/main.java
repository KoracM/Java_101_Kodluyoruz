package temel_kavramlar_ve_degiskenler.pratikler.daire_alan_cevre;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        pi=3.14
        Scanner input=new Scanner(System.in);
        System.out.print("Yaricapi giriniz: ");
        float r=input.nextFloat();
        float pi= 3.14F;

        System.out.println("Dairenin alani: "+(r*r)*pi+"\tcevresi: "+2*pi*r);

//        odev kismi
        System.out.print("Merkez aciyi giriniz: ");
        float aci=input.nextFloat();
        System.out.print("Yaricapi giriniz: ");
        float R=input.nextFloat();
        System.out.println("Daire diliminin alani: "+(pi*R*R*aci)/360);

    }
}
