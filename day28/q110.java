package day28;
import java.util.*;
public class q110 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 5000;

        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter deposit amount: ");
                double deposit = sc.nextDouble();
                balance += deposit;
                System.out.println("Updated Balance = ₹" + balance);
                break;

            case 2:
                System.out.print("Enter withdrawal amount: ");
                double withdraw = sc.nextDouble();

                if (withdraw <= balance) {
                    balance -= withdraw;
                    System.out.println("Updated Balance = ₹" + balance);
                } else {
                    System.out.println("Insufficient Balance");
                }
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }

}
