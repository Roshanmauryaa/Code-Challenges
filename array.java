import java.util.Scanner;
public class array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        // array reversed code

        int left = 0;
        int right = n-1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;

        }

        System.out.print("Reversed Array");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");

        }
        sc.close();

    }

}