import java.util.*;

public class q25 {
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
        
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int result=factorial(n);
        System.out.println("Factorial of "+n+" is: "+result);
        sc.close();
    }
    
}
