//package day13;

import java.util.Scanner;

public class q51 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter element of an array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            else{
                min=arr[i];
            }

        }
        System.out.println("maximum value "+max);
        System.out.println("minimum value "+ min);
        sc.close();
}}
