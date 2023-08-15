package siniflar.odevler;

public class a {

    static int check(int a){
        if(a>=50)
            return 50;
        return 0;
    }

    static int check2(int a){
        if(a>=50)
            return 50;
        else
            return 0;
    }

    public static void main(String[] args) {
        int check,check2;
        check=check(50);
        check2=check2(50);
        System.out.println("Phase 1\nCheck1: "+check+"\tCheck2: "+check2);
        check=check(10);
        check2=check2(10);
        System.out.println("Phase 2\nCheck1: "+check+"\tCheck2: "+check2);
        //which one is faster check or check2 ?
    }

}
