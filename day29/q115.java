package day29;
import java.util.*;
public class q115 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("\n1. Convert to Uppercase");
        System.out.println("2. Convert to Lowercase");
        System.out.println("3. Reverse String");
        System.out.println("4. Find Length");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println(str.toUpperCase());
                break;

            case 2:
                System.out.println(str.toLowerCase());
                break;

            case 3:
                String rev = "";
                for (int i = str.length() - 1; i >= 0; i--)
                    rev += str.charAt(i);

                System.out.println("Reversed String: " + rev);
                break;

            case 4:
                System.out.println("Length = " + str.length());
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }

}
