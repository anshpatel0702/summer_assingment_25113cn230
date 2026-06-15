package day15;

import java.util.Arrays;
import java.util.Scanner;

public class q59 {
      public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        System.out.println("enter how many time to rotate an array");
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        for(int i=0;i<k;i++){
             int last = arr[4];
            for(int j = arr.length - 1; j > 0; j--){
                     arr[j] = arr[j - 1];
              }
            
            arr[0]=last;
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
}}
