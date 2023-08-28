package diziler.odevler.hackerRankChallenge3;

import java.util.Scanner;

public class Main {
    public static int subArray(int[] a){
        int result=0,sum=0;

       for(int i=0;i<a.length;i++)
       {
           for(int j=i;j<a.length;j++){
               sum+=a[j];
           if(sum<0)
               result+=1;
           }
           sum=0;
       }
       return result;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size;
        int[] a;
        size=input.nextInt();
        a=new int[size];
        for(int i=0;i<size;i++)
            a[i]= input.nextInt();
        System.out.println(subArray(a));
    }
}
