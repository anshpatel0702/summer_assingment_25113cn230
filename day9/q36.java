package day9;
import java.util.Scanner;

public class q36 {
    
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no.of rows");
        int num=sc.nextInt();
        System.out.print("enter no. of column");
        int col=sc.nextInt();
        for(int i =1; i<=num; i++){
            for(int j=1;j<=col;j++){
                if(j==1||j==col||i==1||i==num){
                     System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
        sc.close();
}}
