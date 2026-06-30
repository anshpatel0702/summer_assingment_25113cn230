package day30;
import java.util.Scanner;
public class q120 {
    static int roll[] = new int[100];
    static String name[] = new String[100];
    static int marks[] = new int[100];
    static int count = 0;

    static void add(Scanner sc) {

        System.out.print("Roll: ");
        roll[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        name[count] = sc.nextLine();

        System.out.print("Marks: ");
        marks[count] = sc.nextInt();

        count++;

        System.out.println("Added Successfully");
    }

    static void display() {

        System.out.println("\nRoll\tName\tMarks");

        for (int i = 0; i < count; i++) {
            System.out.println(roll[i] + "\t" + name[i] + "\t" + marks[i]);
        }
    }

    static void search(Scanner sc) {

        System.out.print("Enter Roll: ");
        int r = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (roll[i] == r) {

                System.out.println("Found");
                System.out.println(name[i]);
                System.out.println(marks[i]);
                return;
            }
        }

        System.out.println("Not Found");
    }

    static void update(Scanner sc) {

        System.out.print("Enter Roll: ");
        int r = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (roll[i] == r) {

                System.out.print("Enter New Marks: ");
                marks[i] = sc.nextInt();

                System.out.println("Updated");
                return;
            }
        }

        System.out.println("Not Found");
    }

    static void delete(Scanner sc) {

        System.out.print("Enter Roll: ");
        int r = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (roll[i] == r) {

                for (int j = i; j < count - 1; j++) {

                    roll[j] = roll[j + 1];
                    name[j] = name[j + 1];
                    marks[j] = marks[j + 1];
                }

                count--;

                System.out.println("Deleted");
                return;
            }
        }

        System.out.println("Not Found");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1.Add");
            System.out.println("2.Display");
            System.out.println("3.Search");
            System.out.println("4.Update");
            System.out.println("5.Delete");
            System.out.println("6.Exit");

            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    add(sc);
                    break;

                case 2:
                    display();
                    break;

                case 3:
                    search(sc);
                    break;

                case 4:
                    update(sc);
                    break;

                case 5:
                    delete(sc);
                    break;

                case 6:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
 
}
