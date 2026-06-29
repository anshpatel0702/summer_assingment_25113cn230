package day28;
import java.util.*;
public class q112 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Contact ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Contact Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.println("\n----- Contact Details -----");
        System.out.println("Contact ID   : " + id);
        System.out.println("Name         : " + name);
        System.out.println("Phone Number : " + phone);
        System.out.println("Email        : " + email);

        sc.close();
    }

}
