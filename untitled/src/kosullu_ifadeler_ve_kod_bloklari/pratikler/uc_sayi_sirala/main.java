package kosullu_ifadeler_ve_kod_bloklari.pratikler.uc_sayi_sirala;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

 while (true){
     int number1,number2,number3;
     int biggest = 0,median=0,smallest=0;
     int choose=-1;

     System.out.print("1st number: ");
     number1=input.nextInt();
     System.out.print("2nd number: ");
     number2=input.nextInt();
     System.out.print("3rd number: ");
     number3=input.nextInt();
//      number1=?   number2=3   number3=?
     if(number1>number2){
         if(number1>number3){
             biggest=number1;
                if(number2>number3)
                {
                    median=number2;
                    smallest=number3;
                }
                else {
                    median=number3;
                    smallest=number2;
                }

         }
         else {
             biggest=number3;
             median=number1;
             smallest=number2;
         }
     }

     else{
         if(number2>number3){
             biggest=number2;
             if(number3>number1){
                 median=number3;
                 smallest=number1;
             }
             else {
                 median=number1;
                 smallest=number3;
             }
         }
         else {
             biggest=number3;
             median=number2;
             smallest=number1;
         }
     }
     System.out.println("Biggest number is: "+biggest+"\tMedian number is: "+median+"\tSmallest number is: "+smallest);
     System.out.println("\n[0] - Exit\t[1] - Continue");
     choose=input.nextInt();
     if(choose==0)
         break;
 }
    }
}
