package diziler.pratikler.max_min;

import diziler.BasicArray;

import java.util.Scanner;

public class Main {
    public static int max(int[] a){
        int max=a[0];
        for(int i:a){
            if(i>max)
                max=i;
        }
        return max;
    }

    public static int min(int[] a){
        int min=a[0];
        for(int i:a){
            if(i<min)
                min=i;
        }
        return min;
    }

    public static int[] minAndMax(int[] a){
        int min=a[0],max=a[0];

        for(int i:a){
            if(i>max)
                max=i;
            if(i<min)
                min=i;
        }
        int[] b={min,max};
        return b;
    }

    /*public static int[] nearMinAndMax(int[] a,int searching){
        int min=a[0],max=a[0];

        for(int i:a){
            if(i<=searching && i>min)
                min=i;
            if(i>=searching && i<max)
                max=i;
        }
        int[] b={min,max};
        return b;
    }*/

    public static int[] nearMinAndMax(int[] a,int searching){
        int min=-1,max=-1;
        for(int i=0;i<a.length;i++){
           if(i<a.length-1){
               if(a[i]<=searching && a[i+1]>=searching){
                   min=a[i];
                   max=a[i+1];
               }
           }
           else {
               if(a[i]<=searching){
                   min=a[i];
                   max=a[i];
               }
           }

       }
        int[] b={min,max};
        return b;
    }


    public static void main(String[] args) {
        BasicArray arr=new BasicArray();
        int[] array = arr.createRandomArray(10, -5, 8);
        int[] minMax = minAndMax(array);

        arr.printArray(array);
        System.out.println("Max: " + max(array));
        System.out.println("Min: " + min(array));
        arr.printArray(minMax);

        //ODEV
//----------------------------------------------------------------------------------------------------------------------------------
        Scanner input=new Scanner(System.in);

        int[] array2 = arr.createRandomArray(10, -10, 10);

        arr.printArray(array2);
        BasicArray.sort(array2);
//        arr.printArray(array2);

        System.out.print("Enter the searching element: ");
        int searching = input.nextInt();
        int[] r = nearMinAndMax(array2, searching);

        arr.printArray(r);
        System.out.printf("%d sayisindan kucuk en yakin sayi: %d\n%d sayisindan buyuk en yakin sayi: %d",searching,r[0],searching,r[1]);
    }
}
