// Take name as input and print a greeting message for that particular name.


import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you name :");
        String name = sc.next();
        sc.close();

        System.out.println("Hi "+name+" Good morning!");
    }
    
}
