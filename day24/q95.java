package day24;
import java.util.*;
public class q95 {

    public static void findLongestWord(String str) {
        String[] words = str.split(" ");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Longest word: " + longest);
        System.out.println("Length: " + longest.length());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        findLongestWord(str);

        sc.close();
    }
}

