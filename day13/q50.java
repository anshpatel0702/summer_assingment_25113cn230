package day13;

import java.util.Scanner;

public class q50 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter element of an array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int avg, sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        avg=sum/n;
        System.out.println("sum of element of an array is " + sum);
        System.out.println("average of the sum of an array is "+ avg);
        sc.close();
  }
}
