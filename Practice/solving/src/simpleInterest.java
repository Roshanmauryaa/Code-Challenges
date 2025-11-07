import java.util.Scanner;
public class simpleInterest {
    public static void main(String[] args) {
        Scanner Simple = new Scanner(System.in);
        System.out.println("this tool help you to calculate simple interest ");

        System.out.println("please enter the priciple of your loan ");
        Double priciple = Simple.nextDouble();

        System.out.println("please enter the rate of your loan ");
        Double rate = Simple.nextDouble();

        System.out.println("please enter the time of your loan ");
        Double time = Simple.nextDouble();

        Double num = (priciple*rate*time)/100;

        System.out.println("principle interest of your amount is "+ num);



    }
}
