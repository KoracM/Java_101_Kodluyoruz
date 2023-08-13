package siniflar.pratikler.ogrenci_not_sistemi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x,x2,y,y2,z,z2;
        Scanner input=new Scanner(System.in);

        //Teacher objects has been created here
        Teacher a=new Teacher("Korac","541 460 39 90","AVP");
        Teacher b=new Teacher("Mustafa","541 460 39 90","AVP2");
        Teacher c=new Teacher("Korac","541 460 39 90","DB");

        //Course objects has been created here
        Course java=new Course("Algoritma Ve Programlama","101","AVP");
        Course javaScript=new Course("Algoritma Ve Programlama 2","201","AVP2");
        Course sql=new Course("Veri Tabani","101","DB");

        //Entering teacher object into course objects
        java.addTeacher(a);
        javaScript.addTeacher(b);
        sql.addTeacher(c);

        //Creating student object
        Student s1=new Student("Aysenur","21410051027","11A",java,javaScript,sql);

        //Getting 3 grades of 3 different courses from user.
        System.out.print(java.name+" grade(%80): ");
        x= input.nextInt();

        System.out.print(java.name+" verbal grade(%20): ");
        x2= input.nextInt();

        System.out.print(javaScript.name+" grade(%60): ");
        y= input.nextInt();

        System.out.print(javaScript.name+" verbal grade(%40): ");
        y2= input.nextInt();

        System.out.print(sql.name+" grade(%70: ");
        z= input.nextInt();

        System.out.print(sql.name+" verbal grade(%30): ");
        z2= input.nextInt();

        //Entering the 3 grades.
        s1.addBulkExamNotes(x,x2,y,y2,z,z2);


    }
}
