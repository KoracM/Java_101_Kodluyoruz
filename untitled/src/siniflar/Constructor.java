package siniflar;

public class Constructor {
    int a=10;

    public Constructor(int a) {
        System.out.println("a: "+a+"\tthis.a: "+this.a);
        this.a = a;

    }
}
