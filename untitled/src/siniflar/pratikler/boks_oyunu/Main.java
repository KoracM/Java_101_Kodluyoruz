package siniflar.pratikler.boks_oyunu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        int minDamage,maxDamage,hp,weight,luck;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter 1st fighters name: ");
        name= input.next();
        System.out.print("Enter 1st fighters min damage: ");
        minDamage= input.nextInt();
        System.out.print("Enter 1st fighters max damage: ");
        maxDamage= input.nextInt();
        System.out.print("Enter 1st fighters hp: ");
        hp= input.nextInt();
        System.out.print("Enter 1st fighters weight: ");
        weight= input.nextInt();
        System.out.print("Enter 1st fighters luck % : ");
        luck= input.nextInt();

        Fighter f1=new Fighter(name,minDamage,maxDamage,hp,luck,weight);

        System.out.print("\nEnter 2nd fighters name: ");
        name= input.next();
        System.out.print("Enter 2nd fighters min damage: ");
        minDamage= input.nextInt();
        System.out.print("Enter 2nd fighters max damage: ");
        maxDamage= input.nextInt();
        System.out.print("Enter 2nd fighters hp: ");
        hp= input.nextInt();
        System.out.print("Enter 2nd fighters weight: ");
        weight= input.nextInt();
        System.out.print("Enter 2nd fighters luck % : ");
        luck= input.nextInt();

        Fighter f2=new Fighter(name,minDamage,maxDamage,hp,luck,weight);

        Match m=new Match(f1,f2,50,150);
    }
}
