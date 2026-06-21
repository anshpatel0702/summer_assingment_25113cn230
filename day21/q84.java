package day21;
 import java.util.Scanner;
public class q84 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        String upper = s.toUpperCase();

        System.out.println("Uppercase String: " + upper);

        sc.close();
    }
}

