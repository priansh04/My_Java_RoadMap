package Java_From_scratch.Conditional_Statements_loops_in_java;

import java.util.Scanner;

public class armstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int temp = num, sum = 0;
        int digits = String.valueOf(num).length();
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        if (sum == num) {
            System.out.println("This is a Armstrong Number");
        } else {
            System.out.println("This is not Not Armstrong Number");
        }
    }
}
