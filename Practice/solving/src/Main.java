import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner su = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter the number: ");
        int num = su.nextInt();

        int sum = 0; // variable to store sum of digits

        // Loop to calculate sum of digits
        while (num != 0) {
            int digit = num % 10;  // extract last digit
            sum += digit;          // add to sum
            num /= 10;             // remove last digit
        }

        // Display result
        System.out.println("The sum of digits is: " + sum);

        // Close scanner
        su.close();
    }
}
