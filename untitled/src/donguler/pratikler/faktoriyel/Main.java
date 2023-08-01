package donguler.pratikler.faktoriyel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number,i,factorial=1;
        System.out.print("Enter 0 - ? range to finding factorials: ");
        number= input.nextInt();
        for( i=number;i>=0;i--){
            if(i!=0)
                factorial*=i;
        }
        System.out.println("Factorial numbers to "+number+" : "+factorial);

        //odev

        int n,r,combination,n_fac=1,r_fac=1,n_r=1;
        System.out.print("Calculate combination [C(n,r)=?] to enter variable n: ");
        n= input.nextInt();
        System.out.print("\n[C(n,r)=?] enter the other variable r: ");
        r= input.nextInt();
        for(int a=n, b=r,c=(n-r); a>=0 || b>=0 || c>=0 ;a--,b--,c--){
            if(a>0)
                n_fac*=a;
            if(b>0)
                r_fac*=b;
            if(c>0)
                n_r*=c;
        }
        combination=n_fac/(r_fac*n_r);
        System.out.println("C("+n+","+r+") = "+combination);
    }
}
