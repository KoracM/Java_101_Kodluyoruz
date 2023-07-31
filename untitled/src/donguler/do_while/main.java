package donguler.do_while;

public class main {
    public static void main(String[] args) {
        int a=0,b=0;
        do {
            System.out.println("a: "+a);
            a++;
        }
        while (a<3);
        System.out.println("Final a: "+a+"\n");

        do{
            System.out.println("b: "+b);
            b++;
        }
        while (b>3);
        System.out.println("Final b: "+b+"\n\n");
//--------------------------------------------------------------------------------------------
        int i=1, j=1;
        while(i<3)
        {
            System.out.println("-j outside the do: "+j);
            System.out.println("*i: "+i);
            do
            {
                System.out.print("j: "+j+"\t");
                j++;
            }while(j<4);
            System.out.println();
            i++;
        }
        System.out.println("\nFinal j: "+j+"\tFinal i: "+i);
    }
}
