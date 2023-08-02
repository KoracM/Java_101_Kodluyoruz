package donguler.pratikler.girilen_sayiya_kadar_ciftleri_bul;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number,sumOfEvens = 0,counter=0;
        System.out.print("Enter the number: ");
        number=input.nextInt();
        System.out.println("Even numbers between 0 - "+number+": ");
        for(int i=0;i<=number;i++){
            if(i%2==0)
                System.out.print(i+"\t");
            if(i%3==0 && i%4==0 && i!=0){
                sumOfEvens+=i;
                counter++;
            }
        }
        System.out.println("\n\nAvarage of number that can divided by 3 and 4 is: "+sumOfEvens/counter);
        System.out.println("Even numbers between 0 -"+number+" with while:\n");
        //while
        int k=0;
        while(k<=number){
            if(k%2==0)
                System.out.print(k+"\t");
            k++;
        }
    }
}
