package metotlar.pratikler.palindrom_sayilar;

import java.util.Scanner;

public class Main {
    static void isPalindrome(int a) {
        int temp=a,reversed=0;
        while (temp>0){
            reversed=(reversed*10)+(temp%10);
            temp/=10;
        }
        if (reversed==a)
            System.out.println(a+" is a palindrome number.\n");
        else
            System.out.println(a+" isn't a palindrome number!\n");
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number,select;
        do {
            System.out.print("Enter the number to check if its a palindrome number or not: ");
            number= input.nextInt();
            isPalindrome(number);
            System.out.print("[1] - Continue\t[0] - Exit ->");
            select= input.nextInt();
        }while (select==1);
    }
}
