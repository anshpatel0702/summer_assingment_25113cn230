package day22;

import java.util.Scanner;

public class q86 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int n = str.length();
        int count=1;

        for (int i = 0; i < n ; i++) {
            char ch=str.charAt(i);
            if(ch==' '){
                count++;
            }
        }
        System.out.print("no.of words in a sentence is "+count);
       sc.close();
    }}
