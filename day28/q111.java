package day28;
import java.util.*;
public class q111 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int availableSeats = 50;

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of tickets: ");
        int tickets = sc.nextInt();

        if (tickets <= availableSeats) {
            availableSeats -= tickets;

            System.out.println("\nBooking Successful!");
            System.out.println("Name: " + name);
            System.out.println("Tickets Booked: " + tickets);
            System.out.println("Remaining Seats: " + availableSeats);

        } else {
            System.out.println("Sorry! Seats not available.");
        }

        sc.close();
    }

}
