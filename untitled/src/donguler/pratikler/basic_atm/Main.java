package donguler.pratikler.basic_atm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //userName: admin   password: password
        /*Scanner input=new Scanner(System.in);
        String userName,password;
        int remainingLoginCount=3,select,balance=1500,temp;

        while (remainingLoginCount>0){
            System.out.print("Username: ");
            userName=input.next();
            System.out.print("Password: ");
            password=input.next();

            if(userName.equals("admin") && password.equals("password")){
                System.out.println("Logged in successfully");
                while (true){
                    System.out.println("Welcome to the Fleeca Bank\n" +
                            "[1] - Withdraw\n" +
                            "[2] - Deposit\n" +
                            "[3] - Check Balance\n" +
                            "[0] - Exit");
                    System.out.print("Select a transaction: ");
                    select= input.nextInt();
                    if(select==1){
                        while (true){
                            System.out.println("\n[Balance: "+balance+"]\n");
                            System.out.print("Enter the amount of money that will be withdrawn: ");
                            temp= input.nextInt();
                            if(temp>balance){
                                System.out.println("Transaction failed. Amount of withdraw is above of your balance.");
                                System.out.println("[1] - Try again\n[2] - Go to menu");
                                System.out.print("Select a transaction: ");
                                select= input.nextInt();
                                if(select==2)
                                    break;
                            }
                            else if (temp<=balance && temp>0) {
                                balance-=temp;
                                System.out.println("Transaction completed.");
                                System.out.println("\n[Balance: "+balance+"]\n");
                                break;
                            }
                            else
                                System.out.print("Values incorrect!");
                        }
                    }

                    else if(select==2){
                        while (true){
                            System.out.println("\n[Balance: "+balance+"]\n");
                            System.out.print("Enter the amount of money that will be deposit: ");
                            temp= input.nextInt();
                            if(temp>0){
                                balance+=temp;
                                System.out.println("Transaction completed.");
                                System.out.println("\n[Balance: "+balance+"]\n");
                                break;
                            }
                            else
                                System.out.println("Values incorrect!");
                        }
                    }

                    else if(select==3)
                        System.out.println("\n[Balance: "+balance+"]\n");

                    else if(select==0){
                        System.out.println("\nExited! Have a nice day.");
                        return;
                    }
                    else
                        System.out.println("\nSelection invalid!\n"*//*+"\tselection: "+select*//*);

                }
            }
            else {
                System.out.println("Login failed. Username or password unmatched!");
                remainingLoginCount--;
            }
            if(remainingLoginCount==0)
                System.out.println("3 remaining login count has been expired. Contact with your bank");
            else
                System.out.println("Remaning login count: "+remainingLoginCount);
        }*/
    //odev: switch-case kullanarak yapiniz
//---------------------------------------------------------------------------------------------------------------------
        //userName: admin   password: password
        Scanner input=new Scanner(System.in);
        String userName,password;
        int select,remainingLoginCount=3,temp,balance=1500;
        while (remainingLoginCount>0){
            System.out.print("Username: ");
            userName=input.next();
            System.out.print("Password: ");
            password=input.next();
            if(userName.equals("admin") && password.equals("password")){
                System.out.println("Logged in successfully.");
                while (true){
                    System.out.println("Welcome to the Fleeca Bank\n" +
                            "[1] - Withdraw\n" +
                            "[2] - Deposit\n" +
                            "[3] - Check Balance\n" +
                            "[0] - Exit");
                    System.out.print("Select a transaction: ");
                    select=input.nextInt();
                    switch (select){
                        case 1:
                            while (true){
                                System.out.println("\n[Balance: "+balance+"]\n");
                                System.out.print("Enter the amount of money that will be withdrawn: ");
                                temp= input.nextInt();
                                if(temp>balance){
                                    System.out.println("Transaction failed. Amount of withdraw is above of your balance.");
                                    System.out.println("[1] - Try again\n[2] - Go to menu");
                                    System.out.print("Select a transaction: ");
                                    select= input.nextInt();
                                    if(select==2)
                                        break;
                                }
                                else if (temp<=balance && temp>0) {
                                    balance-=temp;
                                    System.out.println("Transaction completed.");
                                    System.out.println("\n[Balance: "+balance+"]\n");
                                    break;
                                }
                                else
                                    System.out.print("Values incorrect!");
                            }
                            break;

                        case 2:
                                while (true){
                                    System.out.println("\n[Balance: "+balance+"]\n");
                                    System.out.print("Enter the amount of money that will be deposit: ");
                                    temp= input.nextInt();
                                    if(temp>0){
                                        balance+=temp;
                                        System.out.println("Transaction completed.");
                                        System.out.println("\n[Balance: "+balance+"]\n");
                                        break;
                                    }
                                    else
                                        System.out.println("Values incorrect!");
                                }
                                break;

                        case 3:
                            System.out.println("\n[Balance: "+balance+"]\n");
                            break;

                        case 4:
                            System.out.println("\nExited! Have a nice day.");
                            return;

                        default:
                            System.out.print("Values incorrect!");
                            break;
                    }
                }
            }
        }

    }
}
