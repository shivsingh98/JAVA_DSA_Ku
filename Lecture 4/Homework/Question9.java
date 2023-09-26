// To find Armstrong Number between two given number.

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number :");
        int num1 = sc.nextInt();
        System.out.println("enter second number :");
        int num2 = sc.nextInt();
        sc.close();
        
        for (int i = num1; i <= num2; i++) {
            int temp = i;
            int temp1 = i;
            int res = 0;
            int n = 0;
            while(temp>0){
                int r = temp%10;
                n = n + 1;
                temp = temp/10;
            }
            while(temp1>0){
                int r = temp1%10;
                res = (int)( res + Math.pow(r, n));
                temp1 = temp1/10;
            }
            if(res == i){
                System.out.print(res + "  ");
            }
        }

    }
}
