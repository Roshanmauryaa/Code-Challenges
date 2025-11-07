import java.util.Scanner;
public class multiple {
    public static void main(String[] args) {
        Scanner multi = new Scanner(System.in);
        System.out.println("enter the number ");
        int num = multi.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(num+"x"+i+"="+(num*i));
        }


    }
}
