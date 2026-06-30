package day30;
 import java.util.Scanner;
public class q119 {

    static int id[] = new int[100];
    static String name[] = new String[100];
    static double salary[] = new double[100];

    static int count = 0;

    static void addEmployee(Scanner sc) {

        System.out.print("Enter ID: ");
        id[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name[count] = sc.nextLine();

        System.out.print("Enter Salary: ");
        salary[count] = sc.nextDouble();

        count++;

        System.out.println("Employee Added.");
    }

    static void displayEmployee() {

        System.out.println("\nID\tName\tSalary");

        for (int i = 0; i < count; i++) {

            System.out.println(id[i] + "\t" + name[i] + "\t" + salary[i]);
        }
    }

    static void searchEmployee(Scanner sc) {

        System.out.print("Enter Employee ID: ");
        int x = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (id[i] == x) {

                System.out.println("Employee Found");
                System.out.println(name[i]);
                System.out.println(salary[i]);
                return;
            }
        }

        System.out.println("Employee Not Found.");
    }

    static void updateSalary(Scanner sc) {

        System.out.print("Enter Employee ID: ");
        int x = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (id[i] == x) {

                System.out.print("Enter New Salary: ");
                salary[i] = sc.nextDouble();

                System.out.println("Salary Updated.");
                return;
            }
        }

        System.out.println("Employee Not Found.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1.Add Employee");
            System.out.println("2.Display Employee");
            System.out.println("3.Search Employee");
            System.out.println("4.Update Salary");
            System.out.println("5.Exit");

            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    addEmployee(sc);
                    break;

                case 2:
                    displayEmployee();
                    break;

                case 3:
                    searchEmployee(sc);
                    break;

                case 4:
                    updateSalary(sc);
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }

}
