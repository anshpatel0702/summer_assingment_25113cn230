import java.util.*;
public class q18 {
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.print("enter a number : ");
        int num = sc.nextInt();
        int temp=num;
        int sum=0;
        int n=0;
        while(temp>0){
            n=temp%10;
            sum=sum+factorial(n);
            temp=temp/10;

    }
        if(sum==num){
            System.out.println(num+" is a strong number");
        }
        else{
            System.out.println(num+" is not a strong number");
        }
        sc.close();
    }

}
