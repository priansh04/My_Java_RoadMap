package my_java_roadmap.Conditional_Statements_loops_in_java;

import java.util.Scanner;

public class palindrome_number {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num, rev = 0;
        while (temp != 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }
        if (rev == num) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
