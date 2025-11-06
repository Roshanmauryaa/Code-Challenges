import java.util.Scanner;
public class prob1{
    public static void main(String[] args){
         Scanner prob1 = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = prob1.nextLine();  // Read a string input

        System.out.println("HELLO world ");
        int i = 5;
        System.out.println("please enter your age ");
        int age = prob1.nextInt();

        System.out.println(age+10+"Your age after 10 year later ");

        System.out.println("Nice to meet you" + name);
        System.out.println(i+55);

    }

}