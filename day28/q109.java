package day28;
import java.util.*;
public class q109 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Name: ");
        String book = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        System.out.print("Is the book issued? (true/false): ");
        boolean issued = sc.nextBoolean();

        System.out.println("\n----- Library Record -----");
        System.out.println("Book ID      : " + id);
        System.out.println("Book Name    : " + book);
        System.out.println("Author       : " + author);
        System.out.println("Issued Status: " + issued);

        sc.close();
    }

}
