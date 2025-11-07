import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
         Scanner leap = new Scanner(System.in);
        System.out.println("enter the year which you want to print");
        int yaer1 = leap.nextInt();

        boolean year = yaer1 %4==0&& yaer1 % 100 !=0 ||(yaer1 %400==0);
        if (year)
        {
            System.out.println("given year is leap year ");
        }
        else {
            System.out.println("this is not a leap year ");
        }


    }
}
