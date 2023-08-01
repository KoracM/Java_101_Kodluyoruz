package donguler.pratikler.uslu_sayi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int base,power,result=1,temp;
        System.out.print("Enter the base value: ");
        base= input.nextInt();
        System.out.print("Enter the positive power value: ");
        power= input.nextInt();
        temp=power;
        while (power>0){
            result*=base;
            power--;
        }
        System.out.println(base+"^"+temp+" = "+result);

        //odev
       /* for(int i=power;power>0;power--){
            result*=base;
        }
        System.out.println(base+"^"+temp+" = "+result);*/
    }
}

