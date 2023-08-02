package donguler.pratikler.armstrong_sayisi;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        /*Scanner input=new Scanner(System.in);
        int number,digit=0,temp,temp_digit=0,result=0,digitNumber=1;
        System.out.print("Enter the number to check if its Armstrong number or not: ");
        number= input.nextInt();
        temp=number;
        while(temp!=0){
            temp/=10;
            digit++;
        }
        temp=number; //tempin degerini tekrar atamaliyiz son degeri 0
        while (temp!=0){
            for(int i=0;i<digit;i++){
                digitNumber*=temp%10;
            }
            temp/=10;
            result+=digitNumber;
            digitNumber=1;
        }

        if(number==result)
            System.out.println(number+" is a Armstrong number.");
        else
            System.out.println(number+" isn't a Armstrong number!");*/

        //odev
//--------------------------------------------------------------------------------
        //Belirli araliktaki Armstrong sayilari bul.
        Scanner input=new Scanner(System.in);
        int number;
        System.out.print("in range of 0 -? which numbers are Armstrong numbers: ");
        number=input.nextInt();

        System.out.println("Armstrong numbers between 0-"+number+" are: ");
        for(int i=1;i<=number;i++){
            int temp,digit=0,result=0,digitNumber;
            temp=i;
            //basamak bulma
            while(temp!=0){
                temp/=10;
                digit++;
            }
            temp=i;
            while(temp!=0){
                digitNumber=1;
                for(int j=0;j<digit;j++){
                    digitNumber*=temp%10;
                }
                temp/=10;
                result+=digitNumber;
            }
            if(result==i)
                System.out.print(i+"\t");
        }

        //odev
//--------------------------------------------------------------------------------
       /* temp_digit=number;
        while (temp_digit!=0){
            sumOfDigit+=temp_digit%10;
            temp_digit=temp_digit-(temp_digit%10);
            temp_digit/=10;
        }
        System.out.println("Sum of the digits of "+number+" is: "+sumOfDigit);*/
    }
}
