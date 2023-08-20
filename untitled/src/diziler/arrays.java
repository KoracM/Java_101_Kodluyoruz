package diziler;

import java.util.Scanner;

public class arrays {

    public static int[] createArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (i * 10) + 10;
        }
        return array;
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("array[%d]: %d\n", i, a[i]);
        }
        System.out.println("\n");
    }

    public static int[] reverseArray(int[] a){
            int[] reversed=new int[a.length];

            //OPTION 1
            for(int i=0,j=(a.length)-1;i<a.length && j>=0;i++,j--){
                reversed[j]=a[i];
            }

            //OPTION 2
            /*for(int i=0;i<10;i++){
                int j=a.length-i;
                reversed[j]=a[i];
            }*/
            return reversed;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size= input.nextInt();

        int[] array = new int[size];
        int array2[] = new int[10]; //Another way to declare an array.

        int[] array3 = {1, 2, 3}; //You can also enter the elements at the beginning
        int[] array4 = new int[]{1,2,3,4,5,6}; //Another way to initializing elements

        int[] array5; //First declare an array
        array5=new int[5]; //then create an array

        int[] reversedArray;

        createArray(array);
        printArray(array);
        reversedArray=reverseArray(array);
        printArray(reversedArray);

        // Multiple sized arrays
        int[][] arr=new int[3][3];

        int[][] arr2 = new int[3][];//or you can define other arrays like this:
        arr2[0] = new int[1];
        arr2[1] = new int[2];
        arr2[2] = new int[3];

        int[][] arr3= { {1,2,3},  //can initialize the elements like that:
                        {4,5,6},
                        {7,8,9}
                      };

        int [][] arr4= new int[3][];

        //arr4[0]={1,2,3}; // you cannot initialize like this
        arr4[0]= new int[]{1, 2, 3}; //can initialize like that

    }
}

