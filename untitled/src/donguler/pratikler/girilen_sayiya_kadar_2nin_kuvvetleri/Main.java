package donguler.pratikler.girilen_sayiya_kadar_2nin_kuvvetleri;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        //math kutuphanesini kullanarak
        /*Scanner input=new Scanner(System.in);
        int number,i=0;
        System.out.print("Enter the number: ");
        number=input.nextInt();
        while (pow(2,i)<=number || pow(4,i)<=number || pow(5,i)<=number){
            if(pow(2,i)<=number)
                System.out.print("2^"+i+":"+(int)pow(2,i)+"\t");
            if(pow(4,i)<=number)
                System.out.print("4^"+i+":"+(int)pow(4,i)+"\t");
            if(pow(5,i)<=number)
                System.out.print("5^"+i+":"+(int)pow(5,i)+"\t");
            i++;
        }*/

        //math kutuphanesini kullanmadan
        Scanner input=new Scanner(System.in);
        int number,power=0;
        int result=1,result2=1,result3=1,base=2,base2=4,base3=5;
        System.out.print("Enter the number: ");
        number=input.nextInt();
        while (result<=number || result2<=number || result3<=number){
            if(result<=number){
                System.out.println(base+"^"+power+" = "+result);
                result*=base;
            }
            if(result2<=number){
                System.out.println(base2+"^"+power+" = "+result2);
                result2*=base2;
            }
            if(result3<=number){
                System.out.println(base3+"^"+power+" = "+result3);
                result3*=base3;
                System.out.println();
            }
            power++;
        }

        //for ile de yapilabilir bir kısmı
        /*for(int i=1;i<100;i*=2){
            System.out.print(i+"\t");
        }*/
    }
}
