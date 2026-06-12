package day12;

import java.util.Scanner;

public class q47 {
    public static void fibo(int n){
        int fibo,a=0,b=1;
        System.out.print(a + " " + b);
        for(int i=2;i<=n;i++){
             fibo=a+b;
             System.out.print(" " +fibo);
             a=b;
             b=fibo;
        }        

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System .in);
        System.out.print("enter a no.");
        int n=sc.nextInt();
        fibo(n);
        sc.close();
    }
}
