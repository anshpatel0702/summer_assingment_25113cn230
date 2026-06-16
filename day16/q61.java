package day16;

import java.util.Scanner;

public class q61 {
    
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter element of an array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum=0;
        int num=arr.length+1;
        int actualsum=num*(num+1)/2;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int me=actualsum-sum;
        System.out.print("missimg element of an array is "+ me);
        sc.close();
    }
}
