package day12;

import java.util.Scanner;

public class q48 {
    public static void perfect(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        } 
        if(n==sum){
        
            System.out.print("Given no. is perfect no."); 
       }
       else{
        System.out.print("not a perfect no.");
       }}
       public static void main(String[] args){
        Scanner sc=new Scanner(System .in);
        System.out.print("enter a no.");
        int n=sc.nextInt();
        perfect(n);
        sc.close();
    }
}
