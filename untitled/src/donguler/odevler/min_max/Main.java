package donguler.odevler.min_max;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amount, smallest = 0, greatest = 0, temp;

        while (true) {
            System.out.print("How many numbers will be comparisoned?: ");
            amount = input.nextInt();

            if (amount > 1) {
                //finding to the greatest number here
                for (int i = 1; i <= amount; i++) {
                    System.out.print("Enter the number" + i + ": ");
                    temp = input.nextInt();
                    if (i == 1) {
                        greatest = temp;
                        smallest = temp;
                    } else {
                        if (temp > greatest)
                            greatest = temp;
                        if (temp < smallest)
                            smallest = temp;
                    }
                }
                System.out.println("\nSmallest number: " + smallest + "\tGreatest number: " + greatest);
                break;
            }
            else
                System.out.println("To the comparison at least 2 numbers needed!");
        }

        //5 ve 6 kiyaslandiginda ve -5 ve -6 kiyaslandiginda hatali calisiyor
        /*for(int i=1;i<=amount;i++){
            System.out.print("Enter the number"+i+": ");
            temp=input.nextInt();
            if(temp<smallest)
                smallest=temp;
            if(temp>greatest)
                greatest=temp;
        }
        System.out.println("Greatest number: "+greatest+"\tSmallest number: "+smallest);*/
    }
}
