package kosullu_ifadeler_ve_kod_bloklari.pratikler.hesap_makinesi;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choose=-1;
        while(choose!=0){
            System.out.print("\nEnter the 1st number: ");
            float number1 = input.nextInt();
            System.out.print("Enter the 2nd number: ");
            float number2 = input.nextInt();
            System.out.println("\n[1]-Addition\n[2]-Substraction\n[3]-Multiplication\n[4]-Division\n[0]-Exit\n");
            System.out.print("Which transaction will be done?: ");
            choose=input.nextInt();

            switch (choose) {
                case 1:
                    //Addition: toplama
                    float result_a=number1+number2;
                    System.out.println("Result is: "+result_a);
                    break;
                case 2:
                    //Substraction: cikarma
                    float result_s=number1-number2;
                    System.out.println("Result is: "+result_s);
                    break;
                case 3:
                    //Multiplication: carpma
                    float result_m=number1*number2;
                    System.out.println("Result is: "+result_m);
                    break;
                case 4:
                    //Division: bolme
                    if(number2!=0){
                        float result_d=number1/number2;
                        System.out.println("Result is: "+result_d);
                        break;
                    }
                    else{
                        System.out.println("\nA number cannot be divided by 0!");
                        break;
                    }
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid value has been inserted!");
                    break;
            }
        }
    }
}


