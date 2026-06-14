//package day14;

import java.util.Scanner;

public class q55 {
    static int secondlargest(int arr[], int size){
        int l=arr[0];
        int sl=0;
        for(int i=0;i<size;i++){
            if(arr[i]>l){
                sl=l;
                l=arr[i];
            }
            if(arr[i]>sl && arr[i]<l){
                 sl=arr[i];
            }
        }
        return sl;
    }
    
      public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter element of an array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int a=secondlargest(arr,n);
        System.out.print("second largest element is "+a );
        sc.close();
}
}