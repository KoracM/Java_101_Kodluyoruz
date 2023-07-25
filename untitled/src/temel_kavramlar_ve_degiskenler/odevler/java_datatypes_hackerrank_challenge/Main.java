package temel_kavramlar_ve_degiskenler.odevler.java_datatypes_hackerrank_challenge;

import java.util.Scanner;
import static java.lang.Math.pow;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        //ranges:
        byte byte_min= (byte) -pow (2,7),byte_max= (byte) (pow(2,7)-1);
        short short_min= (short) -pow (2,15),short_max= (short) (pow(2,15)-1);
        int int_min= (int) -pow (2,31),int_max= (int) (pow(2,31)-1);
        long long_min= (long) -pow (2,63),long_max= (long) (pow(2,63)-1);

        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=byte_min && x<=byte_max)System.out.println("* byte");
                if(x>=short_min && x<=short_max)System.out.println("* short");
                if(x>=int_min && x<=int_max)System.out.println("* int");
                if(x>=long_min && x<=long_max)System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}
