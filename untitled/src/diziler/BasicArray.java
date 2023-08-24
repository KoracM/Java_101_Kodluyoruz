package diziler;

import java.util.Random;
import java.util.Scanner;

public class BasicArray {
    public void printArray(int[] array) {
        System.out.print("\n[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1)
                System.out.print(array[i]);
            else
                System.out.print(array[i] + ",");
        }
        System.out.print("]\n");
    }

    public static void printArrayY(int[] array) {
        System.out.print("\n[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1)
                System.out.print(array[i]);
            else
                System.out.print(array[i] + ",");
        }
        System.out.print("]\n");
    }

    public int[] fill(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
        }
        return array;
    }

    public int[] fill(int[] array, int start, int finish, int value) {
        //finish index does not include.
        for (int i = start; i < finish; i++) {
            array[i] = value;
        }
        return array;
    }

    public static int[] sort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public int[] createRandomArray(int size, int start, int finish) {
        Random r = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = r.nextInt(finish - start) + start;
        }
        return array;
    }

    public int search(int[] array, int searching) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searching)
                return i;
        }
        return -1;
    }

    /*int binarySearch(int[] array,int searching){
        array=BasicArray.sort(array);
        while (true){

        }
    }*/
    public boolean equals(int[] array1, int[] array2) {
        if (array1.length != array2.length)
            return false;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i])
                return false;
        }
        return true;
    }

    public int[] copy(int[] array) {
        int[] copied = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copied[i] = array[i];
        }
        return copied;
    }

    public int[] copy(int[] array, int finish) {
        int[] copied = new int[finish];
        for (int i = 0; i < finish; i++) {
            copied[i] = array[i];
        }
        return copied;
    }

    public int[] copy(int[] array, int start, int finish) {
        int[] copied = new int[finish - start];
        for (int i = start, j = 0; i < finish && j < (finish - start); i++, j++) {
            copied[j] = array[i];
        }
        return copied;
    }

    //binarySearch
    //The binary search algorithm has been understood but how to code it.
    public int binarySearch(int[] array, int searching) {
        int status=-1, temp, l = array.length;
        array = BasicArray.sort(array);
        temp = l;

        //If searching element in array or not
        for (int i : array) {
            if (searching == i) {
                status=0;
                break;
            }
            status = -1;
        }

        l=(l%2==0)?(l/2)-1:l/2;
        while (l > 0 && status==0) {
            if (array[l] == searching)
                return l;

            else if (array[l] < searching) {
//                System.out.println("else if l: "+l);
                l = (l + temp) / 2;
//                System.out.println("islem sonrası else if l: "+l);
            }

            else {
//                System.out.println("else l: "+l);
//                l = (l % 2 == 0) ? (l / 2) - 1 : l / 2;
                l/=2;
//                System.out.println("islem sonrası else l: "+l);
            }

//            System.out.println("while sonu l: "+l+"\n");
        }
        return status;
    }
}
