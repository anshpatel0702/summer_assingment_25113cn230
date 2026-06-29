package day29;
import java.util.*;
public class q114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("\n1. Display");
        System.out.println("2. Find Maximum");
        System.out.println("3. Find Minimum");
        System.out.println("4. Calculate Sum");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println(Arrays.toString(arr));
                break;

            case 2:
                int max = arr[0];
                for (int x : arr)
                    if (x > max)
                        max = x;
                System.out.println("Maximum = " + max);
                break;

            case 3:
                int min = arr[0];
                for (int x : arr)
                    if (x < min)
                        min = x;
                System.out.println("Minimum = " + min);
                break;

            case 4:
                int sum = 0;
                for (int x : arr)
                    sum += x;
                System.out.println("Sum = " + sum);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }

}
