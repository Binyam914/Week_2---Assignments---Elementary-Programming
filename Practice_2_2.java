import java.util.Scanner;

public class Practice_2_2 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter two floating-point numbers
        System.out.print("Enter the first floating-point number (R): ");
        float r = scan.nextFloat(); // Read first floating-point number

        System.out.print("Enter the second floating-point number (T): ");
        float t = scan.nextFloat(); // Read second floating-point number

        // Print the values with labels
        System.out.println("The value of R is: " + r);
        System.out.println("The value of T is: " + t);

        // Calculate sum, difference, and product
        float sum = r + t;
        float difference = r - t;
        float product = r * t;

        // Print the results with labels
        System.out.println("The sum of R and T is: " + sum);
        System.out.println("The difference of R and T is: " + difference);
        System.out.println("The product of R and T is: " + product);

        // Close the scanner to free up resources
        scan.close();
    }
}
