package siniflar.odevler.maas_hesaplayici;

public class Employee {
    String name;
    int workHours,hireYear,currentYear=2023;

    float salary;

    public Employee(String name,int salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
        tostring();
    }

    float tax(float salary){
        if(salary>=1000)
            return (float) (salary*0.3);
        else
            return 0;
    }

    int bonus(int workHours){
        if(workHours>=40)
            return (workHours-40)*30;
        else
            return 0;
    }

    float raiseSalary(float salary,int hireYear,int currentYear){
        int dif=currentYear-hireYear;
        float raise;
        if(dif<10)
            raise= (float) (salary*0.5);

        else if (dif>10 && dif<20)
            raise= (float) (salary*0.10);

        else
            raise= (float) (salary*0.15);

        return -tax(salary)+bonus(workHours)+raise;
    }
    void tostring(){
        float tax=this.tax(this.salary);
        int bonus=this.bonus(this.workHours);
        float raiseSalary=this.raiseSalary(this.salary,this.hireYear,this.currentYear);
        float finalSalary=(this.salary+raiseSalary);

        System.out.println("\n----------------Employee Info----------------\n"+
                "Name\t\t\t\t\t:\t"+this.name+
                "\nCurrent salary\t\t\t:\t"+this.salary+
                "\nWork hours\t\t\t\t:\t"+this.workHours+
                "\nHire year\t\t\t\t:\t"+this.hireYear+
                "\nTax\t\t\t\t\t\t:\t"+tax+
                "\nBonus\t\t\t\t\t:\t"+bonus+
                "\nSalary increase rate\t:\t"+raiseSalary+
                "\nFinal salary\t\t\t:\t"+finalSalary+
                "\n---------------------------------------------\n"
        );
    }
}
