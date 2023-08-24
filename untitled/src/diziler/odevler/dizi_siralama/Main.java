package diziler.odevler.dizi_siralama;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int[] sortASC(int[] a){ //ASC: ascending(artan)
        int temp;

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[i]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }
    public static int[] sortDESC(int[] a){ //DESC: descending(azalan)
        int temp;

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[j]>a[i]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int[] array;
        int size,temp;

        System.out.print("Enter the size of the array: ");
        size= input.nextInt();
        array=new int[size];

        for(int i=0;i<size;i++){
            System.out.print("Element "+(i+1)+": ");
            array[i]= input.nextInt();
        }
        System.out.println();
        System.out.println("Array\t\t\t\t: "+ Arrays.toString(array));
        sortASC(array);
        System.out.println("Array (Sorted ASC)\t: "+Arrays.toString(array));
        sortDESC(array);
        System.out.println("Array (Sorted DESC)\t: "+Arrays.toString(array));
    }
}
