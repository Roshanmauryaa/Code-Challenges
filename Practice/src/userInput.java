import java.util.Scanner;
public class userInput {
    static void main(String[] args) {

          Scanner user = new Scanner(System.in);
//        System.out.println("enter the first number ");
//        int num1 = user.nextInt();
//        System.out.println("enter the second number ");
//        int num2 = user.nextInt();
//
//        int numm = num1 + num2;
//        int numm1 = num1 - num2;
//        System.out.println("the sum of two number is " + numm);
//        System.out.println("the sum of two number is " + numm1);

        System.out.println("enter the first decimal number to calculate the parameter ");
        double para1 = user.nextDouble();
        System.out.println("enter the second decimal number ");
        double para2 = user.nextDouble();
        System.out.println("the addition of both two number is " + (para1+para2));






    }
}
