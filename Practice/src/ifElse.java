import java.util.Scanner;
public class ifElse {
    static void main(String[] args) {
        Scanner ifElse = new Scanner(System.in);


        while(true){
            System.out.println("please enter a number (to exit press space button and enter )");
            String userInput = ifElse.nextLine();

            if (userInput.equals(" ")) {
                System.out.println("Program ended.");
                break;


        }


            int num = Integer.parseInt(userInput);

        if (num>0){
            System.out.println("this no is positive ");

        } else if(num<0) {
            System.out.println("this number is negative");


        }
        else {
            System.out.println("this number is zero ");
        }

    }
        ifElse.close();

    }
}
