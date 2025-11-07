// this program is build to convert Fahrenheit to Celsius

import java.util.Scanner;


public class fehr {
    static void main(String[] args) {
        Scanner fern = new Scanner(System.in);
        System.out.println("give me the tempreture in celcius ");
        float temp1 = fern.nextFloat();
        float temp2 = (temp1-32) * 5/9;
        System.out.println("your answer is " + temp2);

    }
}
