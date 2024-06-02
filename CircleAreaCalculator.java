import java.math.BigDecimal;
import java.util.Scanner;

public class CircleAreaCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius
        System.out.print("Enter the radius of the circle: ");

        // Proper variable naming: 'radius' is a descriptive name for the input value
        BigDecimal radius = scanner.nextBigDecimal();

        // Close the Scanner to avoid resource leak
        scanner.close();

        // Calculate area
        // Use of constants: 'pi' is defined as a constant BigDecimal with appropriate precision
        BigDecimal pi = new BigDecimal("3.14");
        BigDecimal radiusSquared = radius.multiply(radius); // Efficient calculation of radius squared
        BigDecimal area = pi.multiply(radiusSquared); // Efficient calculation of area using BigDecimal arithmetic

        // Output the result
        System.out.println("The area of the circle is: " + area);
    }
}
