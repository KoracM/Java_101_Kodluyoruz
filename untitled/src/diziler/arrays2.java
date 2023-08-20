package diziler;

import java.util.Arrays;
import java.util.Scanner;

public class arrays2 {
    public static void main(String[] args) {
        BasicArray arr=new BasicArray();
        Scanner input=new Scanner(System.in);
        int size,value,start,finish;

        //TESTING FILL AND PRINT
        /*
        System.out.print("Enter the size of the array: ");
        size= input.nextInt();

        int[] array=new int[size];
        array=arr.fill(array,10);

        arr.printArray(array);
        BasicArray.printArrayY(array); //A static method can be called without creating object

        arr.fill(array,3,5,9);
        arr.printArray(array);*/
        //int[] array=new int[]{9,3,7,5,-1};
//---------------------------------------------------------------------------------------------------------------------

        //TESTING SORT and CREATING RANDOM ARRAY
        /*System.out.print("Enter the size of to create random array: ");
        size= input.nextInt();
        System.out.print("Enter the start and finish with space: ");
        start= input.nextInt();
        finish=input.nextInt();
        int[] array=arr.createRandomArray(size,start,finish);

        arr.printArray(array);
        arr.sort(array);
        arr.printArray(array);
        System.out.println("Index: "+Arrays.binarySearch(array,3));
        System.out.println("Index*: "+arr.search(array,3));*/
//---------------------------------------------------------------------------------------------------------------------

        //TESTING EQUALS
       /* int[] array1={1,2,3};
        int[] array2={1,2,3};
        int[] array3={1,3,3};
        System.out.println("Array1 == Array2: "+arr.equals(array1,array2));
        System.out.println("Array1 == Array3: "+arr.equals(array1,array3));*/
//---------------------------------------------------------------------------------------------------------------------

        //TESTING COPY and COPY RANGE
        /*int[] array={1,234,7,-13,84};
        int[] copied=arr.copy(array);
        arr.printArray(array);
        arr.printArray(copied);

        int[] copied2=arr.copy(array,3);
        arr.printArray(copied2);

        int[] copied3=arr.copy(array,2,5);
        arr.printArray(copied3);*/
//---------------------------------------------------------------------------------------------------------------------

        //TESTING BINARY SEARCH
        /*int[] array=arr.createRandomArray(10,0,9);

        arr.printArray(array);
        arr.printArray(BasicArray.sort(array));
        System.out.print("Enter the searching element: ");
        int searching = input.nextInt();
        System.out.println("index: " + arr.binarySearch(array, searching));
        System.out.println("index of original method: " + Arrays.binarySearch(array, searching));*/
//---------------------------------------------------------------------------------------------------------------------
        int[] liste = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};

    }
}
