// Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        sc.close();

        if(num % 2 == 0){
            System.out.println(num + " is Even");
        }else{
            System.out.println(num + " is Odd");
        }
    }
}
