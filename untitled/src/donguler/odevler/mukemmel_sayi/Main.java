package donguler.odevler.mukemmel_sayi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number,sum=0,select;
        Scanner input=new Scanner(System.in);

        while (true){
            System.out.print("\nEnter the number to find if it's a perfect number or not: ");
            number= input.nextInt();

            if(number>=0){
                for(int i=1;i<number;i++){
                    if(number%i==0)
                        sum+=i;
                }
                if(number==sum && number!=0)
                    System.out.println(number+" is a perfect number.");
                else
                    System.out.println(number+" isn't a perfect number!");
                sum=0;

                while (true){
                    System.out.println("\n[1] - Continue\n[0] - Exit");
                    System.out.print("->");
                    select= input.nextInt();
                    if(select==0){
                        System.out.println("\nExited.");
                        return;
                    }
                    else if (select==1) {
                        break;
                    }
                    else {
                        System.out.println("\nInvalid selection!");
                    }
                }
            }
            else
                System.out.println("\nNegative numbers cannot be a perfect numbers!");
        }
    }
}
