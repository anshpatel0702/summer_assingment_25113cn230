package day6;
import java.util.*;
public class q23 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
       int count=0;
        while(n>0){
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        System.out.println("Number of 1s in binary representation: "+count);
        sc.close();
    }
}
