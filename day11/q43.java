package day11;

import java.util.Scanner;

public class q43 {
    public static void prime(int n){
        int flag = 1;
        if(n == 0 || n == 1){
            System.out.print("not a prime no");
        }
        else if(n == 2){
            System.out.print("prime no");
        }
        else{
            for(int i = 2; i <= n / 2; i++){
                if(n % i == 0){
                    flag = 0;
                    break;
                }
            }
            if(flag == 1){
                System.out.print("prime no.");
            }
            else{
                System.out.print("not a prime no.");
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no");
        int a = sc.nextInt();
        prime(a);
        sc.close();
    }
}
