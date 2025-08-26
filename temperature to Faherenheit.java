//Convert temperature to Faherenheit

package OOP_skill;
import java.util.Scanner;

public class Temperature_Faherenheit_convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();  

        
        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");

        scanner.close();
    }
}
