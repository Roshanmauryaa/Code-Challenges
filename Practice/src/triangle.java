import java.util.Scanner;
public class triangle {
    static void main(String[] args) {
        Scanner train = new Scanner(System.in);
        System.out.println("hello welcome to world of parameter and area ");

        System.out.println("enter the given details \n what is the base of your trianle ");
        double base = train.nextDouble();

        System.out.println("enter the height of the given traingle ");
        double base1 = train.nextDouble();

        double answer = 0.5* base * base1;
        System.out.println("your area of the traingle is "+ answer);





    }
}
