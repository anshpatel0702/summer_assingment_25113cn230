package day11;
import java.util.*;
public class q41 {
    public static int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
          System.out.println("enter first no");
          int a = sc.nextInt(); 
          System.out.println("enter second no");
          int b = sc.nextInt();
            System.out.print(sum(a,b));
            sc.close();
        }
}
