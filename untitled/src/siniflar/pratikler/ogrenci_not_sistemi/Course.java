package siniflar.pratikler.ogrenci_not_sistemi;

public class Course {
    //prefix: ders kodu
    String name,code,prefix;
    Teacher teacher;// teacher nesnesi hafizada yer ayirildi ama degeri yok olusturulmadı.
    int note,verbalGrade;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalGrade=0;
        getInfo();
    }

    void addTeacher(Teacher teacher)
    {
        if(teacher.branch.equals(this.prefix)){
            this.teacher=teacher;
            printTeacher();
        }

        else
            System.out.printf("Course's prefix: %s\t|\tTeacher %s's branch: %s\nThey doesn't match !\n",this.prefix,teacher.name,teacher.branch);
    }


    void printTeacher(){
        System.out.println("\n_____________________________________________");
        System.out.printf("Teacher:\n\nName\t\t\t:\t%s\n"+
                "Phone number\t:\t%s\n"+
                "Branch\t\t\t:\t%s\n",this.teacher.name,this.teacher.tel,this.teacher.branch
                );
        System.out.println("_____________________________________________");
    }

    void getInfo(){
        System.out.println("_____________________________________________");
        System.out.printf("Course:\n\nName\t\t:\t\t%s\n" +
                "Code\t\t:\t\t%s\n"+
                "Prefix\t\t:\t\t%s",this.name,this.code,this.prefix
        );
        System.out.println("\n_____________________________________________");
    }
}
