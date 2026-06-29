package day26;
import java.util.*;
public class q104 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.println("===== Java Quiz =====");

        System.out.println("1. Who developed Java?");
        System.out.println("a) Microsoft");
        System.out.println("b) Sun Microsystems");
        System.out.println("c) Google");
        System.out.print("Answer: ");
        char ans1 = sc.next().charAt(0);

        if (ans1 == 'b' || ans1 == 'B') {
            score++;
        }

        System.out.println("\n2. Which keyword is used to create an object?");
        System.out.println("a) class");
        System.out.println("b) this");
        System.out.println("c) new");
        System.out.print("Answer: ");
        char ans2 = sc.next().charAt(0);

        if (ans2 == 'c' || ans2 == 'C') {
            score++;
        }

        System.out.println("\n3. Java is a ______ language.");
        System.out.println("a) Programming");
        System.out.println("b) Markup");
        System.out.println("c) Database");
        System.out.print("Answer: ");
        char ans3 = sc.next().charAt(0);

        if (ans3 == 'a' || ans3 == 'A') {
            score++;
        }

        System.out.println("\nYour Score: " + score + "/3");

        sc.close();
    }

}
