package metotlar.odevler.asal_sayilar_recursive;

import java.util.Scanner;

public class Main {

    static void isPrimeNumber(int n,int a){
        if (n%a==0 && a!=n) {
            System.out.println(" isn't a prime number!");
            return;
        }
        else if(a==n) {
            System.out.println(" is a prime number.");
            return;
        }
        isPrimeNumber(n,++a);
    }


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number,select;
        while (true){
            System.out.print("Enter the number to check if its a prime number or not: ");
            number= input.nextInt();
            System.out.print(number);
            isPrimeNumber(number,2);

            while (true){
                System.out.print("\n[1] - Continue\t[0] - Exit\n->");
                select= input.nextInt();

                if(select==1)
                    break;

                else if (select==0)
                    return;

                else
                    System.out.println("\nInvalid Value!");

            }
        }
    }
}
