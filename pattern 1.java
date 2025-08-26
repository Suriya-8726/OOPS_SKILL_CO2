//pattern 1

package OOP_skill;


import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        for (int row = 0; row < start; row++) {
            for (int num = start; num > row; num--) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
