package day14;

import java.util.Scanner;

public class q54 {
    
      public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter element of an array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count=0;
        System.out.println("enter a elemrnt whose frequency to be find");
        int key=sc.nextInt();
          for(int i=0;i<n;i++){
               if(arr[i]==key){
                count++;
           }
        }
        System.out.print("the frequency of an given no. is "+key+" = "+count );
        sc.close();
} 
}
