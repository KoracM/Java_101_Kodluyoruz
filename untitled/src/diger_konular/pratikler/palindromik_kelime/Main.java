package diger_konular.pratikler.palindromik_kelime;

import java.util.Scanner;

public class Main {
    public static boolean isPalindrome(String a){
        String reversed="";
        for (int i = a.length() - 1; i >= 0; i--)
            reversed += a.charAt(i);

        return a.equals(reversed); //bu daha mantikli
      /*  if (a.equals(reversed))
                    return true;
                else
                    return false;*/
    }

    public static boolean isPalindromeV2(String a){
        int i=0, j=a.length()-1;
        while (i<j){
            if(a.charAt(i)!=a.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word;

        System.out.print("\nEnter the string to check if it's palindrome or not: ");
        word = input.next();
        System.out.println(word+" "+(isPalindrome(word)?"is palindrome":"is not palindrome!"));
        System.out.println(word+" "+(isPalindromeV2(word)?"is palindrome":"is not palindrome!"));


    }
}
