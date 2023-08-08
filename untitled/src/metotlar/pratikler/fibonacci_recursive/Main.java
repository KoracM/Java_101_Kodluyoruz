package metotlar.pratikler.fibonacci_recursive;

import java.util.Scanner;

public class Main {

    static int fibonacciRecursive(int x){
        if(x==2 || x==1) return 1;
        return fibonacciRecursive(x-1)+fibonacciRecursive(x-2);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number;
        System.out.print("Enter the number: ");
        number= input.nextInt();
        System.out.println("Result: "+fibonacciRecursive(number));
    }
}
