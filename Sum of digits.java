//Sum of digits

package OOP_skill;
import java.util.Scanner;

public class Sum_of_digits_of_a_number {
    // Method to calculate sum of digits of a number
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;  // Add the last digit
            num /= 10;        // Remove the last digit
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        
        while (number > 9) {
            number = sumOfDigits(number);
        }

        System.out.println("Sum of digits reduced to a single digit: " + number);

        scanner.close();
    }
}
