package day13;

import java.util.Scanner;

public class q52 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter element of an array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int odd=0;
        int even=0;
         for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }

         }
         
         System.out.println("no. of even no. are "+even);
         System.out.println("no. of odd no. are "+odd);
         sc.close();
}
}