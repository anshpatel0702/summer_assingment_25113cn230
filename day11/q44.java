

import java.util.Scanner;

public class q44 {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no");
        int a = sc.nextInt();
        System.out.print("factorial of a no.is " +factorial(a));
        sc.close();
    }
    
}
