package kosullu_ifadeler_ve_kod_bloklari.pratikler.kullanici_girisi;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String userName,password, userNameDB = "admin", passwordDB = "password";
        String password_reset_choose;
        System.out.print("Username? :");
        userName=input.next();
        System.out.print("Password? :");
        password=input.next();

        //Why we use ".equals" to comparing 2 strings instead of "==" ?
        //I think ".equals" clips left and right side of the word . Try and see.
        if(userName.equals(userNameDB)&&(password.equals(passwordDB))){
            System.out.println("Login successful");
        }
        else {
            System.out.print("Username or password is wrong!\nWould you like to reset password? (Y/N) :");
            password_reset_choose=input.next().toUpperCase();
            if(password_reset_choose.equals("Y")){
                System.out.print("Insert the new password: ");
                password=input.next();
                System.out.println("Password has been changed :)\t"+password);
            }
        }
    }
}
