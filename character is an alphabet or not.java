//Program to check whether a given character is an alphabet or not

package OOP_skill;
import java.util.Scanner;
public class Character_alphabet_or_not {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        
        System.out.print("Enter the alphabet ");
        char ch = scanner.next().charAt(0);  
        
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is an alphabet.");
        } else {
            System.out.println(ch + " is not an alphabet.");
        }

        scanner.close();
    }
}
