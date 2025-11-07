import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner larg = new Scanner(System.in);
        System.out.println("enter the two  number");
        int num1 = larg.nextInt();
        System.out.println("enter the second  number");
        int num2 = larg.nextInt();

        if (num1>num2){
            System.out.println("this number is greatest "+num1);
        }
        else {
            System.out.println(num2+"this is the dad");
        }



    }
}
