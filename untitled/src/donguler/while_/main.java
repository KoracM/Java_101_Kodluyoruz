package donguler.while_;

public class main {
    public static void main(String[] args) {
        int start=0,finish=100;

        while (++start!=--finish);

        //you can use while with 1 line like this: while(condition);    or  while(condition){}

        System.out.println("\nFinal values:\nStart: "+start+"\tfinish: "+finish);
        System.out.println("\nHalfway between of start and finish is: "+start); //start or finish, doesn't matter
    }
}
