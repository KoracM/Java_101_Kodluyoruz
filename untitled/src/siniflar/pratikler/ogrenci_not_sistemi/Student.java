package siniflar.pratikler.ogrenci_not_sistemi;

public class Student {
    //classes: sinifi sanki class olmalı ama
    //course1,2,3 olarak 3 adet ders alacak
    String name,clasS,stuNo; //class olmaz cunku javanin keywordu
    Course course1,course2,course3;
    boolean isPass;
    float avarage; //ort bulunacak ve isPass degeri atanacak

    public Student(String name, String stuNo,String clasS, Course course1, Course course2, Course course3) {
        this.name = name;
        this.stuNo = stuNo;
        this.clasS = clasS;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.avarage=0;
        this.isPass=false;
    }

    //bulk: toplu
    void addBulkExamNotes(int note1,int vnote1,int note2,int vnote2,int note3,int vnote3){
        if( note1>=0 && note1<=100 )
        {
            course1.note=note1;
            System.out.println("\nCourse 1 note has been entered successfully");
        }

        if(vnote1>=0 && vnote1<=100){
            course1.verbalGrade=vnote1;
            System.out.println("Course 1 verbal note has been entered successfully\n");
        }

        if(note2>=0 && note2<=100)
        {
            course2.note=note2;
            System.out.println("Course 2 note has been entered successfully");
        }

        if(vnote2>=0 && vnote2<=100){
            course2.verbalGrade=vnote2;
            System.out.println("Course 2 verbal note has been entered successfully\n");
        }

        if(note3>=0 && note3<=100)
        {
            course3.note=note3;
            System.out.println("Course 3 note has been entered successfully");
        }

        if(vnote3>=0 && vnote3<=100){
            course3.verbalGrade=vnote3;
            System.out.println("Course 3 verbal note has been entered successfully\n");
        }

        else
            System.out.println("The note must be between 0-100!\n");
        printNote();
        calcAvarage();

    }
    void isPass(){

        if(this.isPass)
            System.out.println("\nCongratulations, you have passed!");
        else
            System.out.println("\nUnfortunately you have not passed :(");
        System.out.println("Avarage: "+this.avarage);
    }

    //note1: %80    note2:%60   note3:%70
    void calcAvarage(){
        this.avarage= (float) ( ( (this.course1.note*0.8 + this.course1.verbalGrade*0.2) +
                                  (this.course2.note*0.6 + this.course2.verbalGrade*0.4)+
                                  (this.course3.note*0.7 + this.course3.verbalGrade*0.3) )/3.0 );
        this.isPass= avarage >= 60; //bu daha pratik
        isPass();
    }

    void printNote(){
        System.out.println("\n_____________________________________________");
        System.out.println(this.course1.name+" note\t\t\t: "+this.course1.note);
        System.out.println(this.course1.name+" verbal note\t: "+this.course1.verbalGrade);
        System.out.println();
        System.out.println(this.course2.name+" note\t\t\t: "+this.course2.note);
        System.out.println(this.course2.name+" verbal note\t: "+this.course2.verbalGrade);
        System.out.println();
        System.out.println(this.course3.name+" note\t\t\t\t\t\t: "+this.course3.note);
        System.out.println(this.course3.name+" verbal note\t\t\t\t\t: "+this.course3.verbalGrade);
        System.out.println("_____________________________________________\n");
    }
}
