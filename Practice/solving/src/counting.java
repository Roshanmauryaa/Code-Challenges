import java.util.Scanner;
public class counting {
    public static void main(String[] args) {
        Scanner count = new Scanner(System.in);
        System.out.println("enter the number ");
        int coun = count.nextInt();
        int cou =0;

        if (coun==0){
            cou=1;
        }
        else {
            while (coun!=0){
                coun =coun/10;
                cou++;
            }
        }


        System.out.println("number of digit "+cou);


    }
}
