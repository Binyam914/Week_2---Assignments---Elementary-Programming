import java.util.Scanner;

public class Practice_2_3 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scan = new Scanner(System.in);

        // Variable declaration section
        byte byte_value;
        short short_value;
        int int_value;
        long long_value;
        float float_value;
        double double_value;

        // Prompt the user to enter a byte value and read it
        System.out.print("Enter byte value: ");
        byte_value = scan.nextByte();

        // Prompt the user to enter a short value and read it
        System.out.print("Enter short value: ");
        short_value = scan.nextShort();

        // Prompt the user to enter an int value and read it
        System.out.print("Enter int value: ");
        int_value = scan.nextInt();

        // Prompt the user to enter a long value and read it
        System.out.print("Enter long value: ");
        long_value = scan.nextLong();

        // Prompt the user to enter a float value and read it
        System.out.print("Enter float value: ");
        float_value = scan.nextFloat();

        // Prompt the user to enter a double value and read it
        System.out.print("Enter double value: ");
        double_value = scan.nextDouble();

        // Print out the values with labels
        System.out.println("\n");
        System.out.println("The byte value is:\t\t" + byte_value);
        System.out.println("The short value is:\t\t" + short_value);
        System.out.println("The int value is:\t\t" + int_value);
        System.out.println("The long value is:\t\t" + long_value);
        System.out.println("The float value is:\t\t" + float_value);
        System.out.println("The double value is:\t\t" + double_value);

        // Close the scanner to free up resources
        scan.close();
    }
}
