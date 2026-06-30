package day30;
import java.util.Scanner;
public class q118 {
    static int bookId[] = new int[100];
    static String bookName[] = new String[100];
    static String author[] = new String[100];
    static int count = 0;

    static void addBook(Scanner sc) {

        System.out.print("Enter Book ID: ");
        bookId[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Name: ");
        bookName[count] = sc.nextLine();

        System.out.print("Enter Author: ");
        author[count] = sc.nextLine();

        count++;

        System.out.println("Book Added.");
    }

    static void displayBooks() {

        if (count == 0) {
            System.out.println("Library Empty.");
            return;
        }

        System.out.println("\nID\tBook\tAuthor");

        for (int i = 0; i < count; i++) {
            System.out.println(bookId[i] + "\t" + bookName[i] + "\t" + author[i]);
        }
    }

    static void searchBook(Scanner sc) {

        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (bookId[i] == id) {

                System.out.println("Book Found");
                System.out.println(bookName[i]);
                System.out.println(author[i]);
                return;
            }
        }

        System.out.println("Book Not Found.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1.Add Book");
            System.out.println("2.Display Books");
            System.out.println("3.Search Book");
            System.out.println("4.Exit");

            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    addBook(sc);
                    break;

                case 2:
                    displayBooks();
                    break;

                case 3:
                    searchBook(sc);
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }

}
