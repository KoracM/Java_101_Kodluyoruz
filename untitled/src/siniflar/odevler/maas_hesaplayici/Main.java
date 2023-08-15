package siniflar.odevler.maas_hesaplayici;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        int salary,workHours,hireYear;

        Scanner input=new Scanner(System.in);
        System.out.print("Employee name: ");
        name= input.next();
        System.out.print("Employee salary: ");
        salary= input.nextInt();
        System.out.print("Employee work hours: ");
        workHours= input.nextInt();
        System.out.print("Employee hire year: ");
        hireYear= input.nextInt();

        Employee a=new Employee(name,salary,workHours,hireYear);
    }
}
