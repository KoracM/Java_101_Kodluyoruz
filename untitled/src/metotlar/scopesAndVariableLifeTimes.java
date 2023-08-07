package metotlar;

public class scopesAndVariableLifeTimes {

    public static void main(String[] args) {

        //iki kere i degeri tanimlanmis ve kullanilmis halbuki:
        //int A=5;int A=6; //bu sekilde iki kere tanimlama yaparsak hata aliriz peki bu durumda neden hata almayiz?
        //cunku buradaki i'ler local degiskendir ve her birinin yasam dongusu for icinde baslar ve biter. Yalnizca
        //for icinde gecerlidir.
        for(int i=0;i<4;i++){System.out.println("First i: "+i);}
        System.out.println();
        for(int i=0;i<7;i++){System.out.println("Second i: "+i);}

        //System.out.println("i: "+i); //calismaz! cunku yukaridaki aciklamadan dolayi

        System.out.println();
        int c=0;
        for(c=0;c<5;c++){System.out.println("c: "+c);}
        System.out.println("Final c: "+c); //burasi calisir cunku c'yi sadece for icinde tanimlamadik, c'nin yasam dongusu main
        //icerisinde devam eder.
        System.out.println();

        //baska bir ornek

        int i=0;
        for(i=0;i<=5;i++){
            System.out.println("hi");
        }
        System.out.println();
        for(i=0;i<3;i++){
            System.out.println("hello");
        }
        System.out.println();
        System.out.println("final i: "+i);

        //metot ornegi
        int a=5;
        changeValue(a);
        System.out.println("\nFinal a: "+a);
    }
    static void changeValue(int a){
        a=10;
        System.out.println("\na in function: "+a);
    }
}
