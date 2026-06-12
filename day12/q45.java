package day12;
import java.util.*;
public class q45 {
    public static void palindrome(int n){
        int rev=0;
        int temp=n;
        while(temp>0){
            rev=rev*10+temp%10;
            temp=temp/10;
        }
        if(rev==n){
            System.out.print("no. is palindrome");
        }
        else{
            System.out.print("no.is not a palindrome");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System .in);
        System.out.print("enter a no.");
        int n=sc.nextInt();
        palindrome(n);
        sc.close();
    }
}
