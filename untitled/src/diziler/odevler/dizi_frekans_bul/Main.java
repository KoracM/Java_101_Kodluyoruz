package diziler.odevler.dizi_frekans_bul;

import java.util.Arrays;

public class Main {
    public static int[] sort(int[] a){
        int temp;
        int[] b=Arrays.copyOf(a,a.length);

        for(int i=0;i<b.length;i++){
            for(int j=i+1;j<b.length;j++){
                if(b[j]<b[i]){
                    temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }
        return b;
    }
    public static int[] getCounterArray(int[] sorted){
        int[] ctr=new int[sorted.length];
        int[] tidiedCtr; //Size is unknown soo we need to find size then initialize later.

        int counter=1;
        int temp,temp2=-1;

        //FIRST CREATING COUNTER ARRAY WITH ZEROS
        for(int i=0;i<sorted.length;i++){
            temp=sorted[i];

            for(int j=i+1;j<sorted.length-1;j++){
                if(temp==temp2) {
                    counter=0;
                }
                else if(sorted[i]==sorted[j]){
                    counter++;
                }
            }
            temp2=sorted[i];
            ctr[i]=counter;
            counter=1;
        }

        //Tidying up the counter array (getting out of zeros)

        //Need to find out the size without the zeros because we cannot initialize array without size
        counter=0;
        for(int i:ctr){
            if(i!=0)
                counter++;
        }
        tidiedCtr=new int[counter]; //After the found array size then initializing size.

        int j=0;
        for (int k : ctr) {
            if (k != 0) {
                tidiedCtr[j] = k;
                j++;
            }
        }

        return tidiedCtr;
    }
    public static int[] getUniqueArray(int[] a){
        int counter=1;
        int[] u;

        for(int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1])
                counter++;
        }
        u=new int[counter];
        int j=0;
        u[0]=a[0];
        j++;

        for(int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1]) {
                u[j] = a[i + 1];
                j++;
            }
        }
        return u;
    }

    public static void main(String[] args) {
        int[] array={1,5,2,7,2,7,7,5,5,5,1,9,8};
        int[] sorted=sort(array);
        int[] ctr=getCounterArray(sorted);
        int[] unique=getUniqueArray(sorted);

        System.out.println();
        System.out.println("Array\t : "+Arrays.toString(array)); //Why prints sorted?
        System.out.println("Sorted\t : "+ Arrays.toString(sorted));
        System.out.println("Ctr\t\t : "+Arrays.toString(ctr));
        System.out.println("Unique\t : "+Arrays.toString(unique));
        System.out.println();

        for(int i=0;i<unique.length;i++) //or ctr.length
            System.out.print(unique[i]+"'s frequency: "+ctr[i]+"\n");
    }
}
