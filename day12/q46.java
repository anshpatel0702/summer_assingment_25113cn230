package day12;

import java.util.Scanner;

public class q46 {
    public static void armstrong(int n){
        int digit=0;
        int rem=0;
        double result=0;
        int temp=n;
        while(temp>0){
            digit++;
            temp/=10;
        }
        temp=n;
        while(temp>0){
          rem=temp%10;
          result=result+Math.pow(rem,digit);
          temp/=10;
        }
        if(result==n){
            System.out.print("Armstring no.");
        }
        else{
            System.out.print("not a Armstrong no.");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System .in);
        System.out.print("enter a no.");
        int n=sc.nextInt();
        armstrong(n);
        sc.close();
    }
}
