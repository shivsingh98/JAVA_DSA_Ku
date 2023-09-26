// To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        sc.close();
        String newStr = "";
        for (int i = str.length()-1; i >= 0; i--) {
            newStr += str.charAt(i);
        }
        System.out.println(newStr);
        if(str.equals(newStr)){
            System.out.println("Palindrome!!");
        }else{
            System.out.println("Not a Palindrome!!");
        }
    }
}
