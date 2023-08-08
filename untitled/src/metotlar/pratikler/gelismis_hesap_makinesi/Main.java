package metotlar.pratikler.gelismis_hesap_makinesi;

import java.util.Scanner;

public class Main {

    //toplama
    static float addition(float a,float b){
        return a+b;
    }

    //cikarma
    static float subtraction(float a,float b){
        return a-b;
    }

    //carpma
    static float multiplication(float a,float b){
        return a*b;
    }

    //bolme
    static float division(float a,float b){
        return a/b;
    }

    //üs alma  trouble with: 2^0.5
    static float pow(float a,int b){
        if(b>0)
            return  a*pow(a,--b);

        else if (b==0)
            return 1;

        else
            return ( (1/a )* pow(a,++b));
    }

    //faktoriyel
    static int factorial(int a){
        if(a==1 || a==0)
            return 1;
        return a*factorial(a-1);
    }

    //mod
    static float mode(float a,float b){
        float result=a%b;
        while (result<0)
            result+=b;
        return result;
    }

    //dikdortgen
    static void rectAreaAndPerimeter(float a,float b){
        System.out.println("\nRectangle area: "+(a*b)+"\tperimeter: "+(2*(a+b)));
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int s1,s2,x; //s1:selection1, s2:selection2
        float a,b;

        while (true){
            System.out.print("\n[1] - Addition\n" +
                    "[2] - Substraction\n" +
                    "[3] - Multiplication\n" +
                    "[4] - Division\n" +
                    "[5] - Power\n" +
                    "[6] - Factorial\n" +
                    "[7] - Mode\n" +
                    "[8] - Rectangle Area And Perimeter\n" +
                    "[0] - Exit\n->");
            s1= input.nextInt();
            switch (s1){
                case 0:
                    System.out.println("Exited...");
                    return;
                case 1:
                    System.out.print("Enter the 1st number: ");
                    a= input.nextFloat();
                    System.out.print("Enter the 2nd number: ");
                    b= input.nextFloat();
                    System.out.println("\nResult: "+addition(a,b));
                    break;
                case 2:
                    System.out.print("Enter the 1st number: ");
                    a= input.nextFloat();
                    System.out.print("Enter the 2nd number: ");
                    b= input.nextFloat();
                    System.out.println("\nResult: "+subtraction(a,b));
                    break;
                case 3:
                    System.out.print("Enter the 1st number: ");
                    a= input.nextFloat();
                    System.out.print("Enter the 2nd number: ");
                    b= input.nextFloat();
                    System.out.println("\nResult: "+multiplication(a,b));
                    break;
                case 4:
                    System.out.print("Enter the 1st number: ");
                    a= input.nextFloat();
                    System.out.print("Enter the 2nd number: ");
                    b= input.nextFloat();
                    if(b!=0)
                        System.out.println("\nResult: "+division(a,b));
                    else
                        System.out.println("\nA number cannot be divided by 0!");
                    break;
                case 5:
                    System.out.print("Enter the base number: ");
                    a= input.nextFloat();
                    System.out.print("Enter the integer power number: ");
                    x= input.nextInt();
                    System.out.println("\nResult: "+pow(a,x));
                    break;
                case 6:
                    while (true){
                        System.out.print("Enter the number: ");
                        x= input.nextInt();
                        if(x>=0){
                        System.out.println("\nResult: "+factorial(x));
                            break;
                        }
                        else
                            System.out.println("\nOnly whole numbers have a factorial value!");
                    }
                    break;
                case 7:
                    while (true){
                        System.out.print("Enter the number: ");
                        a= input.nextFloat();
                        System.out.print("Enter the mode value: ");
                        b= input.nextFloat();
                        if(b!=0){
                            System.out.println("\nResult: "+mode(a,b));
                            break;
                        }
                        else
                            System.out.println("\nA number cannot be divided by 0!");
                    }
                    break;
                case 8:
                    while (true){
                        System.out.print("Enter the shorter side of rectangle: ");
                        a= input.nextFloat();
                        System.out.print("Enter the longer side of rectangle: ");
                        b= input.nextFloat();

                        if(a<=0 || b<=0)
                            System.out.println("\nThe edge length of a rectangle cannot 0 or below!");
                        else{
                            rectAreaAndPerimeter(a,b);
                            break;
                        }

                    }
                    break;
                default:
                    System.out.println("Invalid Value!");
            }
            System.out.print("\n[1] - Continue\n[0] - Exit\n->");
            s2= input.nextInt();
            if(s2==1)
                continue;
            else if (s2==0) {
                System.out.println("\nExited...");
                break;
            }
            else {
                while (true){
                    System.out.println("Invalid Value!");
                    System.out.print("\n[1] - Continue\n[0] - Exit\n->");
                    s2= input.nextInt();
                    if(s2==0){
                        System.out.println("\nExited...");
                        return;
                    }

                    else if (s2==1)
                        break;
                }
            }
        }
    }
}
