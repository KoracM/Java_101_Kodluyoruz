package donguler.pratikler.tek_sayilarin_toplami;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        /*Scanner input=new Scanner(System.in);
        int number=0,sumOfOdds=0;
        while(number>=0){
            System.out.print("Enter the number: ");
            number=input.nextInt();

            if(number%2!=0 && number>0)
                sumOfOdds+=number;
        }
        System.out.println("Sum of the odd numbers: "+sumOfOdds);*/
        //while ile de yapilabilir fakat do-while daha uygun ve mantikli

        Scanner input=new Scanner(System.in);
        int number,sumOfOdds=0;

        do {
            System.out.print("Enter the number: ");
            number= input.nextInt();

            // number%2!=0 yaparsak eger negatif degerleri de alir
            //orn -1%2=-1 olur dahil eder
            if(number%2==1)
                sumOfOdds+=number;

            System.out.println("Number: "+number);
        }while (number>=0);

        System.out.println("Sum of the odd numbers: "+sumOfOdds);


//___________________________________________________________________________________________________

        //odev tek sayi girilene kadar cift ve 4'un katlarini topla
     /*   Scanner input2=new Scanner(System.in);
        int number2,sum=0;


        do {
            System.out.print("Enter the number: ");
            number2= input.nextInt();
            if(number2%2==0 && number2%4==0)
                sum+=number2;

        }while (number2%2==0);
        System.out.println("Sum of the numbers that can divided by 2 and 4 is: "+sum);*/


        //while ile de yapilabilir fakat do-while daha uygun ve mantikli
        /*Scanner input_2=new Scanner(System.in);
        int number_2=0,sum=0;

        while ((number_2%2)==0){
            System.out.print("Enter the number: ");
            number_2=input.nextInt();
            if(number_2%2==0 && number_2%4==0)
                sum+=number_2;
        }
        System.out.println("Sum of the numbers that can divided by 2 and 4 is: "+sum);*/
    }
}
