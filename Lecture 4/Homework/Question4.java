// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number :");
        int num1 = sc.nextInt();
        System.out.println("enter 2nd number :");
        int num2 = sc.nextInt();
        System.out.println("enter the operator :");
        char operator = sc.next().charAt(0);
        sc.close();

        if(operator == '+'){
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        }else if(operator == '-'){
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        }else if(operator == '*'){
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        }else if(operator == '/'){
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        }else if(operator == '%'){
            System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
        }else{
            System.out.println("enter correct operator!!");
        }
    }
}
