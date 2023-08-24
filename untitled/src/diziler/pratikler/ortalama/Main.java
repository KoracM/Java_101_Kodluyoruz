package diziler.pratikler.ortalama;

import diziler.BasicArray;

public class Main {
    public static float mean(int[] a){
        float sum=0;
        for(int i:a)
            sum+=i;
        return sum/a.length;
    }

    public static float harmonicMean(int[] a){
        float sum=0;
        int l=a.length;

        for(int i:a) {
            if(i==0)
                l--;
            else
                sum += 1.0 / i;
        }
        sum/=1;
        return l/sum;
    }

    public static void main(String[] args) {
        BasicArray arr=new BasicArray();
        int[] array=arr.createRandomArray(3,0,9);
        arr.printArray(array);
        System.out.println("Array's mean\t\t\t:\t"+mean(array));
        System.out.println("Array's harmonic mean\t:\t"+harmonicMean(array));
    }
}
