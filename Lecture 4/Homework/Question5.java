// Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number :");
        int num1 = sc.nextInt();
        System.out.println("enter the first number :");
        int num2 = sc.nextInt();
        sc.close();

        if(num1 > num2){
            System.out.println(num1+" is grater than "+num2);
        }else{
            System.out.println(num2+" is grater than "+num1);
        }

    }
    
}
