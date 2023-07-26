package kosullu_ifadeler_ve_kod_bloklari.pratikler.hava_sicakligi_etkinlik_oner;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while (true){
            System.out.print("\n\nHava sicakligini giriniz: ");
            int sicaklik=input.nextInt();
            int choose;

            //if ile
            /*if(sicaklik<5)
                System.out.println("\nKayak yapabilirsiniz.");
            else if (sicaklik<25) {
                if (sicaklik<15)
                    System.out.println("\nSinemaya gidebilirsiniz.");
                if (sicaklik>10)
                    System.out.println("\nPiknik yapabilirsiniz.");
            }
            else
                System.out.println("Yuzmeye gidebilirsiniz.");*/

            //switch case + if ile
            if(sicaklik<5)
                System.out.println("\nKayak yapabilirsiniz.");
            else if (sicaklik<25) {
                switch (sicaklik){
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        System.out.println("\nSinemaya gidebilirsiniz");
                        break;
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        System.out.println("\nSinemaya ya da piknige gidebilirsiniz");
                        break;
                    default:
                        System.out.println("\nPiknige gidebilirsiniz");
                        break;
                }
            }
            else
                System.out.println("\nYuzmeye gidebilirsiniz");

            System.out.println("\n\n[0] - Exit\t[1] - Continue");
            System.out.print("-> ");
            choose=input.nextInt();
            if (choose==0)
                break;
        }
    }
}
