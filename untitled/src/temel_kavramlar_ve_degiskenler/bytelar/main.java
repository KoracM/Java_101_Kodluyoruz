package temel_kavramlar_ve_degiskenler.bytelar;

public class main {
    public static void main(String[] args) {
        byte b = 0;
        int a = b++;
        b=0;
        int c=++b;
        System.out.print(a +"\t"+b+"\t"+c);
    }
}
