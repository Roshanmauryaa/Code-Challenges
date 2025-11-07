import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner Check = new Scanner(System.in);
        System.out.println("please Enter the number ");
        int num = Check.nextInt();

        if (num% 2==0){
            System.out.println("Hence your number is even");


        }
        else {
            System.out.println("given numbe is odd");
        }




    }
}
