package kosullu_ifadeler_ve_kod_bloklari.odevler.ucak_bileti;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int km,age,tripType,control=-1,choose;
        double price;

        while (true){
            System.out.print("\nEnter the distance in km: ");
            km=input.nextInt();
            System.out.print("Enter the age: ");
            age=input.nextInt();
            System.out.print("Enter the trip type (1 - One-way ticket \t2 - Round-trip ticket): ");
            tripType=input.nextInt();

            price=0.1*km;

            if((km<0)||(age<0)||tripType<1 || tripType>2)
                control=0;

            if(control!=0){
                price=(age<12) ? (price*0.5):(age>=12 &&age<=24) ? (price*0.9):(age>65) ? (price*0.7):price;
                price=(tripType==2) ? (price*0.8)*2:price;
                System.out.println("\nFinal price is :"+price+" TL");
            }
            else {
                System.out.println("\nInformations has been entered wrongly!");
                control=-1;
            }
            System.out.print("\n[0] - Exit\t[1] - Continue : ");
            choose=input.nextInt();
            if(choose==0){
                System.out.println("\n[Exited...]");
                break;
            }
        }

    }
}
