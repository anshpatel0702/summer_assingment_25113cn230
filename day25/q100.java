package day25;
import java.util.*;
public class q100 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        Arrays.sort(words, (a, b) -> a.length() - b.length());

        System.out.println("Words sorted by length:");
        for (String word : words) {
            System.out.print(word + " ");
        }

        sc.close();
    }
} 

