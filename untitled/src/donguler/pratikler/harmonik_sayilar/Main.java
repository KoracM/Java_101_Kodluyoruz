package donguler.pratikler.harmonik_sayilar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number;
        float result=0;
        System.out.print("1-? :");
        number= input.nextInt();
        for(int i=1;i<=number;i++){
            result+=1.0/i;
            System.out.println("Result: "+result+"\ti: "+i);
        }
        System.out.println("1 - "+number+" harmonic series: "+result);
    }
}
