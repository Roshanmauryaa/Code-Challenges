import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner rec = new Scanner(System.in);
        System.out.println("Enter the number");

        int num = rec.nextInt();
        int rev = 0;

        while (num!=0){
            int rem = num % 10;      // get last digit
            rev = rev * 10 + rem;    // build the reversed number
            num = num / 10;   // remvove the digit
        }
        System.out.println("enter the number "+ rev);

    }
}
