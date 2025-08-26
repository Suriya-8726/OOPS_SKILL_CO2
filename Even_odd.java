//To check even or odd


package OOP_skill;
import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();  
        if(number % 2 == 0) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }

        scanner.close();
    }
}
