package donguler.odevler.asal_sayilar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean control=true;
        System.out.print("(0-?) Enter the range to find prime numbers between that range: ");
        int range= input.nextInt();

        for(int i=2;i<=range;i++){
            for(int j=2;j<=i;j++){
                if(i%j==0 && i!=j){
                    control=false;
                    break; //There is no point to continue to check because if i get divided by j, i is not a prime number anymore.
                }
                else
                    control=true;
            }

            if(control==true)
                System.out.print(i+"\t");
        }
    }
}
