package kosullu_ifadeler_ve_kod_bloklari.pratikler.burc_bul;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String ay,burc = null;
        int gun=0,control = 0,choose;

        //switch case kullanarak
/*       while (true){
           System.out.print("Dogdugunuz ayiniz: ");
           ay=input.next().toLowerCase();
           System.out.print("Dogdugunuz gunu giriniz: ");
           gun=input.nextInt();
           if(gun<1 || gun>31)
               control=1;

           switch (ay){
               case "ocak":
                   burc=(gun<=21)?"oglak":"kova";
                   break;
               case "subat":
                   burc=(gun<=19)?"kova":"balik";
                   break;
               case "mart":
                   burc=(gun<=20)?"balik":"koc";
                   break;
               case "nisan":
                   burc=(gun<=20)?"koc":"boga";
                   break;
               case "mayis":
                   burc=(gun<=21)?"boga":"ikizler";
                   break;
               case "haziran":
                   burc=(gun<=22)?"ikizler":"yengec";
                   break;
               case "temmuz":
                   burc=(gun<=22)?"yengec":"aslan";
                   break;
               case "agustos":
                   burc=(gun<=22)?"aslan":"basak";
                   break;
               case "eylul":
                   burc=(gun<=22)?"basak":"terazi";
                   break;
               case "ekim":
                   burc=(gun<=22)?"terazi":"akrep";
                   break;
               case "kasim":
                   burc=(gun<=21)?"akrep":"yay";
                   break;
               case "aralik":
                   burc=(gun<=21)?"yay":"oglak";
                   break;
               default:
                   control=1;
                   break;
           }
           if(control!=1)
             System.out.println("Burcunuz: "+burc);
           else
               System.out.println("\nHatali giris yaptiniz!\n");
           System.out.print("[0] - Exit\t[1] - Continue -> ");
           choose=input.nextInt();
           if(choose==0)
               break;
       }*/

//--------------------------------------------------OPTION 2----------------------------------------------------

        //switch case kullanmadan
        while (true){
            System.out.print("Dogdugunuz ayi giriniz: ");
            ay=input.next();
            System.out.print("Dogdugunuz gunu giriniz: ");
            gun=input.nextInt();

            if(gun<1 || gun>31)
                control=1;


            if(ay.equals("ocak"))
                burc=(gun<=21)?"oglak":"kova";
            else if(ay.equals("subat"))
                burc=(gun<=19)?"kova":"balik";
            else if(ay.equals("mart"))
                burc=(gun<=20)?"balik":"koc";
            else if(ay.equals("nisan"))
                burc=(gun<=20)?"koc":"boga";
            else if(ay.equals("mayis"))
                burc=(gun<=21)?"boga":"ikizler";
            else if(ay.equals("haziran"))
                burc=(gun<=22)?"ikizler":"yengec";
            else if(ay.equals("temmuz"))
                burc=(gun<=22)?"yengec":"aslan";
            else if(ay.equals("agustos"))
                burc=(gun<=22)?"aslan":"basak";
            else if(ay.equals("eylul"))
                burc=(gun<=22)?"basak":"terazi";
            else if(ay.equals("ekim"))
                burc=(gun<=22)?"terazi":"akrep";
            else if(ay.equals("kasim"))
                burc=(gun<=21)?"akrep":"yay";
            else if(ay.equals("aralik"))
                burc=(gun<=21)?"yay":"oglak";
            else
                control=1;

            if(control!=1)
                System.out.println("Burcunuz: "+burc);
            else{
                System.out.println("\nHatali giris yaptiniz!\n");
                control=0;
            }

            System.out.print("[0] - Exit\t[1] - Continue -> ");
            choose=input.nextInt();
            if(choose==0)
                break;


        }
    }
}
