package donguler.pratikler.EBOB_EKOK;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select,n1, n2, ebob = 1, ekok = 1;

        while (true) {
            //for ile
            System.out.print("Enter the 1st number: ");
            n1 = input.nextInt();
            System.out.print("Enter the 2nd number: ");
            n2 = input.nextInt();
            if (n1 <= 0 || n2 <= 0)
                System.out.println("Yanlis deger girildi. Lutfen tekrar giriniz!");
            else {
                int smallest = (n1 < n2) ? n1 : n2;

                //EKOK BULMA 1.yol. Bu yolda for dongusu daha az calisir.
                for (int i = 1; i <= n1 * n2; i++) {
                    if (i % n1 == 0 && i % n2 == 0) {
                        ekok = i;
                        break;
                    }
                }

                /*//EKOK BULMA 2.yol. Bu yolda for dongusu daha fazla calisir.
                for (int i = n1 * n2; i >= 1; i--) {
                    if (i % n1 == 0 && i % n2 == 0)
                        ekok = i;
                }*/


              /*  //EBOB BULMA 1.yol. 2.yola gore daha fazla calisir buradaki for.
                for(int i=1;i<=smallest;i++){
                    if(n1%i==0 && n2%i==0)
                        ebob=i;
                }
                System.out.println("\nEbob 1.yol ile: "+ebob);*/

                //EBOB BULMA 2.yol. For burada daha az calisir.
                for (int i = smallest; i >= 1; i--) {
                    if (n1 % i == 0 && n2 % i == 0) {
                        ebob = i;
                        break; //burada dongu bitirilmeli cunku en buyuk ortak bolenden daha kucuk olanlari alir.
                    }
                }
                System.out.println("\nEbob: " + ebob + "\tEkok: " + ekok);
                System.out.println("\n[1] - Ebob Ekok almaya devam.\n[0] - Cikis");
                System.out.print("Seciminiz: ");
                select=input.nextInt();
                System.out.println();
                if(select==0){
                    System.out.println("Cikildi...");
                    break;
                }
            }
        }
        //ODEV: while ile
/*        Scanner input=new Scanner(System.in);
        int n1,n2,i=2,ebob=1,ekok=1;

        while (true){
           System.out.print("Enter the number1: ");
           n1= input.nextInt();
           System.out.print("Enter the number2: ");
           n2= input.nextInt();
           if(n1<=0 || n2<=0){
               System.out.println("Yanlis deger girildi. Lutfen tekrar giriniz!");
           }
           else{
               while (n1!=1 || n2!=1){
                   if(n1%i==0 && n2%i==0){
                       ebob*=i;
                       n1/=i;
                       n2/=i;
                   }
                   else{
                       if(n1%i==0){
                           n1/=i;
                           ekok*=i;
                       }

                       if(n2%i==0){
                           n2/=i;
                           ekok*=i;
                       }
                   }
                   if(n1%i!=0 && n2%i!=0)
                       i++;
               }
               ekok*=ebob;
               System.out.println("\nEkok: "+ekok+"\tEbob: "+ebob);
               break;
           }
       }*/
    }
}
