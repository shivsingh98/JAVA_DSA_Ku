// Input currency in rupees and output in USD.

import java.util.Scanner;
import java.text.DecimalFormat;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat dfrmt = new DecimalFormat("#.##");
        System.out.println("enter the amount in rupees :");
        int INR = sc.nextInt();
        sc.close();
        float USD = INR / 83.05f;

        System.out.println(INR + " is equal to : " +dfrmt.format(USD) +" USD");

    }
}
