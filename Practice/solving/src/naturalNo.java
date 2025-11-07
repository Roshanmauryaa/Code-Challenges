import java.util.Scanner;
public class naturalNo {
    public static void main(String[] args) {
        Scanner Nature = new Scanner(System.in);
        System.out.println("enter the number ");

        int n = Nature.nextInt();

        int sum =0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("the sum of the 1 to  " +n+ " is  "+ sum );







    }
}
