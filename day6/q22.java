package day6;
import java.util.*;
public class q22 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the binary number ");
        int n=sc.nextInt();
        int decimal=0;
        int digit=0;
        int i=0;
        while(n>0){
            digit=n%10;
            decimal+=digit*Math.pow(2, i);
            n=n/10; 
            i++;

        }
        System.out.println("Decimal representation: "+decimal);
        sc.close();
      
    
}
}