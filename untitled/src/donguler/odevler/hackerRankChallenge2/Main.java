package donguler.odevler.hackerRankChallenge2;

import java.util.Scanner;
import static java.lang.Math.pow;

//a+2^0.b+
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int q,a,b,n,sum=0;
        //System.out.print("q: ");
        q=input.nextInt();

        for(int i=0;i<q;i++){
            //System.out.print("a b n :");
            a= input.nextInt();
            b= input.nextInt();
            n= input.nextInt();
            for(int j=0;j<n;j++){
                for(int k=0;k<=j;k++){
                    if(k==0)
                        sum+=a;
                    sum+=((int) pow(2,k))*b;
                }
                System.out.print(sum+" ");
                sum=0;
            }
            System.out.println();
        }
    }
}
