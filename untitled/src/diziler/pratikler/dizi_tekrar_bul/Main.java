package diziler.pratikler.dizi_tekrar_bul;

import diziler.BasicArray;

import java.lang.reflect.Array;
import java.util.Arrays;

//ctrl+shift+8 ne yapiyor?
public class Main {
    public static int[] tidyUp(int[] a){
        int[] tidied;
        int ctr=0;

        //Finding size first
        for(int i:a)
            if(i!=0)
                ctr++;
        tidied=new int[ctr];

        ctr=0;
        for(int i:a){
            if(i!=0)
                tidied[ctr++]=i;
        }
        return tidied;
    }

    public static boolean isIn(int[] a,int value){
        for(int i:a){
            if(value==i)
                return true;
        }
        return false;
    }
    public static int[] findRepeated(int[] a){
        int[] repeated=new int[a.length];
        int index=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if((i!=j) && a[i]==a[j]) {
                    if(!isIn(repeated,a[i])) {
                        repeated[index++] = a[i];
//                        System.out.println("i: " + i + "\tj: " + j+"\tadded to repeated: "+repeated[index-1]);
                        break;
                    }
                }
            }
        }
//        repeated=tidyUp(repeated);
        return repeated;
    }

    public static int[] findEvenRepeated(int[] a){
        int[] repeated=new int[a.length];
        int index=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if((i!=j) && a[i]==a[j]) {
                    if(!isIn(repeated,a[i]) && a[i]%2==0) {
                        repeated[index++] = a[i];
//                        System.out.println("i: " + i + "\tj: " + j+"\tadded to repeated: "+repeated[index-1]);
                        break;
                    }
                }
            }
        }
//        repeated=tidyUp(repeated);
        return repeated;
    }

    public static void main(String[] args) {
        BasicArray arr=new BasicArray();
        int[] array= arr.createRandomArray(10,0,10);
        int[] repeated=findRepeated(array);
        int[] evenRepeated=findEvenRepeated(array);
        int[] tidiedRepeated=tidyUp(repeated);
        int[] tidiedEvenRepeated=tidyUp(evenRepeated);

        System.out.println("Array\t\t\t\t\t: "+ Arrays.toString(array));
        System.out.println("Repeated\t\t\t\t: "+ Arrays.toString(repeated));
        System.out.println("Repeated Evens\t\t\t: "+ Arrays.toString(evenRepeated));
        System.out.println("Tidied Repeated\t\t\t: "+Arrays.toString(tidiedRepeated));
        System.out.println("Tidied Repeated Evens\t: "+Arrays.toString(tidiedEvenRepeated));
    }
}
