package donguler.pratikler.armstrong_sayisi;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number,digit=0,temp,temp2,temp_digit=0,result=0,sumOfDigit=0;
        System.out.print("Enter the number to check if its Armstrong number or not: ");
        number= input.nextInt();
        temp=number;
        temp2=temp;
        while(temp!=0){
            temp=temp-(temp%10);
            temp/=10;
            digit++;
        }
        while (temp2!=0){
            result+=(int)pow(temp2%10,digit);
            temp2=temp2-(temp2%10);
            temp2/=10;
        }
        if(number==result)
            System.out.println(number+" is a Armstrong number.");
        else
            System.out.println(number+" isn't a Armstrong number!");
        //odev
        temp_digit=number;
        while (temp_digit!=0){
            sumOfDigit+=temp_digit%10;
            temp_digit=temp_digit-(temp_digit%10);
            temp_digit/=10;
        }
        System.out.println("Sum of the digits of "+number+" of is: "+sumOfDigit);
    }
}
