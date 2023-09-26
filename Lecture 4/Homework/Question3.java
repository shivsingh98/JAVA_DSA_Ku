// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int principal = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();
        sc.close();

        int SimpleIntrest = (principal * rate * time)/100;
        System.out.println(SimpleIntrest);

    }
    
}
