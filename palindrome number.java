//palindrome number

package OOP_skill;

import java.util.Scanner;

public class Palindrome_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int originalNum = scanner.nextInt();

        int tempNum = originalNum;
        int reversedNum = 0;

        
        while (tempNum > 0) {
            int digit = tempNum % 10;
            reversedNum = reversedNum * 10 + digit;
            tempNum /= 10;
        }

       
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome number.");
        } else {
            System.out.println(originalNum + " is not a palindrome number.");
        }

        scanner.close();
    }
}
