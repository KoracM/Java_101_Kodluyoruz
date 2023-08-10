package metotlar.odevler.desen_recursive;

import java.util.Scanner;

public class Main {

    static void pattern(int a,int temp,boolean status){
        if(status && a==temp){
            System.out.print(a+"  ");
            return;
        }
        else if(status || a<=0){
            System.out.print(a+"  ");
            pattern(a+5,temp,true);
        }
        else {
            System.out.print(a+"  ");
            pattern(a-5,temp,false);
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number,select;
        while (true){
            System.out.print("\n\nEnter the number: ");
            number= input.nextInt();
            pattern(number,number,false);
            while (true){
                System.out.print("\n\n[1] - Continue\t[0] - Exit\n->");
                select=input.nextInt();
                if(select==1)
                    break;
                else if (select==0){
                    System.out.println("Exited...");
                    return;
                }
                else
                    System.out.println("\nInvalid Value!");
            }
        }
    }
}
