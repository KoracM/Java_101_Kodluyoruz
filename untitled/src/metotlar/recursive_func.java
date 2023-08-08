package metotlar;

import java.util.Scanner;

public class recursive_func {

    /*static int r(int x){
        System.out.println("x: "+x);
        if(x==0)
            return 0;
        return x+r(x-1);
    }


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number= input.nextInt();
        System.out.println("Result: "+r(number));
    }*/

    static int f(int x){
        if(x==0) return 0;
        return x+f(x-1);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("[n*(n+1)/2]\nEnter the n: ");
        int number= input.nextInt();
        System.out.println("Result: "+f(number));
    }
}
