package kosullu_ifadeler_ve_kod_bloklari.odevler.hackerrank_if_else;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        System.out.print("Enter the number: ");
        n=input.nextInt();

        if(n%2==0){
            if((n>=2 &&n<=5)||n>20)
                System.out.println("Not Weird");
            else if (n>5 && n<=20)
                System.out.println("Weird");
        }
        else
            System.out.println("Weird");
    }
}
