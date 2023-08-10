package metotlar.odevler.uslu_sayilar_recursive;

import java.util.Scanner;

public class Main {

    static float pow(float base,float p){
        if(p<0)
            return ((float)1/ base)*pow(base,++p);

        else if (p>0)
            return base*pow(base,--p);

        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int power,select;
        float number;

        while (true){
            System.out.println("Find the power of a number.\n");
            System.out.print("Enter the base number: ");
            number=input.nextFloat();
            System.out.print("Enter the power: ");
            power= input.nextInt();
            System.out.println(number+"^"+power+" = "+pow(number,power));
            while (true){
                System.out.print("\n[1] - Continue\t[0] - Exit\t->");
                select= input.nextInt();
                if(select==1)
                    break;
                else if (select==0) {
                    System.out.println("\nExited...");
                    return;
                }
                else
                    System.out.println("\nInvalid value!");
            }
        }
    }
}
