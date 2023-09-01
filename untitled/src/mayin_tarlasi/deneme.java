package mayin_tarlasi;

import java.util.Arrays;

public class deneme {
    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b=a;
        int[] c={1,2,3,4};
        int[][] d={{2,3,9},{9,2,3},{1,2,3,4}};
        System.out.println("First stage:");
        System.out.println("a: "+ Arrays.toString(a)+"\tb: "+ Arrays.toString(b));
        b[0]=9;
        System.out.println("Second stage:");
        System.out.println("a: "+ Arrays.toString(a)+"\tb: "+ Arrays.toString(b)+"\td: "+Arrays.toString(d[0])+" "+Arrays.toString(d[1])+" "+Arrays.toString(d[2]));
        System.out.println("Arrays.compare(a,b): "+Arrays.compare(a,b));
        System.out.println("Arrays.compare(a,c): "+Arrays.compare(a,c));
        System.out.println("Arrays.compare(a,d[0]): "+Arrays.compare(a,d[0]));
    }
}
