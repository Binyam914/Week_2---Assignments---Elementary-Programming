import java.util.Scanner;

public class Practice_2_1 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter three integers
        System.out.print("Enter the first integer (X): ");
        int x = scan.nextInt();

        System.out.print("Enter the second integer (Y): ");
        int y = scan.nextInt();

        System.out.print("Enter the third integer (Z): ");
        int z = scan.nextInt();

        // Print the values with labels
        System.out.println("The value of X is: " + x);
        System.out.println("The value of Y is: " + y);
        System.out.println("The value of Z is: " + z);

        // Calculate the average
        double average = (x + y + z) / 3.0;

        // Print the average with label
        System.out.println("The average of X, Y, and Z is: " + average);

        // Close the scanner
        scan.close();
    }
}
