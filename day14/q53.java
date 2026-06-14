package day14;

import java.util.Scanner;

public class q53 {
      public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter element of an array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter a elemrnt to be find");
        int key=sc.nextInt();
          for(int i=0;i<n;i++){
               if(arr[i]==key){
                System.out.print("element is found at "+(i+1));        
           }
        }
        sc.close();
}}
