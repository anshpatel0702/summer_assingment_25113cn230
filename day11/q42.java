package day11;

import java.util.Scanner;

public class q42 {
    public static int maximum(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
          System.out.println("enter first no");
          int a = sc.nextInt(); 
          System.out.println("enter second no");
          int b = sc.nextInt();
          System.out.print("maximum no is " +maximum(a,b));
          sc.close();
    }
}
