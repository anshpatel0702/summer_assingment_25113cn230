package day6;
import java.util.*;
public class q21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        String binary="";
        while(n>0){
            binary=(n%2)+binary;
            n=n/2;
        }
        System.out.println("Binary representation: "+binary);
        sc.close();
    }
}
