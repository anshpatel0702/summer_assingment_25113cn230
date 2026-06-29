package day24;
import java.util.*;
public class q96 {
   public static void removeDuplicates(String str) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (char ch : str.toCharArray()) {
            set.add(ch);
        }

        StringBuilder result = new StringBuilder();

        for (char ch : set) {
            result.append(ch);
        }

        System.out.println("String after removing duplicates: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        removeDuplicates(str);

        sc.close();
    }
}
