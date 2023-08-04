package donguler.odevler.fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n1=0,n2=1,sum=1,range;
        System.out.print("Enter the range: ");
        range= input.nextInt();

        //OPTION1
        for(int i=0;i<range;i++){
            System.out.println(n1+" + "+n2+" = "+sum);
            n1=n2;
            n2=sum;
            sum=n1+n2;
        }

        //OPTION2
        n1=0;n2=1;sum=1;
        System.out.print("\n"+n1+"\t"+n2+"\t"+sum+"\t");
        for(int i=0;i<range-3;i++){
            n1=n2;
            n2=sum;
            sum=n1+n2;
            System.out.print(sum+"\t");
        }
    }
}
