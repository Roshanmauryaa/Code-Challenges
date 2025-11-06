import java.util.Scanner;

public class rc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Print numbers from 0 to 4 using a loop
        System.out.println("This is the loop by the way:");
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // Ask the user for two numbers and print their sum
        System.out.println("Enter the first number : ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);

        System.out.println("wht is yr nem ");
        String name = input.nextLine();
        System.out.println(name+"have a good name btw");

        System.out.println("what is your age ");
        int age = input.nextInt();
        System.out.println(age+"okk great ");

        System.out.println("wht your clg name ");
        String clg = input.nextLine();
        System.out.println(clg+"you hava a good \n clg all the best ");



    }
}
