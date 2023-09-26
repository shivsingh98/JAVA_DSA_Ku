// To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  number :");
        int num = sc.nextInt();
        sc.close();

        int firstNumber = 0;
        int secondNumber = 1;
        int nextNumber;

        System.out.print(firstNumber + " " + secondNumber+ " ");

        for(int i=1; i<=num-2; i++){
            nextNumber = firstNumber + secondNumber;
            System.out.print(nextNumber + " ");
            firstNumber = secondNumber;
            secondNumber = nextNumber; 
        }

    }
    
}
