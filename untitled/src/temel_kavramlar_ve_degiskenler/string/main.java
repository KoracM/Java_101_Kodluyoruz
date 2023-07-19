package temel_kavramlar_ve_degiskenler.string;

public class main {
    public static void main(String[] args) {
        int a=5,b=5,c=5;
        boolean kosul1=a==c;
        boolean kosul2=a>=b;
        //"||" isareti 'ctrl+alt+-' isaretiyle yapinca bloklar kuculuyo
        // 'altgr+-' ile yapiliyor
        boolean sonuc=kosul1|| kosul2;

        //(condition) ? todo: todo2;
        String str=sonuc ? "Dogru" :"Degil" ;
        System.out.println("str: "+str);
    }
}
