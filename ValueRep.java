import java.util.Scanner;

public class ValueRep {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter the side length of the square
        System.out.print("Enter the side length of the square: ");
        int side = scan.nextInt(); // Read side length

        // Calculate the area and perimeter of the square
        int area = side * side;
        int perimeter = 4 * side;

        // Print the area and perimeter with labels
        System.out.println("The area of the square is: " + area);
        System.out.println("The perimeter of the square is: " + perimeter);

        // Close the scanner to free up resources
        scan.close();
    }
}
