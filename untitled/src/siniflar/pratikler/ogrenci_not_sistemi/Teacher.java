package siniflar.pratikler.ogrenci_not_sistemi;

public class Teacher {
    //tel: telephone number | branch: alan, bolum
    String name,tel,branch;

    public Teacher(String name, String tel, String branch) {
        this.name = name;
        this.tel = tel;
        this.branch = branch;
    }

    void getInfo(){
        System.out.printf("Teacher name:\t\t\t: %s\nTeacher phone number\t: %s\nTeacher's Branch\t\t: %s",this.name,this.tel,this.branch);
        System.out.println("\n");
    }
}
