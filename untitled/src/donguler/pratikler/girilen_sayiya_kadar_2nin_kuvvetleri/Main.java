package donguler.pratikler.girilen_sayiya_kadar_2nin_kuvvetleri;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number,i=0;
        System.out.print("Enter the number: ");
        number=input.nextInt();
        while (pow(2,i)<=number || pow(4,i)<=number || pow(5,i)<=number){
            if(pow(2,i)<=number)
                System.out.print("2^"+i+":"+(int)pow(2,i)+"\t");
            if(pow(4,i)<=number)
                System.out.print("4^"+i+":"+(int)pow(4,i)+"\t");
            if(pow(5,i)<=number)
                System.out.print("5^"+i+":"+(int)pow(5,i)+"\t");
            i++;
        }
    }
}
