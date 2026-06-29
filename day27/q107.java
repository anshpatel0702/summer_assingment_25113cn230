package day27;
import java.util.*;
public class q107 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        double hra = basic * 0.20;
        double da = basic * 0.10;
        double gross = basic + hra + da;

        System.out.println("\n----- Salary Slip -----");
        System.out.println("Employee : " + name);
        System.out.println("Basic Salary : ₹" + basic);
        System.out.println("HRA : ₹" + hra);
        System.out.println("DA : ₹" + da);
        System.out.println("Gross Salary : ₹" + gross);

        sc.close();
    }

}
